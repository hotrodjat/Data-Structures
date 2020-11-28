


public class BinarySearchTree {
	private Node root;
	private int size;
	
	public BinarySearchTree() {
		root = null;
		size = 0;
	}
	
	private void addNode(Node localRoot, String data) {
		if (localRoot == null) {
			localRoot = new Node(data);
		}
		else if (data.compareTo(localRoot.getData()) > 0) {
			addNode(localRoot.getRightChild(), data);
		}
		else if (data.compareTo(localRoot.getData()) < 0) {
			addNode(localRoot.getLeftChild(), data);
		}
		else {
			localRoot.incrementCount();
		}
		
	}
	
	public void addNode(String data) {
		addNode(root, data);
	}
	
	
	public static void main(String args[]) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.addNode("Quoc is gay.");
		try {
			System.out.print(tree.root.getData());
		}
		catch (Exception e) {
			System.out.print("Thomas sucks at programming.");
		}
		
	}
	
//	public Node getNode(locaRoot, data) {
//		if ()
//	}
	
}
