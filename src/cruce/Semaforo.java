package cruce;

import java.awt.Color;
import java.awt.Graphics;

public class Semaforo extends Thread {
	
	String trafico;// podraa adquirir los 3 estados R(rojo) E(espera) V(verde)
	int x,y;
	public Semaforo(int comienzo ,int x,int y ) {
		
		this.x = x;
		this.y = y;
		if(comienzo==1) {
			trafico = "V";
		}else {
			trafico = "R";
		}
		
	}
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x, y, 50, 50);
		if(trafico.equals("R")) {
			g.setColor(Color.RED);
			g.fillRect(x+5, y+5, 40, 40);
		}else if(trafico.equals("V")) {
			g.setColor(Color.GREEN);
			g.fillRect(x+5, y+5, 40, 40);
		}else if(trafico.equals("E")) {
			g.setColor(Color.YELLOW);
			g.fillRect(x+5, y+5, 40, 40);
		}
	}
	
	public void cambiar() {
		if(trafico.equals("R")) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			trafico = "E";
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			trafico = "V";
		}else {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			trafico = "E";
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			trafico = "R";
		}
	}
	
	@Override
	public void run() {
		while(true) {
			cambiar();
		}
	}
}
