


/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node
{
    // instance variables - replace the example below with your own
    private Node leftChild;
    private Node rightChild;
    private String data;
    private int count;    

    /**
     * Constructor for objects of class Node
     */
    public Node()
    {
        leftChild = null;
        rightChild = null;
        data = null;
        count = 0;
    }
    
    public Node(String data) {
        leftChild = null;
        rightChild = null;
        this.data = data;
        count = 1;
    }

    protected Node getLeftChild() {
        return leftChild;
    }
    
    protected Node getRightChild() {
        return rightChild;
    }
    
    protected String getData(){
        return data;
    }
    
    protected void incrementCount(){
        count++;
    }
    
    protected void decrementCount(){
        count--;
    }
    
}
