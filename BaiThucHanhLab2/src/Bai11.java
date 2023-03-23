import java.util.Arrays;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();


        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap gia tri cua phan tu thu %d: ", i + 1);
            A[i] = sc.nextInt();
        }

        int B[] = new int [A.length];
        for (int i=0;i<A.length;i++){
            B[i] = A[i];
        }

        Arrays.sort(A);

        System.out.println("Man ban dau: " + Arrays.toString(B));
        System.out.println("Mang da sap xep: " + Arrays.toString(A));
    }
}
