package Dsa_Questions;

public class happyNumber {
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        do{

            slow=addsquare(slow);
            fast=addsquare(addsquare(fast));
            if(slow==fast&& slow!=1 && fast!=1){
                return false;
            }
        }while(slow!=fast);
        return true;
    }
    public int addsquare(int n){
        int k=0;
        int sum=0;
        while(n>0){
            k=n%10;
            sum=sum+(k*k);
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        happyNumber no=new happyNumber();
        int[] arr={1, 7, 10, 13, 19,20, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, 100,101};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(no.isHappy(arr[i]));
        }
    }
}
