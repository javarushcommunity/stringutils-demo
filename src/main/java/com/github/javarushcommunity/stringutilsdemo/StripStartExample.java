package com.github.javarushcommunity.stringutilsdemo;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Class, which represents capabilities of stripStart method {@link StringUtils}
 */
public class StripStartExample {

    public static final String COMMA = ",";

    /**
     * Own solution for trim first commas and spaces operation
     *
     * @param value provided value
     * @return transformed value
     */
    public static String ownStripStart(String value) {
        int index = 0;
        List<String> commaSpace = asList(" ", ",");
        for (int i = 0; i < value.length(); i++) {
            if (commaSpace.contains(String.valueOf(value.charAt(i)))) {
                index++;
            } else {
                break;
            }
        }
        return value.substring(index);
    }

    /**
     * Trim first commas and spaces by StringUtils.stripStart
     *
     * @param value provided value
     * @return transformed value
     */
    public static String apacheCommonLeftPad(String value) {
        return StringUtils.stripStart(value, StringUtils.SPACE + COMMA);
    }

    public static void main(String[] args) {
        String value = "value";

        if(value != null && value.isEmpty()) {
            //doing something
        }

        if(StringUtils.isEmpty(value)) {
            //doing something
        }
    }
}
