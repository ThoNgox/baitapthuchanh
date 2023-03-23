import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen n");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1;i<=n;i++){
            System.out.print("Nhap so nguyen thu " + 1 + ": ");
            int num = sc.nextInt();
            sum += num;
        }

        double tbc = (double) sum / n;
        System.out.println("Trung binh cong cua " + n + " so nguyen la " + tbc);
    }
}
