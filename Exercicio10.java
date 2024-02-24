/**Calculo para Area de um Losangulo
 * @author vinicius.marques
 */

package aula1;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Calcule a Area gemeométrica de um Losângulo");
	
	System.out.println("Digite o diametro maior (D) : ");
	float valor1 = sc.nextFloat();
	
	System.out.println("Digite o diametro menor (d) : ");
	float valor2 = sc.nextFloat();

	float resultado = valor1*valor2/2;
			
	System.out.println("A area do Losângulo é de : "+resultado);
	
	sc.close();
	}
}