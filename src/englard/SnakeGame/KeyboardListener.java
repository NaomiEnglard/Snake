package englard.SnakeGame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardListener extends KeyAdapter {
	
	private ThreadsController cont;
	public KeyboardListener(ThreadsController thread){
		cont = thread;
	}

	public void keyPressed(KeyEvent e) {
		//ThreadsController cont = new ThreadsController();
		switch (e.getKeyCode()) {
		case 39: // -> Right
					// if it's not the opposite direction
			if (cont.getDirectionSnake() != 2)
				cont.setDirectionSnake(1) ;
			break;
		case 38: // -> Top
			if (cont.getDirectionSnake() != 4)
				cont.setDirectionSnake(3) ;
			break;

		case 37: // -> Left
			if (cont.getDirectionSnake() != 1)
				cont.setDirectionSnake(2) ;
			break;

		case 40: // -> Bottom
			if (cont.getDirectionSnake() != 3)
				cont.setDirectionSnake(4);
			break;

		default:
			break;
		}
	}

}
