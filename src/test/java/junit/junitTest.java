package junit;

import org.junit.jupiter.api.*;

public class junitTest {
    @BeforeEach
    void beforeEachTest() {
        System.out.println("this is before each");
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("this is aftereach");
    }


    @Test
    void firstTest() {
        System.out.println("first test!");
        Assertions.assertTrue(3>2);
    }

}