package autocomplete;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.junit.Test;

public class CompleterTest {

  @Test
  public void oneWordFullMatch() {
    Completer completer = new Completer(Set.of("cat"));
    List<String> matches = completer.autoComplete("cat");
    assertEquals(Collections.singletonList("cat"), matches);
  }

}
