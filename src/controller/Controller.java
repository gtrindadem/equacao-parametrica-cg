package controller;

import model.Model;
import view.View;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.geom.Point2D;

public class Controller {
	
	View view;
	Model model;
	
	public Controller() {
		model = new Model();
		view = new View(model.getDesenho());
		
		view.adicionaListenerSlide(new MudaSlide());
	}
	
	class MudaSlide implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			int quantidadePontos = view.getValorQtd();
			model.updateQuantidade(quantidadePontos);
			
			Point2D.Double t = view.getValorT();
			double r = view.getValorR();
			int escal = view.getValorE();
			Point2D.Double c = view.getValorC();
			
			Shape desenho = model.makeTransformacoes(t, r, escal, c);
			
			view.atualiza(desenho);
			
		}
		
	}
	

}
