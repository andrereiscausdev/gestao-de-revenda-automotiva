package entity;

import java.util.Date;

public class RegistroCompra {

	private long id;
	private Date data;
	private int NF;
	private float valorTotal;
	private String veiculos;
	private String comprador;
	private String vendedor;
	private Date dataDeNascimento;

	public RegistroCompra(long id, Date data, int NF, float valorTotal, Date dataDeNascimento) {
		this.id = id;
		this.data = data;
		this.NF = NF;
		this.valorTotal = valorTotal;
		this.dataDeNascimento = dataDeNascimento;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getNF() {
		return NF;
	}

	public void setNF(int nF) {
		NF = nF;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(String veiculos) {
		this.veiculos = veiculos;
	}

	public String getComprador() {
		return comprador;
	}

	public void setComprador(String comprador) {
		this.comprador = comprador;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
}