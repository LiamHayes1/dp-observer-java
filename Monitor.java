
public class Monitor implements Observer {

	public void update(int state) {
		System.out.println("Monitor notified: " + state);
		
	}
}
