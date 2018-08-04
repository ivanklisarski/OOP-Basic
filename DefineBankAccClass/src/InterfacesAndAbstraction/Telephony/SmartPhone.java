package InterfacesAndAbstraction.Telephony;

import java.util.regex.Pattern;

public class SmartPhone implements Callable, Browseable {
    public static final String INVALID_NUMBER = "Invalid number!";
    public static final String INVALID_URL = "Invalid URL!";


    private boolean hasInvalidURL(String URL) {
        return Pattern.compile(".*\\d.*").matcher(URL).matches();
    }

    private boolean hasValidNumber(String number) {
        return Pattern.compile("\\d+").matcher(number)
                .matches();
    }


    @Override
    public String browseTheWorldWideWeb(String url) {
        if (hasInvalidURL(url)) {
            throw new IllegalArgumentException(INVALID_URL);
        }
        return String.format("Browsing: %s!", url);
    }

    @Override
    public String callOtherPhones(String phoneNumber) {
        if (!hasValidNumber(phoneNumber)) {
            throw new IllegalArgumentException(INVALID_NUMBER);

        }
        return String.format("Calling... %s", phoneNumber);
    }
}
