import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws InterruptedException {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Iniciando fase de levantamento de requisitos");
		System.out.println("Responsáveis: Engenheiro de Software e Analista de Negócios");
		System.out.println("Digite 5 requisitos para encerrar a fase de requisitos");

		String tipoRequisito = "", descRequisito;
		int contRequisitos=0;
		
		ArrayList<Requisitos> requisitos = new ArrayList<>();

		while (contRequisitos != 5) {
			
			Requisitos requisito = new Requisitos();
			System.out.println("Tipo de requisito: Funcional, NFuncional, Dominio ou Dados?");
			tipoRequisito = teclado.nextLine();		
			requisito.setTipoRequisito(tipoRequisito);
			System.out.println("Descreva o requisito: ");
			descRequisito = teclado.nextLine();
			requisito.setRequisito(descRequisito);
			
			requisitos.add(requisito);
			contRequisitos++;
			
		}
		
		System.out.println("Elicitação de requisitos finalizada!");
		System.out.println("Iniciada fase de projetos!");
		System.out.println("Responsáveis: Engenheiro de Software e Gestor de Projeto.");
		System.out.println("Realizando documentação!");
		Thread.sleep(1000);
		System.out.println("Planejando fases e datas do projeto");
		Thread.sleep(1000);
		System.out.println("Fase de planejamento finalizada!");
		System.out.println("Estamos prontos para construir o software!");
		System.out.println("Iniciando fase de desenvolvimento!");
		System.out.println("Responsáveis: Desenvolvedores");
		
		
		int classes = 0;
		
		for(Requisitos requisito: requisitos){
		
			System.out.println("Construindo classe: "+classes+" para atender o requisito: "
								+ requisito.getRequisito() +", do tipo: "+ requisito.getTipoRequisito());
			classes++;
			Thread.sleep(1000);
		}
		
		System.out.println("Desenvolvimento finalizado!");
		System.out.println("Iniciando fase de testes");
		
		int teste = 1;
		
		for(Requisitos requisito: requisitos){
		
			System.out.println("Realizando teste: "+teste);
			
			if(teste == 2 || teste == 5) {
				System.out.println("Teste falhou! Código deve ser refatorado");
			} else {
				System.out.println("Teste passou!");
			}
			
			classes++;
			Thread.sleep(1000);
		}
		
		System.out.println("Iniciando revisão de código");
		Thread.sleep(3000);
		System.out.println("Código refatorado e testes aprovados");
		System.out.println("Software pronto para ser implantado em produção");
		
		System.out.println("Configurando ambiente de produção");
		Thread.sleep(3000);
		System.out.println("Certificando-se de que está tudo em ordem para a implantação");
		Thread.sleep(1000);
		System.out.println("Realizando implantação");
		Thread.sleep(3000);
		System.out.println("Software Implantado!");
		System.out.println("Fim do processo de software!");

	}

}
