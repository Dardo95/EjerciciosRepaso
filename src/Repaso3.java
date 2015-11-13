/*
 * Autor: eduardo nogueira
 * la clase repaso2 tiene que dibujar un rectangulo
 * con la esquina superior ixquierda en el centro
 * de la pantalla
 * 
 */

import acm.graphics.*;

public class Repaso3 extends acm.program.GraphicsProgram{

	//declaro una variable de instancia para almacenar el rectangulo
	//como es de instancia, se ve desde el init y desde el run
	GRect rectangulo;

	//declaro otra variable de instancia que guardara el punto x de la 
	//pantalla en que empezara a pintarse el rectangulo
	int distanciaX;

	//declaro otra variable de instancia que guardara el punto Y de la 
	//pantalla en que empezara a pintarse el rectangulo
	int distanciaY;

	public void init(){
		//cambio el tamaño de la patalla
		rectangulo = new GRect(120, 80);
		setSize(800, 600);		
		add(rectangulo);
	}

	public void run(){
		//divido el ancho de la pantalla en 2 para saber donde está
		//la mitad excta de la pantalla
		distanciaX = getWidth()/2;
		distanciaY = getHeight()/2;
		rectangulo.setLocation(distanciaX, distanciaY);

	}

}
