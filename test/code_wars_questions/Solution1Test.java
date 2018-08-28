import code_wars_questions.Solution1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Solution1Test {
    @Test
    public void basicTests() {
        doTest("abracadabra",  1, "bracadabra");
        doTest("abracadabra",  2, "brcadabra");
        doTest("abracadabra",  6, "rcdbr");
        doTest("abracadabra",  8, "rdr");
        doTest("abracadabra", 50, "");
    }
    private void doTest(String s, int k, String expected) {
        assertEquals(expected, Solution1.solve(s, k));
    }
}