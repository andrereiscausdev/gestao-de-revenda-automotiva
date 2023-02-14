package entity;

public class TB_Veiculo {
	
	long id;
	String marca;
	String modelo;
	short modeloFabricao;
	short anoFabricacao;
	String placa;
	String chassi;
	int renavam;
	
	public TB_Veiculo (long id, String marca, String modelo, short modeloFabricacao, short anoFabricacao, String placa,
	String chassi, int renavam){
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.modeloFabricao = modeloFabricacao;
		this.anoFabricacao = anoFabricacao;
		this.placa = placa;
		this.chassi = chassi;
		this.renavam = renavam;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public short getModeloFabricao() {
		return modeloFabricao;
	}

	public void setModeloFabricao(short modeloFabricao) {
		this.modeloFabricao = modeloFabricao;
	}

	public short getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(short anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public int getRenavam() {
		return renavam;
	}

	public void setRenavam(int renavam) {
		this.renavam = renavam;
	}
	
	
	
	
	
	
	

}
