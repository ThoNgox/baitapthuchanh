import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        int[] numbers = new int[100];
        int count = 0;
        while (sum <= 100) {
            System.out.print("Nhap so nguyen: ");
            num = sc.nextInt();
            sum += num;
            numbers[count] = num;
            count++;
        }
        System.out.print("Tong cac so ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("la: "+sum);
    }
}
