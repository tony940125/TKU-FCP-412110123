import java.util.Scanner;

public class hm_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 創建一個 Scanner 對象，用於讀取使用者輸入

        System.out.println("請輸入第一個整數:");  // 提示使用者輸入第一個整數
        int num1 = scanner.nextInt();  // 讀取第一個整數

        System.out.println("請輸入第二個整數:");  // 提示使用者輸入第二個整數
        int num2 = scanner.nextInt();  // 讀取第二個整數

        int sum = num1 + num2;  // 計算兩個數字的和

        System.out.println("兩個數字的和是: " + sum);  // 顯示結果
    }
}
