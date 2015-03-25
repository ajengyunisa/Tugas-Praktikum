public class Sepuluh{
	public static void main(String[] args) {
		int pagar=5;
		for (int i=1; i<=pagar; i++) {
			if (i%2==0) {
				System.out.print(" ");	
			}
			for (int j=1; j<=pagar; j++) {
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}
}