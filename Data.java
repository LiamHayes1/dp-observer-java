import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Timer;

public class Data implements Subject, ActionListener {
	private List<Observer> observers;
	private int state;
	private Timer timer;
	
	public Data() {
		observers = new ArrayList<Observer>();
		timer = new Timer(1000, this);
		timer.start();
	}

	public void attach(Observer o) {
		observers.add(o);
	}

	public void detach(Observer o) {
		int index = observers.indexOf(o);
		observers.remove(index);
	}

	public void notifyObservers() {
		for(Observer o : observers) {
			o.update(state);
		}
	}

	public void actionPerformed(ActionEvent e) {
		state = (int) (Math.random() * 10);
		notifyObservers();
	}
}
