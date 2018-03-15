import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
//import java.util.Calender;



public class OnCallFrame2 extends JFrame implements ActionListener{
  JTextField inputM = new JTextField("01");
  JTextField inputD = new JTextField("01");
  JTextField inputY = new JTextField("2018");
  JButton btn = new JButton("Enter");
  public int m; public int d; public int y;
  public int hi;
  Date newDay;

  public static void main(String[] args) {
    OnCallFrame2 callFrm = new OnCallFrame2();
    //.setVisible(true);

    //try {synchronized (newDay){newDay.wait();}} catch (InterruptedException e){System.out.println("is it working?");}
    //try {synchronized (newDay){newDay.notify();}} catch (InterruptedException e){System.out.println("is it working?");}
    while(true){
      //System.out.println("hello");
      if(callFrm.getHi() == 1){
        System.out.println(callFrm.tellOnCall());
        break;}}
    //System.out.println(newDay.getDay());

  }

  public OnCallFrame2(){
    super("Calculate On Call Points");
    setSize(600,600);
    setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    Container container;
    container = getContentPane();

    JLabel firstLbl = new JLabel ("Enter call dates (Month/Day/Year)");

    btn.addActionListener(this);
    add(btn);

    //container.add(fld, BorderLayout.SOUTH);

    inputM.setBounds(145,150,55,30);
    inputD.setBounds(200,150,50,30);
    inputY.setBounds(250,150,50,30);
    container.add(inputM);
    container.add(inputD);
    container.add(inputY);
    this.hi=0;

    this.newDay = new Date();

    //this.newDay.setDay(d);
    this.newDay.setMonth(m);
    this.newDay.setYear(y);

    this.setVisible(true);

  }

  @Override
  public void actionPerformed(ActionEvent e){
    //if (e.getSource() == btn){hi=1;}
    this.newDay.setDay(Integer.parseInt(inputD.getText()));
    this.newDay.setMonth(Integer.parseInt(inputM.getText()));
    this.newDay.setYear(Integer.parseInt(inputY.getText()));
    //System.out.println(d+ "hi");
    this.hi=1;
    //System.out.println("hi"+hi);
    /*System.out.println("button pressed");
    System.out.println(m);
    System.out.println(d);
    System.out.println(y);*/
  }
  public int getHi(){
    System.out.println("pi day");
    return hi;
  }
  public int tellOnCall(){
    return this.newDay.getDay();
  }

}
