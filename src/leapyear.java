import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" plz insert the year : ");
        int year = sc.nextInt();
        /* if the year is divisible by 4 and 400,and it is not divisible by 100, it is a leap year!
       otherwise it is not a leap year"*/
        boolean givenYear1 = (year%4)==0;
        boolean givenYear2 = (year%100)!=0;
        boolean givenYear3 = (year%400)==0;

        if (givenYear1 && (givenYear3 || givenYear2)){
            System.out.println(year +" "+ "is a leap yesr ");

        }else {
            System.out.println(year + " "+ "is not a leap year");
        }
    }
}
