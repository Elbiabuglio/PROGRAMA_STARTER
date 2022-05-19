
import java.util.Scanner;
public class Suco {

public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);

	System.out.println("Digite a quantidade de litros");
	double litros = leitor.nextDouble();

	System.out.println("Quao o tipo de suco: L(Limao) - T(Tamarino) ");
	String tipoSuco = leitor.next();
	
	double precoTamrino = 0;
	double precoLimao = 0;

	double percentualDesconto = 0;
	double total = 0;
	double totalDeconto = 0;

	if (tipoSuco.equalsIgnoreCase("l")) {
		if (litros > 20) {
			percentualDesconto = 0.03;
		} else {
			percentualDesconto = 0.05;
		}
		total = litros * precoLimao;
	} else if (tipoSuco.equalsIgnoreCase("t")) {
		if (litros > 20) {
			percentualDesconto = 0.04;
		} else {
			percentualDesconto = 0.06;
		}
		double precoTamarino = 0;
		total = litros * precoTamarino;
	}
	totalDeconto = total * percentualDesconto;
	
	double precoPAGAR = total - totalDeconto;
	
	System.out.println("Preço FInal R$ " + precoPAGAR);

}
}