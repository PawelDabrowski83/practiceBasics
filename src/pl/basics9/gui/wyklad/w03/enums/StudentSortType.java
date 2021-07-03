package pl.basics9.gui.wyklad.w03.enums;

public enum StudentSortType {

    BY_AGE(1, "by age"), BY_NAME(2, "by name");

    private final int sortType;
    private final String sortDesc;

    private StudentSortType(int sortType, String sortDesc) {
        this.sortType = sortType;
        this.sortDesc = sortDesc;
    }

    public String getSortDesc() {
        return sortDesc;
    }

    public int getSortType() {
        return sortType;
    }
}
