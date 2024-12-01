package com.github.git_leon.utils.exceptionalfunctionalinterfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author leon on 4/9/18.
 */
public class ExceptionalBiFunctionTest {
    ExceptionalBiFunction<Object, Object, Object[]> method;

    @Before
    public void setup() {
        this.method = (name, age) -> {
            Object[] person = new Object[2];
            boolean validName = name instanceof String;
            boolean validAge = age instanceof Integer;
            boolean validPerson = validName && validAge;

            // throws potential exception
            if(!validPerson) {
                // Should bubble up to an `ExceptionalInvocationError`
                throw new Throwable();
            }

            person[0] = name;
            person[1] = age;
            return person;
        };
    }

    @Test
    public void positiveTest() {
        // given
        String arg1 = "value1";
        Integer arg2 = 5;
        Object[] expected = {arg1, arg2};

        // when
        Object[] actual = ExceptionalBiFunction.tryInvoke(method, arg1, arg2);

        // then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void exceptionalInvocationErrorTest() {
        // given
        Integer arg1 = 5;
        String arg2 = "value1";

        // when
        Object[] actual = ExceptionalBiFunction.tryInvoke(method, arg1, arg2);

        // then
        Assert.assertNull(actual);
    }
}
