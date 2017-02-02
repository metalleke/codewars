package net.metalleke.codewars.kyu6;

public class AlternatingSplit {

    public static String encrypt(final String text, final int n) {
        if (text == null || text.length() == 0) {
            return text;
        }

        if (n <= 0) {
            return text;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < text.length(); i = i + 2) {
            sb.append(text.charAt(i));
        }

        for (int i = 0; i < text.length(); i = i + 2) {
            sb.append(text.charAt(i));
        }

        return encrypt(sb.toString(), n - 1);
    }

    public static String decrypt(final String encryptedText, final int n) {
        if(encryptedText == null || encryptedText.length() == 0) {
            return encryptedText;
        }

        if (n <= 0) {
            return encryptedText;
        }

        StringBuilder sb = new StringBuilder();

        int middle =  encryptedText.length() / 2;

        for(int i = 0; i < middle; i++) {
            sb.append(encryptedText.charAt(middle + i));
            sb.append(encryptedText.charAt(i));
        }

        if(encryptedText.length() % 2 == 1) {
            sb.append(encryptedText.charAt(encryptedText.length() - 1));
        }

        return decrypt(sb.toString(), n - 1);
    }
}