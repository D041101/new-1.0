
// tách 4 số  lần lượt từ dưới  lên 
import java.util.*;

public class App {
    public static void main(String[] args) {
        try (// 自分の得意な言語で
                // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in)) {
            System.out.print("n: ");
            String n = sc.nextLine();
            int mod = n.length() % 4;
            System.out.print("結果 : " );
      for (int i = 0; i < n.length(); i++) {
                if (i != 0 && i % 4 == mod) {
                    System.out.print(",");
                }
                System.out.print(n.charAt(i));
            }
        }
    }
}