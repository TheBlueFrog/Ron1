package a;

public class Main {

    public static Drawing mDrawing;
	private static Controls mControls;

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	mControls = new Controls();
            	mDrawing = new Drawing(20, 20);
            }
        });
    }
}
