package view;
import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Botoes extends JPanel {
	
	JSlider sliderTX = new JSlider(-300, 300, 0);
	JSlider sliderTY = new JSlider(-300, 600, 0);
	
	JSlider sliderQtd = new JSlider(3, 50, 3);
	
	double rFator = 100;
	JSlider sliderR = new JSlider(0, (int)(2*Math.PI*rFator), 0);

	JSlider sliderE = new JSlider(5, 300, 100);

	JSlider sliderCH = new JSlider(-25, 25, 0);
	JSlider sliderCV = new JSlider(-25, 25, 0);

	public Botoes() {
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		add(new Label("Translade em X"));
		add(sliderTX);
		add(new Label("Translade em Y"));
		add(sliderTY);
		add(new Label("Quantidade de pontos no círculo"));
		add(sliderQtd);
		add(new Label("Rotacao"));
		add(sliderR);
		add(new Label("Escalamento"));
		add(sliderE);
		add(new Label("Cisalhamento Horizontal"));
		add(sliderCH);
		add(new Label("Cisalhamento Vertical"));
		add(sliderCV);
	}
	
	public int getValorSlideTX() {
		return sliderTX.getValue();
	}
	
	public int getValorSlideTY() {
		return sliderTY.getValue();
	}
	
	public int getValorSlideQtd() {
		return sliderQtd.getValue();
	}
	
	public double getValorSlideR() {
		return (double)sliderR.getValue()/(double)rFator;
	}

	public int getValorSliderE() { return sliderE.getValue();  }

	public double getValorSliderCH() {
		double value = sliderCH.getValue();
		return value/10;
	}

	public double getValorSliderCV() {
		double value = sliderCV.getValue();
		return value/10;
	}

	public void adicionaListenerSlide(ChangeListener cl) {
		sliderTX.addChangeListener(cl);
		sliderTY.addChangeListener(cl);
		sliderQtd.addChangeListener(cl);
		sliderR.addChangeListener(cl);
		sliderE.addChangeListener(cl);
		sliderCH.addChangeListener(cl);
		sliderCV.addChangeListener(cl);
	}

}
