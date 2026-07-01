import java.util.Scanner;

public class Creativity {
    public static void cTen(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int element : arr) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            }
        }
        System.out.println("Second largest: " + secondLargest);
    }

    public static void cEleven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two positive numbers: ");
        try {
            System.out.println("Enter the value of a:");
            int a = sc.nextInt();

            System.out.println("Enter the value of b:");
            int b = sc.nextInt();

            if (a < 0 || b < 0) {
                throw new Exception("Negative numbers are not allowed");
            }

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("Value of a: " + a);
            System.out.println("Value of b: " + b);
        } catch (Exception e) {
            cEleven();
        }
    }

    public static void cTwelve(int[] values) {
        var oddCount = 0;
        var oddOne = 0;
        var oddTwo = 0;
        for (var i = 0; i < values.length; i++) {
            if (values[i] % 2 != 0) {
                oddCount++;
                oddOne = values[i];
                if (oddCount == 2) {
                    oddTwo = values[i];
                    System.out.println("The first pair of elements with odd product are: 1. " + oddOne + " 2. "+ oddTwo);
                    return;
                }
            }
        }
        System.out.println("No pair with odd product is there.");
    }
}
