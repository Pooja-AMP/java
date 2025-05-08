import java.util.Scanner;
class UserSimple 
 {
    public static void main(String args[])
    {
        float pri, year,rate=7.5f;
        float Simple_Interest;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter Principle amount:");
        pri=sc.nextFloat();
        System.out.println("Enter number of years :");
        year=sc.nextFloat();
        Simple_Interest=(pri*year*rate)/100;
        System.out.println("The Simple Interest is "+Simple_Interest);

    }
    
}
