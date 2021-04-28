package model;

import entity.Desenho;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;

public class Model {
	
	Desenho desenho = new Desenho(3);
	
	public Model() {
	}
	
	public void updateQuantidade(int quantidadePontos) {
		desenho.updateQuantidadePontos(quantidadePontos);
	}
	
	public Shape makeTransformacoes(
			Point2D.Double t,  // valor da transformação de translação
			double a,  // valor do angulo de rotação
			int e, // valor do escalamento
			Point2D.Double c // valor dos cizalhamentos
			) {
		desenho.updateRaio(e);

		Point2D.Double pontoCentral = desenho.getPontoCentral();
		
		AffineTransform transformacao = new AffineTransform();
		
		// Transformação de rotação
		transformacao.preConcatenate(AffineTransform.getTranslateInstance(-pontoCentral.x, -pontoCentral.y));
		transformacao.preConcatenate(AffineTransform.getRotateInstance(a));
		transformacao.preConcatenate(AffineTransform.getTranslateInstance(pontoCentral.x, pontoCentral.y));
		
		// Transformação de Translação
		transformacao.preConcatenate(AffineTransform.getTranslateInstance(t.x, t.y));

		// Transformação de Cizalhamento
		transformacao.preConcatenate(AffineTransform.getTranslateInstance(-pontoCentral.x, -pontoCentral.y));
		transformacao.preConcatenate(AffineTransform.getShearInstance(c.x, c.y));
		transformacao.preConcatenate(AffineTransform.getTranslateInstance(pontoCentral.x, pontoCentral.y));
		
		Shape desenhoTransformado = transformacao.createTransformedShape(desenho);
		
		return desenhoTransformado;
		
	}
	
	public Desenho getDesenho() {
		return desenho;
	}
	
	
	

}
