package JVM_assigns.Assign_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassA myClassA = new ClassA();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        myClassA.countOddAndEven(myClassA.firstMethod(a, b, 40));
    }
}
