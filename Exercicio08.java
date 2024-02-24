/**Calculo para Area de um Triângulo
 * @author vinicius.marques
 */

package aula1;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Calcule a Area gemeométrica de um triângulo");
	
	System.out.println("Digite a base (b) do triângulo : ");
	float valor1 = sc.nextFloat();
	
	System.out.println("Digite a altura (h) do triângulo : ");
	float valor2 = sc.nextFloat();
	
	float resultado = valor1*valor2/2;
			
	System.out.println("A area do triângulo é de : "+resultado);
	
	sc.close();
	}
}