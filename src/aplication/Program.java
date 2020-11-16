package aplication;

import java.util.Date;

import javax.swing.JOptionPane;

import entidades.Pedido;
import entidades.enums.StatusDeCompra;

public class Program {

	public static void main(String[] args) {
		
		Pedido n = new Pedido(1080, new Date(), StatusDeCompra.PagamentoPendente);
		
		JOptionPane.showMessageDialog(null, n);
	}
}
