import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
import java.util.Calendar;



public class OnCallFrame2 extends JFrame implements ActionListener{
  JTextField inputM = new JTextField("01");
  JTextField inputD = new JTextField("01");
  JTextField inputY = new JTextField("2018");
  JButton btn = new JButton("Enter");
  JButton pmBtn = new JButton("Click for PM");
  JButton holidayBtn = new JButton("Click for Holiday");
  public int m; public int d; public int y;
  public int hi;
  Date newDay;
  Calendar cal1;
  OnCallPoints points;
  JTable newTable;

  public static void main(String[] args) {
    OnCallFrame2 callFrm = new OnCallFrame2();
    //.setVisible(true);

    //try {synchronized (newDay){newDay.wait();}} catch (InterruptedException e){System.out.println("is it working?");}
    //try {synchronized (newDay){newDay.notify();}} catch (InterruptedException e){System.out.println("is it working?");}

    /*for(int i=1;i>1;i++){
      if(callFrm.getHi()==1){
        System.out.println(callFrm.tellOnCall());
        i=0;
      }
      else{i++;}
    }

    while(true){
      //System.out.println("hello");
      if(callFrm.getHi() == 1){
        System.out.println(callFrm.tellOnCall());
        break;}}*/
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

    pmBtn.addActionListener(this);
    add(pmBtn);

    holidayBtn.addActionListener(this);
    add(holidayBtn);

    //container.add(fld, BorderLayout.SOUTH);

    inputM.setBounds(145,150,55,30);
    inputD.setBounds(200,150,50,30);
    inputY.setBounds(250,150,50,30);
    container.add(inputM);
    container.add(inputD);
    container.add(inputY);
    this.hi=0;

    this.newDay = new Date();
    cal1 = Calendar.getInstance();
    points = new OnCallPoints();
    newTable = new JTable(data,columns);
    String[] columns = {"Weekday Total","Weekday PM Total","Weekend Total", "SundayPM Total","Holiday Total", "Overall Total", "Total Number of Call"};
    //Class [] columnClass = new Class[]{Integer.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class};
    int[][] data = new int[][]{points.getWeekday(),points.getWeekdayPMTotal(),points.getWeekendTotal(),points.getSundayPMTotal(),points.getHolidayTotal(),points.getOverallTotal(),points.getTotalOnCall()};

    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == btn){
    this.newDay.setDay(Integer.parseInt(inputD.getText()));
    this.newDay.setMonth(Integer.parseInt(inputM.getText()));
    this.newDay.setYear(Integer.parseInt(inputY.getText()));
    cal1.set(this.newDay.getYear(),this.newDay.getMonth(),this.newDay.getDay());
    this.newDay.setWeekday(this.newDay.returnWeekday(cal1.get(Calendar.DAY_OF_WEEK)));}
    else{if(e.getSource() == pmBtn){this.newDay.setPM(true);}
      else{this.newDay.setHoliday(true);}
    }
    points.addPoint(newDay);

    //this.hi=1;
  }
  /*@Override
  public Class<?> getColumnClass(int columnIndex){
    return columnClass[columnIndex];
  }*/
  public int getHi(){
    System.out.println("pi day");
    return hi;
  }
  public int tellOnCall(){
    return this.newDay.getDay();
  }

}
