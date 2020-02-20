package desafiocarroestacionado;

public class Carro {
	private String cor;
	private String placa;
	private int velMax;
	
	
	public Carro(String cor, String placa, int velMax) {
		this.cor = cor;
		this.placa = placa;
		this.velMax = velMax;
	}
	
	
	public String getCor() {
		return cor;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public int getVelMax() {
		return velMax;
	}


	@Override
	public String toString() {
		return "Carro [cor=" + cor + ", placa=" + placa + ", velMax=" + velMax + "]";
	}
	
	

}
