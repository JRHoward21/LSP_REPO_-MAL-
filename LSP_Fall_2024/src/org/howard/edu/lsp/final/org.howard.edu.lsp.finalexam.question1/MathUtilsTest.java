package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    private MathUtils mathUtils = new MathUtils();

    // Tests for factorial method
    @Test
    public void testFactorial_zero() {
        assertEquals(1, mathUtils.factorial(0), "Factorial of 0 should be 1");
    }

    @Test
    public void testFactorial_positiveNumber() {
        assertEquals(120, mathUtils.factorial(5), "Factorial of 5 should be 120");
    }

    @Test
    public void testFactorial_negativeNumber() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.factorial(-1);
        });
        assertEquals("Number must be non-negative", thrown.getMessage(), "Exception message should match");
    }

    // Tests for isPrime method
    @Test
    public void testIsPrime_primeNumber() {
        assertTrue(mathUtils.isPrime(7), "7 should be identified as prime");
    }

    @Test
    public void testIsPrime_nonPrimeNumber() {
        assertFalse(mathUtils.isPrime(4), "4 should not be identified as prime");
    }

    @Test
    public void testIsPrime_edgeCases() {
        assertFalse(mathUtils.isPrime(1), "1 should not be identified as prime");
        assertFalse(mathUtils.isPrime(0), "0 should not be identified as prime");
        assertFalse(mathUtils.isPrime(-3), "Negative numbers should not be prime");
    }

    // Tests for gcd method
    @Test
    public void testGcd_nonZeroInputs() {
        assertEquals(6, mathUtils.gcd(54, 24), "GCD of 54 and 24 should be 6");
    }

    @Test
    public void testGcd_zeroInput() {
        assertEquals(5, mathUtils.gcd(5, 0), "GCD of 5 and 0 should be 5");
        assertEquals(7, mathUtils.gcd(0, 7), "GCD of 0 and 7 should be 7");
    }

    @Test
    public void testGcd_bothZero() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.gcd(0, 0);
        });
        assertEquals("Both numbers cannot be zero", thrown.getMessage(), "Exception message should match");
    }
}
