import java.util.Scanner;

public class Compute_Statistics_from_a_List_of_Numbers {
    public static int sum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
    public static double average(int[] array){
        int  sum= 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum/array.length;
    }
    public static int largest(int[] array){
        int largest = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > largest){
                largest = array[i];
            }
        }
        return largest;
    }
    public static int smallest(int[] array){
        int smallest = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array_length;
        do{
            System.out.print("How many numbers? ");
            array_length = input.nextInt();

        }while(array_length <=0);
        int[] number = new int[array_length];
        for(int i = 0; i < array_length; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            number[i] = input.nextInt();
        }
        input.close();
        System.out.println("Sum : "+sum(number));
        System.out.println("Average : "+average(number));
        System.out.println("Largest : "+largest(number));
        System.out.println("Smallest : "+smallest(number));


    }
}