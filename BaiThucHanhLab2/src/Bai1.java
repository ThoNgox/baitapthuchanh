import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so thu nhat: ");
        double num1 = sc.nextDouble();
        System.out.print("Nhap vao so thu hai: ");
        double num2 = sc.nextDouble();

        // Tinh toan va in ket qua
        System.out.println("Tong: " + (num1 + num2));
        System.out.println("Hieu: " + (num1 - num2));
        System.out.println("Tich: " + (num1 * num2));
        System.out.println("Thuong: " + (num1 / num2));
        System.out.println("Chia lay du: " + (num1 % num2));

        // So sanh 2 so
        if (num1 == num2) {
            System.out.println("Hai so bang nhau");
        } else if (num1 > num2) {
            System.out.println("So thu nhat lon hon so thu hai");
        } else {
            System.out.println("So thu nhat nho hon so thu hai");
        }
    }
}
