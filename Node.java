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
    
    protected void setLeftChild(Node left){
        leftChild = left;
    }
    
    protected Node getRightChild() {
        return rightChild;
    }
    
    protected void setRightChild(Node right) {
        rightChild = right;
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
