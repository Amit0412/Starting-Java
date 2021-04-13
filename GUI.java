import java.applet.Applet;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.CheckboxGroup;

public class Wed extends Applet implements ActionListener
{
    String name=" ";
    String age=" ";
    String uniname=" ";
    String op=" ";
    TextField a=new TextField(10);
    TextField b=new TextField(10);
    TextField c=new TextField(10);
    CheckboxGroup g=new CheckboxGroup();
    Checkbox c1=new Checkbox("Male",g,true);
    Checkbox c2=new Checkbox("Female",g,false);
    Label l1=new Label("Name:");
    Label l2=new Label("Class:");
    Label l3=new Label("University name:");
    Button b1=new Button("Submit");
    Button b2=new Button("Cancel");
    
    public void init()
    {
        add(l1);
        add(a);
        add(l2);
        add(b);
        add(l3);
        add(c);
        add(c1);
        add(c2);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void paint(Graphics g)
    {
        g.drawString(name, 100, 200);
        g.drawString(age, 150, 210);
        g.drawString(uniname,175,225);
        g.drawString(op, 120, 180);
    }
    public void actionPerformed(ActionEvent e)
    {
        name=a.getText();
        age=b.getText();
        uniname=c.getText();
        op=g.getSelectedCheckbox().getLabel();
        repaint();
    }
}
