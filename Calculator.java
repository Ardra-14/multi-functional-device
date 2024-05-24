
public class Calculator {

    public void Addition(int n1, int n2){
        System.out.println("Result = "+ (n1 + n2));
    }
    public void subtraction(int n1, int n2){
        System.out.println("Result = "+ (n1 - n2));
    }

    public void multiplication(int n1, int n2){

        System.out.println("Result = "+ (n1 * n2));

    }
    public void division(int n1, int n2){

        if(n2 != 0){
            System.out.println("Result = "+  (n1 /n2));
        }else{
            System.out.println("Division by zero is not allowed");
        }

    }
}
