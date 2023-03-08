package A37_GUI;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class LogIn extends JFrame implements ActionListener {
    JTextField userName;
    JPasswordField password;
    JLabel Name;
    JLabel pass;
    JButton button;
    JLabel message;
    JFrame frame;

    public LogIn() throws HeadlessException {
        this.setLayout((LayoutManager)null);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("User Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        this.getContentPane().setBackground(new Color(200, 150, 150));
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
            try {
                File f = new File("AdminDetails.txt");
                FileWriter fw = new FileWriter(f, true);
                fw.write("UserName: "+this.userName.getText()+"\n");
                fw.write("Password: "+this.password.getText()+"\n");
                fw.close();
            } catch (IOException e1) {
                System.out.println(e1);
            }
        int sel = JOptionPane.showConfirmDialog(LogIn.this.frame, "Credentials authorized", "Conferm", 0, 1);
        if (sel == 0) {
            this.setVisible(false);
            new mainFrame();
        }
    }

    public static void main(String[] args) {
       new LogIn();
    }
}

