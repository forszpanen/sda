package javapoz20.patterns;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SingletonTest {

    @Test
    public void shouldReturnInstance() {
        //Given

        // When
        Singleton singleton = Singleton.getInstance();

        // Then
        assertNotNull(singleton);
    }


    @Test
    public void shouldReturnSameInstance() {
        // Given
        //When
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Then
        assertTrue(singleton1 == singleton2);
    }
}
