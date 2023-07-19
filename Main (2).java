import binary.BinarySearchTree;
import binary.Node;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(new Node(10));
        binarySearchTree.insert(new Node(20));
        binarySearchTree.insert(new Node(15));
        binarySearchTree.insert(new Node(14));
        binarySearchTree.insert(new Node(9));
        binarySearchTree.insert(new Node(7));
        binarySearchTree.insert(new Node(18));
        binarySearchTree.insert(new Node(34));
        binarySearchTree.insert(new Node(49));
        binarySearchTree.insert(new Node(27));

        binarySearchTree.remove(0);
        binarySearchTree.display();
        System.out.println(binarySearchTree.search(0));
    }
}