package cruce;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Automovil extends Thread{
	
	int coorx,coory,velocidad,color;
	boolean Activo=true;
	char eje;
        ImageIcon Img = null ;
	public Automovil(int x,int y,int vel,char eje,int color) {
		coorx = x;
		coory = y;
		velocidad = vel;
		this.eje = eje;
		Activo=true;
                this.color=color;
	}	
	@SuppressWarnings("unused")
	public void paint(final Graphics grafica) {             
           if(eje=='X'){
               if(grafica.getColor()!=Color.white){
                switch(color){
                    case 1:
                         Img = new ImageIcon(getClass().getResource("/imagenes/1.png"));
                        break;
                    case 2:
                        Img = new ImageIcon(getClass().getResource("/imagenes/2.png"));
                        break;
                    case 3:
                         Img = new ImageIcon(getClass().getResource("/imagenes/3.png"));
                        break;
                    case 4:
                         Img = new ImageIcon(getClass().getResource("/imagenes/4.png"));
                        break;
                    case 5:
                         Img = new ImageIcon(getClass().getResource("/imagenes/5.png"));
                        break;
                    case 6:
                         Img = new ImageIcon(getClass().getResource("/imagenes/6.png"));
                        break;
                }
                grafica.drawImage(Img.getImage(), coorx,coory , null);
            }else {
                   grafica.fillRect(coorx, coory, 40, 20);
               }
           }else{
               if(grafica.getColor()!=Color.white){
                switch(color){
                case 1:
                     Img = new ImageIcon(getClass().getResource("/imagenes/1y.png"));
                    break;
                case 2:
                    Img = new ImageIcon(getClass().getResource("/imagenes/2y.png"));
                    break;
                case 3:
                     Img = new ImageIcon(getClass().getResource("/imagenes/3y.png"));
                    break;
                case 4:
                     Img = new ImageIcon(getClass().getResource("/imagenes/4y.png"));
                    break;
                case 5:
                     Img = new ImageIcon(getClass().getResource("/imagenes/5y.png"));
                    break;
                case 6:
                     Img = new ImageIcon(getClass().getResource("/imagenes/6y.png"));
                    break;
            }
                grafica.drawImage(Img.getImage(), coorx,coory , null);
           }else{
                   grafica.fillRect(coorx, coory, 30, 7);
               }
           }                                		
	}
	public void validar(String s) {
		if(s.equals("V")) {
			Activo=true;
		}else if(s.equals("R")||s.equals("E")) {
			if(eje =='X') {
				if((coorx >=400)&&(coorx <=420)  ) {
					Activo=false;
				}
			}
			if(eje == 'Y') {
				if((coory >=160)&&(coory <=180)  ) {
					Activo=false;
				}
			}
		}
	}
	public void avanzar(String sem,Graphics grafic) {		
		validar(sem);
		if(Activo) {
			grafic.setColor(Color.white);
			paint(grafic);			
			if(eje == 'X') {
				coorx -= velocidad;							
			}else if (eje == 'Y') {
				coory += velocidad;				
			}			
		}
		grafic.setColor(Color.cyan);
		paint(grafic);
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}					
	}	
}