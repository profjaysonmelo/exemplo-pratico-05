
public class VeiculoAquatico extends Veiculo {

	private int tamanhoCasco;
	private int numColetes;
	
	public int getTamanhoCasco() {
		return tamanhoCasco;
	}
	public void setTamanhoCasco(int tamanhoCasco) {
		this.tamanhoCasco = tamanhoCasco;
	}
	public int getNumColetes() {
		return numColetes;
	}
	public void setNumColetes(int numColetes) {
		this.numColetes = numColetes;
	}
	
	public void baixarMotores() {
		System.out.println("Baixando motores...");
	}
}
