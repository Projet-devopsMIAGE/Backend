/*
 * This source file was generated by the Gradle 'init' task
 */
package fr.parisnanterre.mercvre.backend;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AppTest {

    @Test public void checkApirun() {
        assertDoesNotThrow(() -> App.main(new String[] {}));
    }
}
