import javax.swing.*;

public class talbleForm extends JFrame {
    String data[][]={{"Ali","20","OOP"},{"Talha","19","Web"},{"Hanzla","25","BD"}};
    String column[]={"Name","Age","Subject"};
    JTable table;
    JScrollPane scrollPane;

    talbleForm(){
        table=new JTable(data,column);
        table.setBounds(30,40,200,300);
        scrollPane=new JScrollPane(table);
        add(scrollPane);
        setSize(300,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new talbleForm();
    }

}
