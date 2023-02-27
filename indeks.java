import java.util.Scanner;

public class indeks {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		double boy;
		double kilo ;
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		boy=scan.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz : ");
		kilo=scan.nextDouble();
		
		double indeks=(kilo)/(boy*boy);
		System.out.print("Vücut Kitle İndeksiniz : "+indeks);

	}

}
