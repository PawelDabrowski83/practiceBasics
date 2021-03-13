package pl.basics6.ppj.c11.Phone;

public class Smartphone extends CellPhone {

    private Person[] contacts;
    private int count;


    public Smartphone(String communicationInterface, String color) {
        super(communicationInterface, color);
        this.contacts = new Person[0];
    }

    @Override
    public void getHistory() {
        String[] callHistory = super.getCallsHistory();
        String[] result = new String[callHistory.length];

        for (int i = 0; i < callHistory.length; i++) {
            String modified = checkContacts(callHistory[i]);
            result[i] = modified;
        }
    }

    private String checkContacts(String number) {
        if (contacts == null || contacts.length == 0 || count == 0 || number == null) {
            return number;
        }
        boolean personFound = false;
        Person person;
        for (Person p : contacts) {
            if (number.equals(p.getNumber())) {
                return p.toString();
            }
        }
        return number;
    }

    public void addContact(Person person) {
        if (count == contacts.length) {
            extendContacts();
        }
        contacts[count++] = person;
    }

    private void extendContacts() {
        Person[] tmp = new Person[count + 1];
        int step = 0;
        for (Person p : contacts) {
            tmp[step++] = p;
        }
        contacts = tmp;
    }
}
