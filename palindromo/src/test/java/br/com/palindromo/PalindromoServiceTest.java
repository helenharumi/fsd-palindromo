package br.com.palindromo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromoServiceTest {

    @ParameterizedTest
    @ValueSource(strings = {"Rotator", "bob", "madam", "mAlAyAlam", "1", "Able was I, ere I saw Elba", "Madam I’m Adam", "Step on no pets.", "Top spot!"})
    public void testPalindromoVerdadeiro(String texto) {

        PalindromoService palindromo = new PalindromoService();

        boolean checkPalindromo = palindromo.isPalindromo(texto);

        Assertions.assertTrue(checkPalindromo);
    }

    @ParameterizedTest
    @ValueSource(strings = {"xyz", "elephant", "Country", "Top . post!", "Wonderful-fool", "Wild imagination!"})
    public void testPalindromoFalso(String texto) {

        PalindromoService palindromo = new PalindromoService();

        boolean checkPalindromo = palindromo.isPalindromo(texto);

        Assertions.assertFalse(checkPalindromo);
    }
}
