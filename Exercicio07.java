/**Calculo para Area de um Retangulo
 * @author vinicius.marques
 */

package aula1;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Calcule a Area gemeométrica de um retângulo");
	
	System.out.println("Digite a base (b) do retângulo : ");
	int valor1 = sc.nextInt();
	
	System.out.println("Digite a altura (h) do retângulo : ");
	int valor2 = sc.nextInt();
	
	int resultado = valor1*valor2;
			
	System.out.println("A area do retangulo é de : "+resultado);
	
	sc.close();
	}
}