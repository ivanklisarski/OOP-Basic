package DefiningClasses.Google;

public class Children {
    private String childrenName;
    private String childrenBirthday;

    public Children(String childrenName, String childrenBirthday) {
        this.childrenName = childrenName;
        this.childrenBirthday = childrenBirthday;
    }

    public String getChildrenName() {
        return childrenName;
    }

    public void setChildrenName(String childrenName) {
        this.childrenName = childrenName;
    }

    public String getChildrenBirthday() {
        return childrenBirthday;
    }

    public void setChildrenBirthday(String childrenBirthday) {
        this.childrenBirthday = childrenBirthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s",this.childrenName,this.childrenBirthday);
    }
}
