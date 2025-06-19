package telas;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException; // Adicionar esta importação
import java.net.URL; // Adicionar esta importação
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelComFundo extends JPanel {

    private Image imagemDeFundo;

    public JPanelComFundo(String caminhoDaImagem) {
        try {
            // *** LINHA 15 (cuidado com as linhas exatas, pode variar após edições) ***
            // Adicione estas linhas para depuração:
            URL imageUrl = getClass().getResource(caminhoDaImagem);

            if (imageUrl == null) {
                System.err.println("Erro: URL da imagem nula para o caminho: " + caminhoDaImagem);
                // Lança uma exceção para que o stack trace completo apareça
                throw new IOException("Recurso de imagem não encontrado no classpath: " + caminhoDaImagem);
            } else {
                System.out.println("URL da imagem encontrada: " + imageUrl.toExternalForm());
            }

            imagemDeFundo = new ImageIcon(imageUrl).getImage(); // Esta é a linha 17 agora

        } catch (Exception e) { // Pegue a exceção mais genérica por enquanto para depuração
            System.err.println("Erro ao carregar imagem de fundo: " + caminhoDaImagem);
            e.printStackTrace(); // Imprime o stack trace completo
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagemDeFundo != null) {
            g.drawImage(imagemDeFundo, 0, 0, getWidth(), getHeight(), this);
        }
    }
}