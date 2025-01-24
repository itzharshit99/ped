import java.util.LinkedList;
import java.util.Queue;

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

  void levelOrderTraversal(TreeNode node) {
    if (node == null) {
      return;
    }
    Queue<TreeNode> q = new LinkedList<>();
    q.add(node);
    while (!q.isEmpty()) {
      TreeNode curr = q.poll();
      System.out.println(curr.data);
      if (curr.left != null) {
        q.add(curr.left);
      }
      if (curr.right != null) {
        q.add(curr.right);
      }
    }
  }
}

public class Level {
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.root = new TreeNode(1);
    tree.root.left = new TreeNode(2);
    tree.root.right = new TreeNode(3);
    tree.root.left.left = new TreeNode(4);
    tree.root.left.right = new TreeNode(5);
    tree.root.right.left = new TreeNode(6);
    tree.root.right.right = new TreeNode(7);

    // Perform Level Order Traversal
    System.out.println("Level Order Traversal:");
    tree.levelOrderTraversal(tree.root); // Output: 1 2 3 4 5 6 7
  }

}
