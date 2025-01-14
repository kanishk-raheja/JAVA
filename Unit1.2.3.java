import java.util.Scanner;
public class Main
  {
    public static void main(String[] args) {
        //Type your code here
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = (a&b|c)^(~a&b|c);
         System.out.println("Result of (" + a + " & " + b + " | " + c + ") ^ (~" + a + " & " + b + " | " + c + "): " + result);
    }
  }
