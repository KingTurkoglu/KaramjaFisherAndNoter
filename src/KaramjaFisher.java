import org.powerbot.script.PollingScript;


public class KaramjaFisher extends PollingScript {
	
	public void start() {
		System.out.println("Script Started");
	}
	
	public void stop() {
		System.out.println("Script Stopped");
	}
	
	public int poll() {
		return 0;
	}

}
