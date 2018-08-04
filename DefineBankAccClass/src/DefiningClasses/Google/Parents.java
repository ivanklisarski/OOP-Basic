package DefiningClasses.Google;

public class Parents {
    private String parentName;
    private String parantBirthday;

    public Parents(String parentName, String parantBirthday) {
        this.parentName = parentName;
        this.parantBirthday = parantBirthday;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParantBirthday() {
        return parantBirthday;
    }

    public void setParantBirthday(String parantBirthday) {
        this.parantBirthday = parantBirthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.parentName, this.parantBirthday);
    }
}
