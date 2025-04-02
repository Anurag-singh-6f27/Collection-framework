package Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Binary_tree tree=new Binary_tree();
        Scanner sc=new Scanner(System.in);
        tree.populate(sc);
        tree.displaytree();
    }
}
