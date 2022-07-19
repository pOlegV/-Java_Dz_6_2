import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.Dz_6_2.service.BonusService;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void shouldCalculate(String nameTest, long amount, boolean registered, int expected) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
    
}
