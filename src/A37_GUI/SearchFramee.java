package A37_GUI;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SearchFramee extends JFrame {
    JFrame frame;
    JLabel label;
    JTextField search;
    JButton button;
    JButton close;
    JLabel display;

    public SearchFramee() throws HeadlessException {
        this.initializingComponents();
        this.addComponent();
        this.settingBounds();
        this.registerClickListeners();
    }

    public void initializingComponents() {
        this.frame = new JFrame("Search Page (Movie Rental Store)");
        this.frame.setDefaultCloseOperation(3);
        this.frame.setResizable(false);
        this.frame.setVisible(true);
        this.frame.setLayout((LayoutManager)null);
        Container c = this.frame.getContentPane();
        Color color = new Color(240, 223, 222);
        c.setBackground(color);
        this.label = new JLabel("Enter Id");
        this.button = new JButton("Search");
        this.close = new JButton("Close");
        this.search = new JTextField();
        this.display = new JLabel();
    }

    public void addComponent() {
        this.frame.add(this.label);
        this.frame.add(this.button);
        this.frame.add(this.search);
        this.frame.add(this.display);
        this.frame.add(this.close);
    }

    public void settingBounds() {
        this.frame.setBounds(430, 200, 500, 500);
        this.label.setBounds(100, 90, 300, 30);
        this.label.setFont(new Font("Arial", 1, 16));
        this.search.setBounds(100, 140, 200, 30);
        this.button.setBounds(100, 200, 100, 50);
        this.button.setFont(new Font("Arial", 1, 20));
        this.close.setBounds(250, 200, 100, 50);
        this.close.setFont(new Font("Arial", 1, 20));
        this.display.setBounds(20, 300, 400, 40);
        this.display.setFont(new Font("Arial", 1, 20));
    }

    private void registerClickListeners() {
        this.button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SearchData s = new SearchData();

                try {
                    display.setText(s.search(search.getText()));
                } catch (IOException var4) {
                    var4.printStackTrace();
                }

            }
        });
        this.close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int sel = JOptionPane.showConfirmDialog(frame, "Do you Want To Close", "Conferm", 0, 3);
                if (sel == 0) {
                    System.out.println("Yes Is Selected");
                    System.exit(0);
                } else if (sel == 1) {
                    System.out.println("No Is Selected");
                }

            }
        });
    }
}