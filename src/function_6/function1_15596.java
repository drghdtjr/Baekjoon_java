package function_6;

import java.util.Scanner;

public class function1_15596 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=Test(n);
        System.out.println(sum);
    }
    public static int Test(int a)
    {
        return (a*(a+1))/2;
    }
}
