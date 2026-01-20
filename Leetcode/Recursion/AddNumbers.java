package Leetcode.Recursion;

public class AddNumbers{
    
    static int count(int n){
        if(n==0) return 0;
        return count(n-1)+1;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(count(6));
    }
}
