package Coding;

public class Fib {
    public static void main(String[] args) {
        int n =8;
        int i = sumEvenFib(n);
        System.out.println(i);
    }
    public static int sumEvenFib(int n){
        if(n<2)
            return 0;
        if(n<8)
            return 2;
        //1,1,2,3,5,8,13,21,34,55,89,144,233,377,610
        int first = 2;
        int sec = 0;
        int sum=2;
        while(sum<n){
            int t =4*first+sec;
            if(t<=n){
                sum+=t;
            }
            else break;
            sec=first;
            first= t;
        }
        return sum;

    }
}
