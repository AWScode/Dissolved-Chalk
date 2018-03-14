import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;

public class OnCallFrame extends Frame implements ActionListener{
  Button firstBtn = new Button("Enter");
  TextField inputM;
  TextField inputD;
  //int days1;
  TextField inputY;

  /*public void actionPerformed (ActionEvent e){
      String a = inputD.getText();
      int b = Integer.parseInt(a);
      System.out.println("hi");
      days1 = b;
  }*/

  public OnCallFrame(){
    setLayout(new FlowLayout());
    Label firstLbl = new Label ("Enter call dates (Month/Day/Year)");
    firstLbl.setBounds(200,100,100,30);
    add (firstLbl);

    inputM = new TextField("00");
    add(inputM);
    inputM.setBounds(145,150,55,30);

    inputD = new TextField("00");
    add(inputD);
    inputD.setBounds(200,150,50,30);

    inputY = new TextField("2018");
    add(inputY);
    inputY.setBounds(250,150,50,30);

    //Panel one = new Panel();
    firstBtn.setBounds(250,200,80,30);
    add (firstBtn);
    setSize(500,500);
    firstBtn.addActionListener(this);


    setLayout(null);
    setVisible(true);
    }
    public Button getButton(){
      return firstBtn;
    }

    public int setDays(){
    int days1=0;
    firstBtn.addActionListener(new ActionListener(){
      String a = inputD.getText();
      days1 = Integer.parseInt(a);});
    return days1;
    }

    public int getDays(){
    return setDays();
    }


    //public int getMonths(){
    //return setDays();
    //}
    public int getYears(){
    String a = inputY.getText();
    int b = Integer.parseInt(a);
    return b;
    }
    //void performActionPerformedMethod(){actionPerformed(ActionEvent e);}
    //void performActionMethod(){

}
