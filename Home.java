public class Home {
	public static void main (String[] args) {
		int a, b, c;
		String s1, s2;
		System.out.println("Введите ДВА числа");
		a = new Scanner(System.in).nextInt();
		b = new Scanner(System.in).nextInt();
		c = a + b;
		System.out.println("Сумма ваших чисел равна " + c);
		
		System.out.println ("Сканер запустись!");
	}
}