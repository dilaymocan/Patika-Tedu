import java.util.Scanner;

public class daire {

	public static void main(String[] args) {
		double r;
		double 𝜋=3.14;
		Scanner scan= new Scanner(System.in);
		System.out.print("Dairenin yarıçap uzunluğunu giriniz:");
		r=scan.nextDouble();
		System.out.print("Merkez açı ölçüsünü giriniz:");
		int 𝛼=scan.nextInt();
		
		double alan,çevre;
		alan= (𝜋 * (r*r) * 𝛼) / 360;
		çevre=2 *𝜋 * r;
		
        System.out.println("Dairenin çevresi:"+çevre);
        System.out.println("Dairenin alanı"+alan);
	}

}
