package A32_MovieRecord_GUI;

import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ViewAllMovieFrame extends JFrame {
    JTable table;
    String[] header = new String[]{"ID", "Title", "Actors", "Category", "A4_Date"};
    JScrollPane sp;

    public ViewAllMovieFrame() throws HeadlessException {
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        this.viewAll();
    }

    public void viewAll() {
        ViewAllBackend v = new ViewAllBackend();
        String[][] movie = new String[0][];

        try {
            movie = v.viewAll();
        } catch (IOException var4) {
            var4.printStackTrace();
        }

        this.table = new JTable(movie, this.header);
        this.table.setBounds(70, 290, 400, 300);
        JScrollPane sp = new JScrollPane(this.table);
        this.add(sp);
        this.setBounds(450, 150, 700, 300);
    }
}

