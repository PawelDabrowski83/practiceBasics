package pl.basics6.ppj.c14;

import java.io.IOException;
import java.io.InputStream;

public class Person {
    private String name;
    private String surname;
    private int yearOfBirth;
    private boolean gender;
    private short zipCode;

    public Person(InputStream inputStream) {
        try {
            System.out.println("Enter first name:");
            this.name = readInputWord(inputStream);
            System.out.println("Enter last name:");
            this.surname = readInputWord(inputStream);
            System.out.println("Enter year of birth:");
            this.yearOfBirth = Integer.parseInt(readInputWord(inputStream));
            System.out.println("Enter gender:");
            this.gender = Boolean.parseBoolean(readInputWord(inputStream));
            System.out.println("Enter zipcode:");
            this.zipCode = Short.parseShort(readInputWord(inputStream));
        } catch (NumberFormatException e) {
            throw new IncorrectInputException();
        }
    }

    public String readInputWord(InputStream inputStream) {
        int data = 0;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            data = inputStream.read();
            while (data != -1 && data != (int) '\n') {
                stringBuffer.append((char) data);
                data = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString().trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public short getZipCode() {
        return zipCode;
    }

    public void setZipCode(short zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", gender=" + gender +
                ", zipCode=" + zipCode +
                '}';
    }
}
