package telas;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 * Um DocumentFilter que restringe o número máximo de caracteres permitidos
 * em um componente de texto (JTextField, JTextArea, etc.).
 */
public class LengthRestrictedDocumentFilter extends DocumentFilter {
    private int maxLength;

    public LengthRestrictedDocumentFilter(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public void insertString(FilterBypass fb, int offset, String str, AttributeSet attr) throws BadLocationException {
        // Verifica se o comprimento total (atual + novo texto) não excede o maxLength
        if (str == null) return; // Proteção para caso o texto seja nulo
        if ((fb.getDocument().getLength() + str.length()) <= maxLength) {
            super.insertString(fb, offset, str, attr); // Se sim, permite a inserção
        }
        // Se não, não faz nada, impedindo a inserção
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String str, AttributeSet attrs) throws BadLocationException {
        // Verifica se o comprimento total (atual - texto a ser substituído + novo texto) não excede o maxLength
        if (str == null) str = ""; // Garante que str não seja nulo para cálculo de length
        if ((fb.getDocument().getLength() - length + str.length()) <= maxLength) {
            super.replace(fb, offset, length, str, attrs); // Se sim, permite a substituição
        }
        // Se não, não faz nada
    }

    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        // A remoção de caracteres geralmente não precisa de restrição de comprimento,
        // então ela é sempre permitida.
        super.remove(fb, offset, length);
    }
}