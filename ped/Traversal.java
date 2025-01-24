class TreeNode {
  int data;
  TreeNode left;
  TreeNode right;

  TreeNode(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
  }
}

class BinaryTree {
  TreeNode root;

  BinaryTree() {
      root = null;
  }

  // Inorder Traversal (Left -> Root -> Right)
  void inorderTraversal(TreeNode node) {
      if (node != null) {
          inorderTraversal(node.left); // Visit left
          System.out.print(node.data + " "); // Visit root
          inorderTraversal(node.right); // Visit right
      }
  }

  // Preorder Traversal (Root -> Left -> Right)
  void preorderTraversal(TreeNode node) {
      if (node != null) {
          System.out.print(node.data + " "); // Visit root
          preorderTraversal(node.left); // Visit left
          preorderTraversal(node.right); // Visit right
      }
  }

  // Postorder Traversal (Left -> Right -> Root)
  void postorderTraversal(TreeNode node) {
      if (node != null) {
          postorderTraversal(node.left); // Visit left
          postorderTraversal(node.right); // Visit right
          System.out.print(node.data + " "); // Visit root
      }
  }
}

public class Traversal {
  public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();

      // Manually constructing the binary tree
      tree.root = new TreeNode(1);
      tree.root.left = new TreeNode(2);
      tree.root.right = new TreeNode(3);
      tree.root.left.left = new TreeNode(4);
      tree.root.left.right = new TreeNode(5);

      // Traversals
      System.out.println("Inorder Traversal:");
      tree.inorderTraversal(tree.root); // Output: 4 2 5 1 3

      System.out.println("\nPreorder Traversal:");
      tree.preorderTraversal(tree.root); // Output: 1 2 4 5 3

      System.out.println("\nPostorder Traversal:");
      tree.postorderTraversal(tree.root); // Output: 4 5 2 3 1
  }
}
