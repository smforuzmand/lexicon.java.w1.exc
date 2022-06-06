import java.util.Scanner;
public class averageThreenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz insert first number:");
        int firstnum = sc.nextInt();
        System.out.println("plz insert second number:");
        int secondnum = sc.nextInt();
        System.out.println(" plz insert the last number:");
        int lastnum = sc.nextInt();
        System.out.println("the average is :"+(firstnum+secondnum+lastnum)/3);
    }
}
