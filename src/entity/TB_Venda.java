package entity;

import java.sql.Date;

public class TB_Venda {
	
	long id;
	Date data;
	int notaFiscal;
	float valorTotal;
	String veiculos;
	String comprador;
	String vendedor;
	
	public TB_Venda(long id, Date data, int notaFiscal, float valorTotal, String veiculos, String comprador, String vendedor) {
		this.id = id;
		this.data = data;
		this.notaFiscal = notaFiscal;
		this.valorTotal = valorTotal;
		this.veiculos = veiculos;
		this.comprador = comprador;
		this.vendedor = vendedor;
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

	public int getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
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
	

}
