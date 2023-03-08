package A32_MovieRecord_GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class SearchMovie extends JFrame implements ActionListener {
    JLabel searchLabel;
    JTextField search;
    JButton button;
    JLabel message;
    JTable table;
    String[] header = new String[]{"ID", "Title", "Actors", "Category", "A4_Date"};
    JScrollPane sp;

    public SearchMovie() throws HeadlessException {
        this.setLayout((LayoutManager)null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
        this.setTitle("search Movie");
        this.initializingComponent();
        this.addComponent();
        this.settingBounds();
        this.styling();
    }

    public void initializingComponent() {
        this.searchLabel = new JLabel("Enter ID");
        this.search = new JTextField();
        this.button = new JButton("Search Movie");
        this.button.addActionListener(this);
        this.message = new JLabel("Please enter id, title");
        this.sp = new JScrollPane(this.table);
    }

    public void addComponent() {
        this.add(this.search);
        this.add(this.searchLabel);
        this.add(this.button);
        this.add(this.message);
    }

    public void settingBounds() {
        this.setBounds(500, 150, 500, 500);
        this.searchLabel.setBounds(100, 80, 130, 40);
        this.search.setBounds(240, 80, 170, 40);
        this.button.setBounds(150, 160, 200, 50);
        this.message.setBounds(150, 230, 200, 30);
        this.message.setVisible(false);
    }

    public void styling() {
        this.getContentPane().setBackground(new Color(16, 172, 132));
        this.searchLabel.setForeground(new Color(255, 255, 255));
        this.searchLabel.setFont(new Font("Sans", 1, 17));
        this.search.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        this.button.setFocusable(false);
        this.button.setFont(new Font("SansSerif", 1, 17));
        this.button.setBackground(new Color(52, 73, 94));
        this.button.setForeground(new Color(255, 255, 255));
        this.button.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        this.message.setFont(new Font("Sans", 1, 17));
        this.message.setForeground(new Color(255, 255, 255));
    }

    public void actionPerformed(ActionEvent e) {
        if (this.search.getText().equals("")) {
            this.message.setVisible(true);
        } else {
            new TableSearch(this.search.getText());
        }

    }
}

