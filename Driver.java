
public class Driver {
	public static void main(String[] args) {
		
		Data data = new Data();
		
		Monitor monitor = new Monitor();
		CoolantManager coolantManager = new CoolantManager();
		FanManager fanManager = new FanManager();
		
		data.attach(monitor);
		data.attach(coolantManager);
		data.attach(fanManager);
	}
}
