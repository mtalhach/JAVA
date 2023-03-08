package A32_MovieRecord_GUI;

import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableSearch extends JFrame {
    JTable table;
    String[] header = new String[]{"ID", "Title", "Actors", "Category", "A4_Date"};
    String input;

    public TableSearch(String input) throws HeadlessException {
        this.input = input;
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        this.display();
    }

    public void display() {
        System.out.println(this.input);
        SearchMovieBackend s = new SearchMovieBackend();

        try {
            String[][] movie = new String[][]{s.search(this.input).split("_")};
            this.table = new JTable(movie, this.header);
            this.table.setBounds(70, 290, 400, 300);
            JScrollPane sp = new JScrollPane(this.table);
            this.add(sp);
            this.setBounds(450, 150, 700, 300);
        } catch (IOException var4) {
            var4.printStackTrace();
        }

    }
}

