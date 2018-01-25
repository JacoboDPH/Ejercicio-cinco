import java.awt.Image;
import java.io.Closeable;
import java.math.*;
import java.util.Scanner;

import javax.naming.ldap.HasControls;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ramdom = (int) (Math.random() * 100) + 1;
		
		int numeroUsuario;
		
		int intentos = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("El número es "+ramdom);
		
		do {
			
			System.out.println("Cuál es el número aleatorio");
			
			numeroUsuario = teclado.nextInt();
		
			intentos = ++intentos;
			
			
			if (numeroUsuario > ramdom) {
				
				System.out.println("El número que buscas es menor");
				
			}
			
			else {
				
				System.out.println("El número que buscas es mayor");
			}
			
		} while (numeroUsuario != ramdom);
		
			System.out.println("Corrento el número es "+ ramdom + "\n lo HasControls conseguido en " + intentos +" intentos");
			
			teclado.close();
		
			
			
		}
		
		

	

}
