package Coding;

public class ArmStrong {
    public static void main(String[] args) {
        int n = 8208;
        int r =n;
        int dig=0;
        while(r!=0){
            r=r/10;
            dig++;
        }
        int sum=0;
        r=n;
        while(r!=0){
            int  i = r%10;
            sum+=Math.pow(i,dig);
            r=r/10;
        }
        if(sum==n){
            System.out.println("true");
        }
        else System.out.println("false");
    }


}
