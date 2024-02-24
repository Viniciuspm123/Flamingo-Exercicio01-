/**Calculo para Area de um Quadrado
 * @author vinicius.marques
 */

package aula1;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Calcule a Area gemeométrica de um Quadrado");
	
	System.out.println("Digite o lado (l) do quadrado : ");
	int valor1 = sc.nextInt();
	
	int resultado = valor1*valor1;
			
	System.out.println("A area do quadrado é de : "+resultado);
	
	sc.close();
	}
}