//import javax.swing.table.DefaultTableCellRenderer;
//import javax.swing.*;

public class OnCallPoints{
  private int monthTotal;
  private int weekdayTotal;
  private int weekdayPMTotal;
  private int weekendTotal;
  private int sundayPMTotal;
  private int holidayTotal;
  private int overallTotal;
  private int holidayNum;
  private int weekdayNum;
  private int weekdayPMNum;
  private int weekendNum;
  private int sundayPMNum;
  private int totalOnCall;
  public int monthArray[];
  public OnCallPoints(){
    holidayNum = 0;
    weekdayNum = 0;
    weekdayPMNum = 0;
    weekendNum = 0;
    sundayPMNum = 0;

    weekdayTotal = 0;
    weekdayPMTotal = 0;
    weekendTotal = 0;
    sundayPMTotal = 0;
    holidayTotal = 0;

    monthTotal = 0;
    monthArray = new int[13]; //each space is a month, except 0 (wanted 1-12)
    overallTotal = 0;
    totalOnCall = 0;
  }
  public void addPoint(Date a){
    if(a.getHoliday()==true){holidayNum++; return;}
    if(a.getWeekday().equalsIgnoreCase("Monday") || a.getWeekday().equalsIgnoreCase("Tuesday") || a.getWeekday().equalsIgnoreCase("Wednesday") || a.getWeekday().equalsIgnoreCase("Thursday") || a.getWeekday().equalsIgnoreCase("Friday")){
      if(a.getPM() == true){weekdayPMNum++;} else {weekdayNum++;}
    }
    else{if(a.getWeekday().equalsIgnoreCase("Sunday") && a.getPM() == true){sundayPMNum++;}else{weekendNum++;}}
  }

  public int getWeekdayTotal(){return weekdayNum;}
  public int getWeekdayPMTotal(){return weekdayPMNum * 3;}
  public int getWeekendTotal(){return weekendNum * 4;}
  public int getSundayPMTotal(){return sundayPMNum * 2;}
  public int getHolidayTotal(){return holidayNum * 5;}

  public int getOverallTotal(){
    overallTotal = weekdayTotal+weekdayPMTotal+weekendTotal+sundayPMTotal+holidayTotal;
    return overallTotal;
  }
  //realized that I don't need the below
  public int getTotalOnCall(){
    totalOnCall = weekdayNum+weekdayPMNum+weekendNum+sundayPMNum+holidayNum;
    return totalOnCall;
  }
  public void addToMonth(Date b){
    for(int i=0;i<13;i++){
      if(b.getMonth() == i){monthArray[i] = overallTotal;}
  }}
  /*public void setTable(JTable a){
    a.getColumn(0).set
    a.getRow(0).setCellRenderer(FormatRenderer.)

  }*/
}
