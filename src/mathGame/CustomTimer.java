package deneme2;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomTimer {
    private Timer timer;
    private int seconds = 0;
    private ActionListener actionListener;

    public CustomTimer() {
        seconds = 0;
        actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seconds++;
                System.out.println("Elapsed time: " + seconds + " seconds");
            }
        };
        this.timer = new Timer(1000, actionListener);        
        this.seconds = 0;
    }

    public void start() {
        timer.start();
    }

    public void stop() {
        timer.stop();
    }

    public int getSeconds() {
        return seconds;
    }

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
    
}
