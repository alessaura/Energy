package energy;

public class Cadastro {
	private String nome;
	
	public Cadastro (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		Cadastro outro = (Cadastro) obj;
		return outro.getNome().equals(this.nome);
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
	
}
