package view;
import javax.swing.*;
import java.awt.*;

public class Tela extends JPanel {
	
	Shape desenho;
	
	public Tela(Shape desenho) {
		this.desenho = desenho;
	}
	
	public void atualiza(Shape desenho) {
		this.desenho = desenho;
		repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		this.setBackground(new Color(218, 234, 255));

		g2d.setColor(Color.blue);

		g2d.setStroke(new BasicStroke(15));
		
		g2d.fill(desenho);
		
	}

}
