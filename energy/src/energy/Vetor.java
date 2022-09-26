package energy;

import java.util.Arrays;

public class Vetor {
	private Cadastro[] cadastro = new Cadastro [10];
	private int totalDeCadastro = 0;
	
	public void adiciona (Cadastro cadastro) {
		this.cadastro[totalDeCadastro] = cadastro;
		totalDeCadastro++;
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeCadastro;
		
	}
	public Cadastro pega(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
	}
	
	public void remove(int posicao) {
		for(int i =posicao; i < this.totalDeCadastro; i++) {
			this.cadastro[i] = this.cadastro[i+1];
		}
		
		totalDeCadastro--;
		
	}
	
	public boolean contem(Cadastro cadastro) {
	
		
		for (int i = 0; i < totalDeCadastro; i++) {
			if(cadastro.equals(cadastro[i])) {
			return true;
			}
		}
		return false;
		
	}
	
	public int tamanho() {
	return totalDeCadastro;
	}
	
	public String toString() {
		return Arrays.toString(cadastro);
	}
}
