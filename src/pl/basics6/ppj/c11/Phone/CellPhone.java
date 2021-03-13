package pl.basics6.ppj.c11.Phone;

import java.util.Arrays;

public class CellPhone extends Phone {
    private String[] callsHistory;
    private int callsCounter;

    public CellPhone(String communicationInterface, String color) {
        super(communicationInterface, color);
        this.callsHistory = new String[10];
    }


    public String[] getCallsHistory() {
        return callsHistory;
    }

    @Override
    public void call(String number) {
        super.call(number);
        callsHistory[callsCounter++ % callsHistory.length] = number;
    }

    public void getHistory() {
        System.out.println(Arrays.toString(getCallsHistory()));
    }


}
