package A35_DataBase_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LogIn extends JFrame{
    JLabel userName;
    JLabel password;
    JTextField textField;
    JPasswordField passwordField;
    JButton LogIn;
    JButton reset;

    public LogIn() {
        setBounds(450,200,400,250);
        setTitle("LogIn Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        init();
        BoundsComponents();
        addComponents();
        styling();


        LogIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name,password;
                name=textField.getText();
                password=passwordField.getText();
                Connection con;
                PreparedStatement pst;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con= DriverManager.getConnection("jdbc:mysql://localhost:1428/cuonline","root","Dsaq@786");
                    pst=con.prepareStatement("insert into Login(name,password)values(?,?)");
                    pst.setString(1,name);
                    pst.setString(2,password);
                    pst.executeUpdate();
                }
                catch (ClassNotFoundException e2){
                    e2.printStackTrace();
                }
                catch (SQLException e1){
                    e1.printStackTrace();
                }

                new Registration();


            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==reset){
                    textField.setText("");
                    passwordField.setText("");
                }
            }
        });


        setVisible(true);
    }

    public void init(){
        userName=new JLabel("User Name");
        password=new JLabel("Password");
        textField=new JTextField();
        passwordField=new JPasswordField();
        LogIn=new JButton("LogIn");
        reset=new JButton("Reset");
    }
    public void BoundsComponents(){
        userName.setBounds(20,20,100,30);
        textField.setBounds(130,20,150,30);
        password.setBounds(20,70,100,30);
        passwordField.setBounds(130,70,150,30);
       LogIn.setBounds(80,140,100,30);
       reset.setBounds(200,140,100,30);

    }
    public void addComponents(){
        add(userName);
        add(textField);
        add(password);
        add(passwordField);
        add(LogIn);
        add(reset);
    }
    public void styling(){
        userName.setFont(new Font("Sans", 1, 17));
        textField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        password.setFont(new Font("Sans", 1, 17));
        passwordField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        LogIn.setBackground(new Color(52, 73, 94));
        LogIn.setForeground(new Color(255, 255, 255));
        reset.setBackground(new Color(52, 73, 94));
        reset.setForeground(new Color(255, 255, 255));
    }





    public static void main(String[] args) {
        new LogIn();

    }
}
