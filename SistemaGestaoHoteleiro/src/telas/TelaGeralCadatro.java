package telas;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaGeralCadatro extends javax.swing.JFrame 
{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaGeralCadatro.class.getName());

    public TelaGeralCadatro() 
    {
        initComponents();
        setLocationRelativeTo(null); 
        
        bnFuncionario.addActionListener(this::bnFuncionarioActionPerformed);
        
        bnHospedes.addActionListener(this::bnHospedesActionPerformed);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bnFuncionario = new javax.swing.JButton();
        bnHospedes = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        Cadastar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bnFuncionario.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bnFuncionario.setText("Funcionario");
        bnFuncionario.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 15, 10, 15));

        bnHospedes.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bnHospedes.setText("Hospedes");
        bnHospedes.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 15, 10, 15));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logo1-removebg-preview.png"))); // NOI18N

        Cadastar.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        Cadastar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cadastar.setText("Cadastar");
        Cadastar.setAlignmentX(0.5F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cadastar, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(275, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(bnHospedes, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cadastar)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnHospedes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(262, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
      private void bnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) 
      {                                             
       
        TelaCadatroFuncionario telaFuncionario = new TelaCadatroFuncionario();
        telaFuncionario.setVisible(true);
        this.dispose();
             
        }                                            

    private void bnHospedesActionPerformed(java.awt.event.ActionEvent evt) 
    {                                           
      
        TelaCadastro telaHospedes = new TelaCadastro();
        telaHospedes.setVisible(true);
        this.dispose(); 
        
    }
    public static void main(String args[]) 
    {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex)
        {
            logger.log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new TelaGeralCadatro().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cadastar;
    private javax.swing.JButton bnFuncionario;
    private javax.swing.JButton bnHospedes;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
