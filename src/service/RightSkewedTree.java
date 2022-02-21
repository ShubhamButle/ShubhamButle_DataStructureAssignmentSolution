package service;

import java.util.ArrayList;
import model.Node;

public class RightSkewedTree {
	void inOrderTraversal(Node root, ArrayList<Integer> tree) {
		if (root == null) {
			return;
		}

		inOrderTraversal(root.left, tree);
		tree.add(root.data);
		inOrderTraversal(root.right, tree);
	}

	public Node convertToRightSkewedTree(Node root) {
		if (root != null) {
			ArrayList<Integer> tree = new ArrayList<Integer>();
			inOrderTraversal(root, tree);

			Node rightSkewedTree = new Node(tree.get(0));
			Node temp = rightSkewedTree;

			for (int i = 1; i < tree.size(); i++) {
				temp.right = new Node(tree.get(i));
				temp = temp.right;
			}

			return rightSkewedTree;
		}

		return null;
	}

	public void traverseRightSkewedTree(Node rightSkewedTree) {
		Node temp = rightSkewedTree;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.right;
		}
	}
}