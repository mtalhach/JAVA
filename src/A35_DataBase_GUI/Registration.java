package A35_DataBase_GUI;

import javax.swing.*;
import javax.swing.plaf.nimbus.State;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.*;

public class Registration extends JFrame {
    private JLabel head,name,password,email,address,subject,gender,city,list;
    private JTextField nameField,emailField,addressField;
    private JPasswordField passwordField;
    private JTextArea area;
    private JCheckBox oop,db,web,android;
    private JRadioButton male,female;
    private ButtonGroup bg;
    private JComboBox cityBox;
    private JButton addUser;
    private JMenuBar menuBar;
    private JButton addNew,update,delete,showHideList;
    private String[] City={"Lahore","Karachi","Islamabad","Sialkot","Sargodha","Sahiwal",
    "Pesawar","Gujrat","Mianwali","Multan"};

    public Registration(){
        setBounds(20,20,700,600);
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);setLayout(null);
        init();
        BoundComponents();
        addComponents();

        addUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name,password,city,email,address;
                String data1;
                name=nameField.getText();
                password=passwordField.getText();
                email=emailField.getText();
                address=addressField.getText();
                city=(String) cityBox.getSelectedItem();
                if (male.isSelected()) {
                    data1 = "Male";
                } else {
                    data1 = "Female";
                }

                String data2;
                if(oop.isSelected()){
                    data2="OOP  ";
                }else if(db.isSelected()){
                    data2="DB  ";
                }else if(web.isSelected()){
                    data2="Web  ";
                }else if(android.isSelected()){
                    data2="Android  ";
                }else{
                    data2=" ";
                }



                Connection con;
                PreparedStatement pst;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con= DriverManager.getConnection("jdbc:mysql://localhost:1428/cuonline","root","Dsaq@786");
                    pst=con.prepareStatement("insert into users(username,password,city,email,address,subjects,gender)values(?,?,?,?,?,?,?)");
                    pst.setString(1,name);
                    pst.setString(2,password);
                    pst.setString(3,city);
                    pst.setString(4,email);
                    pst.setString(5,address);
                    pst.setString(6,data2);
                    pst.setString(7,data1);
                    pst.executeUpdate();
                }
                catch (ClassNotFoundException e2){
                    e2.printStackTrace();
                }
                catch (SQLException e1){
                    e1.printStackTrace();
                }
                String str=nameField.getText();
                area.setText(str);


            }
        });

        addNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                passwordField.setText("");
                emailField.setText("");
                addressField.setText("");
                cityBox.setSelectedIndex(0);
                male.setSelected(false);
                female.setSelected(false);
                oop.setSelected(false);
            }
        });

        showHideList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(area.isVisible()==true){
                    area.setVisible(false);
                }
                else if(area.isVisible()==false){
                    area.setVisible(true);
                }
            }
        });



        setVisible(true);
    }





    public void init(){
        menuBar=new JMenuBar();
        addNew=new JButton("Add New");
        update=new JButton("Update");
        delete=new JButton("Delete");
        showHideList=new JButton("Show/Hide List");

        head=new JLabel("Add New User");
        name=new JLabel("User Name");
        password=new JLabel("Password");
        email=new JLabel("email");
        address=new JLabel("Address");

        nameField=new JTextField();
        passwordField=new JPasswordField();
        emailField=new JTextField();
        addressField=new JTextField();

        subject=new JLabel("Subject:");
        oop=new JCheckBox("OOP");
        db=new JCheckBox("DB");
        web=new JCheckBox("Web");
        android=new JCheckBox("Android");

        gender=new JLabel("Gender:");
        male=new JRadioButton("Male");
        female=new JRadioButton("Female");
        bg=new ButtonGroup();

        city=new JLabel("City:");
        cityBox=new JComboBox(City);

        addUser=new JButton("Add User");
        area=new JTextArea();
        list=new JLabel("Current User");
    }
    public void BoundComponents(){
        menuBar.setBackground(new Color(52, 73, 120));
        menuBar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        addNew.setForeground(new Color(255, 255, 255));
        addNew.setFont(new Font("Sans", 1, 15));
        addNew.setBackground(new Color(52, 73, 94));
        addNew.setFocusable(false);

        update.setForeground(new Color(255, 255, 255));
        update.setFont(new Font("Sans", 1, 15));
        update.setBackground(new Color(52, 73, 94));
        update.setFocusable(false);

        delete.setForeground(new Color(255, 255, 255));
        delete.setFont(new Font("Sans", 1, 15));
        delete.setBackground(new Color(52, 73, 94));
        delete.setFocusable(false);

        showHideList.setForeground(new Color(255, 255, 255));
        showHideList.setFont(new Font("Sans", 1, 15));
        showHideList.setBackground(new Color(52, 73, 94));
        showHideList.setFocusable(false);

        head.setBounds(250,50,200,40);
        head.setFont(new Font("Arial", Font.BOLD, 25));

        name.setBounds(250,110,100,30);
        name.setFont(new Font("Sans", 1, 15));
        nameField.setBounds(370,110,270,30);
        nameField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        password.setBounds(250,150,100,30);
        password.setFont(new Font("Sans", 1, 15));
        passwordField.setBounds(370,150,270,30);
        passwordField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        email.setBounds(250,190,100,30);
        email.setFont(new Font("Sans", 1, 15));
        emailField.setBounds(370,190,270,30);
        emailField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        address.setBounds(250,230,100,30);
        address.setFont(new Font("Sans", 1, 15));
        addressField.setBounds(370,230,270,30);
        addressField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        subject.setBounds(250,270,100,30);
        subject.setFont(new Font("Sans", 1, 15));
        oop.setBounds(370,270,60,30);
        db.setBounds(450,270,60,30);
        web.setBounds(510,270,60,30);
        android.setBounds(570,270,70,30);

        gender.setBounds(250,310,100,30);
        gender.setFont(new Font("Sans", 1, 15));
        male.setBounds(370,310,70,30);
        female.setBounds(460,310,70,30);

        city.setBounds(250,350,100,30);
        city.setFont(new Font("Sans", 1, 15));
        cityBox.setBounds(370,350,100,30);

        addUser.setBounds(540,400,100,30);
        addUser.setBackground(new Color(52, 73, 120));
        addUser.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        addUser.setForeground(new Color(255, 255, 255));
        addUser.setFont(new Font("Sans", 1, 15));

        area.setBounds(4,50,120,400);
        list.setBounds(2,20,100,30);
        area.setFocusable(false);
    }
    public void addComponents(){
        menuBar.add(addNew);menuBar.add(update);menuBar.add(delete);
        menuBar.add(showHideList);
        setJMenuBar(menuBar);

        add(head);add(name);add(password);add(email);add(address);
        add(nameField);add(passwordField);add(emailField);add(addressField);
        add(subject);add(oop);add(db);add(web);add(android);
        add(gender);add(male);add(female);bg.add(male);bg.add(female);
        add(city);add(cityBox);
        add(addUser);
        add(area);add(list);
    }
    public static void main(String[] args) {
        new Registration();
    }
}
