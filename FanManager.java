
public class FanManager implements Observer {

	public void update(int state) {
		System.out.println("Fan Manager notified: " + state);
	}
}
