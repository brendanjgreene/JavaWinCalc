import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class myWEvent extends WindowAdapter{
	
	Frame win;
	public myWEvent(Frame f) {
		// TODO Auto-generated constructor stub
		win=f;
	}
	public void windowClosed(WindowEvent x) {
		win.dispose();
	}
	public void windowClosing(WindowEvent x) {
		System.exit(0);
		//win.dispose();
	}

}