package pl.basics9.gui.wyklad.w05.ex02;

public class Student extends pl.basics9.gui.wyklad.w01.persons.Student {

    public Student(String name, int age, String id) {
        super(name, age, id);
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = hash + 31 * (this.name == null ? 0 : this.name.hashCode());
        hash = hash + this.age;
        return hash;
    }
}
