package pl.basics6;

import java.util.regex.Pattern;

public class BinaryDecoder {
    protected static final Pattern BINARY_PATTERN = Pattern.compile("[01]{8}+");
    public String decode(String binary) {
        if (binary == null || binary.isBlank()){
            return "";
        }
        if (!BINARY_PATTERN.matcher(binary).find()){
            return "";
        }
        StringBuilder source = new StringBuilder(binary);
        StringBuilder target = new StringBuilder();
        while(source.length() > 0){
            String substring = source.substring(0, 8);
            source.delete(0, 8);
            int charNumber = Integer.parseInt(substring, 2);
            target.append((char) charNumber);
        }
        return target.toString();
    }
}
