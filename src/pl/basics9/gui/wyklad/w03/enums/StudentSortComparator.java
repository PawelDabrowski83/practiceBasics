package pl.basics9.gui.wyklad.w03.enums;

import pl.basics9.gui.wyklad.w01.persons.Person;

import java.util.Comparator;

public class StudentSortComparator implements Comparator<Person> {

    private StudentSortType sortType;

    public StudentSortComparator(StudentSortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Person o1, Person o2) {
     /*
        if(sortType == StudentSortType.BYID) {
            return o1.getAge() - o2.getAge();
        }
        if (sortType == StudentSortType.BYNAME) {
            return o1.getName().compareTo(o2.getName());
        }
        return 0;
      */

        return switch (sortType) {
            case BY_AGE -> o1.getAge() - o2.getAge();
            case BY_NAME -> o1.getName().compareTo(o2.getName());
        };

    }
}
