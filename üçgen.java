import java.util.Scanner;

public class üçgen {

	public static void main(String[] args) {
	double a,b,c;
	Scanner scan= new Scanner(System.in);
	
	System.out.print("a kenarının uzunluğunu giriniz:");
	a=scan.nextInt();
		
	System.out.print("b kenarının uzunluğunu giriniz:");
	b=scan.nextInt();	
		
	c = (double) Math.sqrt((a*a)+(b*b));
	System.out.println("Hipotenüs uzunluğu : "+c);
			
	System.out.print(a);	
	System.out.print(" "+b);	
	System.out.print(" "+c);	
		
    double u=(a+b+c)/2;
    double çevre =2*u; 
    double alan;
    alan = Math.sqrt(u * (u-a)* (u-b) * (u-c));
    System.out.println("Üçgenin çevre: "+çevre);
    System.out.println("Üçgenin alan: "+alan);
	
	
	
	}

}


