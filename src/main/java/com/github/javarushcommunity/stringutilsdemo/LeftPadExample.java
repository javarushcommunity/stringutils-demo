package com.github.javarushcommunity.stringutilsdemo;

import org.apache.commons.lang3.StringUtils;

import java.util.stream.IntStream;

/**
 * Class, which represents capabilities of leftPad method {@link StringUtils}
 */
public class LeftPadExample {

    /**
     * Own solution for left pad operation
     *
     * @param value provided value
     * @return transformed value
     */
    public static String ownLeftPad(String value) {
        String trimmedValue = value.trim();

        if(trimmedValue.length() == value.length()) {
            return value;
        }

        StringBuilder newValue = new StringBuilder(trimmedValue);

        IntStream.rangeClosed(1, value.length() - trimmedValue.length())
                .forEach(it -> newValue.insert(0, "0"));
        return newValue.toString();
    }

    /**
     * leftPad with using {@link StringUtils#leftPad(String, int, int)}
     *
     * @param value provided value
     * @return transformed value
     */
    public static String apacheCommonLeftPad(String value) {
        return StringUtils.leftPad(value.trim(), value.length(), "0");
    }

}
