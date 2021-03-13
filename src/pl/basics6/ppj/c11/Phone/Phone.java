package pl.basics6.ppj.c11.Phone;

public class Phone {

    private String communicationInterface;
    private String color;

    public Phone(String communicationInterface, String color) {
        this.communicationInterface = communicationInterface;
        this.color = color;
    }

    public void call(String number) {
        System.out.println(number);
    }

    public String getCommunicationInterface() {
        return communicationInterface;
    }

    public void setCommunicationInterface(String communicationInterface) {
        this.communicationInterface = communicationInterface;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getHistory() {
        System.out.println("no history");
    }
}
