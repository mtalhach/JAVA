package A37_GUI;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

public class mainFrame extends JFrame implements ActionListener {
    JLabel id,title,stock,price,category;
    JTextField idField,titleField,stockField,priceField;
    JComboBox cat;
    JFrame frame;

    String[] items={"Samsung","Vivo","Oppo","Lenovo","LG","Infinix","Tecno","Readme"};

    JButton add,search,sale,Exit;

    public mainFrame() throws HeadlessException {
        this.setBounds(50,50,500,450);
        this.setVisible(true);
        this.setLayout((LayoutManager)null);
        this.setTitle("Main Frame");
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.initializingComponent();
        this.addComponent();
        this.settingBounds();
        this.styling();
    }

    public void initializingComponent() {
        id=new JLabel("Id");
        title=new JLabel("Title");
        stock=new JLabel("Stock");
        price=new JLabel("Price");
        category=new JLabel("Category");

        idField=new JTextField();
        titleField=new JTextField();
        stockField=new JTextField();
        priceField=new JTextField();
        cat=new JComboBox(items);

        add=new JButton("Add");
        search=new JButton("search");
        sale=new JButton("Sale");
        Exit=new JButton("Exit");

        this.add.addActionListener(this);
        this.search.addActionListener(this);
        this.sale.addActionListener(this);
        this.Exit.addActionListener(this);
    }

    public void addComponent() {
       add(id);add(title);add(stock);add(price);add(category);
       add(idField);add(titleField);add(stockField);add(priceField);add(cat);
       add(add);add(search);add(sale);add(Exit);
    }

    public void settingBounds() {
       id.setBounds(50,20,100,30);
       idField.setBounds(170,20,200,30);
        title.setBounds(50,70,100,30);
        titleField.setBounds(170,70,200,30);
        stock.setBounds(50,120,100,30);
        stockField.setBounds(170,120,200,30);
        price.setBounds(50,170,100,30);
        priceField.setBounds(170,170,200,30);
        category.setBounds(50,220,100,30);
        cat.setBounds(170,220,100,30);

        add.setBounds(70,300,80,30);
        search.setBounds(160,300,80,30);
        sale.setBounds(250,300,80,30);
        Exit.setBounds(340,300,80,30);



    }

    public void styling() {
        this.getContentPane().setBackground(new Color(100, 220, 120));
        this.id.setFont(new Font("SansSerif", 1, 17));
        this.idField.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        this.title.setFont(new Font("SansSerif", 1, 17));
        this.titleField.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        this.stock.setFont(new Font("SansSerif", 1, 17));
        this.stockField.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        this.price.setFont(new Font("SansSerif", 1, 17));
        this.priceField.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        this.category.setFont(new Font("SansSerif", 1, 17));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==add) {
            if (idField.getText().equals("") ||titleField.getText().equals("") || stockField.getText().equals("") ||priceField.getText().equals("") ) {
                int sel = JOptionPane.showConfirmDialog(mainFrame.this.frame, "Plz Fill All The Field", "Conferm", 0, 1);
                if (sel == 0) {
                    this.setVisible(true);
                }
            } else {
                WritingData w = new WritingData();
                StringBuilder str = new StringBuilder();
                String string = this.id.getText();
                str.append(string + "_" + this.idField.getText()+ "_" + this.titleField.getText() + "_" + this.stockField.getText() + "_" + this.priceField.getText()  + "\n");

                try {
                    w.write(str.toString());
                    int sel = JOptionPane.showConfirmDialog(mainFrame.this.frame, "SuccessFully Added", "Conferm", 0, 1);
                    if (sel == 0) {
                        idField.setText("");
                        titleField.setText("");
                        stockField.setText("");
                        priceField.setText("");
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        if(e.getSource()==search){
            new SearchFramee();
        }
        if(e.getSource()==Exit){
            int sel = JOptionPane.showConfirmDialog(frame, "Do you Want To Close", "Conferm", 0, 3);
            if (sel == 0) {
                System.out.println("Yes Is Selected");
                System.exit(0);
            } else if (sel == 1) {
                System.out.println("No Is Selected");
            }
        }

    }
}


