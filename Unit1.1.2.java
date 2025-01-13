import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      // creating sc object 
        int a= sc.nextInt();
      // input integer
        char b= sc.next().charAt(0);
      //used to read single char as input
        System.out.println("Integer Value: "+ a);
        System.out.println("Character Value: "+b);
    }
}
