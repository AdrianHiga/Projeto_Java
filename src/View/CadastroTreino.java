/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroTreino extends javax.swing.JFrame {

    public CadastroTreino() {
        initComponents();
        

    }

    public CadastroTreino(String serie, String exercicio1, String exercicio2, String exercicio3, String exercicio4, String exercicio5, String nome, String operacao) {
        initComponents();
        cbxTreino.getSelectedItem().toString();
        txtEx1.setText(exercicio1);
        txtEx2.setText(exercicio2);
        txtEx3.setText(exercicio3);
        txtEx4.setText(exercicio4);
        txtEx5.setText(exercicio5);
        txtNome.setText(nome);
         if(operacao.equals("excluir")){
           btnbSalvar.setVisible(false);
           btnAlteracaoTreino.setVisible(false);
        } else if(operacao.equals("alterar")){
            btnbSalvar.setVisible(false);
           btnExcluir.setVisible(false);   
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEx4 = new javax.swing.JTextField();
        btnbSalvar = new javax.swing.JButton();
        btnAlteracaoTreino = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtEx3 = new javax.swing.JTextField();
        txtEx5 = new javax.swing.JTextField();
        txtEx2 = new javax.swing.JTextField();
        txtEx1 = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        cbxTreino = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lblEx5 = new javax.swing.JLabel();
        lblEx4 = new javax.swing.JLabel();
        lblEx3 = new javax.swing.JLabel();
        lblEx2 = new javax.swing.JLabel();
        lblEx1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Cadastro de Treino");
        getContentPane().setLayout(null);
        getContentPane().add(txtEx4);
        txtEx4.setBounds(320, 380, 320, 30);

        btnbSalvar.setText("Salvar");
        btnbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbSalvar);
        btnbSalvar.setBounds(410, 540, 140, 30);

        btnAlteracaoTreino.setText("Salvar Alteração");
        btnAlteracaoTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlteracaoTreinoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlteracaoTreino);
        btnAlteracaoTreino.setBounds(410, 540, 140, 30);

        btnExcluir.setText("Excluir Treino");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(410, 540, 140, 30);
        getContentPane().add(txtEx3);
        txtEx3.setBounds(320, 330, 320, 30);
        getContentPane().add(txtEx5);
        txtEx5.setBounds(320, 430, 320, 30);
        getContentPane().add(txtEx2);
        txtEx2.setBounds(320, 280, 320, 30);

        txtEx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEx1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtEx1);
        txtEx1.setBounds(320, 230, 320, 30);
        getContentPane().add(txtNome);
        txtNome.setBounds(320, 480, 320, 30);

        cbxTreino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SÉRIE A", "SÉRIE B", "SÉRIE C" }));
        cbxTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTreinoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxTreino);
        cbxTreino.setBounds(320, 180, 320, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 490, 70, 19);

        lblEx5.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblEx5.setForeground(new java.awt.Color(255, 255, 255));
        lblEx5.setText("Exercício 5");
        getContentPane().add(lblEx5);
        lblEx5.setBounds(230, 440, 90, 16);

        lblEx4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblEx4.setForeground(new java.awt.Color(255, 255, 255));
        lblEx4.setText("Exercício 4");
        getContentPane().add(lblEx4);
        lblEx4.setBounds(230, 390, 90, 16);

        lblEx3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblEx3.setForeground(new java.awt.Color(255, 255, 255));
        lblEx3.setText("Exercício 3");
        getContentPane().add(lblEx3);
        lblEx3.setBounds(230, 340, 90, 16);

        lblEx2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblEx2.setForeground(new java.awt.Color(255, 255, 255));
        lblEx2.setText("Exercício 2");
        getContentPane().add(lblEx2);
        lblEx2.setBounds(230, 290, 90, 16);

        lblEx1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblEx1.setForeground(new java.awt.Color(255, 255, 255));
        lblEx1.setText("Exercício 1");
        getContentPane().add(lblEx1);
        lblEx1.setBounds(230, 240, 90, 16);

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cadastro de Treino");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 130, 170, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/painel-login.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 110, 570, 500);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/projeto facul.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 930, 690);

        setSize(new java.awt.Dimension(944, 684));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbSalvarActionPerformed

        String serie, Ex1, Ex2, Ex3, Ex4, Ex5, nome;
        serie = cbxTreino.getSelectedItem().toString();
        Ex1 = txtEx1.getText();
        Ex2 = txtEx2.getText();
        Ex3 = txtEx3.getText();
        Ex4 = txtEx4.getText();
        Ex5 = txtEx5.getText();
        nome = txtNome.getText();

        try {
            //2 - Conectar no banco de dados sistemabd
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3307/sistemabd", "root", "171246@Njo");
            //Executar a operação desejada (INSERT, UPDATE, DELETE, SELECT)
            PreparedStatement st = conectado.prepareStatement("INSERT INTO treino VALUES(?,?,?,?,?,?,?)");
            st.setString(1, serie);
            st.setString(2, Ex1);
            st.setString(3, Ex2);
            st.setString(4, Ex3);
            st.setString(5, Ex4);
            st.setString(6, Ex5);
            st.setString(7, nome);

            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Treino cadastrado com sucesso");

            cbxTreino.getSelectedItem().toString();
            txtEx1.setText("");
            txtEx2.setText("");
            txtEx3.setText("");
            txtEx4.setText("");
            txtEx5.setText("");
            txtNome.setText("");

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Treino Já cadastrado");
            } else {
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }
        }
    }

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {
        String Exercicio1, Exercicio2, Exercicio3, Exercicio4, Exercicio5, Treino;
        Exercicio1 = txtEx1.getText();
        Exercicio2 = txtEx2.getText();
        Exercicio3 = txtEx3.getText();
        Exercicio4 = txtEx4.getText();
        Exercicio5 = txtEx5.getText();
        Treino = cbxTreino.getSelectedItem().toString();

        if (Treino.isEmpty()) { // se usuário está vazio
            JOptionPane.showMessageDialog(null, "É obrigatório digitar o usuário");
            cbxTreino.requestFocus();
            return; // stop
        }
        try {
            //2 - Conectar no banco de dados sistemabd
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3307/sistemabd", "root", "171246@Njo");
            //Executar a operação desejada (INSERT, UPDATE, DELETE, SELECT)
            PreparedStatement st = conectado.prepareStatement("DELETE treino SET serie = ?, exercicio1 = ?, exercicio2 = ?, exercicio3 = ?,exercicio4 = ?, exercicio5 = ? WHERE nome = ?");
            st.setString(1, Exercicio1);
            st.setString(2, Exercicio2);
            st.setString(3, Exercicio3);
            st.setString(4, Exercicio4);
            st.setString(5, Exercicio5);
            st.setString(6, Treino);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Treino alterado com sucesso");
            conectado.close();
            dispose();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Treino Já cadastrado");
                txtEx1.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnbSalvarActionPerformed

    private void cbxTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTreinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTreinoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta; // 0 - Sim; 1 - Não 
        resposta = JOptionPane.showConfirmDialog(null, "Confirma?", "Confirmação", 0);
        if (resposta == 0) {
            String u = txtNome.getText();
            try {
                //2 - Conectar no banco de dados sistemabd
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3307/sistemabd", "root", "171246@Njo");
                //Executar a operação desejada (INSERT, UPDATE, DELETE, SELECT)
                PreparedStatement st = conectado.prepareStatement("DELETE FROM treino WHERE nome = ?");
                st.setString(1, u);
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso");
                dispose();
                conectado.close();

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
            }
        } else {
            dispose();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlteracaoTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlteracaoTreinoActionPerformed
        String serie, Ex1, Ex2, Ex3, Ex4, Ex5, nome;
        serie = cbxTreino.getSelectedItem().toString();
        Ex1 = txtEx1.getText();
        Ex2 = txtEx2.getText();
        Ex3 = txtEx3.getText();
        Ex4 = txtEx4.getText();
        Ex5 = txtEx5.getText();
        nome = txtNome.getText();

        if (nome.isEmpty()) { // se usuário está vazio
            JOptionPane.showMessageDialog(null, "É obrigatório digitar o nome");
            txtNome.requestFocus();
            return; // stop
        }
        if (serie.isEmpty()) { // se senha está vazia
            JOptionPane.showMessageDialog(null, "É obrigatório digitar a série");
            return; // stop
        }
        try {
            //2 - Conectar no banco de dados sistemabd
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3307/sistemabd", "root", "171246@Njo");
            //Executar a operação desejada (INSERT, UPDATE, DELETE, SELECT)
            PreparedStatement st = conectado.prepareStatement("UPDATE treino SET serie = ?, exercicio1 = ?, exercicio2 = ?, exercicio3 = ?,exercicio4 = ?, exercicio5 = ? WHERE nome = ?");
            st.setString(1, serie);
            st.setString(2, Ex1);
            st.setString(3, Ex2);
            st.setString(4, Ex3);
            st.setString(5, Ex4);
            st.setString(6, Ex5);
            st.setString(7, nome);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Treino alterado com sucesso");
            conectado.close();
            dispose();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Treino Já cadastrado");
                txtNome.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnAlteracaoTreinoActionPerformed

    private void txtEx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEx1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTreino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlteracaoTreino;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnbSalvar;
    private javax.swing.JComboBox<String> cbxTreino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblEx1;
    private javax.swing.JLabel lblEx2;
    private javax.swing.JLabel lblEx3;
    private javax.swing.JLabel lblEx4;
    private javax.swing.JLabel lblEx5;
    private javax.swing.JTextField txtEx1;
    private javax.swing.JTextField txtEx2;
    private javax.swing.JTextField txtEx3;
    private javax.swing.JTextField txtEx4;
    private javax.swing.JTextField txtEx5;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
