import java.util.Scanner;   //系统默认的包之外的类
/**
 * 测试获得键盘输入
 * @author 猪猪康
 *
 */
public class TestScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);   //io流对象
		System.out.println("qingshuri ");
		String name = scanner.nextLine();
		System.out.println("aij ");
		String favor = scanner.nextLine();
		System.out.println("nian ");
		int age = scanner.nextInt();
		System.out.println(name);
		System.out.println(favor);
		System.out.println(age);
	}
}
