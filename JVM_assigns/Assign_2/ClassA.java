package JVM_assigns.Assign_2;

import java.util.Scanner;

public class ClassA {
    public int x;

    public ClassA() {
        System.out.println("Hello");
    }

    public void initX() {
        Scanner sc = new Scanner(System.in);
        this.x = sc.nextInt();
    }

    public void printXAdd12() {
        System.out.println(this.x + 12);
    }

    public boolean isXEven() {
        return this.x % 2 == 0;
    }
}
