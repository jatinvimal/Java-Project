import view.MJFrame;
import view.StartPanel;

/**
 * Created by jatin kumar vimal on 21/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        MJFrame mjFrame = new MJFrame();
        mjFrame.setContentPane(new StartPanel());
    }
}
