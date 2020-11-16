package entidades;

import java.util.Date;

import entidades.enums.StatusDeCompra;

public class Pedido 
{
	private Integer id;
	private Date momento;
	private StatusDeCompra status;
	
	public Pedido() 
	{}

	public Pedido(Integer id, Date momento, StatusDeCompra status) 
	{
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public Integer getId() 
	{
		return id;
	}

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Date getMomento() 
	{
		return momento;
	}

	public void setMomento(Date momento) 
	{
		this.momento = momento;
	}

	public StatusDeCompra getStatus() 
	{
		return status;
	}

	public void setStatus(StatusDeCompra status) 
	{
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", momento=" + momento + ", status=" + status.toString() + "]";
	}
	
	
	
}
