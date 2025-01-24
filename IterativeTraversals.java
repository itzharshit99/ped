import java.util.Stack;

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

  void preOrder(TreeNode node) {
    if (node == null) {
      return;
    }
    Stack<TreeNode> st = new Stack<>();
    st.push(node);
    while (!st.isEmpty()) {
      TreeNode curr = st.pop();
      System.out.println(curr.data);
      if (curr.right != null) {
        st.push(curr.right);
      }
      if (curr.left != null) {
        st.push(curr.left);
      }
    }
  }
}

public class IterativeTraversals {
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

    // Manually construct the tree
    tree.root = new TreeNode(1);
    tree.root.left = new TreeNode(2);
    tree.root.right = new TreeNode(3);
    tree.root.left.left = new TreeNode(4);
    tree.root.left.right = new TreeNode(5);
    tree.root.right.left = new TreeNode(6);
    tree.root.right.right = new TreeNode(7);

    // Perform Iterative Preorder Traversal
    System.out.println("Iterative Preorder Traversal:");
    tree.preOrder(tree.root);
  }
}
