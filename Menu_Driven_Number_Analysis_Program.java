import java.util.Scanner;
public class Menu_Driven_Number_Analysis_Program {
    // this function make sure the length of array is positive
    public static int array_length(Scanner input) {
        int length_;
        do{
            System.out.print("How many numbers? ");
            length_ = input.nextInt();
        }while(length_<=0);
        return length_ ;
    }
    public static int[] fill_the_array(Scanner input) {
        int[] array_numbers = new int[array_length(input)];
        for(int i = 0; i < array_numbers.length; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            array_numbers[i] = input.nextInt();

        }
        return array_numbers;
    }
    public static int compute_sum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
    public static double compute_average(int[] array){
       return (double) compute_sum(array)/array.length;
    }
    public static int Find_largest_number(int[] array){
        int largest = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > largest){
                largest = array[i];
            }
        }
        return largest;
    }
    public static int Find_smallest_number(int[] array){
        int smallest = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];

            }

        }
        return smallest;
    }
    public static void options(Scanner input,int[] array) {
        int option;
        System.out.println("-----------------------");
        System.out.println("1. Display all numbers");
        System.out.println("2. Compute Sum");
        System.out.println("3. Compute Average");
        System.out.println("4. Find largest number");
        System.out.println("5. Find smallest number");
        System.out.println("6. Exit");

        do{
            System.out.println("Pick an option");
            option=input.nextInt();
        }while (option<=0 || option>6);
        switch(option) {
            case 1:
                print_the_array(array);
                break;
            case 2:
                System.out.print("Sum : " + compute_sum(array));
                break;
            case 3:
                System.out.print("Average : " + compute_average(array));

                break;
            case 4:
                System.out.print("Largest : " + Find_largest_number(array));

                break;
            case 5:
                System.out.print("Smallest : " + Find_smallest_number(array));
                break;
            case 6:
                System.out.println("Exit successfull");
                input.close();
                System.exit(0);

        }
    }
    public static void print_the_array(int[] array){

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = fill_the_array(input);
        while(true){
            options(input,numbers);
        System.out.println();}





    }
}