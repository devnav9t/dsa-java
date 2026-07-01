import java.util.Scanner;

public class Reinforcement {

    public static void rOne() {
        GameEntry[] a =  new GameEntry[6];
        a[0] = new GameEntry(1);
        a[1] = new GameEntry(2);
        a[2] = new GameEntry(3);
        a[3] = new GameEntry(4);
        a[4] = new GameEntry(5);
        a[5] = new GameEntry(6);
        GameEntry[] b = a.clone();
        a[4].score = 550;
        System.out.println(b[4].score);
    }

    public static void rTwo(long n, long m) {
        System.out.println(n % m == 0);
    }

    public static void rThree(int n) {
        System.out.println(n % 2 != 0);
    }

    public static void rFour(int n) {
        boolean isMultipleOf3 = false;
        boolean isMultipleOf7 = false;
        if (n % 3 == 0) {
            System.out.println("n is a multiple of 3");
            isMultipleOf3 = true;
        }
        if  (n % 7 == 0) {
            System.out.println("n is a multiple of 7");
            isMultipleOf7 = true;
        }
        if (!isMultipleOf3 && !isMultipleOf7) {
            System.out.println("n is neither a multiple of 3 nor 7.");
        }
    }

    public static void rFive() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter ten numbers:");
        try {
            int sum = 0;
            int total = 10;

            for (int i = 1; i <= total; i++) {
                sum += input.nextInt();
            }

            System.out.println("Average is " + ((double)sum)/total);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void rSix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        try {
            int n = input.nextInt();
            if (n <= 0) {
                throw new RuntimeException("n is less than zero");
            }
            int sum = 0;
            for  (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Average is " + ((double)sum)/n);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void rSeven() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any phrase:");
        String phrase = input.nextLine();

        int vowels = 0;
        int consonants = 0;
        int numbers = 0;
        int symbols = 0;

        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.toLowerCase().charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
                continue;
            }
            if ("bcdfghjklmnpqrstvwxyz".indexOf(ch) != -1) {
                consonants++;
                continue;
            }
            if ("0123456789".indexOf(ch) != -1) {
                numbers++;
                continue;
            }
            if (ch == ' ') {
                continue;
            }
            symbols++;
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of numbers: " + numbers);
        System.out.println("Number of symbols: " + symbols);
    }

    public static void rEight() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any phrase:");
        String phrase = input.nextLine();

        StringBuilder phraseBuilder = new StringBuilder();

        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.toLowerCase().charAt(i);
            if ("aeioubcdfghjklmnpqrstvwxyz0123456789 ".indexOf(ch) != -1) {
                phraseBuilder.append(phrase.charAt(i));
            }
        }

        System.out.println("Phrase: " + phraseBuilder.toString());
    }

}

class GameEntry {
    int score;

    GameEntry(int score) {
        this.score = score;
    }
}

class Flower {
    String name;
    int numberOfPetals;
    float price;
    Flower(String name, int numberOfPetals, float price) {
        this.name = name;
        this.numberOfPetals = numberOfPetals;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    public void setNumberOfPetals(int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}