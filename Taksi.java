package ucgen;

import java.util.Scanner;

public class Taksi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Gidilen Mesafeyi Giriniz : ");
		
		double mesafe = scanner.nextDouble();
		
		double acilis = 10;
		
		double indiBindi = 20;
		
		double km = mesafe*2.20;
		
		double ucret;
		
		if (mesafe<20) {
			
			ucret = indiBindi;
			
			System.out.print("Ücret : " + ucret);
			
		} else {
			
			ucret = acilis + km ;
			
			System.out.println("Ücret : " + ucret);

		}
		
		
		
		
		
		
		
		

	}

}
