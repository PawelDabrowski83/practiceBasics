package pl.basics3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class DataParserTest {

    @DisplayName("Should formatData() work")
    @ParameterizedTest(name = "{index} => expected={0}, input={1}")
    @MethodSource("formatDataArgumentsProvider")
    void formatData(String expected, String input) {
        assertEquals(expected, DataParser.formatData(input));
    }
    private static Stream<Arguments> formatDataArgumentsProvider() {
        return Stream.of(
                Arguments.of("09/28/2012", "2012-09-28"),
                Arguments.of("", "2012-09-282012-09-28"),
                Arguments.of("", "151-141-11"),
                Arguments.of("01/15/1999", "1999-01-15"),
                Arguments.of("", "1899-15-15"),
                Arguments.of("", "2000-00-31"),
                Arguments.of("01/31/2002", "2002-01-31"),
                Arguments.of("", "2002-02-333"),
                Arguments.of("10/15/1995", "1995-10-15"),
                Arguments.of("", "1316-15-15"),
                Arguments.of("", "1648-02-65"),
                Arguments.of("", "16156-11-16516"),
                Arguments.of("", "1325-84-16"),
                Arguments.of("", "1966-65-64"),
                Arguments.of("", "2122-01-31"),
                Arguments.of("03/08/2020", "2020-03-08"),
                Arguments.of("01/05/2019", "2019-01-05"),
                Arguments.of("06/18/2020", "2020-06-18")
        );
    }
}
