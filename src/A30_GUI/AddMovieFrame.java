package A30_GUI;

import java.awt.HeadlessException;
import javax.swing.JFrame;

public class AddMovieFrame extends JFrame {
    public AddMovieFrame() throws HeadlessException {
        this.setTitle(GlobalVariables.userName);
        this.setSize(400, 400);
        this.setVisible(true);
    }
}