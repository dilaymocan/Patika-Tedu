import java.util.Scanner;

public class taksimetre {

	public static void main(String[] args) {
	double tutar,km ;
    Scanner scan= new Scanner(System.in);
	
    System.out.print("Gidilecek kilometreyi belirtiniz: ");
	km= scan.nextDouble();
	tutar= (km*2.20);
    int açılış=(int) 10.0;
    
    double GenelTutar=(açılış+tutar);
    double Ödenecek = (tutar<=20)? 20 : (açılış+tutar) ;
    
    		
	System.out.println("Taksimetrede yazan değer: "+Ödenecek);
	}

}
