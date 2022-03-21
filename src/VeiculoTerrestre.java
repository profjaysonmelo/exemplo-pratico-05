
public class VeiculoTerrestre extends Veiculo {
	
	private int tamanhoRoda;
	private Double kilometragem;
	
	public int getTamanhoRoda() {
		return tamanhoRoda;
	}
	public void setTamanhoRoda(int tamanhoRoda) {
		this.tamanhoRoda = tamanhoRoda;
	}
	public Double getKilometragem() {
		return kilometragem;
	}
	public void setKilometragem(Double kilometragem) {
		this.kilometragem = kilometragem;
	}
	
	public void incluirMotorista(String nomeMotorista) {
		System.out.println("Nome do Motorista: " + nomeMotorista);
	}
}
