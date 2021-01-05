package com.github.javarushcommunity.stringutilsdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Unit-level testing for StripStartExample")
class StripStartExampleTest {

    @DisplayName("Should transform by using stripStart method as expected")
    @Test
    public void shouldTransformOwnStripStartAsExpected() {
        //given
        String value = ", , books";
        String expectedTransformedValue = "books";

        //when
        String transformedValue = StripStartExample.ownStripStart(value);

        //then
        Assertions.assertEquals(expectedTransformedValue, transformedValue);
    }

    @DisplayName("Should transform by using StringUtils method as expected")
    @Test
    public void shouldTransformStringUtilsStripStartAsExpected() {
        //given
        String value = ", , books";
        String expectedTransformedValue = "books";

        //when
        String transformedValue = StripStartExample.apacheCommonLeftPad(value);

        //then
        Assertions.assertEquals(expectedTransformedValue, transformedValue);
    }
}