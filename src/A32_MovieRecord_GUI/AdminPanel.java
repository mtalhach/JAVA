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

public class AdminPanel extends JFrame implements ActionListener {
    JButton add;
    JButton delete;

    public AdminPanel() throws HeadlessException {
        this.setLayout((LayoutManager)null);
        this.setVisible(true);
        this.setTitle("Admin Panel");
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.initializingComponent();
        this.addComponent();
        this.settingBounds();
        this.styling();
    }

    public void initializingComponent() {
        this.add = new JButton("Add Movie");
        this.delete = new JButton("Delete Movie");
        this.add.addActionListener(this);
        this.delete.addActionListener(this);
    }

    public void addComponent() {
        this.add(this.add);
        this.add(this.delete);
    }

    public void settingBounds() {
        this.setBounds(450, 150, 500, 500);
        this.add.setBounds(175, 100, 150, 50);
        this.delete.setBounds(175, 200, 150, 50);
    }

    public void styling() {
        this.getContentPane().setBackground(new Color(16, 172, 132));
        this.add.setFocusable(false);
        this.add.setFont(new Font("SansSerif", 1, 18));
        this.add.setBackground(new Color(52, 73, 94));
        this.add.setForeground(new Color(255, 255, 255));
        this.add.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        this.delete.setFocusable(false);
        this.delete.setFont(new Font("SansSerif", 1, 18));
        this.delete.setBackground(new Color(52, 73, 94));
        this.delete.setForeground(new Color(255, 255, 255));
        this.delete.setBorder(BorderFactory.createLineBorder(Color.black, 3));
    }

    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (str.equals("Add Movie")) {
            new AddMovieFrame();
            this.setVisible(false);
            System.out.println("add movie");
        }

        if (str.equals("Delete Movie")) {
            new DeleteMovieFrame();
            System.out.println("Delete movie ");
        }

    }
}

