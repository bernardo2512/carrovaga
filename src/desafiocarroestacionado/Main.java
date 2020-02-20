package desafiocarroestacionado;

public class Main {

	public static void main(String[] args) {
		Carro c1 = new Carro("preto","ffa4452",130);
		Estacionamento e1 = new Estacionamento(1,c1);
		
		System.out.println(e1.toString());

	}

}
