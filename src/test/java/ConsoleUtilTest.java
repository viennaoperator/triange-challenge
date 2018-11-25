import com.tradeshift.util.ConsoleUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.util.Scanner;

public class ConsoleUtilTest {

    @Mock
    private Scanner in;

    private String inputMessage;

    @Before
    public void SetupAppTest() {
        in = Mockito.mock(Scanner.class);
        App.in = in;
        inputMessage = "length x";
    }

    @Test
    public void GetUserInputAsInt_UserPutsInNumber_Valid() {
        Mockito.when(in.nextLine()).thenReturn("1");
        float input = ConsoleUtil.GetUserInputAsFloat(inputMessage, in);
        Assert.assertEquals("console input was not saved properly",1,  input, 0);
    }

    @Test
    public void ReadNumberFromConsole_UserPutsInCharacter_ShouldReturnZero() {
        Mockito.when(in.nextLine()).thenReturn("c");
        float input = ConsoleUtil.ReadNumberFromConsole(in);
        Assert.assertEquals("ReadNumberFromConsole should return 0 if a character is typed in",0, input, 0);
    }

    @Test
    public void ReadNumberFromConsole_UserPutsInNegativeNumber_ShouldReturnZero() {
        Mockito.when(in.nextLine()).thenReturn("-1");
        float input = ConsoleUtil.ReadNumberFromConsole(in);
        Assert.assertEquals("ReadNumberFromConsole should return 0 if a character is a negative number",0, input, 0);
    }

    @Test
    public void ReadNumberFromConsole_UserPutsInFloatingNumber_ShouldReturnValidNumber() {
        Mockito.when(in.nextLine()).thenReturn("2.04");
        float input = ConsoleUtil.ReadNumberFromConsole(in);
        Assert.assertEquals("ReadNumberFromConsole doesn't parse input correctly!",2, input, 2.04);
    }

    @Test
    public void ReadNumberFromConsole_UserPutsInFloatingNumberWithKomma_ShouldReturnValidNumber() {
        Mockito.when(in.nextLine()).thenReturn("2,04");
        float input = ConsoleUtil.ReadNumberFromConsole(in);
        Assert.assertEquals("ReadNumberFromConsole doesn't parse input correctly!",2, input, 2.04);
    }
}
