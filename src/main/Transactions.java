package main;

import model.*;
import service.*;

public class Transactions {
	public static void main(String[] args) {
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.right.left = new Node(55);

		RightSkewedTree skewedTree = new RightSkewedTree();
		Node rightSkewedTree = skewedTree.convertToRightSkewedTree(root);
		skewedTree.traverseRightSkewedTree(rightSkewedTree);
	}
}