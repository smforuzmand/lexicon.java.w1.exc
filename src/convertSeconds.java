import java.util.Scanner;
public class convertSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz insert digits : ");
        int seconds = sc.nextInt();
        int s = seconds % 60;
        int h = seconds / 60;
        int m = h % 60;
        h = h / 60;
        System.out.print( h + ":" + m + ":" + s);

    }
}