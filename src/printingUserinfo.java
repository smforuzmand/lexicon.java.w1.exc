import java.util.Scanner;
public class printingUserinfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" what is your name please?");
        String str = sc.nextLine();
        System.out.println("Hello"+str);
    }
}
