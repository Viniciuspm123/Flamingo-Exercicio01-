/**Calculo para Area de um Trapezio
 * @author vinicius.marques
 */

package aula1;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Calcule a Area gemeométrica de um Trapézio");
	
	System.out.println("Digite a Base maior (B) : ");
	float valor1 = sc.nextFloat();
	
	System.out.println("Digite a Base menor (b) : ");
	float valor2 = sc.nextFloat();

	System.out.println("Digite a Altura (b) : ");
	float valor3 = sc.nextFloat();
	
	float resultado = (valor1+valor2)*valor3/2;
			
	System.out.println("A area do trapezio é de : "+resultado);

	sc.close();
	}
}