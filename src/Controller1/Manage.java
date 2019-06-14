
package Controller1;

import InterfaceView.PanelInput;


public class Manage implements Controller {

    @Override
    public void saveBtn(PanelInput input) {
        try {
            input.data[0] = input.kode.getText();
            input.data[1] = input.pemberi.getText();
            input.data[2] = input.petugas.getText();
            input.data[3] = input.bahan.getText();
            input.data[4] = input.berat.getText();
          
            input.model.addRow(input.data);
          
            input.kode.setText("");
            input.pemberi.setText("");
            input.petugas.setText("");
            input.bahan.setText("");
            input.berat.setText("");
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
    
    @Override
    public void editBtn(PanelInput input) {
        try {
            int baris = input.jTableInput.getSelectedRow();
        
            input.data[0] = input.kode.getText();
            input.data[1] = input.pemberi.getText();
            input.data[2] = input.petugas.getText();
            input.data[3] = input.bahan.getText();
            input.data[4] = input.berat.getText();
        
            input.model.setValueAt(input.data[0], baris,0);
            input.model.setValueAt(input.data[1], baris,1);
            input.model.setValueAt(input.data[2], baris,2);
            input.model.setValueAt(input.data[3], baris,3);
            input.model.setValueAt(input.data[4], baris,4);
        
            input.kode.setText("");
            input.pemberi.setText("");
            input.petugas.setText("");
            input.bahan.setText("");
            input.berat.setText("");
        } catch (Exception e) {
            System.out.println(e);
        }
    }    

    @Override
    public void deleteBtn(PanelInput input) {
        try {
            int baris = input.jTableInput.getSelectedRow();
        
            input.model.removeRow(baris);
            input.kode.setText("");
            input.pemberi.setText("");
            input.petugas.setText("");
            input.bahan.setText("");
            input.berat.setText("");
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
