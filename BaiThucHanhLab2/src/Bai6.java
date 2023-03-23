import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen duong n = ");
        int n = sc.nextInt();

        long giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }

        System.out.printf("Giai thua cua %d la %d", n, giaiThua);
    }
}
