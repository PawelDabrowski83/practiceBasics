package pl.basics6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryDecoderTest {

    BinaryDecoder binaryDecoder = new BinaryDecoder();

    @DisplayName("Should decode work properly")
    @ParameterizedTest
    @MethodSource("decodeArgumentsProvider")
    void decode(String expected, String binary){
        assertEquals(expected, binaryDecoder.decode(binary));
    }
    private static Stream<Arguments> decodeArgumentsProvider(){
        return Stream.of(
                Arguments.of("", ""),
                Arguments.of("Hello", "0100100001100101011011000110110001101111")
        );
    }

    @Test
    public void shouldDecodeGivenNullReturnEmpty(){
        String binary = null;
        assertEquals("", binaryDecoder.decode(binary));
    }
}
