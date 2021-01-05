package com.github.javarushcommunity.stringutilsdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Unit-level testing for LeftPadExample")
class LeftPadExampleTest {

    @DisplayName("Should transform by using ownLeftPad method as expected")
    @Test
    public void shouldTransformOwnLeftPadAsExpected() {
        //given
        String value = "1   ";
        String expectedTransformedValue = "0001";

        //when
        String transformedValue = LeftPadExample.ownLeftPad(value);

        //then
        Assertions.assertEquals(expectedTransformedValue, transformedValue);
    }

    @DisplayName("Should transform by using StringUtils method as expected")
    @Test
    public void shouldTransformStringUtilsLeftPadAsExpected() {
        //given
        String value = "1   ";
        String expectedTransformedValue = "0001";

        //when
        String transformedValue = LeftPadExample.apacheCommonLeftPad(value);

        //then
        Assertions.assertEquals(expectedTransformedValue, transformedValue);
    }

}