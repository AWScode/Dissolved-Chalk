
public class Date {
  private String weekday;
  private int day;
  private int month;
  private int year;
  private boolean pm;
  private boolean holiday;
  public Date(){
    day = 01;
    month = 01;
    year = 2018;
    pm = false;
    holiday = false;
    weekday = "Sunday";
  }
  public void setDay(int a){
    day = a;
  }
  public void setMonth(int b){
    month = b;
  }
  public void setYear(int c){
    year = c;
  }
  public void setPM(boolean d){
    pm = d;
  }
  public void setHoliday(boolean e){
    holiday = e;
  }
  public void setWeekday(String f){
    weekday = f;
  }
  public int getDay(){
    return day;
  }
  public int getMonth(){
    return month;
  }
  public int getYear(){
    return year;
  }
  public String getWeekday(){
    return weekday;
  }
  public boolean getPM(){
    return pm;
  }
  public boolean getHoliday(){
    return holiday;
  }
}
