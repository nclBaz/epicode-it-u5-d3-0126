package riccardogulin.u5d3;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;
import riccardogulin.u5d3.tools.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class U5d3ApplicationTests {

	@BeforeAll
	public static void initialSetup() {
		System.out.println("INITIAL SETUP");
	}

	@AfterAll
	public static void cleanUp() {
		System.out.println("CLEAN UP");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("BEFORE EACH");
	}

	@AfterEach
	public void afterEach() {
		System.out.println("AFTER EACH");
	}

	@Test
	@DisplayName("Testa divisione, dovrebbe lanciare un'eccezione se divisore uguale a zero")
	void testDiv() {
		System.out.println("TEST 1");
		double result = Calculator.div(2, 2);
		assertEquals(1, result);
		assertThrows(IllegalArgumentException.class, () -> Calculator.div(100, 0));
	}

//	@Test
//	void testSum() {
//		System.out.println("TEST 2");
//		int result = Calculator.sum(2, 3);
//		int result2 = Calculator.sum(10, 10);
//		assertEquals(5, result);
//		assertEquals(20, result2);
//	}

	@ParameterizedTest
	@CsvSource({"2, 2, 4", "5, 5, 10", "-5, 5, 0", "10, 10, 20", "100, 100, 200"})
	void testSum(int num1, int num2, int expectedResult) {
		int result = Calculator.sum(num1, num2);
		assertEquals(expectedResult, result);
	}
}
