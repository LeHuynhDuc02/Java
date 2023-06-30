/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLy;

import static java.awt.image.ImageObserver.WIDTH;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class QLHopDongNhanSu extends javax.swing.JFrame {

    ArrayList<HopDongNhanSu> dsHD=new ArrayList<HopDongNhanSu>();   
    int dongChon=-1;//dòng chọn khi bấm vào bảng
    HopDongNhanSu hd=new HopDongNhanSu();//biến trung gian dùng tạo đối tượng  
    int kt=1;
    public QLHopDongNhanSu() {
        initComponents();
    }

    public void loadTableHopDong(){
        //In du lieu ra bang
        tbhopdong.setModel(new TableHopDong(dsHD));
    }
    public void fakeData(){
        dsHD.clear();
        HopDongNhanSu hd1 = new HopDongNhanSu("HD01", "NV01", "Nguyễn Văn A", "Hợp đồng 3 năm", "11/11/2020","11/11/2023", "Gia hạn trước 1 tháng");
        HopDongNhanSu hd2 = new HopDongNhanSu("HD02", "NV03", "Nguyễn THị C", "Hợp đồng 5 năm", "2/8/2017","2/8/2022", "Gia hạn trước 1 tháng");
        HopDongNhanSu hd3 = new HopDongNhanSu("HD03", "NV02", "Trần Văn B", "Hợp đồng 10 năm", "8/3/2019", "8/3/2029", "Gia hạn trước 1 tháng");
        dsHD.add(hd1);
        dsHD.add(hd2);
        dsHD.add(hd3);
    }
    public boolean Check(String ma) {
        for(var t : dsHD)
            if (t.getMaHopDong().trim().compareTo(ma.trim())==0)
                return true;
        return false;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtmahopdong = new javax.swing.JTextField();
        txtmanhansu = new javax.swing.JTextField();
        txttennhansu = new javax.swing.JTextField();
        txtloaihd = new javax.swing.JTextField();
        txtngayky = new javax.swing.JTextField();
        txtngayhethan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtghichu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbhopdong = new javax.swing.JTable();
        btnload = new javax.swing.JButton();
        btnluu = new javax.swing.JButton();
        btnxoatrang = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ HỢP ĐỒNG NHÂN SỰ");

        jLabel2.setText("Mã hợp đồng:");

        jLabel3.setText("Mã nhân sự:");

        jLabel4.setText("Tên nhân sự:");

        jLabel5.setText("Loại hợp đồng:");

        jLabel6.setText("Ngày hết hạn:");

        jLabel7.setText("Ngày ký:");

        jLabel8.setText("Ghi chú:");

        tbhopdong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbhopdong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbhopdongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbhopdong);

        btnload.setText("Load");
        btnload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloadActionPerformed(evt);
            }
        });

        btnluu.setText("Lưu file");
        btnluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnluuActionPerformed(evt);
            }
        });

        btnxoatrang.setText("Xóa trắng");
        btnxoatrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoatrangActionPerformed(evt);
            }
        });

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnthoat.setText("Thoát");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnload)
                        .addGap(18, 18, 18)
                        .addComponent(btnluu)
                        .addGap(18, 18, 18)
                        .addComponent(btnxoatrang)
                        .addGap(18, 18, 18)
                        .addComponent(btnthem)
                        .addGap(18, 18, 18)
                        .addComponent(btnsua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnxoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnthoat))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txttennhansu, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                            .addComponent(txtmanhansu))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(42, 42, 42))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtghichu, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtmahopdong, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(28, 28, 28)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtloaihd, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(txtngayky)
                                    .addComponent(txtngayhethan))))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtmahopdong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmanhansu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtngayky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txttennhansu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtloaihd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(txtngayhethan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtghichu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnload)
                    .addComponent(btnluu)
                    .addComponent(btnxoatrang)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(btnxoa)
                    .addComponent(btnthoat))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloadActionPerformed
        fakeData();
        loadTableHopDong();
    }//GEN-LAST:event_btnloadActionPerformed

    private void btnluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluuActionPerformed
        try {
            FileWriter fw = new FileWriter("hopdong.txt");
            for (var x : dsHD)
                fw.write(x.toString()+"\n");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        JOptionPane.showMessageDialog(this,"Đã lưu thành công","Thông báo", WIDTH);
    }//GEN-LAST:event_btnluuActionPerformed

    private void btnxoatrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoatrangActionPerformed
        txtmahopdong.setText("");
        txtmanhansu.setText("");
        txttennhansu.setText("");
        txtloaihd.setText("");
        txtngayky.setText("");
        txtngayhethan.setText("");
        txtghichu.setText("");
    }//GEN-LAST:event_btnxoatrangActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        try {
            kt=1;
            hd = new HopDongNhanSu(txtmahopdong.getText(),txtmanhansu.getText(),txttennhansu.getText(),
                txtloaihd.getText(),txtngayky.getText(),txtngayhethan.getText(),txtghichu.getText());
            if (Check(hd.getMaHopDong()))
            {
                throw new Exception("Không được trùng mã hợp đồng");
            }
            if (hd.getMaNhanSu().trim().compareTo("")==0
                    || hd.getTenNhanSu().trim().compareTo("")==0  
                    || hd.getLoaiHopDong().trim().compareTo("")==0 
                    || hd.getNgayKy().trim().compareTo("")==0 
                    || hd.getNgayHetHan().trim().compareTo("")==0 
                    || hd.getGhiChu().trim().compareTo("")==0 
                    || hd.getMaHopDong().trim().compareTo("")==0 
                        ){
                    throw new Exception("Không được để trống thông tin");
                }
        } catch (Exception ex) {
            kt=0;
            JOptionPane.showMessageDialog(this,ex.toString(),"Thông báo", WIDTH);
        }
        if (kt==1)
            dsHD.add(hd);
        loadTableHopDong();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        dongChon = tbhopdong.getSelectedRow();
        String x; 
        HopDongNhanSu hdNew = new HopDongNhanSu();
        if (dongChon!=-1) {
            x = (String) tbhopdong.getValueAt(dongChon, 0);
            try {
                kt=1;
                hdNew.setMaHopDong(x);
                hdNew.setMaNhanSu(txtmanhansu.getText());
                hdNew.setTenNhanSu(txttennhansu.getText());
                hdNew.setLoaiHopDong(txtloaihd.getText());
                hdNew.setNgayKy(txtngayky.getText());
                hdNew.setNgayHeHan(txtngayhethan.getText());
                hdNew.setGhiChu(txtghichu.getText());
                if (hdNew.getMaNhanSu().trim().compareTo("")==0
                    || hdNew.getTenNhanSu().trim().compareTo("")==0  
                    || hdNew.getLoaiHopDong().trim().compareTo("")==0 
                    || hdNew.getNgayKy().trim().compareTo("")==0 
                    || hdNew.getNgayHetHan().trim().compareTo("")==0 
                    || hdNew.getGhiChu().trim().compareTo("")==0 
                    //|| hdNew.getMaHopDong().trim().compareTo("")==0 
                        ){
                    throw new Exception("Không được để trống thông tin");
                }
                if (x.trim().compareTo(txtmahopdong.getText().trim())!=0) {
                        throw new Exception("Không được sửa mã hợp đồng");
                   }
            } catch (Exception ex) {
                kt=0;
                JOptionPane.showMessageDialog(this,ex.toString(),"Thông báo", WIDTH);
            }
            
            if(kt==1)
            {
                dsHD.set(dongChon, hdNew);
            }
            loadTableHopDong();
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Chưa chọn dòng sửa","Thông báo", WIDTH);
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        dongChon = tbhopdong.getSelectedRow();
        if (dongChon!=-1) {
            dsHD.remove(dongChon);
            loadTableHopDong();
        }
        else {
            JOptionPane.showMessageDialog(this,"Chưa chọn dòng xóa","Thông báo", WIDTH);
        }
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        //System.exit(0);
        this.dispose();
    }//GEN-LAST:event_btnthoatActionPerformed

    private void tbhopdongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbhopdongMouseClicked
        dongChon = tbhopdong.getSelectedRow();
        if (dongChon!=-1) {
            hd = dsHD.get(dongChon);
            txtmahopdong.setText(hd.getMaHopDong());
            txtmanhansu.setText(hd.getMaNhanSu());
            txttennhansu.setText(hd.getTenNhanSu());
            txtloaihd.setText(hd.getLoaiHopDong());
            txtngayky.setText(hd.getNgayKy());
            txtngayhethan.setText(hd.getNgayHetHan());
            txtghichu.setText(hd.getGhiChu());
        }
    }//GEN-LAST:event_tbhopdongMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLHopDongNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLHopDongNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLHopDongNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLHopDongNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLHopDongNhanSu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnload;
    private javax.swing.JButton btnluu;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnthoat;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton btnxoatrang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbhopdong;
    private javax.swing.JTextField txtghichu;
    private javax.swing.JTextField txtloaihd;
    private javax.swing.JTextField txtmahopdong;
    private javax.swing.JTextField txtmanhansu;
    private javax.swing.JTextField txtngayhethan;
    private javax.swing.JTextField txtngayky;
    private javax.swing.JTextField txttennhansu;
    // End of variables declaration//GEN-END:variables
}
