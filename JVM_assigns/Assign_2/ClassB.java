package JVM_assigns.Assign_2;

import java.util.Scanner;

public class ClassB extends ClassA {
    public int y;

    public void initY() {
        Scanner sc = new Scanner(System.in);
        this.y = sc.nextInt();
    }

    public int sumOfVars() {
        return this.x + this.y;
    }
}
