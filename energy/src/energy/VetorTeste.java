package energy;

public class VetorTeste {
	public static void main(String[] args) {
		Cadastro c1 = new Cadastro("Alessandra");
		Cadastro c2  = new Cadastro("Jose");
		
		Vetor lista = new Vetor();
		
		System.out.println(lista.tamanho());
		lista.adiciona(c1);
		System.out.println(lista.tamanho());
		lista.adiciona(c2);
		System.out.println(lista.tamanho());
		
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);
	}

}
