package draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	
	private Color color;
	private int[]x= {290,310,330,350,350,330,310,290};
	private int[]y= {90,70,70,90,110,130,130,110};
	private Polygon poly ;
	/**
	 * Create the panel.
	 */
	//111111111111111111111111111111111111111111111111111111111111
	public DrawPanel() {

	}
	
	@Override
	protected void paintComponent(Graphics g) {
		//色の設定
		g.setColor(Color.green);
		//直線
		g.drawLine(20, 20, 200, 100);
		//色の設定
		g.setColor(Color.RED);
		//短形
		g.drawRect(10, 10, 100, 50);
		
		color = new Color(200,120,200);
		g.setColor(color);
		//塗りつぶし
		g.fillRect(50, 50, 50, 100);
		
		
		g.setColor(color.blue);
		//楕円
		g.drawOval(100, 100, 50, 50);
		
		poly = new Polygon(x,y,8);
		g.fillPolygon(poly);
	}
}
