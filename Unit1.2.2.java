import java.util.Scanner;
public class Main
  {
      public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        System.out.println(String.format("Rs.%.2f", a+b+c));
    }
  }
