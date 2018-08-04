package Inheritance.Mankind;

import java.util.regex.Pattern;

public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.setFirstName( firstName);
        this.setLastName( lastName);
    }

    private void setFirstName(String firstName) {
        if(firstName== null || hasInvalidAuthorName(firstName)  ){
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        }else if (firstName.length() < 4){
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }
        this.firstName = firstName;
    }

    protected void setLastName(String lastName) {
        if(lastName== null || hasInvalidAuthorName(lastName)  ){
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        }else if (firstName.length() < 3){
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        }
        this.lastName = lastName;
    }

    private boolean hasInvalidAuthorName(String name) {
        return Pattern.compile("^[A-Z]")
                .matcher(name)
                .matches();
    }
    protected String getInfo() {
        return String.format("First Name: %s%nLast Name: %s", this.firstName, this.lastName);
    }

}
