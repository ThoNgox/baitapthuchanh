import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String str = scanner.nextLine();

        int countLower = 0; 
        int countUpper = 0; 
        int countDigit = 0; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLowerCase(ch)) {
                countLower++;
            } else if (Character.isUpperCase(ch)) {
                countUpper++;
            } else if (Character.isDigit(ch)) {
                countDigit++;
            }
        }

        System.out.println("So ky tu thuong trong chuoi: " + countLower);
        System.out.println("So ky tu hoa trong chuoi: " + countUpper);
        System.out.println("So chu so trong chuoi: " + countDigit);
    }
}
