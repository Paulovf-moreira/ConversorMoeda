package entidade;

public class CalculoMoeda {
	
	
	public static double conversao (double preco, double quantidadeDolares) {
		return (preco*quantidadeDolares/100*6)+preco*quantidadeDolares;
	}

}
