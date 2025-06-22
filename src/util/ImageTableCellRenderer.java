package util; // Ou crie um pacote 'renderers'

import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImageTableCellRenderer extends DefaultTableCellRenderer {

    private static final Logger logger = Logger.getLogger(ImageTableCellRenderer.class.getName());
    private int imageSize; // Tamanho para redimensionar a imagem

    public ImageTableCellRenderer(int imageSize) {
        this.imageSize = imageSize;
        setHorizontalAlignment(JLabel.CENTER); // Centraliza a imagem na célula
        setVerticalAlignment(JLabel.CENTER);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus,
                                                   int row, int column) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (value instanceof String && !((String) value).isEmpty()) {
            String imagePath = (String) value;
            try {
                Image img;
                if (imagePath.startsWith("http://") || imagePath.startsWith("https://")) {
                    img = ImageIO.read(new URL(imagePath));
                } else {
                    File file = new File(imagePath);
                    if (!file.exists()) {
                        label.setIcon(null);
                        label.setText("N/A"); // Ou algum indicador de "não encontrado"
                        return label;
                    }
                    img = ImageIO.read(file);
                }

                if (img != null) {
                    Image scaledImg = img.getScaledInstance(imageSize, imageSize, Image.SCALE_SMOOTH);
                    label.setIcon(new ImageIcon(scaledImg));
                    label.setText(""); // Não mostra texto se houver imagem
                } else {
                    label.setIcon(null);
                    label.setText("Erro"); // Indicador de erro ao carregar
                }
            } catch (IOException e) {
                logger.log(Level.WARNING, "Erro ao carregar imagem para JTable: " + imagePath, e);
                label.setIcon(null);
                label.setText("Erro"); // Erro ao carregar
            }
        } else {
            label.setIcon(null);
            label.setText("Sem Imagem"); // Ou um ícone padrão
        }
        return label;
    }
}