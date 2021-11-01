package trees;

public class BinarySearchTree extends BinaryTree{
    Node root;
    public BinarySearchTree(Node root) {
        this.root=root;
    }
    public void add(Node newNode,Node root) {
        if (root == null) {
            return;
        }
        if (newNode.value > root.value) {
            if (root.rightChild == null)
                root.rightChild = newNode;
            else
                add(newNode, root.rightChild);

        }
        if (newNode.value < root.value) {
            if (root.leftChild == null)
                root.leftChild = newNode;
            else
                add(newNode, root.leftChild);
        }
    }
    public boolean contain(int value,Node root){
        if(root==null){
            try {
                throw new Exception("not found");
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        if(root.value==value){
            System.out.println("found");
            return true;
        }
        if(value>root.value){
            contain(value,root.rightChild);

        }
        if(value<root.value){
            contain(value,root.leftChild);
        }
        return false;
    }
}