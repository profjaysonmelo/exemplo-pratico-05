
public class Principal {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		veiculo.setMarca("FORD");
		veiculo.setModelo("FUSCA");
		veiculo.setAno(1979);
		
		System.out.println(veiculo.getDadosVeiculo());
		
		VeiculoTerrestre veiculoT1 = new VeiculoTerrestre();
		veiculoT1.setMarca("VW");
		veiculoT1.setModelo("KOMBI");
		veiculoT1.setAno(1990);
		
		veiculoT1.setKilometragem(10000.00);
		veiculoT1.setTamanhoRoda(15);
		
		System.out.println(veiculoT1.getDadosVeiculo());
		System.out.println("Km: " + veiculoT1.getKilometragem());
				
	}
	
}
