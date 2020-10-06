package JVM_assigns.Assign_3;

import java.util.concurrent.ThreadLocalRandom;

public class ClassA {
    // Sorry for naming
    public int[] firstMethod(int a, int b, int initArr) {
        int[] randomNumbersArray = new int[initArr];

        if (a > b) {
            for (int i = 0; i < initArr; i++) {
                randomNumbersArray[i] = ThreadLocalRandom.current().nextInt(b, a + 1);
            }
        } else {
            for (int i = 0; i < initArr; i++) {
                randomNumbersArray[i] = ThreadLocalRandom.current().nextInt(a, b + 1);
            }
        }

        return randomNumbersArray;
    }

    public void countOddAndEven(int[] arr) {
        int evenCounter = 0;
        int oddCounter = 0;
        int evenSum = 0;
        int oddSum = 0;



        for (int i : arr) {
            if (i % 2 == 0) {
                evenSum += i;
                evenCounter++;
            } else {
                oddSum += i;
                oddCounter++;
            }
        }
        System.out.println("Even: " + evenCounter + "\n" + "Odd: " + oddCounter);
        System.out.println("Even Sum: " + evenSum + "\n" + "Odd Sum: " + oddSum);

        int[] newArr = this.firstMethod(evenSum, oddSum, 5);
        for (int value :  newArr) {
            System.out.println(value);
        }
    }

}
