import java.util.*;
public class mainCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz insert the first number :");
        int number1 = sc.nextInt();
        System.out.println("plz insert the second number : ");
        int number2 = sc.nextInt();
        int sum = number2+number1;
        int sub = number2-number1;
        int div = number2/number1;
        int mul = number1*number2;
        //System.out.println("summation: ",sum, "subtraction:"," ", sub, "division:"," ",div, "multiplication:",mul);
        System.out.println("summation = "+ sum);
        System.out.println("subtraction =" + sub);
        System.out.println("division =" + div);
        System.out.println("multiplication =" + mul);
    }
}
