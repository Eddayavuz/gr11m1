public class Scope{
public static void main(String[] args) {
        // TODO: Create an instance of ScopePractice, call methodA and methodB,
        // and observe the access to classVariable and local variables.


        // Can methodA or methodB directly access localVariableA or localVariableB?
        }
}
class ScopePractice {

    private int classVariable = 10;

    public void methodA() {
        int localVariableA = 20;

        // TODO: Write code here to access classVariable and localVariableA
        // and print their values.

        // Can localVariableA be accessed in methodB?

    }

    public void methodB() {
        int localVariableB = 15;
        // TODO: Write code here to access classVariable and print its value.
        // Can classVariable be accessed in methodA?

        // Can localVariableB be accessed in methodA?
    }
}