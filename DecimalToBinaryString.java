//Part (c)  Function returning String
import java.util.Scanner;

public class DecimalToBinaryString {

    static String convertToBinary(int num){
        if (num == 0) {
            return "0";
        }

        String binary = "";

        while(num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }

        return binary;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer number: ");
        int number = input.nextInt();

        String result = convertToBinary(number);
        System.out.println("Binary: " + result);
    }
}
