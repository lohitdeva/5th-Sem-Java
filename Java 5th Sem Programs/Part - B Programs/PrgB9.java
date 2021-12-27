//Program to draw a bar chart using applets

import java.awt.*;
import java.applet.*;

public class PrgB9 extends Applet {
	int n = 0;
	String label[];
	int val[];
	
	public void init() {
		try {
			n = Integer.parseInt(getParameter("columns"));
			label = new String[n];
			val = new int[n];
			label[0] = getParameter("label1");
			label[1] = getParameter("label2");
			label[2] = getParameter("label3");
			label[3] = getParameter("label4");
			label[4] = getParameter("label5");
			val[0] = Integer.parseInt(getParameter("c1"));
			val[1] = Integer.parseInt(getParameter("c2"));
			val[2] = Integer.parseInt(getParameter("c3"));
			val[3] = Integer.parseInt(getParameter("c4"));
			val[4] = Integer.parseInt(getParameter("c5"));
		}
		catch (NumberFormatException e) {
		}
	}
	
	public void paint(Graphics g) {
		for(int i = 0; i < n; i++) {
			g.setColor(Color.red);
			g.drawString(label[i], 20, i * 50 + 30);
			g.fillRect(50, i * 50 + 10, val[i], 40);
		}
	}
}