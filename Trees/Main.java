package Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BST tree=new BST();
        tree.insert(15);
        tree.insert(10);
        tree.insert(20);
        tree.insert(25);
        tree.insert(18);
        System.out.println(tree.isEmpty());
        tree.displaytree();
        System.out.println(tree.isBalanced());

    }
}
