package JVM_assigns.Assign_1;

import java.util.Scanner;

public class ClassC {
    public int a, b, c;

    public void initVariables() {
        Scanner sc = new Scanner(System.in);

        this.a = sc.nextInt();
        this.b = sc.nextInt();
        this.c = sc.nextInt();
    }

    public int getLastDigitOfA() {
        return this.a % 10;
    }

    public int getFirstDigitOfB() {
        return Integer.parseInt(Integer.toString(this.b).substring(0, 1));
    }

    public int getDigitsSumOfC() {
        int cloneC = this.c;
        int sum = 0;
        while (cloneC > 0) {
            sum = sum + cloneC % 10;
            cloneC /= 10;
        }

        return sum;
    }

    public int printAAndBMethodsMultiply() {
        return this.getLastDigitOfA() * this.getFirstDigitOfB();
    }

    public void printMethodsSum() {
        System.out.println(this.getDigitsSumOfC() + this.printAAndBMethodsMultiply());
    }


}
