package desafiocarroestacionado;

public class Estacionamento {
	
	private int numeroVaga;
	private Carro carro;
	
	public Estacionamento(int numeroVaga, Carro carro) {
		this.numeroVaga = numeroVaga;
		this.carro = carro;
	}

	@Override
	public String toString() {
		return "Estacionamento [numeroVaga=" + numeroVaga + ", carro=" + carro + "]";
	}
	
	

}
