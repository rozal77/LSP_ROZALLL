package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
    public String encrypt(String text) {
        // Initialize two StringBuilder objects for even and odd characters
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();

        // Iterate through each character in the input text
        for (int i = 0, j=0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // if whitespace just ignore and continue. 
            if(Character.isWhitespace(ch)){
            	continue;
            }
            // Check if the character is a letter or digit (ignoring punctuation and whitespace)
            if (Character.isLetterOrDigit(ch)) {
                // Append even-indexed characters to evenChars StringBuilder
                if (j % 2 == 0) {
                    evenChars.append(ch);
                    j++;
                }
                // Append odd-indexed characters to oddChars StringBuilder
                else {
                    oddChars.append(ch);
                    j++;
                }
            }
        }

        // Concatenate even and odd characters and return the encrypted string
        return evenChars.toString() + oddChars.toString();
    }
}

