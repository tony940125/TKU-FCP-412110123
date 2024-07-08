
import java.util.Scanner;

  public class hm_07 {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);  // 創建一個 Scanner 對象來讀取使用者輸入
  
          System.out.println("請輸入圓的半徑:");  // 提示使用者輸入圓的半徑
          double radius = scanner.nextDouble();  // 從使用者讀取半徑值
  
          double area = Math.PI * radius * radius;  // 使用 Math.PI 計算圓的面積
  
          System.out.println("圓的面積是: " + area);  // 顯示圓的面積
      }
  }