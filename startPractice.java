// starting point for class activities
java.util.Scanner input = new java.util.Scanner(System.in);

public class startPractice{
    public static void main(String[] args){
        int [][] matrix = new int[10][10];
        initializeWithInput(matrix, input);
    }

    public static void initializeWithInput(int [][] matrix, Scanner input){
        // Initializing arrays with input values

        System.out.println("enter " + matrix.length + " rows and " + matrix[0].length + " columns");

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        displayArray(myList);
        sumElements(myList);
    }

    public static void initializeWithRandom(int [][] matrix){
        // Initializing arrays with random values

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = int Math.random() * 100;
            }
        }
        displayArray(myList);
        sumElements(myList);
    }

    public static void displayArray (int [][] matrix){
        // display the array

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            system.out.println(" ");
        }
    }

    public static void sumElements (int [][] matrix){
        // display the array

        int total = 0;

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }
        System.out.println("the total of all array elements is " + total)
    }

}
