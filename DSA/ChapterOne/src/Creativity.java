import java.util.HashMap;
import java.util.Map;
import java.util.Random;
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
        for (int value : values) {
            if (value % 2 != 0) {
                oddCount++;
                oddOne = value;
                if (oddCount == 2) {
                    oddTwo = value;
                    System.out.println("The first pair of elements with odd product are: 1. " + oddOne + " 2. " + oddTwo);
                    return;
                }
            }
        }
        System.out.println("No pair with odd product is there.");
    }

    public static void cThirteen(int val) throws Exception {
        if (val <= 2) {
            throw new Exception("Number must be greater than 2.");
        }
        var divideCount = 0;
        while (val > 2) {
            val /= 2;
            divideCount++;
        }

        System.out.println(val + " must be divided by 2 " + divideCount + " times to get a number less than 2.");
    }

    public static void cFourteen(int[] arr) {
        boolean distinct = true;
        Map<Integer, Integer> map = new HashMap<>();
        for (int element : arr) {
            if (map.containsKey(element)) {
                distinct = false;
                System.out.println("First duplicate key: " + element);
                break;
            }
            map.put(element, 1);
        }
        System.out.println("All numbers are distinct.");
    }

    public static void cFifteen(int[] arr) {
        Random rand = new Random();
        for (int i =  arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i);

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i: arr) {
            System.out.println(i + " ");
        }
    }
}
