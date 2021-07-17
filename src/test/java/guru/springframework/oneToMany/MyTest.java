package guru.springframework.oneToMany;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyTest {

    @Test
    public void testFirstRegex() {
        Pattern compiledPattern = Pattern.compile("Marcin");
        Matcher matcher = compiledPattern.matcher("Nazywam sie Marcin Pietraszek");

        System.out.println(matcher.find());
        System.out.println(matcher.matches());
    }

    @Test
    public void testSymbolQuestionMark() {
        Pattern pattern = Pattern.compile("kr?at");
        assertTrue(pattern.matcher("krat").matches());
        assertTrue(pattern.matcher("kat").matches());
        assertFalse(pattern.matcher("krrat").matches());
        assertFalse(pattern.matcher("kot").matches());
    }

    @Test
    public void testSymbolQuestionMark1() {
        // create matcher for pattern p and given string
        Pattern p = Pattern.compile("^([a-zA-Z]+)([0-9]+)(.*)");
        Matcher m = p.matcher("Testing123Testing");

        // if an occurrence if a pattern was found in a given string...
        if (m.find()) {
            // ...then you can use group() methods.
            System.out.println(m.group(0)); // whole matched expression
            System.out.println(m.group(1)); // first expression from round brackets (Testing)
            System.out.println(m.group(2)); // second one (123)
            System.out.println(m.group(3)); // third one (Testing)
        }
    }

    @Test
    public void testSymbolQuestionMark2() {
        //Pattern p = Pattern.compile("^([a-zA-Z]+)([0-9]+)(.*)");
        Pattern p = Pattern.compile("kr?at");
        Matcher m = p.matcher("kat");
        //System.out.println(pattern.matcher("krat"));
        if (m.find()) {
            System.out.println("Group found:\t" + m.group(0)); // whole matched expression
        }
        m = p.matcher("kot");
        if (m.find()) {
            System.out.println("Group found:\t" + m.group(0)); // whole matched expression
        }
    }

    @Test
    public void simaplePattern() {
        //Pattern p = Pattern.compile("^([a-zA-Z]+)([0-9]+)(.*)");
        Pattern p = Pattern.compile("kr?at");
        Matcher m = p.matcher("kat");
        //System.out.println(pattern.matcher("krat"));
        if (m.find()) {
            System.out.println("Group found:\t" + m.group(0)); // whole matched expression
        }
        m = p.matcher("kot");
        if (m.find()) {
            System.out.println("Group found:\t" + m.group(0)); // whole matched expression
        }
    }
}
