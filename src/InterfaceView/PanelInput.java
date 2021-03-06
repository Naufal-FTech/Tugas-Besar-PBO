
package InterfaceView;

import Driver.Manage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class PanelInput extends javax.swing.JPanel {

    String source;
    File file;
    BufferedReader br;
    public DefaultTableModel model;
    public String[] data;
    Manage manage = new Manage();
    
    public PanelInput() {
        initComponents();
        data = new String [5];
        loadData();        
    }

    public void loadData(){
        source = "src/Database/Database Masuk.txt";
        file = new File (source);
        try {
            br = new BufferedReader(new FileReader(file));
            String barisPertama = br.readLine();
            String[] namaKolom = barisPertama.split(",");
            model = (DefaultTableModel)jTableInput.getModel(); 
            model.setColumnIdentifiers(namaKolom);
            
            Object[] dataBaris = br.lines().toArray();
            for (Object dataBaris1 : dataBaris){
                String baris = dataBaris1.toString();
                String[] dataLoad = baris.split("/");
                model.addRow(dataLoad);
            }
        } catch (Exception e) {
        }
    }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInput = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kode = new javax.swing.JTextField();
        pemberi = new javax.swing.JTextField();
        petugas = new javax.swing.JTextField();
        bahan = new javax.swing.JTextField();
        berat = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();

        jTableInput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KODE", "PEMBERI", "Ptgs. PENERIMA", "BAHAN ZAKAT", "BERAT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInputMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableInput);

        jLabel1.setText("Kode");

        jLabel2.setText("Nama Pemberi");

        jLabel3.setText("Petugas Penerima");

        jLabel4.setText("Bahan");

        jLabel5.setText("Berat");

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconfinder_Save_70652.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsaveMouseClicked(evt);
            }
        });
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconfinder_edit-delete_23231.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconfinder_file_edit_48763.png"))); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kode, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(pemberi)
                            .addComponent(petugas)
                            .addComponent(bahan)
                            .addComponent(berat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(btnsave)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(btnedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(pemberi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(petugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(bahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(berat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsaveMouseClicked

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try {
            manage.saveBtn(this);
        } catch (Exception ex) {
            Logger.getLogger(PanelInput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {
            manage.deleteBtn(this);
        } catch (Exception ex) {
            Logger.getLogger(PanelInput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        try {
            manage.editBtn(this);
        } catch (Exception ex) {
            Logger.getLogger(PanelInput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void jTableInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInputMouseClicked
        int baris = jTableInput.getSelectedRow();
        
        kode.setText(model.getValueAt(baris,0).toString());
        pemberi.setText(model.getValueAt(baris,1).toString());
        petugas.setText(model.getValueAt(baris,2).toString());
        bahan.setText(model.getValueAt(baris,3).toString());
        berat.setText(model.getValueAt(baris,4).toString());
    }//GEN-LAST:event_jTableInputMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField bahan;
    public javax.swing.JTextField berat;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableInput;
    public javax.swing.JTextField kode;
    public javax.swing.JTextField pemberi;
    public javax.swing.JTextField petugas;
    // End of variables declaration//GEN-END:variables
}
