package codefight;

import java.util.ArrayList;
import java.util.List;

public class FirstNotRepetingCharacter {

  public static void main(String[] args) {
    System.out.println(firstNotRepeatingCharacter("abacabad"));
    System.out.println(firstNotRepeatingCharacter("abacabaabacaba"));
  }

  static char firstNotRepeatingCharacter(String s) {
    List<Character> t = new ArrayList<>(), u = new ArrayList<>();
    for (Character c : s.toCharArray()) {
      if(t.contains(c))
        u.remove(c);
      else
        u.add(c);
      if(!t.contains(c))
        t.add(c);
    }
    return (u.size() > 0?u.get(0):'_');
  }
}
