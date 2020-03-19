import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Iniciando fase de levantamento de requisitos");
		System.out.println("Respons�veis: Engenheiro de Software e Analista de Neg�cios");
		System.out.println("Digite 0 para encerrar a fase de requisitos");

		String tipoRequisito = "", descRequisito;
		int contRequisitos=0;
		
		ArrayList<Requisitos> requisitos = new ArrayList<>();

		while (tipoRequisito != "fim") {
			
			Requisitos requisito = new Requisitos();
			System.out.println("Tipo de requisito: Funcional, NFuncional, Dominio ou Dados?");
			tipoRequisito = teclado.nextLine();
			requisito.setTipoRequisito(tipoRequisito);
			System.out.println("Descreva o requisito: ");
			descRequisito = teclado.nextLine();
			requisito.setRequisito(descRequisito);
			
			requisitos.add(requisito);
			
		}
		
		System.out.println("Elicita��o de requisitos finalizada!");
		

	}

}
