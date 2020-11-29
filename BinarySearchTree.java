public class BinarySearchTree {
    private Node root;
    private int size;
        
    public BinarySearchTree() {
        root = null;
        size = 0;
    }
    private void addNode(Node localRoot, String data) {
        if (root == null) {
            root = new Node(data);
        }
        else {
            if (data.compareTo(localRoot.getData()) > 0) {
                if (localRoot.getRightChild() == null) {
                    localRoot.setRightChild(new Node(data));
                }
                else {
                    addNode(localRoot.getRightChild(), data);
                }
            }
            else if (data.compareTo(localRoot.getData()) < 0) {
                if (localRoot.getLeftChild() == null) {
                    localRoot.setLeftChild(new Node(data));
                }
                else {
                    addNode(localRoot.getLeftChild(), data);
                }
            }
        }
        
    }
    private void addNode(String data) {
        addNode(root, data);
    }
    public static void main() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.addNode("tomato");
        tree.addNode("zebra");
        tree.addNode("apple");
        System.out.println("Tree root: " + tree.root.getLeftChild().getData());
    }
}
