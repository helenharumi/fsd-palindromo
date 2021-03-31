package br.com.palindromo;

public class PalindromoService {

    public boolean isPalindromo(String texto) {
        texto = texto.replaceAll("[^a-z-A-Z0-9]", "");
        String textoInvertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }
        return textoInvertido.equalsIgnoreCase(texto);
    }
}
