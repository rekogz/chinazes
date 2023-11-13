import org.junit.jupiter.api.*;

public class jUnitChinazes {
    @BeforeEach
    void beforeEach() {
        System.out.println("pisya");
    }
    @BeforeAll
    static void beforeAll() {
        System.out.println("eto full dolbaeb");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("salam");
    }
    @AfterEach
    void afterEach() {
        System.out.println("malekym");
    }
    @Test
    void firstTest() {
        System.out.println("chlen");
        System.out.println("mamy el");
    }
        @Test
        void dolbaebTest() {
            System.out.println(".!.");
        }
}
