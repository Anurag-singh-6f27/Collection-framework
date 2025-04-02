package Trees;

import java.util.Scanner;

public class Binary_tree {
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    public Binary_tree() {
    }
    private Node root;
    public void populate(Scanner sc){
        System.out.println("Enter the root node:");
        int val=sc.nextInt();
        root =new Node(val);
        populate(sc,root);
    }
    private void populate(Scanner sc,Node node){
        System.out.println("Do you want to enter left of "+node.value);
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("Enter value for left:");
            int val= sc.nextInt();
            node.left=new Node(val);
            populate(sc,node.left);
        }
        System.out.println("Do you want to enter Right of "+node.value);
        boolean right =sc.nextBoolean();
        if(right){
            System.out.println("Enter value for right:");
            int val= sc.nextInt();
            node.right=new Node(val);
            populate(sc,node.right);
        }
    }
    public void display(){
        display(root,"");
    }
    private void display(Node node ,String indent){
        if(node!=null) {
            System.out.println(indent + node.value);
            display(node.left,indent+"\t");
            display(node.right,indent+"\t");
        }
    }
    public void displaytree(){
        displaytree(root,0);
    }

    private void displaytree(Node node, int level) {
        if(node==null){
            return;
        }
        displaytree(node.right,level+1);
        if(level!=0){
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|---->"+node.value);
        }
        else {
            System.out.println(node.value);
        }
        displaytree(node.left,level+1);
    }
}
