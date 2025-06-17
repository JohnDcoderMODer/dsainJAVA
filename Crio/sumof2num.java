import java.util.Scanner;
public class sumof2num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int FirstNumber = sc.nextInt();
        int SecondNumber = sc.nextInt();

        int Sum =  FirstNumber + SecondNumber;

        System.out.println(Sum);
        sc.close();
    }

}
