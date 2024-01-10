/*
1. Complete the code in methodA to access and print the values of classVariable and localVariableA. Also, comment on whether localVariableA can be accessed in methodB.
2. Complete the code in methodB to access and print the value of classVariable. Also, comment on whether classVariable can be accessed in methodA, and whether localVariableB can be accessed in methodA.
3. In the main method, create an instance of ScopePractice, call methodA and methodB, and observe the access to classVariable and local variables. Comment on whether methodA or methodB can directly access localVariableA or localVariableB.
*/

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
