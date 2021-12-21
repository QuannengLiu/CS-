import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println("您输入的字符串为：" + str);
    }
}
