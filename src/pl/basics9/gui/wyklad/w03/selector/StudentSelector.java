package pl.basics9.gui.wyklad.w03.selector;

@FunctionalInterface
public interface StudentSelector {

    boolean crit(Student student);

    static Student[] filter(Student[] students, StudentSelector selector) {
        int count = 0;
        for (Student s : students) {
            if (selector.crit(s)) {
                count++;
            }
        }
        Student[] result = new Student[count];
        count = 0;
        for (Student s : students) {
            if (selector.crit(s)) {
                result[count++] = s;
            }
        }
        return result;
    };
}
