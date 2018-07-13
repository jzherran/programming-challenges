package codesignal;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class AsanaBot_R2 {

  public static void main(String[] args) {
    System.out.println(htmlToLuna("<img />".trim()));
  }

  static String htmlToLuna(String html) {
    StringTokenizer st = new StringTokenizer(html, ">");
    StringBuilder sb = new StringBuilder();
    List<String> c = new ArrayList<>();

    while (st.hasMoreTokens()) {
      String s = st.nextToken().substring(1);
      System.out.println(s);
      switch (s) {
        case "div":
          sb.append("DIV([");
          c.add("div");
          break;
        case "p":
          sb.append("P([");
          c.add("p");
          break;
        case "b":
          sb.append("B([");
          c.add("b");
          break;
        case "img/":
        case "img /":
        case "/div":
        case "/p":
        case "/b":
        case "/ div":
        case "/ p":
        case "/ b":
          if (s.equals("img/") || s.equals("img /")) {
            sb.append("IMG({})");
          }
          if (sb.substring(sb.length() - 2).equals(", ")) {
            sb = new StringBuilder(sb.substring(0, sb.length() - 2));
          }
          if (c.size() > 0 && c.get(c.size() - 1).equals(s.substring(1))) {
            c.remove(c.size() - 1);
            sb.append("])");
          }
          if (c.size() > 0) {
            sb.append(", ");
          }
          break;
      }
      System.out.println(sb.toString() + " - " + c);
    }
    return sb.toString();
  }
}
