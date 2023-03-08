package A30_GUI;

import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogInFrame extends JFrame {
    JLabel userLabel;
    JLabel passwordLabel;
    JTextField textField;
    JPasswordField passwordField;
    JButton loginButton;
    JButton cancelButton;

    public LogInFrame() throws HeadlessException {
        this.setBounds(100, 50, 400, 250);
        this.setTitle("Movie Rental Login");
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.setLayout((LayoutManager)null);
        this.setVisible(true);
        this.initComponent();
        this.addComponentToFrame();
        this.setComponentBounds();
        this.registerClickListeners();
    }

    private void initComponent() {
        this.userLabel = new JLabel("User Name");
        this.passwordLabel = new JLabel("Password");
        this.textField = new JTextField();
        this.passwordField = new JPasswordField();
        this.loginButton = new JButton("Login");
        this.cancelButton = new JButton("Cancel");
    }

    private void addComponentToFrame() {
        this.add(this.userLabel);
        this.add(this.passwordLabel);
        this.add(this.textField);
        this.add(this.passwordField);
        this.add(this.loginButton);
        this.add(this.cancelButton);
    }

    private void setComponentBounds() {
        this.userLabel.setBounds(20, 20, 100, 25);
        this.textField.setBounds(150, this.userLabel.getY(), 100, 27);
        this.passwordLabel.setBounds(20, 60, 100, 25);
        this.passwordField.setBounds(150, 65, 100, 27);
        this.loginButton.setBounds(20, 100, (int)this.loginButton.getPreferredSize().getWidth(), 30);
        this.cancelButton.setBounds(100, 100, 100, 30);
    }

    private void registerClickListeners() {
        this.loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello To GUI");
                GlobalVariables.userName = LogInFrame.this.textField.getText();
                new AddMovieFrame();
            }
        });
        this.cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LogInFrame.this.setVisible(false);
            }
        });
    }
}

