package pl.basics6.ppj.c11;

public class Cookie {

    private final String producerName;
    private final int massInGrams;
    private final String productCode;

    public Cookie(String producerName, int massInGrams, String productCode) {
        this.producerName = producerName;
        this.massInGrams = massInGrams;
        this.productCode = productCode;
    }

    public String getProducerName() {
        return producerName;
    }

    public int getMassInGrams() {
        return massInGrams;
    }

    public String getProductCode() {
        return productCode;
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "producerName='" + producerName + '\'' +
                ", massInGrams=" + massInGrams +
                ", productCode='" + productCode + '\'' +
                '}';
    }
}
