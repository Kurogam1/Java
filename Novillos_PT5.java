//Kyle Christian T. Novillos
//BSCS 2-1

import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int val) {
        root = insert(root, val);
    }

    private TreeNode insert(TreeNode node, int val) {
        if (node == null) {
            node = new TreeNode(val);
        } else if (val < node.val) {
            node.left = insert(node.left, val);
        } else if (val > node.val) {
            node.right = insert(node.right, val);
        }
        return node;
    }

    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.val + " ");
            inorderTraversal(node.right);
        }
    }

    public void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    public void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.val + " ");
        }
    }
}

public class Novillos_PT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        while (!done) {
            BinaryTree tree = new BinaryTree();

            //prompt the user to enter the values for the nodes
            System.out.print("Enter the values for the nodes in the binary tree (separated by spaces): ");
            String[] values = scanner.nextLine().split(" ");

            //insert the values into the binary tree
            for (String value : values) {
                int val = Integer.parseInt(value);
                tree.insert(val);
            }

            boolean innerDone = false;
            while (!innerDone) {
                //prompt the user to select an option
                System.out.println("[1] In-order Traversal");
                System.out.println("[2] Pre-order Traversal");
                System.out.println("[3] Post-order Traversal");
                System.out.println("[4] Enter new values");
                System.out.println("[5] Exit");
                System.out.print("Select option: ");

                //read the user's input and perform the selected action
                int option = scanner.nextInt();
                scanner.nextLine();
                switch (option) {
                    case 1:
                        System.out.print("In-order traversal: ");
                        tree.inorderTraversal(tree.root);
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Pre-order traversal: ");
                        tree.preorderTraversal(tree.root);
                        System.out.println();
                        break;
                    case 3:
                        System.out.print("Post-order traversal: ");
                        tree.postorderTraversal(tree.root);
                        System.out.println();
                        break;
                    case 4:
                        innerDone = true;
                        break;
                    case 5:
                        innerDone = true;
                        done = true;
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            }
        }
    }
}
