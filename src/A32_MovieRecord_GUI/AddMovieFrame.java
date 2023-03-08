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

public class AddMovieFrame extends JFrame implements ActionListener {
    JLabel idLabel;
    JLabel titleLabel;
    JLabel actorLabel;
    JLabel categoryLabel;
    JLabel dateLabel;
    JTextField id;
    JTextField title;
    JTextField actors;
    JTextField category;
    JTextField date;
    JButton button;
    JLabel message;
    JLabel writeMessage;

    public AddMovieFrame() throws HeadlessException {
        this.setVisible(true);
        this.setLayout((LayoutManager)null);
        this.setResizable(false);
        this.setTitle("Add Movie");
        this.setDefaultCloseOperation(3);
        this.initializingComponent();
        this.addComponent();
        this.settingBounds();
        this.styling();
    }

    public void initializingComponent() {
        this.idLabel = new JLabel("Enter ID");
        this.titleLabel = new JLabel("Enter title");
        this.actorLabel = new JLabel("Enter Actors");
        this.categoryLabel = new JLabel("Enter category");
        this.dateLabel = new JLabel("Release date");
        this.id = new JTextField();
        this.title = new JTextField();
        this.actors = new JTextField();
        this.category = new JTextField();
        this.date = new JTextField();
        this.button = new JButton("Add Movie");
        this.button.addActionListener(this);
        this.message = new JLabel("Please Fill all Entries");
        this.writeMessage = new JLabel("Writing Successful");
    }

    public void addComponent() {
        this.add(this.idLabel);
        this.add(this.titleLabel);
        this.add(this.actorLabel);
        this.add(this.categoryLabel);
        this.add(this.dateLabel);
        this.add(this.id);
        this.add(this.title);
        this.add(this.actors);
        this.add(this.category);
        this.add(this.date);
        this.add(this.button);
        this.add(this.message);
        this.add(this.writeMessage);
    }

    public void settingBounds() {
        this.setBounds(400, 100, 550, 600);
        this.idLabel.setBounds(90, 70, 140, 35);
        this.id.setBounds(250, 70, 180, 35);
        this.titleLabel.setBounds(90, 120, 140, 35);
        this.title.setBounds(250, 120, 180, 35);
        this.actorLabel.setBounds(90, 170, 140, 35);
        this.actors.setBounds(250, 170, 180, 35);
        this.categoryLabel.setBounds(90, 220, 140, 35);
        this.category.setBounds(250, 220, 180, 35);
        this.dateLabel.setBounds(90, 270, 140, 35);
        this.date.setBounds(250, 270, 180, 35);
        this.button.setBounds(200, 360, 150, 50);
        this.message.setBounds(190, 450, 250, 30);
        this.writeMessage.setBounds(200, 450, 200, 30);
    }

    public void styling() {
        this.getContentPane().setBackground(new Color(16, 172, 132));
        this.idLabel.setForeground(new Color(255, 255, 255));
        this.idLabel.setFont(new Font("Sans", 1, 17));
        this.titleLabel.setForeground(new Color(255, 255, 255));
        this.titleLabel.setFont(new Font("Sans", 1, 17));
        this.actorLabel.setForeground(new Color(255, 255, 255));
        this.actorLabel.setFont(new Font("Sans", 1, 17));
        this.categoryLabel.setForeground(new Color(255, 255, 255));
        this.categoryLabel.setFont(new Font("Sans", 1, 17));
        this.dateLabel.setForeground(new Color(255, 255, 255));
        this.dateLabel.setFont(new Font("Sans", 1, 17));
        this.id.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        this.title.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        this.actors.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        this.category.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        this.date.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        this.button.setFocusable(false);
        this.button.setFont(new Font("SansSerif", 1, 18));
        this.button.setBackground(new Color(52, 73, 94));
        this.button.setForeground(new Color(255, 255, 255));
        this.button.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        this.message.setForeground(new Color(255, 255, 255));
        this.message.setFont(new Font("Sans", 1, 18));
        this.message.setVisible(false);
        this.writeMessage.setForeground(new Color(255, 255, 255));
        this.writeMessage.setFont(new Font("Sans", 1, 18));
        this.writeMessage.setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
        if (this.id.getText().equals("") && this.title.getText().equals("") && this.actors.getText().equals("") && this.category.getText().equals("") && this.date.getText().equals("")) {
            this.writeMessage.setVisible(false);
            this.message.setVisible(true);
        } else {
            WritingMovie w = new WritingMovie();
            StringBuilder str = new StringBuilder();
            String var10001 = this.id.getText();
            str.append(var10001 + "_" + this.title.getText() + "_" + this.actors.getText() + "_" + this.category.getText() + "_" + this.date.getText() + "\n");

            try {
                w.write(str.toString());
                this.message.setVisible(false);
                this.writeMessage.setVisible(true);
            } catch (IOException var5) {
                var5.printStackTrace();
            }
        }

    }
}
