import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please select a function: ");
        System.out.println("1 for Calculator");
        System.out.println("2 for Text Analyzer");

        int functionNumber = s.nextInt();
        s.nextLine();

        Calculator c = new Calculator();
        TextAnalyzer t = new TextAnalyzer();

        switch (functionNumber){
            case 1:

                System.out.println("Please select an option number: ");
                System.out.println("1 for Addition");
                System.out.println("2 for Subtraction");
                System.out.println("3 for Multiplication");
                System.out.println("4 for Divison");

                int functionOption = s.nextInt();

                System.out.println("Enter your first number: ");
                int n1 = s.nextInt();
                System.out.println("Enter your second number: ");
                int n2 = s.nextInt();

                switch (functionOption){
                    case 1:
                        c.Addition(n1,n2);
                        break;
                    case 2:
                        c.subtraction(n1,n2);
                        break;
                    case 3:
                       c.multiplication(n1,n2);
                        break;
                    case 4:
                        c.division(n1,n2);
                        break;
                    default:
                        System.out.println("Invalid option.");
                        break;
               }
               break;

            case 2:

                System.out.println("Please select an option number: ");
                System.out.println("1 for counting words");
                System.out.println("2 for counting characters");
                System.out.println("3 for counting vowels");

                int textOption = s.nextInt();
                s.nextLine();

                System.out.println("Enter the string: ");
                String str = s.nextLine();

                switch (textOption){
                    case 1:
                        t.countWords(str);
                        break;
                    case 2:
                        t.countCharacters(str);
                        break;
                    case 3:
                        t.countVowels(str);
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
                break;
        }
    }
}