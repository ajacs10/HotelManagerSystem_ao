package telas; // Certifique-se de que está no mesmo pacote da TelaCadatroFuncionario

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class NumberOnlyDocumentFilter extends DocumentFilter {
    private int maxLength;

    public NumberOnlyDocumentFilter(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (string == null) {
            return;
        }

        // Remove quaisquer caracteres que não sejam dígitos
        String filteredString = string.replaceAll("[^0-9]", "");

        // Calcula o tamanho da string resultante após a inserção
        int currentLength = fb.getDocument().getLength();
        int newLength = currentLength + filteredString.length();

        if (newLength <= maxLength) {
            super.insertString(fb, offset, filteredString, attr);
        } else {
            // Se exceder o comprimento máximo, insere apenas o que couber
            int charsToInsert = maxLength - currentLength;
            if (charsToInsert > 0) {
                super.insertString(fb, offset, filteredString.substring(0, charsToInsert), attr);
            }
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (text == null) {
            super.replace(fb, offset, length, text, attrs);
            return;
        }

        // Remove quaisquer caracteres que não sejam dígitos
        String filteredText = text.replaceAll("[^0-9]", "");

        // Calcula o tamanho da string resultante após a substituição
        int currentLength = fb.getDocument().getLength();
        int newLength = currentLength - length + filteredText.length();

        if (newLength <= maxLength) {
            super.replace(fb, offset, length, filteredText, attrs);
        } else {
            // Se exceder o comprimento máximo, insere apenas o que couber
            int charsToInsert = maxLength - (currentLength - length);
            if (charsToInsert > 0) {
                super.replace(fb, offset, length, filteredText.substring(0, charsToInsert), attrs);
            }
        }
    }
}