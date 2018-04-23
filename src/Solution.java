import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) throws IOException {
    System.out.println(solution());
  }

  public static int solution() throws IOException {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    char[] chars = new char[]{'A', 'I', 'D'};
    File directory = new File("\\resources");

    if (!directory.exists()) directory.mkdir();

    for (int i = 0; i < 20; i++) {
      File file = new File(String.format("\\resources\\in%02d.txt", i+1));
      FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);
      for (int j = 0; j < rand.nextInt(10) + 5; j++) {
        if (!file.exists()) file.createNewFile();

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < rand.nextInt(10) + 5; k++) {
          sb.append(chars[rand.nextInt(2) + 0]);
        }
        System.out.println(sb.toString());
        bw.write(sb.toString());
        bw.newLine();
      }
      bw.close();
      System.out.println();
    }

    sc.close();
    return 0;
  }
}

/*

*/