package A33_MovieRentalStore_GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.Year;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class AddFrame extends JFrame implements ChangeListener {
    JFrame frame;
    JLabel id;
    JLabel title;
    JLabel actor;
    JLabel category;
    JLabel date;
    JLabel labelDate;
    JLabel Result;
    JTextField idField;
    JTextField titleField;
    JTextField actorField;
    JTextField categoryField;
    JButton addButton;
    JButton closeButton;
    JSpinner s1;
    JSpinner s2;
    JSpinner s3;
    SpinnerModel model1;
    SpinnerModel model2;
    SpinnerModel model3;
    String[] month = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    AddFrame() throws HeadlessException {
        this.initializingComponent();
        this.addComponents();
        this.settingBounds();
        this.registerClickListeners();
        this.s1.addChangeListener(this);
        this.s2.addChangeListener(this);
        this.s3.addChangeListener(this);
    }

    public void initializingComponent() {
        this.frame = new JFrame("Add Movie (Movie Rental Store)");
        this.addButton = new JButton("Add data");
        this.closeButton = new JButton("Close");
        ImageIcon img = new ImageIcon("add.png");
        this.frame.setIconImage(img.getImage());
        Container c = this.frame.getContentPane();
        Color color = new Color(250, 223, 222);
        c.setBackground(color);
        this.id = new JLabel("Enter ID");
        this.title = new JLabel("Enter title");
        this.actor = new JLabel("Enter Actors");
        this.category = new JLabel("Enter category");
        this.date = new JLabel("Enter release date");
        this.idField = new JTextField();
        this.titleField = new JTextField();
        this.actorField = new JTextField();
        this.categoryField = new JTextField();
        String str = String.valueOf(Year.now());
        int y = Integer.parseInt(str);
        this.model1 = new SpinnerNumberModel(1, 1, 31, 1);
        this.model2 = new SpinnerListModel(this.month);
        this.model3 = new SpinnerNumberModel(y, y - 100, y, 1);
        this.s1 = new JSpinner(this.model1);
        this.s2 = new JSpinner(this.model2);
        this.s3 = new JSpinner(this.model3);
        this.labelDate = new JLabel();
        this.Result = new JLabel();
    }

    public void addComponents() {
        this.frame.add(this.id);
        this.frame.add(this.title);
        this.frame.add(this.actor);
        this.frame.add(this.category);
        this.frame.add(this.date);
        this.frame.add(this.idField);
        this.frame.add(this.titleField);
        this.frame.add(this.actorField);
        this.frame.add(this.categoryField);
        this.frame.add(this.s1);
        this.frame.add(this.s2);
        this.frame.add(this.s3);
        this.setDOB();
        this.frame.add(this.labelDate);
        this.validate();
        this.frame.add(this.Result);
        this.frame.add(this.addButton);
        this.frame.add(this.closeButton);
    }

    public void settingBounds() {
        this.frame.setBounds(300, 150, 650, 500);
        this.frame.setVisible(true);
        this.frame.setLayout((LayoutManager)null);
        this.frame.setDefaultCloseOperation(3);
        this.frame.setResizable(false);
        this.id.setBounds(100, 70, 100, 30);
        this.idField.setBounds(250, 70, 180, 30);
        this.title.setBounds(100, 115, 100, 30);
        this.titleField.setBounds(250, 115, 180, 30);
        this.actor.setBounds(100, 160, 100, 30);
        this.actorField.setBounds(250, 160, 180, 30);
        this.category.setBounds(100, 205, 100, 30);
        this.categoryField.setBounds(250, 205, 180, 30);
        this.date.setBounds(100, 250, 130, 30);
        this.s1.setBounds(250, 250, 100, 30);
        this.s2.setBounds(360, 250, 100, 30);
        this.s3.setBounds(470, 250, 100, 30);
        this.labelDate.setBounds(100, 280, 300, 50);
        this.addButton.setBounds(150, 330, 150, 50);
        this.addButton.setFont(new Font("Arial", 1, 20));
        this.closeButton.setBounds(350, 330, 150, 50);
        this.closeButton.setFont(new Font("Arial", 1, 20));
        this.Result.setBounds(100, 390, 300, 50);
        this.Result.setFont(new Font("Arial", 1, 20));
    }

    private void registerClickListeners() {
        this.addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Write write = new Write();
                StringBuilder str = new StringBuilder();
                AddFrame.this.Result.setText("Movie Add Successfully");
                String ste = AddFrame.this.idField.getText();
                str.append(str + "\t" + AddFrame.this.titleField.getText() + "\t" + AddFrame.this.actorField.getText() + "\t" + AddFrame.this.categoryField.getText() + "\t" + AddFrame.this.labelDate.getText() + "\t\n\n");

                try {
                    write.write(str.toString());
                    AddFrame.this.Result.getText();
                } catch (IOException var5) {
                    var5.printStackTrace();
                }

            }
        });
        this.closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int sel = JOptionPane.showConfirmDialog(AddFrame.this.frame, "Do you Want To Close", "Conferm", 0, 3);
                if (sel == 0) {
                    System.out.println("Yes Is Selected");
                    System.exit(0);
                } else if (sel == 1) {
                    System.out.println("No Is Selected");
                }

            }
        });
    }

    public void setDOB() {
        int day = (Integer)this.s1.getValue();
        int year = (Integer)this.s3.getValue();
        String month = (String)this.s2.getValue();
        this.labelDate.setText(day + " - " + month + " - " + year);
    }

    public void stateChanged(ChangeEvent e) {
        this.setDOB();
    }
}

