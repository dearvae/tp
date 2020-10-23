package seedu.address.commons.util;

import java.time.format.DateTimeFormatter;

public class DateUtil {
    public static final String MESSAGE_CONSTRAINTS =
            "DateTime should be in the format of dd-MM-yyyy HH:mm.";
    public static final String DATE_VALIDATION_REGEX = "^(3[01]|[12][0-9]|0[1-9])-(1[0-2]|0[1-9])-[0-9]{4}$";
    public static final String DATETIME_VALIDATION_REGEX =
            "^(3[01]|[12][0-9]|0[1-9])-(1[0-2]|0[1-9])-[0-9]{4} (2[0-3]|[01][0-9]):([0-5][0-9])$";
    public static final String TIME_VALIDATION_REGEX = "^(2[0-3]|[01][0-9]):([0-5][0-9])$";
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public static final String SEARCH_CONSTRAINTS =
            "Search phrase for date should be in the format of dd-MM-yyyy or HH:mm or dd-MM-yyyy HH:mm.";
    public static final String DAY_MESSAGE_CONSTRAINTS =
            "Day should be in the format of MON, TUE, ..., SUN or MONDAY, TUESDAY, ..., SUNDAY";

    /**
     * Returns true if a given string is a valid date number.
     *
     * @param test the string value to be put to test.
     * @return true if the test string is valid and false otherwise
     */
    public static boolean isValidDate(String test) {
        return test.matches(DATE_VALIDATION_REGEX);
    }

    /**
     * Returns true if a given string is a valid date number.
     *
     * @param test the string value to be put to test.
     * @return true if the test string is valid and false otherwise
     */
    public static boolean isValidDateTime(String test) {
        return test.matches(DATETIME_VALIDATION_REGEX);
    }

    /**
     * Returns true if a given string is a valid date number.
     *
     * @param test the string value to be put to test.
     * @return true if the test string is valid and false otherwise
     */
    public static boolean isValidTime(String test) {
        return test.matches(TIME_VALIDATION_REGEX);
    }

    /**
     * Returns true if a given string is a valid search phrase for date time.
     *
     * @param test the string value to be put to test.
     * @return true if the test string is valid and false otherwise
     */
    public static boolean isValidSearchPhrase(String test) {
        return isValidDateTime(test) || isValidDate(test) || isValidTime(test);
    }
}