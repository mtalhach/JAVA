package A33_MovieRentalStore_GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI extends JFrame {
    JFrame frame;
    JLabel label;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JPanel panel;
    JPanel panel2;

    GUI() throws HeadlessException {
        this.initializingComponent();
        this.init();
        this.addComponent();
        this.settingBounds();
        this.registerClickListeners();
    }

    public void initializingComponent() {
        this.frame = new JFrame("Main Page (Movie Rental Store)");
        this.label = new JLabel("Movie Rental Store");
        this.label.setFont(new Font("Arial", 2, 30));
        Container c = this.frame.getContentPane();
        c.setLayout((LayoutManager)null);
        ImageIcon img = new ImageIcon("Movie-Icon.png");
        this.frame.setIconImage(img.getImage());
        this.panel = new JPanel();
        this.panel.setBounds(15, 10, 445, 50);
        this.panel.setBackground(Color.WHITE);
        this.panel.setLayout((LayoutManager)null);
        c.add(this.panel);
        this.panel2 = new JPanel();
        this.panel2.setBounds(37, 100, 400, 300);
        this.panel2.setBackground(Color.WHITE);
        this.panel2.setLayout((LayoutManager)null);
        c.add(this.panel2);
        Color color = new Color(220, 120, 166);
        c.setBackground(color);
        this.button1 = new JButton("ADD Movie");
        this.button1.setFont(new Font("Amasis MT Pro Black", 1, 18));
        this.button2 = new JButton("Search Movie");
        this.button2.setFont(new Font("Amasis MT Pro Black", 1, 16));
        this.button3 = new JButton("Exit...");
        this.button4 = new JButton("Button");
        this.button3.setFont(new Font("Amasis MT Pro Black", 1, 20));
    }

    public void init() {
        this.frame.setDefaultCloseOperation(3);
        this.frame.setResizable(false);
        this.frame.setVisible(true);
    }

    public void addComponent() {
        this.panel2.add(this.button1);
        this.panel2.add(this.button2);
        this.panel2.add(this.button3);
        this.panel2.add(this.button4);
        this.panel.add(this.label);
    }

    public void settingBounds() {
        this.frame.setBounds(400, 100, 500, 500);
        this.label.setBounds(80, 9, 350, 40);
        this.button1.setBounds(120, 60, 150, 50);
        this.button2.setBounds(120, 130, 150, 50);
        this.button3.setBounds(120, 200, 150, 50);
        this.button4.setBounds(120, 250, 150, 50);
    }

    private void registerClickListeners() {
        this.button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AddFrame();
                System.out.println("clicked.....");
            }
        });
        this.button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new SearchFrame();
                System.out.println("clicked.....");
            }
        });
        this.button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int sel = JOptionPane.showConfirmDialog(GUI.this.frame, "Do you Want To Exit", "Conferm", 0, 3);
                if (sel == 0) {
                    System.out.println("clicked.....");
                    System.out.println("Yes Is Selected");
                    System.exit(0);
                } else if (sel == 1) {
                    System.out.println("clicked.....");
                    System.out.println("No Is Selected");
                }

            }
        });
    }
}
