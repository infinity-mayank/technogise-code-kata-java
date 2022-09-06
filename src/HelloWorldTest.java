import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class HelloWorldTest {
    @Test
    @DisplayName("Should show simple assertion")
    void shouldShowSimpleAssertion() {
        assertEquals(HelloWorld.sample(), "Hello world");
    }
}