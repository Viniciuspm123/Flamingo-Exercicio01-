/**Calculo para Divisão de dois valores
 * @author vinicius.marques
 */

package aula1;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um valor : ");
	float valor1 = sc.nextFloat();
	
	System.out.println("Digite um segundo valor : ");
	float valor2 = sc.nextFloat();
	
	float resultado = valor1/valor2;
			
	System.out.println("A divisão dos valores digitados é : "+resultado);
	
	sc.close();
	}
}