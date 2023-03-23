import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so: ");
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println("So vua nhap la so chan");
        } else {
            System.out.println("So vua nhap la so le");
        }
    }
}
