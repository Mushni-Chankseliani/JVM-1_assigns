package JVM_assigns.Assign_2;

public class Main {
    public static void main(String[] args) {
        ClassB myClassB = new ClassB();

        // ClassA class methods
        myClassB.initX();
        myClassB.printXAdd12();
        System.out.println(myClassB.isXEven());

        // ClassB methods
        myClassB.initY();
        System.out.println(myClassB.sumOfVars());
    }
}
