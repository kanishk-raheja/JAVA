import java.util.Scanner;
class Main
  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        if(n/10>=10)
        {
          System.out.println("Not a valid two-digit number.");
        }
        else
        {
          while (n>0)
            {
              int a = n%10;
              sum +=a;
              n/=10;
            }
          System.out.println("Digit Sum: "+sum);
            if (sum>10)
            {
              System.out.println("The sum of the digits is not less than 10.");
            }
            else
            {
              System.out.println("The sum of the digits is less than 10.");
            }
        }
    }
}
