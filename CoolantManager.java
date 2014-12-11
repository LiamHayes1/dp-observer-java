
public class CoolantManager implements Observer {

	public void update(int state) {
		System.out.println("Coolant Manager notified: " + state);		
	}
}
