import java.util.Scanner;

public class manav {

	public static void main(String[] args) {
		double elma,armut,domates,muz,patlıcan;
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Aldığınız armut miktarını kg cinsinden giriniz: ");
		armut=scan.nextDouble();
		double a=armut*2.14;
		
		System.out.print("Aldığınız elma miktarını kg cinsinden giriniz: ");
		elma=scan.nextDouble();
		double e=elma*3.67;
		
		System.out.print("Aldığınız domates miktarını kg cinsinden giriniz: ");
		domates=scan.nextDouble();
		double d=domates*1.11;
		
		System.out.print("Aldığınız muz miktarını kg cinsinden giriniz: ");
		muz=scan.nextDouble();
		double m=muz*0.95;
		
		System.out.print("Aldığınız patlıcan miktarını kg cinsinden giriniz: ");
		patlıcan=scan.nextDouble();
		double p=patlıcan*5.0;
		
		double total=(a+e+d+m+p);
		System.out.print("Total ödemeniz gereken miktar: "+total);
		
		
		
		
		
		
	}

}
