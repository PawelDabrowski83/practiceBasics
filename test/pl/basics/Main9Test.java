package pl.basics;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class Main9Test {

    String key;
    String value;
    Map<Character, Character> cipher;
    Map<Character, Character> cipherExpected;
    Map<Character, Character> cipherActual;
    String str;
    String messageExpected;
    String messageActual;

    @Before
    public void setUp() {

        cipher = Stream.of(new Character[][] {
                { 'a', 'z' },
                { 'b', 'y' },
                { 'c', 'x' },
                { 'd', 'w' },
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
    }

    @Test
    public void shouldGetCipherReturnEmptyGivenNull() {

        // given
        key = null;
        value = null;
        cipherExpected = new HashMap<>();

        // when
        cipherActual = Main9.getCipher(key, value);

        // then
        assertEquals(cipherExpected, cipherActual);
    }

    @Test
    public void shouldGetCipherReturnEmptyGivenEmpty() {

        // given
        key = "";
        value = "";
        cipherExpected = new HashMap<>();

        // when
        cipherActual = Main9.getCipher(key, value);

        // then
        assertEquals(cipherExpected, cipherActual);
    }

    @Test
    public void shouldGetCipherReturnEmptyGivenUnevenInput() {

        // given
        key = "abc";
        value = "dgwkwgf";
        cipherExpected = new HashMap<>();

        // when
        cipherActual = Main9.getCipher(key, value);

        // then
        assertEquals(cipherExpected, cipherActual);
    }

    @Test
    public void shouldGetCipherWork() {

        // given
        key = "abcd";
        value = "zyxw";
        cipherExpected = new HashMap<>(cipher);

        //when
        cipherActual = Main9.getCipher(key, value);
    }

    @Test
    public void shouldEncodeWork() {

        // given
        str = "abcdefgh";
        messageExpected = "zyxwefgh";

        // when
        messageActual = Main9.encode(str, cipher);

        // then
        assertEquals(messageExpected, messageActual);
    }

    @Test
    public void shouldEncodeGivenNullReturnEmpty() {

        // given
        str = null;
        messageExpected = "";

        // when
        messageActual = Main9.encode(str, cipher);

        // then
        assertEquals(messageExpected, messageActual);
    }

    @Test
    public void shouldEncodeGivenEmptyReturnEmpty() {

        // given
        str = "";
        messageExpected = "";

        // when
        messageActual = Main9.encode(str, cipher);

        // then
        assertEquals(messageExpected, messageActual);
    }

    @Test
    public void shouldEncodeGivenWorthlessCipherReturnMessage() {

        // given
        str = "abcd efgh";
        cipher = Stream.of(new Character[][] {
                { 'a', 'a' },
                { 'b', 'b' },
                { 'c', 'c' },
                { 'd', 'd' },
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
        messageExpected = new String(str);

        // when
        messageActual = Main9.encode(str, cipher);

        // then
        assertEquals(messageExpected, messageActual);
    }

    @Test
    public void shouldEncodeGivenNotUsefulCipherReturnMessage() {

        // given
        str = "ab cd ef gh";
        cipher = Stream.of(new Character[][] {
                { 's', 'u' },
                { 'r', 't' },
                { 'q', 'm' },
                { 'p', 'n' },
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
        messageExpected = new String(str);

        // when
        messageActual = Main9.encode(str, cipher);

        // then
        assertEquals(messageExpected, messageActual);
    }

    @Test
    public void shouldEncodeGivenNullCipherReturnMessage() {

        // given
        str = "ab ab bada";
        cipher = null;
        messageExpected = new String(str);

        // when
        messageActual = Main9.encode(str, cipher);

        // then
        assertEquals(messageExpected, messageActual);
    }

    @Test
    public void shouldDecodeWork() {

        // given
        str = "zyxw vuts";
        messageExpected = "abcd vuts";

        // when
        messageActual = Main9.decode(str, cipher);

        // then
        assertEquals(messageExpected, messageActual);
    }

    @Test
    public void shouldDecodeGivenNullStringReturnEmpty() {

        // given
        str = null;
        messageExpected = "";

        // when
        messageActual = Main9.decode(str, cipher);

        // then
        assertEquals(messageExpected, messageActual);
    }
}
