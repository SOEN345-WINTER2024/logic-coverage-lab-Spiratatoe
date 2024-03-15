
import org.junit.Test;
import static org.junit.Assert.*;


public class CheckItTests {

    // combinational clause couverage
    @Test public void testCheckIt(){

        assertEquals("P is true", CheckIt.checkIt(true, true, true));

        assertEquals("P is true", CheckIt.checkIt(true, false, true));

        assertEquals("P is true", CheckIt.checkIt(true, true, false));

        assertEquals("P is true", CheckIt.checkIt(true, false, false));

        assertEquals("P is true", CheckIt.checkIt(false, true, true));

        assertEquals("P isn't true", CheckIt.checkIt(false, false, true));

        assertEquals("P isn't true", CheckIt.checkIt(false, true, false));

        assertEquals("P isn't true", CheckIt.checkIt(false, false, false));
    }

    @Test public void testCheckItPredicate(){
        // we only need two
        assertEquals("P is true", CheckIt.checkIt(true, true, true));

        assertEquals("P isn't true", CheckIt.checkIt(false, false, false));
    }

    @Test public void testCheckItClause(){
        // we only need two
        assertEquals("P is true", CheckIt.checkIt(true, true, true));

        assertEquals("P isn't true", CheckIt.checkIt(false, false, false));
    }

    @Test public void testCheckItCACC(){
        // we only need two
        assertEquals("P is true", CheckIt.checkIt(true, true, false));

        assertEquals("P isn't true", CheckIt.checkIt(false, true, true));
    }

    @Test public void testCheckItRACC(){
        // we only need two
        assertEquals("P is true", CheckIt.checkIt(true, false, true));

        assertEquals("P isn't true", CheckIt.checkIt(false, false, true));
    }


}
