package nl.seiferd.spring.hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloControllerTest {

    @Test
    public void foo() {
        assertEquals(new HelloController().hi("test"), "Hi there test");
    }
}
