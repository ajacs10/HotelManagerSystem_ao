package telas;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException; // Adicionar esta importação
import java.net.URL; // Adicionar esta importação
import javax.imageio.ImageIO; // Embora não usado diretamente no código atual, é comum em carregamento de imagens.
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelComFundo extends JPanel {

    private Image imagemDeFundo;

    public JPanelComFundo(String caminhoDaImagem) 
    {
        try {
            // Tenta obter a URL do recurso no classpath
            URL imageUrl = getClass().getResource(caminhoDaImagem);

            if (imageUrl == null) {
                // Se a URL for nula, significa que o recurso não foi encontrado
                System.err.println("Erro: URL da imagem nula para o caminho: " + caminhoDaImagem);
                // Lança uma exceção para que o problema seja visível e possa ser depurado
                throw new IOException("Recurso de imagem não encontrado no classpath: " + caminhoDaImagem);
            } else {
                // Para depuração: imprime a URL da imagem encontrada
                System.out.println("URL da imagem encontrada: " + imageUrl.toExternalForm());
            }

            // Carrega a imagem usando ImageIcon a partir da URL
            imagemDeFundo = new ImageIcon(imageUrl).getImage();

        } catch (Exception e) { // Captura qualquer exceção que possa ocorrer durante o carregamento
            System.err.println("Erro ao carregar imagem de fundo para o caminho: " + caminhoDaImagem);
            e.printStackTrace(); // Imprime o stack trace completo para detalhes do erro
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Garante que o painel seja desenhado corretamente
        if (imagemDeFundo != null) {
            // Desenha a imagem de fundo preenchendo todo o painel
            g.drawImage(imagemDeFundo, 0, 0, getWidth(), getHeight(), this);
        }
    }
}