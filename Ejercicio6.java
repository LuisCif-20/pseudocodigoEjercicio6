import java.util.*;
public class Ejercicio6{
	public static void main(String[] args) {
		int mayor25 = 0;
		int menor25 = 0;
		int tmayor = 0;
		int tmenor = 0;
		int prom1;
		int prom2;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 100 ; i++ ) {
			int edad;
			System.out.println("Ingresa la edad");
			edad = scan.nextInt();
			if (edad >= 25) {
				mayor25++;
				tmayor += edad;
			} else {
				menor25++;
				tmenor += edad;
			}
		}
		prom1 = tmayor/mayor25;
		prom2 = tmenor/menor25;
		System.out.println("El promedio de edad de personas mayores de 25 años es " + prom1);
		System.out.println("El promedio de edad de personas menores a 25 años es de " + prom2);
	}
}