package cruce;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Cruce extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	int numerAutX,numerAutY;
	Semaforo semx=new Semaforo(1,400,400);
	Semaforo semy=new Semaforo(0,150,150);
	
	Automovil hilo1 = new Automovil(600, 202, 2, 'X',1);
	Automovil hilo2 = new Automovil(600, 250, 4, 'X',2);
	Automovil hilo3 = new Automovil(600, 300, 3, 'X',3);
	Automovil hilo4 = new Automovil(600, 350, 5, 'X',4);
        Automovil hilo9x = new Automovil(600, 226, 2, 'X',4);
        Automovil hilo10x = new Automovil(600, 324, 6, 'X',4);
	Automovil hilo5 = new Automovil(202, 0, 2, 'Y',5);
	Automovil hilo6 = new Automovil(250, 0, 3, 'Y',6);
	Automovil hilo7 = new Automovil(300, 0, 4, 'Y',1);
	Automovil hilo8 = new Automovil(350, 0, 6, 'Y',2);
        Automovil hilo11y = new Automovil(226, 0, 5, 'Y',4);
        Automovil hilo12y = new Automovil(324, 0, 2, 'Y',4);
	
	
	public Cruce( ) {
	setSize(600,600);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        
//        numerAutX = (int) ((Math.random()* 6) + 1);
//        numerAutY = (int) ((Math.random()* 6) + 1);
        numerAutX= 6;
        numerAutY = 6;
        semx.start();
        semy.start();
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
        hilo7.start();
        hilo8.start();
        hilo9x.start();
        hilo10x.start();
        hilo11y.start();
        hilo12y.start();

	}
	public void cruc(Graphics h) {
//		h.setColor(Color.gray);
//		h.fillRect(1, 1, 200, 200);
//		h.fillRect(400, 400, 200, 200);
//		h.fillRect(1, 400, 200, 200);
//                h.fillRect(400, 1, 200, 200);
                
                ImageIcon Img1 = new ImageIcon(getClass().getResource("/imagenes/s1.png"));
                ImageIcon Img2 = new ImageIcon(getClass().getResource("/imagenes/s2.png"));
                ImageIcon Img3 = new ImageIcon(getClass().getResource("/imagenes/s3.png"));
                ImageIcon Img4 = new ImageIcon(getClass().getResource("/imagenes/s4.png"));
                 h.drawImage(Img1.getImage(), 1,1 , null);
                 h.drawImage(Img2.getImage(), 400,1 , null);
                 h.drawImage(Img3.getImage(), 400,400 , null);
                 h.drawImage(Img4.getImage(), 1,400 , null);
	    
	}
	@Override
	public void paint(Graphics g) {
		 cruc(g);
		 semx.paint(g);
		 semy.paint(g);
                 
		 if(numerAutX >=1){
                    hilo1.avanzar(semx.trafico, g);
                    if(numerAutX >=2){
                        hilo2.avanzar(semx.trafico, g);
                        if(numerAutX >=3){
                            hilo3.avanzar(semx.trafico, g);
                            if(numerAutX >=4){
                                hilo4.avanzar(semx.trafico, g);
                                if(numerAutX >=5){
                                    hilo9x.avanzar(semx.trafico, g);
                                    if(numerAutX ==6){
                                        hilo10x.avanzar(semx.trafico, g);
                                    }
                                }
                            }
                        }
                    }
                }
                if(numerAutY >=1){
                    hilo5.avanzar(semy.trafico, g);
                    if(numerAutY >=2){
                        hilo6.avanzar(semy.trafico, g);
                        if(numerAutY >=3){
                            hilo7.avanzar(semy.trafico, g);
                            if(numerAutY >=4){
                                hilo8.avanzar(semy.trafico, g);
                                if(numerAutY >=5){
                                    hilo11y.avanzar(semy.trafico, g);
                                    if(numerAutY ==6){
                                        hilo12y.avanzar(semy.trafico, g);
                                    }
                                }
                            }
                        }
                    }
                }
                
                if (hilo1.coorx <-26){
                    hilo1.coorx =600;
                    hilo1.color=(int) ((Math.random()* 6) + 1);
                    hilo1.velocidad= (int) ((Math.random()* 5) + 2);
                }
                if (hilo2.coorx <-26){
                    hilo2.coorx =600;
                    hilo2.color=(int) ((Math.random()* 6) + 1);
                    hilo2.velocidad= (int) ((Math.random()* 5) + 2);
                }
                if (hilo3.coorx <-26){
                    hilo3.coorx =600;
                    hilo3.color=(int) ((Math.random()* 6) + 1);
                    hilo3.velocidad= (int) ((Math.random()* 5) + 2);
                }if (hilo4.coorx <-26){
                    hilo4.coorx =600;
                    hilo4.color=(int) ((Math.random()* 6) + 1);
                    hilo4.velocidad= (int) ((Math.random()* 5) + 2);
                }if (hilo9x.coorx <-26){
                    hilo9x.coorx =600;
                    hilo9x.color=(int) ((Math.random()* 6) + 1);
                    hilo9x.velocidad= (int) ((Math.random()* 5) + 2);
                }if (hilo10x.coorx <-26){
                    hilo10x.coorx =600;
                    hilo10x.color=(int) ((Math.random()* 6) + 1);
                    hilo10x.velocidad= (int) ((Math.random()* 5) + 2);
                }
                if (hilo5.coory >600){
                    hilo5.coory =0;   
                    hilo5.color=(int) ((Math.random()* 6) + 1);
                    hilo5.velocidad= (int) ((Math.random()* 5) + 2);
                }if (hilo6.coory >600){
                    hilo6.coory =0;   
                    hilo6.color=(int) ((Math.random()* 6) + 1);
                    hilo6.velocidad= (int) ((Math.random()* 5) + 2);
                }if (hilo7.coory >600){
                    hilo7.coory =0;   
                    hilo7.color=(int) ((Math.random()* 6) + 1);
                    hilo7.velocidad= (int) ((Math.random()* 5) + 2);
                }if (hilo8.coory >600){
                    hilo8.coory =0;   
                    hilo8.color=(int) ((Math.random()* 6) + 1);
                    hilo8.velocidad= (int) ((Math.random()* 5) + 2);
                }if (hilo11y.coory >600){
                    hilo11y.coory =0;   
                    hilo11y.color=(int) ((Math.random()* 6) + 1);
                    hilo11y.velocidad= (int) ((Math.random()* 5) + 2);
                }if (hilo12y.coory >600){
                    hilo12y.coory =0;   
                    hilo12y.color=(int) ((Math.random()* 6) + 1);
                    hilo12y.velocidad= (int) ((Math.random()* 5) + 2);
                }
//                if (hilo1.coorx <-20){
//                    hilo1.coorx =600;
//                    hilo2.coorx =600;
//                    hilo3.coorx =600;
//                    hilo4.coorx =600;
//                    hilo9x.coorx =600;
//                    hilo10x.coorx =600;
//                    numerAutX = (int) ((Math.random()* 6) + 1);
//                    
//                    hilo1.color=(int) ((Math.random()* 6) + 1);
//                    hilo2.color=(int) ((Math.random()* 6) + 1);
//                    hilo3.color=(int) ((Math.random()* 6) + 1);
//                    hilo4.color=(int) ((Math.random()* 6) + 1);
//                    hilo9x.color=(int) ((Math.random()* 6) + 1);
//                    hilo10x.color=(int) ((Math.random()* 6) + 1);
//                    
//                }
                
//                if (hilo5.coory >600){
//                    hilo5.coory =0;
//                    hilo6.coory =0;
//                    hilo7.coory =0;
//                    hilo8.coory =0;
//                    hilo11y.coory =0;
//                    hilo12y.coory =0;
//                    numerAutY = (int) ((Math.random()* 6) + 1);
//                   
//                    hilo5.color=(int) ((Math.random()* 6) + 1);
//                    hilo6.color=(int) ((Math.random()* 6) + 1);
//                    hilo7.color=(int) ((Math.random()* 6) + 1);
//                    hilo8.color=(int) ((Math.random()* 6) + 1);
//                    hilo11y.color=(int) ((Math.random()* 6) + 1);
//                    hilo12y.color=(int) ((Math.random()* 6) + 1);
//                }
                     
                     
                 
	}
	
	
	
	
	public static void main(String[] args) {
		Cruce nuevo = new Cruce();
                
		while (true) {
			nuevo.repaint();
                        
		}
	}
}

/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GUI extends JFrame
{
    int grafico = 0 ;
    public GUI()
    {
        super("Graficas en java");
        setSize(500,500);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        accionkeyboard KB = new accionkeyboard();
        addKeyListener(KB);
    }

    public void paint (Graphics g)
    {
        //repaint();
        if(grafico == 1)
        {

            g.setColor(Color.red);
            g.drawRect(
                    (int) ((Math.random()* 350) + 1),
                    (int) ((Math.random()* 350) + 1),
                    (int) ((Math.random()* 200) + 1),
                    (int) ((Math.random()* 200) + 1));

            g.drawOval(
                    (int) ((Math.random()* 350) + 1),
                    (int) ((Math.random()* 350) + 1),
                    (int) ((Math.random()* 200) + 1),
                    (int) ((Math.random()* 200) + 1));

            int [] vx1 = {(int) ((Math.random()* 350) + 1),(int) ((Math.random()* 350) + 1), (int) ((Math.random()* 350) + 1)};
            int [] vy1 = {(int) ((Math.random()* 350) + 1),(int) ((Math.random()* 350) + 1), (int) ((Math.random()* 350) + 1)};
            g.drawPolygon (vx1, vy1, 3);


            grafico = 0;

        }
        else if  (grafico == 2)
        {
            g.setColor(Color.RED);
            g.drawLine(
                    (int) ((Math.random()* 450) + 1),
                    (int) ((Math.random()* 450) + 1),
                    (int) ((Math.random()* 450) + 1),
                    (int) ((Math.random()* 450) + 1));
            grafico=0;
        }

        else if (grafico == 3)
        {
           Toolkit t = Toolkit.getDefaultToolkit ();
            Image imagen = t.getImage ("infinity.jpg");
            g.drawImage (imagen, 10, 30, this);
            grafico = 0;
        }

        else if (grafico == 4)
        {
            g.drawRect(1,386,500,1);

            for (int i = 0 ; i <= 255 ; i++)
            {
                try {
                    g.setColor(Color.black);
                    g.drawOval(20,30+i,100,100);
                    Thread.sleep(50);
                    g.setColor(Color.white);
                    g.drawOval(20,30+i,100,100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            grafico = 0;
        }
        repaint();
    }
    class accionkeyboard extends KeyAdapter
    {
        @Override
            public void keyPressed(KeyEvent e){
            try {
                aux(e);
            }
            catch (letrainvalida ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
        }
        }

    public void aux(KeyEvent e) throws letrainvalida{
        int teclado = e.getKeyCode();
        if (teclado == KeyEvent.VK_L) {
            System.out.println("le dio a la L");
            grafico = 1;
            repaint();
        } else if (teclado == KeyEvent.VK_C) {
            System.out.println("le dio a la C");
            grafico = 2;
            repaint();
        } else if (teclado == KeyEvent.VK_I) {
            System.out.println("le dio a la I");
            grafico = 3;
            repaint();
        }
        else if (teclado== KeyEvent.VK_Q) {
             System.out.println("le dio a la Q");
             grafico = 4;
             repaint();
         }
        else {
                throw new letrainvalida();
        }
    }
    public class letrainvalida extends Exception
    {
        public String getMessage()
        {
            return "letra invalida";
        }
    }

    public static void main (String args [])
    {
        new GUI();

    }
}*/