package View;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class TelaUsuario extends javax.swing.JFrame {

    public TelaUsuario() {
        initComponents();
        btnExcluir.setVisible(false);
        btnSalvarAlteracao.setVisible(false);
    }

    public TelaUsuario(String usuario, String senha, String nome, String cargo, String operacao) {
        initComponents();
        txtUsuario.setText(usuario);
        txtNome.setText(nome);
        txtSenha.setText(senha);
        cmbCargo.setSelectedItem(cargo);
        if(operacao.equals("excluir")){
           btnSalvar1.setVisible(false);
           btnSalvarAlteracao.setVisible(false);
        } else if(operacao.equals("alterar")){
           btnSalvar1.setVisible(false);
           btnExcluir.setVisible(false);   
           txtUsuario.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        btnExcluir = new javax.swing.JButton();
        btnSalvar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalvarAlteracao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Controle de usuários");
        getContentPane().setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuário");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(100, 120, 80, 24);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(180, 110, 240, 40);

        lblSenha.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(100, 180, 60, 24);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(180, 180, 240, 40);

        lblNome.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome ");
        getContentPane().add(lblNome);
        lblNome.setBounds(100, 250, 60, 24);
        getContentPane().add(txtNome);
        txtNome.setBounds(180, 240, 240, 40);

        lblCargo.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(255, 255, 255));
        lblCargo.setText("Cargo");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(100, 320, 60, 24);

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Gerente", "Personal" }));
        cmbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(180, 310, 240, 40);

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(200, 390, 190, 40);

        btnSalvar1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnSalvar1.setText("Salvar");
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar1);
        btnSalvar1.setBounds(200, 390, 190, 40);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 60, 120, 50);

        btnSalvarAlteracao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalvarAlteracao.setText("Salvar Alteração");
        btnSalvarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlteracaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarAlteracao);
        btnSalvarAlteracao.setBounds(200, 440, 190, 40);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/painel-login_1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 550, 500);

        setSize(new java.awt.Dimension(599, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCargoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta; // 0 - Sim; 1 - Não 
        resposta = JOptionPane.showConfirmDialog(null, "Confirma?", "Confirmação", 0);
        if (resposta == 0) {
            String u = txtUsuario.getText();
            try {
                //2 - Conectar no banco de dados sistemabd
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3307/sistemabd", "root", "171246@Njo");
                //Executar a operação desejada (INSERT, UPDATE, DELETE, SELECT)
                PreparedStatement st = conectado.prepareStatement("DELETE FROM usuario WHERE usuario = ?");
                st.setString(1, u);
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso");
                dispose();
                conectado.close();

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
    }//GEN-LAST:event_btnExcluirActionPerformed
        } else {
            dispose();
        }
    }
    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtSenha.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed


    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed
        String u, s, n, c;
        u = txtUsuario.getText();
        s = txtSenha.getText();
        n = txtNome.getText();
        c = cmbCargo.getSelectedItem().toString();

        if (u.isEmpty()) { // se usuário está vazio
            JOptionPane.showMessageDialog(null, "É obrigatório digitar o usuário");
            txtUsuario.requestFocus();
            return; // stop
        }
        if (s.isEmpty()) { // se senha está vazia
            JOptionPane.showMessageDialog(null, "É obrigatório digitar a senha");
            txtSenha.requestFocus();
            return; // stop
        }
        try {
            //2 - Conectar no banco de dados sistemabd
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3307/sistemabd", "root", "171246@Njo");
            //Executar a operação desejada (INSERT, UPDATE, DELETE, SELECT)
            PreparedStatement st = conectado.prepareStatement("INSERT INTO usuario VALUES(?,?,?,?)");
            st.setString(1, u);
            st.setString(2, s);
            st.setString(3, n);
            st.setString(4, c);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
            txtUsuario.setText("");
            txtSenha.setText("");
            txtNome.setText("");
            cmbCargo.setSelectedIndex(0);
            txtUsuario.requestFocus();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Usuário Já cadastrado");
                txtUsuario.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void btnSalvarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlteracaoActionPerformed
         String u, s, n, c;
        u = txtUsuario.getText();
        s = txtSenha.getText();
        n = txtNome.getText();
        c = cmbCargo.getSelectedItem().toString();

        if (u.isEmpty()) { // se usuário está vazio
            JOptionPane.showMessageDialog(null, "É obrigatório digitar o usuário");
            txtUsuario.requestFocus();
            return; // stop
        }
        if (s.isEmpty()) { // se senha está vazia
            JOptionPane.showMessageDialog(null, "É obrigatório digitar a senha");
            txtSenha.requestFocus();
            return; // stop
        }
        try {
            //2 - Conectar no banco de dados sistemabd
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3307/sistemabd", "root", "171246@Njo");
            //Executar a operação desejada (INSERT, UPDATE, DELETE, SELECT)
            PreparedStatement st = conectado.prepareStatement("UPDATE usuario SET senha = ?, nome = ?, cargo = ? WHERE usuario = ?");
            st.setString(1, s);
            st.setString(2, n);
            st.setString(3, c);
            st.setString(4, u);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");
           conectado.close();
           dispose();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Usuário Já cadastrado");
                txtUsuario.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSalvarAlteracaoActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JButton btnSalvarAlteracao;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
