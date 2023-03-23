import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang cua ma tran");
        int hang = sc.nextInt();
        System.out.println("Nhap so cot cua ma tran");
        int cot = sc.nextInt();

        int [][] matrix = new int[hang][cot];

        System.out.println("Nhap gia tri cho cac phan tu cua ma tran: ");
        for (int i = 0; i<hang; i++){
            for (int j=0;j<cot;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        int maxValue = matrix[0][0];
        for (int i = 0;i<hang;i++){
            for (int j=0;j<cot;j++){
                if (matrix[i][j]>maxValue){
                    maxValue = matrix[i][j];
                }
            }
        }

        System.out.println("Phan tu co gia tri lon nhat trong ma tran la: " + maxValue);
    }
}
