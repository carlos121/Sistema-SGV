/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgv.Telas_Imagens;

import sgv.Telas.*;
import sgv.DAO.ClienteDao;
import sgv.Logica.Cliente1;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CS INOVAÇÃO
 */
public final class Cliente_teste extends javax.swing.JFrame {

    //Criando os nomes dos Dados da Tabela...
    DefaultTableModel tmCliente = new DefaultTableModel(null, new String[]{"ID","Nome", "Endereço", "Telefone", "CPF", "Cidade", "Estado"});
    List<Cliente1> clientes;//Lista os clientes da Tabela
    ListSelectionModel lsmCliente;//Modelo de seleção da lista de contatos da Tabela

    /**
     * Creates new form Cliente
     */
    public Cliente_teste() {
        initComponents();
        desabilitaDados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Cliente = new javax.swing.JPanel();
        jText_pesquisar = new javax.swing.JTextField();
        btn_pesquisar = new javax.swing.JButton();
        jPanel_DadosCliente = new javax.swing.JPanel();
        jLabel_nome = new javax.swing.JLabel();
        jText_nome = new javax.swing.JTextField();
        jLabel_endereco = new javax.swing.JLabel();
        jTex_endereco = new javax.swing.JTextField();
        jLabel_cidade = new javax.swing.JLabel();
        jText_Cidade = new javax.swing.JTextField();
        jLabel_telefone = new javax.swing.JLabel();
        jText_Estado = new javax.swing.JTextField();
        jLabel_estado = new javax.swing.JLabel();
        jLabel_cpf = new javax.swing.JLabel();
        jText_CPF = new javax.swing.JTextField();
        jLabel_id = new javax.swing.JLabel();
        jText_ID = new javax.swing.JTextField();
        jText_Telefone = new javax.swing.JTextField();
        jPanel2_Botoes = new javax.swing.JPanel();
        jBNovo = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jT_Dados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btn_pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgv/Telas_Imagens/pesquisa.png"))); // NOI18N
        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_ClienteLayout = new javax.swing.GroupLayout(jPanel_Cliente);
        jPanel_Cliente.setLayout(jPanel_ClienteLayout);
        jPanel_ClienteLayout.setHorizontalGroup(
            jPanel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ClienteLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jText_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_pesquisar)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel_ClienteLayout.setVerticalGroup(
            jPanel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_DadosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel_nome.setText("Nome:");

        jText_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_nomeActionPerformed(evt);
            }
        });

        jLabel_endereco.setText("Endereço:");

        jLabel_cidade.setText("Cidade:");

        jLabel_telefone.setText("Telefone:");

        jLabel_estado.setText("Estado:");

        jLabel_cpf.setText("CPF:");

        jLabel_id.setText("ID:");

        javax.swing.GroupLayout jPanel_DadosClienteLayout = new javax.swing.GroupLayout(jPanel_DadosCliente);
        jPanel_DadosCliente.setLayout(jPanel_DadosClienteLayout);
        jPanel_DadosClienteLayout.setHorizontalGroup(
            jPanel_DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_DadosClienteLayout.createSequentialGroup()
                        .addComponent(jLabel_estado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jText_Estado))
                    .addGroup(jPanel_DadosClienteLayout.createSequentialGroup()
                        .addGroup(jPanel_DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_endereco)
                            .addComponent(jLabel_nome)
                            .addComponent(jLabel_id)
                            .addComponent(jLabel_telefone))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTex_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel_DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel_DadosClienteLayout.createSequentialGroup()
                                .addComponent(jLabel_cpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jText_CPF))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_DadosClienteLayout.createSequentialGroup()
                                .addComponent(jLabel_cidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jText_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_DadosClienteLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTex_endereco, jText_CPF, jText_Cidade, jText_Estado, jText_Telefone, jText_nome});

        jPanel_DadosClienteLayout.setVerticalGroup(
            jPanel_DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DadosClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_id)
                    .addComponent(jText_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_DadosClienteLayout.createSequentialGroup()
                        .addGroup(jPanel_DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_nome)
                            .addComponent(jText_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_estado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_endereco)
                            .addComponent(jTex_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jText_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_cidade)))
                .addGroup(jPanel_DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_DadosClienteLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel_DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jText_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_cpf)))
                    .addGroup(jPanel_DadosClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_telefone)
                            .addComponent(jText_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel_DadosClienteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTex_endereco, jText_CPF, jText_Cidade, jText_Estado, jText_Telefone, jText_nome});

        jBNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgv/Telas_Imagens/novo.png"))); // NOI18N
        jBNovo.setText("Novo");
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        jBAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgv/Telas_Imagens/alterar.png"))); // NOI18N
        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgv/Telas_Imagens/excluir.png"))); // NOI18N
        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgv/Telas_Imagens/salvar.png"))); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgv/Telas_Imagens/sair1.png"))); // NOI18N
        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2_BotoesLayout = new javax.swing.GroupLayout(jPanel2_Botoes);
        jPanel2_Botoes.setLayout(jPanel2_BotoesLayout);
        jPanel2_BotoesLayout.setHorizontalGroup(
            jPanel2_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2_BotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        jPanel2_BotoesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBAlterar, jBExcluir, jBNovo, jBSair, jBSalvar});

        jPanel2_BotoesLayout.setVerticalGroup(
            jPanel2_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_BotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBExcluir)
                    .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNovo)
                    .addComponent(jBSalvar)
                    .addComponent(jBSair))
                .addContainerGap())
        );

        jPanel2_BotoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBAlterar, jBExcluir, jBNovo, jBSair, jBSalvar});

        jT_Dados.setModel(tmCliente);
        jT_Dados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmCliente = jT_Dados.getSelectionModel();
        lsmCliente.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e){
                if(! e.getValueIsAdjusting()){
                    jTTabelaLinhaSelecionada(jT_Dados);
                }
            }
        });
        jScrollPane2.setViewportView(jT_Dados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel_DadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2_Botoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_DadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2_Botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        dispose(); //saí do modo de execução; 
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed

        habilitaDados();
        jText_nome.setText("");
        jTex_endereco.setText("");
        jText_Telefone.setText("");
        jText_Estado.setText("");
        jText_Cidade.setText("");
        jText_CPF.setText("");
    }//GEN-LAST:event_jBNovoActionPerformed

    public boolean verificaDados() {

        if (!jText_nome.getText().equals("") && !jTex_endereco.getText().equals("")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "O campo nome ou endereço está vazio!");
            return false;
        }
    }    

    protected void listarCliente() throws SQLException {

        try {
            ClienteDao dao = new ClienteDao();
            clientes = dao.getLista("%" + jText_pesquisar.getText() + "%");
            mostraPesquisa(clientes);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "errro na busca!");
        }
    }

    public void desabilitaDados() {

        jText_ID.setEditable(false);
        jText_nome.setEditable(false);
        jTex_endereco.setEditable(false);
        jText_Telefone.setEditable(false);
        jText_Estado.setEditable(false);
        jText_Cidade.setEditable(false);
        jText_CPF.setEditable(false);

        jText_ID.setText("");
        jText_nome.setText("");
        jTex_endereco.setText("");
        jText_Telefone.setText("");
        jText_Estado.setText("");
        jText_Cidade.setText("");
        jText_CPF.setText("");
    }

    public void habilitaDados() {
        jText_nome.requestFocus(); //SETAR O FOCO NO CAMPO ESCOLHIDO!
        jText_nome.setEditable(true);
        jTex_endereco.setEditable(true);
        jText_Telefone.setEditable(true);
        jText_Estado.setEditable(true);
        jText_Cidade.setEditable(true);
        jText_CPF.setEditable(true);
    }

    public void cadastro() throws SQLException {

        int resp = JOptionPane.showConfirmDialog(this, "Deseja realmente salvar este cliente?",
                "confirmação", JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.YES_NO_OPTION) {
                
            try {
                Cliente1 client = new Cliente1();
                client.setNome(jText_nome.getText());
                client.setEndereco(jTex_endereco.getText());
                client.setTelefone(jText_Telefone.getText());
                client.setEstado(jText_Estado.getText());
                client.setCidade(jText_Cidade.getText());
                client.setCpf(jText_CPF.getText());

                ClienteDao dao = new ClienteDao();
                dao.Adiciona(client);
                JOptionPane.showMessageDialog(null, "Os dados foram cadastrados com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao realizar o cadastro!");
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador do sistema!");
            }
            desabilitaDados();
        }
    }

    private void jTTabelaLinhaSelecionada(JTable tabela) {
        if (jT_Dados.getSelectedRow() != -1) {
            habilitaDados();
            jText_ID.setText(String.valueOf(clientes.get(tabela.getSelectedRow()).getId()));
            jText_nome.setText(clientes.get(tabela.getSelectedRow()).getNome());
            jTex_endereco.setText(clientes.get(tabela.getSelectedRow()).getEndereco());
            jText_Telefone.setText(clientes.get(tabela.getSelectedRow()).getTelefone());
            jText_CPF.setText(clientes.get(tabela.getSelectedRow()).getCpf());
            jText_Cidade.setText(clientes.get(tabela.getSelectedRow()).getCidade());
            jText_Estado.setText(clientes.get(tabela.getSelectedRow()).getEstado());

        } else {

            jText_ID.setText("");
            jText_nome.setText("");
            jTex_endereco.setText("");
            jText_Telefone.setText("");
            jText_Estado.setText("");
            jText_Cidade.setText("");
            jText_CPF.setText("");

        }
    }


    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        // TODO add your handling code here:

        if (verificaDados()) {
            try {
                cadastro();
                listarCliente();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao realizar o cadastro!");
            }
            desabilitaDados();
        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        try {
            listarCliente();
            desabilitaDados();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar a pesquisa!");
        }
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed

        try {
            alteraCliente();
            listarCliente();
            desabilitaDados();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar cliente!");
        }
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed

        try {
            excluirCliente();
            listarCliente();
            desabilitaDados();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
        }

    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jText_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_nomeActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

    /*    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;

            }
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Cliente_teste().setVisible(true);
            }
        });
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JLabel jLabel_cidade;
    private javax.swing.JLabel jLabel_cpf;
    private javax.swing.JLabel jLabel_endereco;
    private javax.swing.JLabel jLabel_estado;
    private javax.swing.JLabel jLabel_id;
    private javax.swing.JLabel jLabel_nome;
    private javax.swing.JLabel jLabel_telefone;
    private javax.swing.JPanel jPanel2_Botoes;
    private javax.swing.JPanel jPanel_Cliente;
    private javax.swing.JPanel jPanel_DadosCliente;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jT_Dados;
    private javax.swing.JTextField jTex_endereco;
    private javax.swing.JTextField jText_CPF;
    private javax.swing.JTextField jText_Cidade;
    private javax.swing.JTextField jText_Estado;
    private javax.swing.JTextField jText_ID;
    private javax.swing.JTextField jText_Telefone;
    private javax.swing.JTextField jText_nome;
    private javax.swing.JTextField jText_pesquisar;
    // End of variables declaration//GEN-END:variables

    private void mostraPesquisa(List<Cliente1> clientes) {

        while (tmCliente.getRowCount() > 0) {
            tmCliente.removeRow(0);
        }
        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum cliente cadastrdo no banco de dados!");
        } else {
            String[] linha = new String[]{null, null, null, null, null, null,null};
            for (int i = 0; i < clientes.size(); i++) {
                tmCliente.addRow(linha);
                tmCliente.setValueAt(clientes.get(i).getId(), i, 0);
                tmCliente.setValueAt(clientes.get(i).getNome(), i, 1);
                tmCliente.setValueAt(clientes.get(i).getEndereco(), i, 2);
                tmCliente.setValueAt(clientes.get(i).getTelefone(), i, 3);
                tmCliente.setValueAt(clientes.get(i).getCpf(), i, 4);
                tmCliente.setValueAt(clientes.get(i).getCidade(), i, 5);
                tmCliente.setValueAt(clientes.get(i).getEstado(), i, 6);
            }
        }
    }

    public void excluirCliente() throws SQLException {

        int resp = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este cliente?",
                "confirmação", JOptionPane.YES_NO_OPTION);

        if (jT_Dados.getSelectedRow() != -1) {
            if (resp == JOptionPane.YES_NO_OPTION) {
                ClienteDao dao = new ClienteDao();
                dao.removeCliente(clientes.get(jT_Dados.getSelectedRow()));
                JOptionPane.showMessageDialog(null, "Cliente excluído com Sucesso!");
            }
        }
    }

    private void alteraCliente() throws SQLException {

        int resp = JOptionPane.showConfirmDialog(this, "Deseja realmente alterar este cliente?",
                "confirmação", JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.YES_NO_OPTION) {

            if (jT_Dados.getSelectedRow() != -1) {

                if (verificaDados()) {
                    Cliente1 client = new Cliente1();
                    ClienteDao dao = new ClienteDao();
                    client.setId(Integer.valueOf(jText_ID.getText())); //Altera o Contato pelo ID...
                    client.setNome(jText_nome.getText());
                    client.setEndereco(jTex_endereco.getText());
                    client.setTelefone(jText_Telefone.getText());
                    client.setCpf(jText_CPF.getText());
                    client.setCidade(jText_Cidade.getText());
                    client.setEstado(jText_Estado.getText());
                    dao.alteraCliente(client);
                    JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
                }
            }
        }
    }
}
