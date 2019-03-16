package autocomplete;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Completer {

  private Set<String> words;

  public Completer() {
    this.words = new HashSet<>();
  }

  public Completer(Collection<String> words) {
    this.words = new HashSet<>(words);
  }

  public List<String> autoComplete(String prefix) {
    List<String> matches = new ArrayList<>();
    for (String word : this.words) {
      if (matches(word, prefix)) {
        matches.add(word);
      }
    }
    return matches;
  }

  private static boolean matches(String word, String prefix) {
    return word.startsWith(prefix);
  }
}
