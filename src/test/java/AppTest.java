import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.Console;
import java.util.Scanner;


public class AppTest {

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
        int input = App.GetUserInputAsInt(inputMessage);
        Assert.assertEquals("console input was not saved properly",1, input);
    }

    @Test
    public void ReadNumberFromConsole_UserPutsInCharacter_ShouldReturnZero() {
        Mockito.when(in.nextLine()).thenReturn("c");
        int input = App.ReadNumberFromConsole();
        Assert.assertEquals("ReadNumberFromConsole should return 0 if a character is typed in",0, input);
    }

    @Test
    public void ReadNumberFromConsole_UserPutsInNegativeNumber_ShouldReturnZero() {
        Mockito.when(in.nextLine()).thenReturn("-1");
        int input = App.ReadNumberFromConsole();
        Assert.assertEquals("ReadNumberFromConsole should return 0 if a character is a negative number",0, input);
    }

    @Test
    public void ReadNumberFromConsole_UserPutsInValidNumber_ShouldReturnValidNumber() {
        Mockito.when(in.nextLine()).thenReturn("2");
        int input = App.ReadNumberFromConsole();
        Assert.assertEquals("ReadNumberFromConsole doesn't parse input correctly!",2, input);
    }
}
