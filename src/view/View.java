package view;

import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.geom.Point2D;

public class View {
	
	Janela janela;
	
	public View(Shape desenho) {
		janela = new Janela(desenho);
	}
	
	public void atualiza(Shape desenho) {
		janela.atualiza(desenho);
	}
	
	public void adicionaListenerSlide(ChangeListener cl) {
		janela.adicionaListenerSlide(cl);
	}
	
	public Point2D.Double getValorT() {
		return janela.getValorSlideT();
	}

	public Point2D.Double getValorC() { return janela.getValorSliderC();	}

	public int getValorQtd() {
		return janela.getValorSlideQtd();
	}

	public double getValorR() {
		return janela.getValorSlideR();
	}

	public int getValorE() { return janela.getValorSlideE(); }

}
