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

public class MovieSystem extends JFrame implements ActionListener {
    JLabel label;
    JButton admin;
    JButton user;
    JButton exit;

    public MovieSystem() throws HeadlessException {
        this.setLayout((LayoutManager)null);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Movie Rental System");
        this.setDefaultCloseOperation(3);
        this.initializingComponent();
        this.addingComponent();
        this.settingBounds();
        this.styling();
    }

    public void initializingComponent() {
        this.admin = new JButton("Admin Login");
        this.user = new JButton("User Login");
        this.exit = new JButton("Exit");
        this.label = new JLabel("Welcome To Movie Rental System");
    }

    public void addingComponent() {
        this.add(this.label);
        this.add(this.admin);
        this.add(this.user);
        this.add(this.exit);
        this.admin.addActionListener(this);
        this.user.addActionListener(this);
        this.exit.addActionListener(this);
    }

    public void settingBounds() {
        this.setBounds(450, 150, 500, 500);
        this.label.setBounds(70, 40, 360, 30);
        this.admin.setBounds(170, 100, 150, 50);
        this.user.setBounds(170, 200, 150, 50);
        this.exit.setBounds(170, 300, 150, 50);
    }

    public void styling() {
        this.getContentPane().setBackground(new Color(16, 172, 132));
        this.label.setFont(new Font("SansSerif", 1, 20));
        this.label.setForeground(new Color(255, 255, 255));
        this.admin.setFocusable(false);
        this.admin.setFont(new Font("SansSerif", 1, 17));
        this.admin.setBackground(new Color(52, 73, 94));
        this.admin.setForeground(new Color(255, 255, 255));
        this.admin.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        this.user.setFocusable(false);
        this.user.setFont(new Font("SansSerif", 1, 18));
        this.user.setBackground(new Color(52, 73, 94));
        this.user.setForeground(new Color(255, 255, 255));
        this.user.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        this.exit.setFocusable(false);
        this.exit.setFont(new Font("SansSerif", 1, 18));
        this.exit.setBackground(new Color(52, 73, 94));
        this.exit.setForeground(new Color(255, 255, 255));
        this.exit.setBorder(BorderFactory.createLineBorder(Color.black, 3));
    }

    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (str.equals("Admin Login")) {
            this.setVisible(false);
            new AdminLogin();
        } else if (str.equals("User Login")) {
            new UserLogin();
            this.setVisible(false);
        } else if (str.equals("Exit")) {
            this.dispose();
        }

    }
}

