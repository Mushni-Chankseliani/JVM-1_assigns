package JVM_assigns.Assign_1;

public class Main {
    public static void main(String[] args) {
        ClassC myClassC = new ClassC();

        myClassC.initVariables();
        System.out.println(myClassC.getLastDigitOfA());
        System.out.println(myClassC.getFirstDigitOfB());
        System.out.println(myClassC.getDigitsSumOfC());
        System.out.println(myClassC.printAAndBMethodsMultiply());
        myClassC.printMethodsSum();
    }
}
