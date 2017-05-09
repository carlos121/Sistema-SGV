/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgv.Telas;

/**
 *
 * @author Inovação
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    /**
     * Creates new form MenuPrincipal_test
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelButon = new javax.swing.JPanel();
        jButtonCliente = new javax.swing.JButton();
        jButtonProduto = new javax.swing.JButton();
        jButtonOperacao = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanelImagem = new javax.swing.JPanel();
        imagem1 = new javax.swing.JButton();
        imagem2 = new javax.swing.JButton();
        imagem3 = new javax.swing.JButton();
        mensagem = new javax.swing.JPanel();
        mensage1 = new javax.swing.JLabel();
        jMenuBar_MenuBar = new javax.swing.JMenuBar();
        Adm = new javax.swing.JMenu();
        CadastrarFuncionario = new javax.swing.JMenuItem();
        Menu_Cadastrar = new javax.swing.JMenu();
        CadastrarFornece = new javax.swing.JMenuItem();
        CadastrarCliente = new javax.swing.JMenuItem();
        CadastrarProduto = new javax.swing.JMenuItem();
        Relatorio = new javax.swing.JMenu();
        RelatorioProdutos = new javax.swing.JMenuItem();
        RelatorioFornecedor = new javax.swing.JMenuItem();
        RelatorioClientes = new javax.swing.JMenuItem();
        RelatorioVendas = new javax.swing.JMenuItem();
        Sobre = new javax.swing.JMenu();
        InfSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButtonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgv/Telas_Imagens/usuario.png"))); // NOI18N
        jButtonCliente.setText("Cliente");
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });

        jButtonProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgv/Telas_Imagens/produto.png"))); // NOI18N
        jButtonProduto.setText("Produto");
        jButtonProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutoActionPerformed(evt);
            }
        });

        jButtonOperacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgv/Telas_Imagens/operacao2.png"))); // NOI18N
        jButtonOperacao.setText("Caixa");
        jButtonOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOperacaoActionPerformed(evt);
            }
        });

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgv/Telas_Imagens/sair1.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelButonLayout = new javax.swing.GroupLayout(jPanelButon);
        jPanelButon.setLayout(jPanelButonLayout);
        jPanelButonLayout.setHorizontalGroup(
            jPanelButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButonLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButtonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonProduto)
                .addGap(18, 18, 18)
                .addComponent(jButtonOperacao)
                .addGap(18, 18, 18)
                .addComponent(jButtonSair)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jPanelButonLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonCliente, jButtonOperacao, jButtonProduto, jButtonSair});

        jPanelButonLayout.setVerticalGroup(
            jPanelButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProduto)
                    .addComponent(jButtonOperacao)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelButonLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonCliente, jButtonOperacao, jButtonProduto, jButtonSair});

        imagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgv/Telas_Imagens/roupa1.png"))); // NOI18N

        imagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgv/Telas_Imagens/roupas2.png"))); // NOI18N

        imagem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgv/Telas_Imagens/roupa3.png"))); // NOI18N

        javax.swing.GroupLayout jPanelImagemLayout = new javax.swing.GroupLayout(jPanelImagem);
        jPanelImagem.setLayout(jPanelImagemLayout);
        jPanelImagemLayout.setHorizontalGroup(
            jPanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImagemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imagem2)
                .addGap(18, 18, 18)
                .addComponent(imagem3)
                .addGap(48, 48, 48))
        );

        jPanelImagemLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {imagem1, imagem2, imagem3});

        jPanelImagemLayout.setVerticalGroup(
            jPanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImagemLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagem2)
                    .addComponent(imagem3))
                .addGap(24, 24, 24))
        );

        jPanelImagemLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {imagem1, imagem2, imagem3});

        mensage1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mensage1.setText("SEJAM BEM VINDO AO SOFTWARE DE GESTÃO DE VENDAS (SGV)");

        javax.swing.GroupLayout mensagemLayout = new javax.swing.GroupLayout(mensagem);
        mensagem.setLayout(mensagemLayout);
        mensagemLayout.setHorizontalGroup(
            mensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mensagemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mensage1)
                .addGap(141, 141, 141))
        );
        mensagemLayout.setVerticalGroup(
            mensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mensagemLayout.createSequentialGroup()
                .addComponent(mensage1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        Adm.setText("Administrador");

        CadastrarFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, java.awt.event.InputEvent.CTRL_MASK));
        CadastrarFuncionario.setText("Cadastrar Funcionario");
        CadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarFuncionarioActionPerformed(evt);
            }
        });
        Adm.add(CadastrarFuncionario);

        jMenuBar_MenuBar.add(Adm);

        Menu_Cadastrar.setText("Cadastrar");

        CadastrarFornece.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        CadastrarFornece.setText("Cadastrar Fornecedor");
        Menu_Cadastrar.add(CadastrarFornece);

        CadastrarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        CadastrarCliente.setText("Cadastrar Cliente");
        CadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarClienteActionPerformed(evt);
            }
        });
        Menu_Cadastrar.add(CadastrarCliente);

        CadastrarProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        CadastrarProduto.setText("Cadastrar Produto");
        CadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarProdutoActionPerformed(evt);
            }
        });
        Menu_Cadastrar.add(CadastrarProduto);

        jMenuBar_MenuBar.add(Menu_Cadastrar);

        Relatorio.setText("Relatório");

        RelatorioProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        RelatorioProdutos.setText("Relatório dos Produtos");
        Relatorio.add(RelatorioProdutos);

        RelatorioFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        RelatorioFornecedor.setText("Relatório dos Fornecedores");
        Relatorio.add(RelatorioFornecedor);

        RelatorioClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        RelatorioClientes.setText("Relatório dos Clientes");
        Relatorio.add(RelatorioClientes);

        RelatorioVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        RelatorioVendas.setText("Relatório das Vendas");
        Relatorio.add(RelatorioVendas);

        jMenuBar_MenuBar.add(Relatorio);

        Sobre.setText("Sobre");

        InfSistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        InfSistema.setText("Sobre o Sistema");
        InfSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfSistemaActionPerformed(evt);
            }
        });
        Sobre.add(InfSistema);

        jMenuBar_MenuBar.add(Sobre);

        setJMenuBar(jMenuBar_MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelButon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanelButon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarFuncionarioActionPerformed
        // TODO add your handling code here:
         new Funcionario().setVisible(true);
    }//GEN-LAST:event_CadastrarFuncionarioActionPerformed

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        new Cliente().setVisible(true);
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void InfSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfSistemaActionPerformed
        new Sobre().setVisible(true);
    }//GEN-LAST:event_InfSistemaActionPerformed

    private void CadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarClienteActionPerformed
        // TODO add your handling code here:
        new Cliente().setVisible(true);
    }//GEN-LAST:event_CadastrarClienteActionPerformed

    private void jButtonOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOperacaoActionPerformed
        // TODO add your handling code here:
        new Venda().setVisible(true);
    }//GEN-LAST:event_jButtonOperacaoActionPerformed

    private void jButtonProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutoActionPerformed
        // TODO add your handling code here:
        new Produto().setVisible(true);
    }//GEN-LAST:event_jButtonProdutoActionPerformed

    private void CadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarProdutoActionPerformed
        // TODO add your handling code here:
        new Produto().setVisible(true);
    }//GEN-LAST:event_CadastrarProdutoActionPerformed

    /**
     * @param args the command line arguments
     */
  /*  public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/*        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
/*        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });  
    }
*/  //TIRANDO A CLASSE PRINCIPAL, COLOCANDO COMENTARIO NO MAIN...
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Adm;
    private javax.swing.JMenuItem CadastrarCliente;
    private javax.swing.JMenuItem CadastrarFornece;
    private javax.swing.JMenuItem CadastrarFuncionario;
    private javax.swing.JMenuItem CadastrarProduto;
    private javax.swing.JMenuItem InfSistema;
    private javax.swing.JMenu Menu_Cadastrar;
    private javax.swing.JMenu Relatorio;
    private javax.swing.JMenuItem RelatorioClientes;
    private javax.swing.JMenuItem RelatorioFornecedor;
    private javax.swing.JMenuItem RelatorioProdutos;
    private javax.swing.JMenuItem RelatorioVendas;
    private javax.swing.JMenu Sobre;
    private javax.swing.JButton imagem1;
    private javax.swing.JButton imagem2;
    private javax.swing.JButton imagem3;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonOperacao;
    private javax.swing.JButton jButtonProduto;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JMenuBar jMenuBar_MenuBar;
    private javax.swing.JPanel jPanelButon;
    private javax.swing.JPanel jPanelImagem;
    private javax.swing.JLabel mensage1;
    private javax.swing.JPanel mensagem;
    // End of variables declaration//GEN-END:variables
}