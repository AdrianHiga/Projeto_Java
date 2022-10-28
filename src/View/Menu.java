package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu(String nome, String cargo) {
        initComponents();
        lblSaudacao.setText("Seja bem-vindo " + nome + " Cargo: " + cargo);
        if (cargo.equalsIgnoreCase("gerente")) {
            btnListaUsuario.setVisible(true);
            btnCadastrarUsuario.setVisible(true);
            btnAlterarUsuario.setVisible(true);
            btnExcluirUsuario.setVisible(true);
        } else if (cargo.equalsIgnoreCase("cliente")) {
            btnExcluirTreino.setEnabled(false);
            btnCadastrarTreino.setEnabled(false);
            btnAlterarTreino.setEnabled(false);
            btnTreino.setVisible(true);
             btnListaUsuario.setEnabled(false);
            btnCadastrarUsuario.setEnabled(false);
            btnAlterarUsuario.setEnabled(false);
            btnExcluirUsuario.setEnabled(false);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblAlterarDadosUsuario = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        lblSaudacao = new javax.swing.JLabel();
        lblAddUsuario = new javax.swing.JLabel();
        lblTreino = new javax.swing.JLabel();
        lblCadastrarTreino1 = new javax.swing.JLabel();
        lblAlterarTreino = new javax.swing.JLabel();
        lblExcluirTreino = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        btnExcluirUsuario = new javax.swing.JButton();
        btnAlterarUsuario = new javax.swing.JButton();
        btnCadastrarUsuario = new javax.swing.JButton();
        btnListaUsuario = new javax.swing.JButton();
        btnExcluirTreino = new javax.swing.JButton();
        btnAlterarTreino = new javax.swing.JButton();
        btnCadastrarTreino = new javax.swing.JButton();
        btnTreino = new javax.swing.JButton();
        lblCadastrarTreino = new javax.swing.JLabel();
        barMenu = new javax.swing.JMenuBar();

        setTitle("Menu do sistema");
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setText("Excluir Usuário");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(630, 470, 110, 30);

        lblAlterarDadosUsuario.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblAlterarDadosUsuario.setText("Alterar dados de Usuário");
        getContentPane().add(lblAlterarDadosUsuario);
        lblAlterarDadosUsuario.setBounds(440, 470, 170, 30);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(440, 470, 170, 30);

        lblUsuario.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblUsuario.setText("Lista de Usuários");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(150, 470, 150, 30);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(140, 470, 140, 30);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(630, 470, 110, 30);

        lblSaudacao.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        lblSaudacao.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(200, 60, 610, 60);

        lblAddUsuario.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblAddUsuario.setText("Add Usuário");
        getContentPane().add(lblAddUsuario);
        lblAddUsuario.setBounds(320, 470, 90, 30);

        lblTreino.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblTreino.setText(" Treino");
        getContentPane().add(lblTreino);
        lblTreino.setBounds(190, 290, 140, 30);

        lblCadastrarTreino1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblCadastrarTreino1.setText("Cadastrar Treino");
        getContentPane().add(lblCadastrarTreino1);
        lblCadastrarTreino1.setBounds(310, 290, 120, 30);

        lblAlterarTreino.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblAlterarTreino.setText("Alterar Treino");
        getContentPane().add(lblAlterarTreino);
        lblAlterarTreino.setBounds(480, 280, 120, 50);

        lblExcluirTreino.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblExcluirTreino.setText("Excluír Treino");
        getContentPane().add(lblExcluirTreino);
        lblExcluirTreino.setBounds(630, 280, 120, 50);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(610, 290, 130, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(300, 470, 120, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(460, 290, 130, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(300, 290, 130, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 290, 90, 30);

        btnExcluirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/lata-de-lixo (1).png"))); // NOI18N
        btnExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluirUsuario);
        btnExcluirUsuario.setBounds(610, 330, 130, 120);

        btnAlterarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/alterar (1).png"))); // NOI18N
        btnAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterarUsuario);
        btnAlterarUsuario.setBounds(460, 330, 130, 120);

        btnCadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/adicionar-usuario (1).png"))); // NOI18N
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarUsuario);
        btnCadastrarUsuario.setBounds(300, 330, 130, 120);

        btnListaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/lista-de-usuarios (1).png"))); // NOI18N
        btnListaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnListaUsuario);
        btnListaUsuario.setBounds(150, 330, 130, 120);

        btnExcluirTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/lata-de-lixo (1).png"))); // NOI18N
        btnExcluirTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirTreinoActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluirTreino);
        btnExcluirTreino.setBounds(610, 160, 130, 120);

        btnAlterarTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ferramenta-lapis (1).png"))); // NOI18N
        btnAlterarTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarTreinoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterarTreino);
        btnAlterarTreino.setBounds(460, 160, 130, 120);

        btnCadastrarTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/AlterarTreino (1).png"))); // NOI18N
        btnCadastrarTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarTreinoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarTreino);
        btnCadastrarTreino.setBounds(300, 160, 130, 120);

        btnTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/halterofilista (2).png"))); // NOI18N
        btnTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreinoActionPerformed(evt);
            }
        });
        getContentPane().add(btnTreino);
        btnTreino.setBounds(150, 160, 130, 120);

        lblCadastrarTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/projeto facul.jpg"))); // NOI18N
        getContentPane().add(lblCadastrarTreino);
        lblCadastrarTreino.setBounds(0, 0, 990, 650);
        setJMenuBar(barMenu);

        setSize(new java.awt.Dimension(944, 684));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreinoActionPerformed
        new Treino().setVisible(true);
    }//GEN-LAST:event_btnTreinoActionPerformed

    private void btnCadastrarTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarTreinoActionPerformed
        CadastroTreino tela;
        tela = new CadastroTreino();
        tela.setVisible(true);
    }//GEN-LAST:event_btnCadastrarTreinoActionPerformed

    private void btnAlterarTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarTreinoActionPerformed
        abrirCadastroTreino("alterar");
    }//GEN-LAST:event_btnAlterarTreinoActionPerformed

    private void btnListaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaUsuarioActionPerformed
        new ListaUsuarios().setVisible(true);
    }//GEN-LAST:event_btnListaUsuarioActionPerformed

    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        TelaUsuario tela;
        tela = new TelaUsuario();
        tela.setVisible(true);
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    private void btnAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarUsuarioActionPerformed
        abrirTelaUsuario("alterar");
    }//GEN-LAST:event_btnAlterarUsuarioActionPerformed

    private void btnExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuarioActionPerformed
        abrirTelaUsuario("excluir");
    }//GEN-LAST:event_btnExcluirUsuarioActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void btnExcluirTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTreinoActionPerformed
        abrirCadastroTreino("excluir");
    }//GEN-LAST:event_btnExcluirTreinoActionPerformed

    private void abrirCadastroTreino(String operacao) {
        String t;
        t = JOptionPane.showInputDialog(null, "Digite o nome do cliente que deseja excluir o treino " + operacao, "Treino", 1);
        if (t == null) {
            return;
        }
        try {
            //2 - Conectar no banco de dados sistemabd;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3307/sistemabd", "root", "171246@Njo");
            //3 - Buscar o usuário digitado na tabela usuario do banco de dados sistemabd;
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM treino WHERE nome = ? ");
            st.setString(1, t);
            ResultSet resultado = st.executeQuery();
            //4 - Verificar se o usuário foi encontrado na tabela usuario do banco de dados.
            if (resultado.next()) {
                String serie, exercicio1, exercicio2, exercicio3, exercicio4, exercicio5, nome;
                serie = resultado.getString("serie");
                exercicio1 = resultado.getString("exercicio1");
                exercicio2 = resultado.getString("exercicio2");
                exercicio3 = resultado.getString("exercicio3");
                exercicio4 = resultado.getString("exercicio4");
                exercicio5 = resultado.getString("exercicio5");
                nome = resultado.getString("nome");

                //Abrir o formulário Menu.java
                CadastroTreino tela;
                tela = new CadastroTreino(serie, exercicio1, exercicio2, exercicio3, exercicio4, exercicio5, nome);
                tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário Não cadastrado");
            }
            //5 - Desconectar.
            conectado.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não está na library");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você errou nos dados da conexão com o banco de dados");
        }
    }

    private void abrirTelaUsuario(String operacao) {
        String u;
        u = JOptionPane.showInputDialog(null, "Digite o usuário que deseja " + operacao, "Usuário", 1);
        if (u == null) {
            return;
        }
        try {
            //2 - Conectar no banco de dados sistemabd;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3307/sistemabd", "root", "171246@Njo");
            //3 - Buscar o usuário digitado na tabela usuario do banco de dados sistemabd;
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM usuario WHERE usuario = ? ");
            st.setString(1, u);
            ResultSet resultado = st.executeQuery();
            //4 - Verificar se o usuário foi encontrado na tabela usuario do banco de dados.
            if (resultado.next()) {
                String usuario, senha, nome, cargo;
                usuario = resultado.getString("usuario");
                senha = resultado.getString("senha");
                nome = resultado.getString("nome");
                cargo = resultado.getString("cargo");
                //Abrir o formulário Menu.java
                TelaUsuario tela;
                tela = new TelaUsuario(usuario, senha, nome, cargo, operacao);
                tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário Não cadastrado");
            }
            //5 - Desconectar.
            conectado.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não está na library");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você errou nos dados da conexão com o banco de dados");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JButton btnAlterarTreino;
    private javax.swing.JButton btnAlterarUsuario;
    private javax.swing.JButton btnCadastrarTreino;
    private javax.swing.JButton btnCadastrarUsuario;
    private javax.swing.JButton btnExcluirTreino;
    private javax.swing.JButton btnExcluirUsuario;
    private javax.swing.JButton btnListaUsuario;
    private javax.swing.JButton btnTreino;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblAddUsuario;
    private javax.swing.JLabel lblAlterarDadosUsuario;
    private javax.swing.JLabel lblAlterarTreino;
    private javax.swing.JLabel lblCadastrarTreino;
    private javax.swing.JLabel lblCadastrarTreino1;
    private javax.swing.JLabel lblExcluirTreino;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JLabel lblTreino;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables

}
