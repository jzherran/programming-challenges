package codesignal;

import java.util.ArrayList;
import java.util.List;

public class FirstNotRepetingCharacter {

  public static void main(final String[] args) {
    System.out.println(firstNotRepeatingCharacter("abacabad"));
    System.out.println(firstNotRepeatingCharacter("abacabaabacaba"));
  }

  static char firstNotRepeatingCharacter(final String s) {
    final List<Character> t = new ArrayList<>(), u = new ArrayList<>();
    for (final Character c : s.toCharArray()) {
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
