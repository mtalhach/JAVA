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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLogin extends JFrame implements ActionListener {
    JTextField userName;
    JPasswordField password;
    JLabel Name;
    JLabel pass;
    JButton button;
    JLabel message;

    public AdminLogin() throws HeadlessException {
        this.setLayout((LayoutManager)null);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Admin Login");
        this.setDefaultCloseOperation(3);
        this.initializingComponent();
        this.addComponent();
        this.settingBounds();
        this.styling();
    }

    public void initializingComponent() {
        this.userName = new JTextField();
        this.password = new JPasswordField();
        this.Name = new JLabel("Enter User Name");
        this.pass = new JLabel("Enter Password");
        this.button = new JButton("Login");
        this.button.addActionListener(this);
        this.message = new JLabel();
    }

    public void addComponent() {
        this.add(this.userName);
        this.add(this.password);
        this.add(this.Name);
        this.add(this.pass);
        this.add(this.button);
        this.add(this.message);
    }

    public void settingBounds() {
        this.setBounds(450, 150, 500, 500);
        this.Name.setBounds(85, 70, 150, 35);
        this.userName.setBounds(255, 70, 150, 35);
        this.pass.setBounds(85, 120, 150, 35);
        this.password.setBounds(255, 120, 150, 35);
        this.button.setBounds(170, 210, 150, 50);
        this.message.setBounds(120, 280, 300, 45);
    }

    public void styling() {
        this.getContentPane().setBackground(new Color(16, 172, 132));
        this.Name.setForeground(new Color(255, 255, 255));
        this.Name.setFont(new Font("Sans", 1, 17));
        this.pass.setForeground(new Color(255, 255, 255));
        this.pass.setFont(new Font("Sans", 1, 17));
        this.userName.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        this.password.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        this.button.setFocusable(false);
        this.button.setFont(new Font("SansSerif", 1, 17));
        this.button.setBackground(new Color(52, 73, 94));
        this.button.setForeground(new Color(255, 255, 255));
        this.button.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        this.message.setFont(new Font("Sans", 1, 17));
        this.message.setForeground(new Color(255, 255, 255));
    }

    public void actionPerformed(ActionEvent e) {
        if (this.userName.getText().equals("admin") && this.password.getText().equals("admin")) {
            this.setVisible(false);
            new AdminPanel();
        } else {
            this.message.setText("Invalid user Name or Password");
        }

    }
}
