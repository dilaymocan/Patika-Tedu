import java.util.Scanner;

public class ortalama {

	public static void main(String[] args) {
		int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Matematik değerini giriniz:");
        matematik=scan.nextInt();
        
        System.out.println("Fizik değerini giriniz:");
        fizik=scan.nextInt();
        
        System.out.println("Kimya değerini giriniz:");
        kimya=scan.nextInt();
        
        System.out.println("Türkçe değerini giriniz:");
        turkce=scan.nextInt();
        
        System.out.println("Tarih değerini giriniz:");
        tarih=scan.nextInt();
        
        System.out.println("Müzik değerini giriniz:");
        muzik=scan.nextInt();
        
        
       double a= (matematik+fizik+kimya+turkce+tarih+muzik)/6;
       System.out.println("Ortalamanız: "+a);
       
       String sonuc = (a>=60) ? "Geçti" : "Kaldı";
	   System.out.print("Öğrenci sınıfı "+sonuc+".");
       
	}

}
