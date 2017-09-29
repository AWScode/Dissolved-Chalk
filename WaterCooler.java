import java.io.*;
import java.util.*;
import java.nio.charset.*;
import java.nio.file.*;
public class WaterCooler{
  public static void main(String[] args) {
    File file = new File("Testing.txt");
    Path whereTopics = Paths.get("C: Desktop\\School\\ComputerScience\\Testing.txt");
    BufferedReader reader = Files.newBufferedReader(whereTopics,StandardCharsets.UTF_8);
    //ArrayList<String> topics = new ArrayList<String>();
    //Scanner readTopics= new Scanner(file);
    System.out.println("Testing.txt");
  }
}
