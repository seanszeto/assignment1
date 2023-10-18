import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class dataTypes {

    public static void main(String[] args) {
//        int year = 2023;
//        String name = "Sean";
//        float table = 12.34567F;
//        double chair = 10.2;
//        char englishGrade = 'C';
//        boolean passEnglish = false;
//        System.out.println(year);
//        System.out.println(name);
//        System.out.println(table);
//        System.out.println(chair);
//        System.out.println(englishGrade);
//        System.out.println(passEnglish);

    }

    public void anInt() {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        System.out.println("This array list has " + integers.size() + " elements.");
        System.out.println("It is " + integers.contains(1) + " that the element 1 is in the array list.");
        Collections.sort(integers);

    }

    public static void doubleToInteger() {
        double doubleValue = 123.456;
        int intValue = (int) doubleValue;
        System.out.println(intValue);
    }

    public static void integerToDouble() {
        int intValue2 = 456;
        double doubleValue2 = (double) intValue2;
        System.out.println(doubleValue2);
    }

    public static void evenOrOdd() {
        int num = 2;
        int remainder = num % 2;
        if (remainder == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    public void positiveOrNegative() {
        int inputNumber = 5;
        if (inputNumber > 0) {
            System.out.println("The number is positive");
        } else if (inputNumber < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }

    public boolean primeNumber() {

        int primeNum = 25;
        for (int i = primeNum - 1; i * i >= 2; i--) {
            if (primeNum % i == 0) {
                return false;
            } else {
                break;
            }
        }
        return true;
    }

    public static void oneToTen() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void oneToTenEven() {
        for (int x = 0; x < 5; x++) {
            System.out.println(x * 2);
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

//    public static String stringReversal() {}

    public static void printArray() {
        int[] sampleArray = {4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < sampleArray.length; i++) {
            System.out.println(sampleArray[i] + " ");
        }
    }

    public static void arraySum() {
        int[] sampleArray = {4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < sampleArray.length; i++) {
            sum = sum + sampleArray[i];
        }
        System.out.println(sum);
    }

    public static int largestElement() {
        int[] largestArray = {1, 2, 3, 4, 5, 6};
        int max = largestArray[0];
        for (int i = 0; i < 6; i++) {
            if (largestArray[i] > max) {
                max = largestArray[i];
            }
        }
        return max;
    }

    public static void integerArray() {
        List<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);
        intArray.add(5);
        intArray.remove(1);

        System.out.println(intArray.size());
        boolean found = false;

        for (int i : intArray) {
            if (i == 2) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("2 is in the array list.");
        } else {
            System.out.println("2 is not in the array list.");
        }

        Collections.sort(intArray);
        System.out.println("Sorted ArrayList: " + intArray);
    }

    public static void printBreak() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                if (i == 10) {
                    break;
                }
            }

        }

    }

    public static void dayOfWeek() {
        int day = 5;
        switch(day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
    }

    public static void grade() {
        int score = 9;
        switch (score) {
            case 1, 2, 3, 4, 5:
                System.out.println("F");
                break;
            case 6:
                System.out.println("D");
                break;
            case 7:
                System.out.println("C");
                break;
            case 8:
                System.out.println("B");
                break;
            case 9:
                System.out.println("A");
                break;
            case 10:
                System.out.println("A+");
                break;
        }
    }

    public class stringReverser {
        public static String reverseString(String input) {
            char[] oldString = input.toCharArray();
            int arrayStart = 0;
            int arrayEnd = input.length() - 1;

            while (arrayStart < arrayEnd) {
                char newString = oldString[arrayStart];
                oldString[arrayStart] = oldString[arrayEnd];
                oldString[arrayEnd] = newString;
                arrayStart++;
                arrayEnd--;
            }
            return new String(oldString);
        }
            public static void main (String[]args){
                String originalString = "To be reversed.";
                String reversedString = reverseString(originalString);
                System.out.println("Original String: " + originalString);
                System.out.println("Reversed String: " + reversedString);
            }
        }

    public class maxNumberFinder {
        public static void findBiggerNumber() {
            int number1 = 10;
            int number2 = 5;

            if (number1 > number2) {
                System.out.println("Number 1: " + number1 + " is the bigger number.");
            }
            else if (number2 > number1) {
                System.out.println("Number 2: " + number2 + " is the bigger number.");
            } else {
                System.out.println("The two numbers are equal.");
            }
        }
    }
}
