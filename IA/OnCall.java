import java.util.*;
import jxl.*;
import jxl.write.*;
import jxl.write.Number;

public class OnCall{
  public static void main(String[] arg){
    Date newDay = new Date();
    OnCallPoints newOCP = new OnCallpoints();
    Scanner day = new Scanner(System.in);
    System.out.println("How many on call times to report?");
    int callNum = day.nextInteger();

    int totalOnCall = 0;
    int overallTotal = 0;

    For(int i=0; i=<callNum; i++){
      System.out.println("When were you on call? (month/day/year)"); //ex. 01/01/18
      String date1 = day.nextLine();
      int day1 = Integer.parseInt(date1.substring(0,2));
      int month1 = Integer.parseInt(date1.substring(3,5));
      int year = Integer.parseInt(date1.substring(6));
      newDay.setDay(day1);
      newDay.setMonth(month1);
      newDay.setYear(year1);
      System.out.println("Was it a holiday?");
      String holi1 = day.nextLine();
      if(holi1.equalsIgnoreCase("yes")){newDay.setHoliday(true);} else{newDay.setHoliday(false);}
      System.out.println("Was it at night?");
      String pm1 = day.nextLine();
      if(pm1.equalsIgnoreCase("yes")){newDay.setPM(true);} else{newDay.setPM(false);}
      newOCP.addPoint(newDay);
      totalOnCall++;
      overallTotal =overallTotal + newOCP.getOverallTotal();
    }

    try{
      String filename = "E:\\file.xls";
      WritableWorkbook workbook = Workbook.createWorkbook(new File(On Call Points));
      WritableSheet sheet = workbook.createSheet("Sheet1",0);
      Label overT = new Label(0,0,"Overall Total");
      sheet.addCell(overT);
      Number totalOver = new Number(0,1,overallTotal);
      sheet.addCell(totalOver);

      Label totalOn = new Label(1,0,"Total Times On Call");
      sheet.addCell(totalOn);
      Number onTotal = new Number(1,1,totalOnCall);
      sheet.addCell(onTotal);

      workbook.write();
      workbook.close();
    }catch(WriteException e){}
  }
}
