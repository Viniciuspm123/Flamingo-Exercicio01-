/**Calculo para Area de um Circulo
 * @author vinicius.marques
 */

package aula1;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Calcule a Area gemeométrica de um Circulo");
	
	System.out.println("Digite o Raio (r) : ");
	float valor1 = sc.nextFloat();

	float pi = 3.14f;
		
	float resultado =pi*(valor1*valor1);
			
	System.out.println("A area do seu trinângulo é de : "+resultado);

	sc.close();
	}
}