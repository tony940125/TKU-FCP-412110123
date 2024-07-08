import java.util.Scanner;

public class hm_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 創建 Scanner object 來讀取使用者輸入

        System.out.println("請輸入您的姓名:");  // 提示使用者輸入姓名
        String name = scanner.nextLine();  // 讀取使用者輸入的姓名

        System.out.println("請輸入您的年齡:");  // 提示使用者輸入年齡
        int age = scanner.nextInt();  // 讀取使用者輸入的年齡

        scanner.nextLine();  // 讀取換行符（清除輸入緩衝區）

        System.out.println("請輸入您的城市:");  // 提示使用者輸入城市
        String city = scanner.nextLine();  // 讀取使用者輸入的城市

        System.out.println("您的姓名是: " + name);  // 輸出姓名
        System.out.println("您的年齡是: " + age);  // 輸出年齡
        System.out.println("您所在的城市是: " + city);  // 輸出城市
    }
}