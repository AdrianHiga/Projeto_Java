package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class Treino extends javax.swing.JFrame {

   
    public Treino() {
        initComponents();
        PreencherTreino();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTreino = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setTitle("Treino");
        getContentPane().setLayout(null);

        tblTreino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Série", "Exercicio1", "Exercicio2", "Exercicio3", "Exercicio4", "Exercicio5", "Cliente"
            }
        ));
        jScrollPane1.setViewportView(tblTreino);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 100, 770, 500);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/projeto facul.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 930, 690);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(280, 120, 10, 10);

        setSize(new java.awt.Dimension(944, 684));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Treino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTreino;
    // End of variables declaration//GEN-END:variables

    public void PreencherTreino() {
        try {
            //1 - Conectar ao Banco de Dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3307/sistemabd", "root", "171246@Njo");

            //2 - Buscar todos os usuários (SELECT)
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM treino ORDER BY nome ASC");
            ResultSet resultado = st.executeQuery();

            //3 - Carregar os usuários na tabela tblUsuarios
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblTreino.getModel();
            tblModelo.setRowCount(0);
            while (resultado.next()) {
                Object dados[] = {resultado.getString("serie"), resultado.getString("exercicio1"), resultado.getString("exercicio2"), resultado.getString("exercicio3"),resultado.getString("exercicio4"),resultado.getString("exercicio5"),resultado.getString("nome")};
                tblModelo.addRow(dados);
            }

            //4 - Desconectar do banco de dados
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}

