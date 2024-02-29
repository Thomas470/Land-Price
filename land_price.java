import java.util.Locale;
import java.util.Scanner;

public class land_price {

	public static void main(String[] args) {		
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("How wide is the land? R: ");	
	double largura = sc.nextDouble();
	System.out.print("What is the length of the land? R: ");
	double comprimento = sc.nextDouble();
	System.out.print("What is the land value per square meter? R: ");	
	double metro = sc.nextDouble();
	
	double area = (largura * comprimento);
	double total = (metro * area);
	
	System.out.println();
	System.out.printf("The land has an area of: %.2f square meters.%n", area);
	System.out.printf("The land is costing a total of: %.2f reais.%n", total);

	sc.close();
	}
}