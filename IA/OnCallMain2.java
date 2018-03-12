import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;

public class OnCallMain2 extends Frame{
  Button firstBtn = new Button("Enter");
  TextField inputM = new TextField("Month");
  TextField inputD = new TextField("Day");
  TextField inputY = new TextField("Year");

  public OnCallMain2(){
    setLayout(new FlowLayout());
    Label firstLbl = new Label ("Enter call dates");
    firstLbl.setBounds(200,100,100,30);
    add (firstLbl);

    add(inputM);
    inputM.setBounds(145,150,55,30);
    //inputM.addActionListener(this);

    add(inputD);
    inputD.setBounds(200,150,50,30);
    //inputD.addActionListener(this);

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
  public static void main(String[] arg){

    new OnCallMain2();

    Date newDay = new Date();

    Scanner times = new Scanner(System.in);
    System.out.println("How many on call times to report?");
    int callNum = times.nextInt();

    OnCallPoints newOCP = new OnCallPoints();
    Scanner day = new Scanner(System.in);

    int totalOnCall = 0;
    int overallTotal = 0;

    for(int i=0; i<callNum; i++){
      System.out.println("When were you on call? (month/day/year)"); //ex. 01/01/18
      String date1 = day.nextLine();
      int day1 = Integer.parseInt(date1.substring(0,2));
      int month1 = Integer.parseInt(date1.substring(3,5));
      int year1 = Integer.parseInt(date1.substring(6));
      newDay.setDay(day1);
      newDay.setMonth(month1);
      newDay.setYear(year1);
      System.out.println("Was it a holiday?");
      String holi1 = day.nextLine();
      if(holi1.equalsIgnoreCase("yes")){newDay.setHoliday(true);} else{newDay.setHoliday(false);}
      System.out.println("Was it at night?");
      String pm1 = day.nextLine();
      if(pm1.equalsIgnoreCase("yes")){newDay.setPM(true);} else{newDay.setPM(false);}
      System.out.println("What day of the week was it?");
      String engDay = day.nextLine();
      newDay.setWeekday(engDay);
      newOCP.addPoint(newDay);


      totalOnCall++;
      overallTotal =overallTotal + newOCP.getOverallTotal();
    }
    System.out.println(overallTotal);
  }
  public static ActionListener taskPerformer = new ActionListener(){
  public void actionPerformed(ActionEvent a){
    String value = inputM.getText();
  }};
}
