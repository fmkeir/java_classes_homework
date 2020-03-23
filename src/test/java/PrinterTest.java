import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(20);
    }

    @Test
    public void canPrintIfEnoughPaper() {
        printer.print(6);
        assertEquals(14, printer.getPaperSheets());
    }

    @Test
    public void canPrintIfEnoughPaperTonerUsed() {
        printer.print(5);
        assertEquals(15, printer.getPaperSheets());
        assertEquals(495, printer.getToner());
    }

    @Test
    public void paperCanBeAdded() {
        printer.addPaper(5);
        assertEquals(25, printer.getPaperSheets());
    }
}
