package entity;

public class TB_Veiculo {

	private long id;
	private String nome;
	private String marca;
	private String modelo;
	private String anoDoModelo;
	private String placa;
	private String chassi;
	private int ranavam;

	public TB_Veiculo(long id, String marca, String modelo, String anoDoModelo, String placa, String chassi,
			int renavam) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.anoDoModelo = anoDoModelo;
		this.placa = placa;
		this.chassi = chassi;
		this.ranavam = renavam;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getAnoDoModelo() {
		return anoDoModelo;
	}

	public void setAnoDoModelo(String anoDoModelo) {
		this.anoDoModelo = anoDoModelo;
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

	public int getRanavam() {
		return ranavam;
	}

	public void setRanavam(int ranavam) {
		this.ranavam = ranavam;
	}
}