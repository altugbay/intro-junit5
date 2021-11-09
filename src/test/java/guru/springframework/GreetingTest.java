package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void beforeClass() {
        System.out.println("Before all called once");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Altug"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each");
    }

    @AfterAll
    static void afterClass() {
        System.out.println("After all called once");
    }
}