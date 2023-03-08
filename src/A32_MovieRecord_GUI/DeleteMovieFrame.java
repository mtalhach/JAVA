package A32_MovieRecord_GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DeleteMovieFrame extends JFrame implements ActionListener {
    JLabel deleteLabel;
    JTextField delete;
    JButton button;
    JLabel message;

    public DeleteMovieFrame() throws HeadlessException {
        this.setLayout((LayoutManager)null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
        this.setTitle("Delete Movie");
        this.initializingComponent();
        this.addComponent();
        this.settingBounds();
        this.styling();
    }

    public void initializingComponent() {
        this.deleteLabel = new JLabel("Enter ID");
        this.delete = new JTextField();
        this.button = new JButton("Delete Movie");
        this.message = new JLabel("Please enter id");
        this.button.addActionListener(this);
    }

    public void addComponent() {
        this.add(this.delete);
        this.add(this.deleteLabel);
        this.add(this.button);
        this.add(this.message);
    }

    public void settingBounds() {
        this.setBounds(450, 150, 500, 500);
        this.deleteLabel.setBounds(100, 80, 130, 40);
        this.delete.setBounds(240, 80, 170, 40);
        this.button.setBounds(150, 160, 200, 50);
        this.message.setBounds(150, 230, 250, 30);
        this.message.setVisible(false);
    }

    public void styling() {
        this.getContentPane().setBackground(new Color(16, 172, 132));
        this.deleteLabel.setForeground(new Color(255, 255, 255));
        this.deleteLabel.setFont(new Font("Sans", 1, 17));
        this.delete.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        this.button.setFocusable(false);
        this.button.setFont(new Font("SansSerif", 1, 17));
        this.button.setBackground(new Color(52, 73, 94));
        this.button.setForeground(new Color(255, 255, 255));
        this.button.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        this.message.setFont(new Font("Sans", 1, 17));
        this.message.setForeground(new Color(255, 255, 255));
    }

    public void actionPerformed(ActionEvent e) {
        if (this.delete.getText().equals("")) {
            this.message.setVisible(true);
            System.out.println("if");
        } else {
            System.out.println("else");
            DeleteMovieBackend d = new DeleteMovieBackend();
            byte flag = 0;

            try {
                flag = d.deleting(this.delete.getText());
            } catch (IOException var5) {
                var5.printStackTrace();
            }

            System.out.println(flag);
            if (flag == 1) {
                this.message.setText("Deleting Movie Successful");
                this.message.setVisible(true);
            } else {
                this.message.setText("Movie not Exist");
                this.message.setVisible(true);
            }
        }

    }
}

