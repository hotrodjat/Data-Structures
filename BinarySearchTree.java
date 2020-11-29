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
            size++;
        }
        else {
            if (data.compareTo(localRoot.getData()) > 0) {
                if (localRoot.getRightChild() == null) {
                    localRoot.setRightChild(new Node(data));
                    size++;
                }
                else {
                    addNode(localRoot.getRightChild(), data);
                }
            }
            else if (data.compareTo(localRoot.getData()) < 0) {
                if (localRoot.getLeftChild() == null) {
                    localRoot.setLeftChild(new Node(data));
                    size++;
                }
                else {
                    addNode(localRoot.getLeftChild(), data);
                }
            }
        }
        
    }
    
    public void addNode(String data) {
        addNode(root, data);
    }
    
    private Node removeNode(Node localRoot, String data) {
        if (localRoot == null) {
            /*
             * This takes care of the case when the desired node is not in the tree.
             */
            return null;
        }
        if (data.equals(localRoot.getData())) {
            /*
             * Removed node has no children.
             */
            if (localRoot.getRightChild() == null && localRoot.getLeftChild() == null) {
                if (localRoot == root) {
                    root = null;
                }
                return null;
            }
            /*
             * Removed node has only left child.
             */
            else if (localRoot.getRightChild() == null) {
                if (localRoot == root) {
                    root = localRoot.getLeftChild();
                }
                return localRoot.getLeftChild();
            }
            /*
             * Removed node has only right child.
             */
            else if (localRoot.getLeftChild() == null) {
                if (localRoot == root) {
                    root = localRoot.getRightChild();
                }
                return localRoot.getRightChild();
            }
            /*
             * Removed node has two children.
             */
            else {
                Node current = localRoot.getRightChild();
                while (current.getLeftChild() != null) {
                    current = current.getLeftChild();
                }
                removeNode(root, current.getData());
                current.setRightChild(localRoot.getRightChild());
                current.setLeftChild(localRoot.getLeftChild());
                if (localRoot == root) {
                    root = current;
                }
                return current;
            }
        }
        else if (data.compareTo(localRoot.getData()) > 0) {
            localRoot.setRightChild(removeNode(localRoot.getRightChild(), data));
            return localRoot;
        }
        else {
            localRoot.setLeftChild(removeNode(localRoot.getLeftChild(), data));
            return localRoot;
        }
    }
    
    public void removeNode(String data){
        removeNode(root, data);
    }
    
    public Node getNode(Node localRoot, String data) {
    	if (localRoot == null) {
    		return new Node();
    	}
    	if (data.compareTo(localRoot.getData()) == 0) {
    		return localRoot;
    	}
    	else if (data.compareTo(localRoot.getData()) < 0) {
    		return getNode(localRoot.getLeftChild(), data);
    	}
    	else {
    		return getNode(localRoot.getRightChild(), data);
    	}
    	
    }
    
    public Node getNode(String data) {
        return getNode(root, data);
    }
    
    public boolean contains(Node localRoot, String data) {
    	if (localRoot == null) {
    		return false;
    	}
    	if (data.compareTo(localRoot.getData()) == 0) {
    		return true;
    	}
    	else if (data.compareTo(localRoot.getData()) < 0) {
    		return contains(localRoot.getLeftChild(), data);
    	}
    	else {
    		return contains(localRoot.getRightChild(), data);
    	}
    }
    
    public boolean contains(String data) {
    	return contains(root, data);
    }
    
    public void inorderTraversal(Node localRoot) {
    	if (localRoot == null) {
    		return;
    	}
    	else {
    		inorderTraversal(localRoot.getLeftChild());
    		System.out.println(localRoot.getData());
    		inorderTraversal(localRoot.getRightChild());
    		
    	}
    }
    
    public void preorderTraversal(Node localRoot) {
    	if (localRoot == null) {
    		return;
    	}
    	else {
    		System.out.println(localRoot.getData());
    		preorderTraversal(localRoot.getLeftChild());
    		preorderTraversal(localRoot.getRightChild());
    		
    	}
    }
    
    public void postorderTraversal(Node localRoot) {
    	if (localRoot == null) {
    		return;
    	}
    	else {
    		postorderTraversal(localRoot.getLeftChild());
    		postorderTraversal(localRoot.getRightChild());
    		System.out.println(localRoot.getData());
    	}
    }
    
    public int getSize() {
    	return size;
    }
    
    public Node getRoot() {
    	return root;
    }
    
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.addNode("tomato");
        tree.addNode("zebra");
        tree.addNode("apple");
        tree.addNode(" urmom");
        tree.addNode("$&!@#!**%!(%(");
        tree.addNode("BdsaBbbVVsas");
        System.out.println(tree.contains("urmom"));
        System.out.println(tree.contains("$&!@#!**%!(%("));
        System.out.println(tree.getNode("tomato").getData());
        System.out.println(tree.getNode("zeb").getData());
        System.out.println(tree.getSize());
        System.out.println(tree.getRoot().getData());
        tree.inorderTraversal(tree.root);
        
        
        System.out.println("Tree root: " + tree.root.getData());
    }
}
