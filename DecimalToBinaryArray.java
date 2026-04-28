//Part b 

import java.util.Scanner;

public class DecimalToBinaryArray {

    static int[] convertToBinary(int num) {
        int temp = num;
        int count = 0;

        while (temp > 0) {
            count++;
            temp = temp / 2;
        }

        int[] binaryArray = new int[count];
        int index = count - 1;

        while (num > 0) {
            binaryArray[index] = num % 2;
            num = num / 2;
            index--;
        }

        return binaryArray;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int number = input.nextInt();

        int[] result = convertToBinary(number);

        System.out.print("Binary: ");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]);
        }
    }
}
