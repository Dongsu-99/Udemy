import java.util.Scanner;

public class IfElseIfRepeat {
    // 조건문 복습
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number1 :");
        int num1 = sc.nextInt();
        System.out.println(num1);

        System.out.print("Enter Number2 :");
        int num2 = sc.nextInt();
        System.out.println(num2);

        System.out.println("1 - Add");

        System.out.println("2 - Subtract");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");

        int choose = sc.nextInt();
        System.out.println("Choose Operation : " + choose);

        performOperationsUsingSwitch(num1, num2, choose);


    }

    private static void performOperationsUsingNestedIfElse(int num1, int num2, int choose) {
        if (choose == 1) {
            System.out.println("Result is =" + (num1 + num2));
        } else if (choose == 2) {
            System.out.println("Result is =" + (num1 - num2));
        } else if (choose == 3) {
            System.out.println("Result is =" + (num1 / num2));
        } else if (choose == 4) {
            System.out.println("Result is = " + (num1 * num2));
        }
    }

    private static void performOperationsUsingSwitch(int num1, int num2, int choose) {
        switch (choose){
            case 1 : System.out.println("Result is =" + (num1 + num2));
            break;
            case 2 : System.out.println("Result is =" + (num1 - num2));
            break;
            case 3 : System.out.println("Result is =" + (num1 / num2));
            break;
            case 4 : System.out.println("Result is =" + (num1 * num2));
            default : System.out.println("Invaild Operation");

        }

    }
}
