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

public class UserPanel extends JFrame implements ActionListener {
    JButton search;
    JButton viewAll;
    JLabel message;

    public UserPanel() throws HeadlessException {
        this.setVisible(true);
        this.setLayout((LayoutManager)null);
        this.setTitle("User Panel");
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.initializingComponent();
        this.addComponent();
        this.settingBounds();
        this.styling();
    }

    public void initializingComponent() {
        this.search = new JButton("Search Movie");
        this.viewAll = new JButton("View all");
        this.search.addActionListener(this);
        this.viewAll.addActionListener(this);
    }

    public void addComponent() {
        this.add(this.search);
        this.add(this.viewAll);
    }

    public void settingBounds() {
        this.setBounds(500, 150, 500, 500);
        this.search.setBounds(175, 100, 150, 50);
        this.viewAll.setBounds(175, 200, 150, 50);
    }

    public void styling() {
//        this.getContentPane().setBackground(new Color(16, 172, 132));
        this.search.setFocusable(false);
        this.search.setFont(new Font("SansSerif", 1, 17));
        this.search.setBackground(new Color(52, 73, 94));
        this.search.setForeground(new Color(255, 255, 255));
        this.search.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        this.viewAll.setFocusable(false);
        this.viewAll.setFont(new Font("SansSerif", 1, 17));
        this.viewAll.setBackground(new Color(52, 73, 94));
        this.viewAll.setForeground(new Color(255, 255, 255));
        this.viewAll.setBorder(BorderFactory.createLineBorder(Color.black, 3));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Search Movie")) {
            new SearchMovie();
        }

        if (e.getActionCommand().equals("View all")) {
            new ViewAllMovieFrame();
        }

    }
}

