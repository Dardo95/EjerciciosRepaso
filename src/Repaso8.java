/*
 * Repaso 8
 * 
 * 
 */

import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.util.RandomGenerator;

public class Repaso8 extends acm.program.GraphicsProgram{

	//declaro una variable de instancia para guardar el rectángulo
	GRect rectangulo;

	//declaro una variable de tipo aleatorio
	RandomGenerator aleatorio = new RandomGenerator();

	public void init(){
		setSize(800,600);
		rectangulo = new GRect(120, 80);
		//inserto el "escuchador" del raton
		addMouseListeners();

	}

	public void run(){
		//Añado el rectángulo en el centro exacto de la pantalla
		add(rectangulo, 
				getWidth()/2 - rectangulo.getWidth()/2,
				getHeight()/2 - rectangulo.getHeight()/2
				);
	}


	//añado el método que escucha el evento del clic del raton

	public void mouseClicked (MouseEvent evento){
		//si en la posición en la que se ha hecho clic
		//está el rectángulo entonces lo relleno

		if ( getElementAt( evento.getX(), evento.getY()) == rectangulo ){
			double distanciaAlCentroDelRectangulo =
					evento.getX() - rectangulo.getX();
			if(distanciaAlCentroDelRectangulo > rectangulo.getWidth()/2){
				rectangulo.move(10, 0);
			}
			else{
				rectangulo.move(-10, 0);
			}
			
		}
	}
}
