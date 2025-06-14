/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package praktik12;

// importan

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;  
import java.util.Date; 

public class StokObat extends javax.swing.JFrame {

    /**
     * Creates new form StokObat
     */
    public StokObat() {
        initComponents();
        loadStokObatData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_backApotek = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_listObat = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lbl_biasa = new javax.swing.JLabel();
        lb_infoUpdate = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("APOTEK SYAHDANA");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 0));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("APOTEK SYAHDANA");

        btn_backApotek.setBackground(new java.awt.Color(255, 102, 51));
        btn_backApotek.setText("KEMBALI");
        btn_backApotek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backApotekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_backApotek)
                .addGap(105, 105, 105)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(165, 165, 165))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(btn_backApotek))
                .addContainerGap())
        );

        table_listObat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID OBAT", "NAMA", "JUMLAH", "EXPIRED"
            }
        ));
        jScrollPane1.setViewportView(table_listObat);

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        jLabel2.setText("LIST STOK OBAT APOTEK SYAHDANA");

        lbl_biasa.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        lbl_biasa.setText("LAST UPDATE ON:");

        lb_infoUpdate.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        lb_infoUpdate.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_infoUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_biasa))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(lbl_biasa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_infoUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backApotekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backApotekActionPerformed
        // TODO add your handling code here:
        
        ApotekApp apotekFrame = new ApotekApp();
        apotekFrame.setVisible(true);
    }//GEN-LAST:event_btn_backApotekActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    private void loadStokObatData() {
        DefaultTableModel model = (DefaultTableModel) table_listObat.getModel();
        model.setRowCount(0);

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DatabaseController.getConnection();
            String sql = "SELECT id_obat, nama, jumlah, expired FROM StokObat ORDER BY nama ASC";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                row.add(rs.getInt("id_obat"));
                row.add(rs.getString("nama"));
                row.add(rs.getInt("jumlah"));
                row.add(rs.getDate("expired"));
                model.addRow(row);
            }

            // --- PERBAIKAN DI SINI: SELALU TAMPILKAN WAKTU ---
            Date lastUpdate = DatabaseController.getLastUpdateTimestamp();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            lb_infoUpdate.setText(sdf.format(lastUpdate)); // Selalu tampilkan waktu, karena sudah dijamin tidak null
            // --- AKHIR PERBAIKAN ---

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error saat memuat data stok obat: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            if (rs != null) { try { rs.close(); } catch (SQLException e) { /* ignore */ } }
            if (pstmt != null) { try { pstmt.close(); } catch (SQLException e) { /* ignore */ } }
            DatabaseController.closeConnection(conn);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_backApotek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_infoUpdate;
    private javax.swing.JLabel lbl_biasa;
    private javax.swing.JTable table_listObat;
    // End of variables declaration//GEN-END:variables
}
