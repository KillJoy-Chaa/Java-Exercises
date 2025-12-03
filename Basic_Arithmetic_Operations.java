import java.util.Scanner;
public class Basic_Arithmetic_Operations {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int product(int a,int b){
        return a*b;
    }
    public static void quotient(int a,int b){
        if(b==0){
            System.out.println("Quotient : Error => cannot divide by zero");
        }else{
            System.out.println("Quotient: "+a/b);
        }
    }
    public static int difference(int a,int b){
        return a-b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        input.close();
        System.out.println("Sum: " + Basic_Arithmetic_Operations.sum(a,b) );
        System.out.println("Difference: " + Basic_Arithmetic_Operations.difference(a,b) );
        System.out.println("Product: " + Basic_Arithmetic_Operations.product(a,b) );
        Basic_Arithmetic_Operations.quotient(a,b);
    }
}