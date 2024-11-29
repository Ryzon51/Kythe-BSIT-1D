public class Main {
	public static void main(String[] args) {
		int n = 8;
        printMultiplication(n);
    }
        public static void printMultiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}