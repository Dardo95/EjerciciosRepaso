/*
 * Autor: eduardo nogueira
 * la clase repaso2 tiene que dibujar un rectangulo
 * a partir del centro de la pamtalla, en el lado superior
 * de la pantalla
 * 
 */

import acm.graphics.*;

public class Repaso2 extends acm.program.GraphicsProgram{

	//declaro una variable de instancia para almacenar el rectangulo
	//como es de instancia, se ve desde el init y desde el run
	GRect rectangulo;
	
	//declaro otra variable de instancia que guardara el punto x de la 
	//pantalla en que empezara a pintarse el rectangulo
	int distanciaX;
	
	public void init(){
		//cambio el tamaño de la patalla
		setSize(800, 600);
		
		//creo el rectangulo de 120 ancho x 80 de alto
		rectangulo = new GRect(120,80);
		add(rectangulo);
	}
	
	public void run(){
		//divido el ancho de la pantalla en 2 para saber donde está
		//la mitad excta de la pantalla
		distanciaX = getWidth()/2;
		rectangulo.setLocation(distanciaX, 0);
		
	}
	
}
