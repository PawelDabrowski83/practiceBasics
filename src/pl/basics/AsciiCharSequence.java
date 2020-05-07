package pl.basics;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {

    private byte[] bytes;

    public AsciiCharSequence(byte[] bytes) {
        if (bytes != null) {
            this.bytes = Arrays.copyOf(bytes, bytes.length);
        }
    }

    @Override
    public int length() {
        return this.bytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) this.bytes[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {

        return new AsciiCharSequence(Arrays.copyOfRange(this.bytes, start, end));
    }

    @Override
    public String toString() {

        return new String(this.bytes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AsciiCharSequence)) return false;

        AsciiCharSequence that = (AsciiCharSequence) o;

        return Arrays.equals(bytes, that.bytes);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(bytes);
    }
}
