package A31_GUI_Lab;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RegistrationForm extends JFrame implements ActionListener {
    JLabel label;
    JLabel name;
    JLabel Mobile;
    JLabel Gender;
    JLabel DOB;
    JLabel Address;
    JLabel term;
    JLabel Result;
    JTextField tName;
    JTextField tMobile;
    JTextArea tAddress;
    JTextArea tOut;
    JRadioButton male;
    JRadioButton female;
    ButtonGroup bng;
    JComboBox Date;
    JComboBox Month;
    JComboBox Year;
    JCheckBox rTerm;
    JButton submit;
    JButton reset;
    String[] date = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    String[] month = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String[] year = new String[]{"2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"};

    public RegistrationForm() throws HeadlessException {
        this.setTitle("Registration Form");
        this.setFont(new Font("Arial", 1, 20));
        this.setBounds(50, 50, 800, 600);
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.init();
        this.componentBounds();
        this.addComponent();
        this.setLayout((LayoutManager)null);
        this.setVisible(true);
    }

    public void init() {
        this.label = new JLabel("Registration Form");
        this.name = new JLabel("Name");
        this.tName = new JTextField();
        this.Mobile = new JLabel("Mobile");
        this.tMobile = new JTextField();
        this.Gender = new JLabel("Gender");
        this.male = new JRadioButton("Male");
        this.female = new JRadioButton("FeMale");
        this.bng = new ButtonGroup();
        this.DOB = new JLabel("DOB");
        this.Date = new JComboBox(this.date);
        this.Month = new JComboBox(this.month);
        this.Year = new JComboBox(this.year);
        this.Address = new JLabel("Address");
        this.tAddress = new JTextArea();
        this.rTerm = new JCheckBox();
        this.term = new JLabel("Accept Term And Conditions");
        this.submit = new JButton("Submit");
        this.reset = new JButton("reset");
        this.tOut = new JTextArea();
        this.Result = new JLabel("");
    }

    public void componentBounds() {
        this.label.setBounds(300, 10, 300, 70);
        this.label.setFont(new Font("Arial", 1, 20));
        this.name.setBounds(50, 100, 80, 20);
        this.tName.setBounds(140, 100, 170, 20);
        this.Mobile.setBounds(50, 140, 80, 20);
        this.tMobile.setBounds(140, 140, 170, 20);
        this.Gender.setBounds(50, 180, 80, 20);
        this.male.setBounds(140, 180, 80, 20);
        this.female.setBounds(230, 180, 80, 20);
        this.DOB.setBounds(50, 220, 80, 20);
        this.Date.setBounds(140, 220, 60, 20);
        this.Month.setBounds(210, 220, 60, 20);
        this.Year.setBounds(280, 220, 60, 20);
        this.Address.setBounds(50, 260, 80, 20);
        this.tAddress.setBounds(140, 270, 170, 90);
        this.tAddress.setLineWrap(true);
        this.rTerm.setBounds(80, 374, 30, 30);
        this.term.setBounds(110, 370, 200, 40);
        this.submit.setBounds(80, 430, 100, 30);
        this.submit.addActionListener(this);
        this.reset.setBounds(200, 430, 100, 30);
        this.reset.addActionListener(this);
        this.tOut.setBounds(370, 100, 300, 300);
        this.tOut.setLineWrap(true);
        this.Result.setBounds(100, 480, 300, 30);
    }

    public void addComponent() {
        this.add(this.label);
        this.add(this.name);
        this.add(this.tName);
        this.add(this.Mobile);
        this.add(this.tMobile);
        this.add(this.Gender);
        this.add(this.male);
        this.add(this.female);
        this.bng.add(this.male);
        this.bng.add(this.female);
        this.add(this.DOB);
        this.add(this.Date);
        this.add(this.Month);
        this.add(this.Year);
        this.add(this.Address);
        this.add(this.tAddress);
        this.add(this.rTerm);
        this.add(this.term);
        this.add(this.submit);
        this.add(this.reset);
        this.add(this.tOut);
        this.add(this.Result);
    }

    public void actionPerformed(ActionEvent e) {
        String data1;
        if (e.getSource() == this.submit) {
            if (this.rTerm.isSelected()) {
                String var10000 = this.tName.getText();
                String data = "Name: " + var10000 + "\nMobile: " + this.tMobile.getText() + "\n";
                if (this.male.isSelected()) {
                    data1 = "Gender: Male\n";
                } else {
                    data1 = "Gender: Female\n";
                }

                var10000 = (String)this.Date.getSelectedItem();
                String data2 = "DOB: " + var10000 + "/" + (String)this.Month.getSelectedItem() + "/" + (String)this.Year.getSelectedItem() + "\n";
                String data3 = "Address: " + this.tAddress.getText() + "\n";
                this.tOut.setText(data + data1 + data2 + data3);
                this.tOut.setEditable(false);
                this.Result.setText("Successfully Register");
            } else {
                this.tOut.setText("");
                this.Result.setText("Please Accept The Term And Conditions");
            }
        } else if (e.getSource() == this.reset) {
            data1 = "";
            this.tName.setText(data1);
            this.tMobile.setText(data1);
            this.tAddress.setText(data1);
            this.tOut.setText(data1);
            this.Result.setText(data1);
            this.rTerm.setSelected(false);
            this.Date.setSelectedIndex(0);
            this.Month.setSelectedIndex(0);
            this.Year.setSelectedIndex(0);
        }

    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
