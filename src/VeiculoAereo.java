
public class VeiculoAereo extends Veiculo {

	private String tipoTurbina;
	private int altitudeMaxima;
	public String getTipoTurbina() {
		return tipoTurbina;
	}
	public void setTipoTurbina(String tipoTurbina) {
		this.tipoTurbina = tipoTurbina;
	}
	public int getAltitudeMaxima() {
		return altitudeMaxima;
	}
	public void setAltitudeMaxima(int altitudeMaxima) {
		this.altitudeMaxima = altitudeMaxima;
	}
	
	public void ligarTurbina() {
		System.out.println("Ligando turbina...");
	}
}
