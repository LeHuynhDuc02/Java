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
public class QLNhanSu extends javax.swing.JFrame {

    ArrayList<NhanSu> dsNS=new ArrayList<NhanSu>();   
    int dongChon=-1;//dongf chon khi bấm vào bảng
    NhanSu ns=new NhanSu();//biến trung gian dùng tạo đối tượng  
    int kt=1;
    public QLNhanSu() {
        initComponents();
    }
    public boolean Check(String ma) {
        for(var t : dsNS)
            if (t.getMaNhanSu().trim().compareTo(ma.trim())==0)
                return true;
        return false;
    }
    public void loadTableNhanSu(){
        //In du lieu ra bang
        tbnhansu.setModel(new TableNhanSu(dsNS));
    }
    public String layGioiTinh() {
        if (rdonam.isSelected())
            return "Nam";
        else if (rdonu.isSelected())
            return "Nữ";
        return "";
    }
    public void fakeData(){
        dsNS.clear();
        NhanSu ns1 = new NhanSu("NS1", "Trưởng phòng", "Tài chính","Trần Văn A","Hà Nam","Nam","abc1@gmail.com","08818818","17/01/2002");
        NhanSu ns2 = new NhanSu("NS2", "Nhân viên", "Nhân sự","Nguyễn Thị C","Hà Nội","Nam","abc1@gmail.com","08818818","17/01/2002");
        NhanSu ns3 = new NhanSu("NS3", "Phó phòng", "Marketing","Lê Văn B","Thái Bình","Nam","abc1@gmail.com","08818818","17/01/2002");
        dsNS.add(ns1);
        dsNS.add(ns2);
        dsNS.add(ns3);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rdonam = new javax.swing.JRadioButton();
        rdonu = new javax.swing.JRadioButton();
        txtma = new javax.swing.JTextField();
        txtchucdanh = new javax.swing.JTextField();
        txtphongban = new javax.swing.JTextField();
        txthoten = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        txtngaysinh = new javax.swing.JTextField();
        txtsodt = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbnhansu = new javax.swing.JTable();
        btnload = new javax.swing.JButton();
        btnluufile = new javax.swing.JButton();
        btnxoatrang = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ NHÂN SỰ");

        jLabel2.setText("Mã nhân sự:");

        jLabel3.setText("Chức danh:");

        jLabel4.setText("Tên phòng ban:");

        jLabel5.setText("Họ tên:");

        jLabel6.setText("Địa chỉ:");

        jLabel7.setText("Ngày sinh:");

        jLabel8.setText("Số đt:");

        jLabel9.setText("Email:");

        jLabel10.setText("Giới tính:");

        buttonGroup1.add(rdonam);
        rdonam.setText("Nam");
        rdonam.setToolTipText("");

        buttonGroup1.add(rdonu);
        rdonu.setText("Nữ");

        tbnhansu.setModel(new javax.swing.table.DefaultTableModel(
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
        tbnhansu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbnhansuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbnhansu);

        btnload.setText("Load");
        btnload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloadActionPerformed(evt);
            }
        });

        btnluufile.setText("Lưu file");
        btnluufile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnluufileActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtchucdanh, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtphongban, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsodt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdonam)
                                .addGap(18, 18, 18)
                                .addComponent(rdonu))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnload)
                        .addGap(18, 18, 18)
                        .addComponent(btnluufile)
                        .addGap(26, 26, 26)
                        .addComponent(btnxoatrang)
                        .addGap(18, 18, 18)
                        .addComponent(btnthem)
                        .addGap(29, 29, 29)
                        .addComponent(btnsua)
                        .addGap(37, 37, 37)
                        .addComponent(btnxoa)
                        .addGap(27, 27, 27)
                        .addComponent(btnthoat))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtsodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtchucdanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtphongban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(rdonam)
                    .addComponent(rdonu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnxoa)
                    .addComponent(btnsua)
                    .addComponent(btnthem)
                    .addComponent(btnxoatrang)
                    .addComponent(btnluufile)
                    .addComponent(btnload)
                    .addComponent(btnthoat))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        try {
            kt=1;
            ns = new NhanSu(txtma.getText(), txtchucdanh.getText(),txtphongban.getText(), 
                txthoten.getText(), txtdiachi.getText(),layGioiTinh(), 
                txtemail.getText(), txtsodt.getText(), txtngaysinh.getText());
            if (Check(ns.getMaNhanSu())) {
                kt=0;
                throw new Exception("Mã nhân sự không được trùng");
            }
            if (ns.getChucDanh().trim().compareTo("")==0
                       || ns.getTenPhongBan().trim().compareTo("")==0
                       || ns.getHoTen().trim().compareTo("")==0
                       || ns.getDiaChi().trim().compareTo("")==0
                       || ns.getGioiTinh().trim().compareTo("")==0
                       || ns.getEmail().trim().compareTo("")==0
                       || ns.getSoDT().trim().compareTo("")==0
                       || ns.getNgaySinh().trim().compareTo("")==0
                       || ns.getMaNhanSu().trim().compareTo("")==0
                           ){
                       throw new Exception("Không được để trống thông tin");
                   }
            
        } catch (Exception ex) {
            kt=0;
            JOptionPane.showMessageDialog(this,
                    ex.toString(),"Thông báo", WIDTH);
        }
        if (kt==1)
            dsNS.add(ns);
        loadTableNhanSu();//load lại bảng với dl mới
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        //câp nhật dữ liệu mới tại vị trí dòng chọn
           dongChon=tbnhansu.getSelectedRow();
           String x; 
           if (dongChon != -1) {
               x = (String) tbnhansu.getValueAt(dongChon, 0);
               NhanSu nsNew = new NhanSu();
               try {
                   kt=1;
                   nsNew.setMaNhanSu(x);
                   nsNew.setChucDanh(txtchucdanh.getText()+"");
                   nsNew.setTenPhongBan(txtphongban.getText()+"");
                   nsNew.setHoTen(txthoten.getText()+"");
                   nsNew.setDiaChi(txtdiachi.getText()+"");
                   nsNew.setGioiTinh(layGioiTinh()+"");
                   nsNew.setEmail(txtemail.getText()+"");
                   nsNew.setSoDT(txtsodt.getText()+"");
                   nsNew.setNgaySinh(txtngaysinh.getText()+"");
                   if (nsNew.getChucDanh().trim().compareTo("")==0
                       || nsNew.getTenPhongBan().trim().compareTo("")==0
                       || nsNew.getHoTen().trim().compareTo("")==0
                       || nsNew.getDiaChi().trim().compareTo("")==0
                       || nsNew.getGioiTinh().trim().compareTo("")==0
                       || nsNew.getEmail().trim().compareTo("")==0
                       || nsNew.getSoDT().trim().compareTo("")==0
                       || nsNew.getNgaySinh().trim().compareTo("")==0
                       //|| nsNew.getMaNhanSu().trim().compareTo("")==0
                           ){
                       throw new Exception("Không được để trống thông tin");
                   }
                   if (x.trim().compareTo(txtma.getText().trim())!=0) {
                        throw new Exception("Không được sửa mã nhân sự");
                   }
               } catch (Exception ex) {
                   kt=0;
                   JOptionPane.showMessageDialog(this,
                    ex.toString(),"Thông báo", WIDTH);
               }
           
           if(kt==1)
                dsNS.set(dongChon, nsNew);//vị trí là dòng chọn
           //dữ liệu mới là từ giao diện cập nhật
           loadTableNhanSu();
        }
        else
            JOptionPane.showMessageDialog(this,
                    "Chưa chọn dòng sửa","Thông báo", WIDTH);
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        dongChon = tbnhansu.getSelectedRow(); 
        if (dongChon != -1) {           
           dsNS.remove(dongChon);
           loadTableNhanSu();
        }
        else
            JOptionPane.showMessageDialog(this, 
                    "Chưa chọn dòng xóa","Thông báo",WIDTH);
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        //System.exit(0);
        this.dispose();
    }//GEN-LAST:event_btnthoatActionPerformed

    private void btnxoatrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoatrangActionPerformed
            txtma.setText("");
            txtchucdanh.setText("");
            txtphongban.setText("");
            txthoten.setText("");
            txtdiachi.setText("");
            txtemail.setText("");
            txtsodt.setText("");
            txtngaysinh.setText("");
    }//GEN-LAST:event_btnxoatrangActionPerformed

    private void btnluufileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluufileActionPerformed
        try {
            FileWriter fw = new FileWriter("nhansu.txt");
            for (var x : dsNS)
                fw.write(x.toString()+"\n");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        JOptionPane.showMessageDialog(this,"Đã lưu thành công","Thông báo", WIDTH);
    }//GEN-LAST:event_btnluufileActionPerformed

    private void btnloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloadActionPerformed
        fakeData();
        loadTableNhanSu();
    }//GEN-LAST:event_btnloadActionPerformed

    private void tbnhansuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbnhansuMouseClicked
        dongChon = tbnhansu.getSelectedRow();
        if (dongChon != -1) {
            ns = dsNS.get(dongChon);            
            txtma.setText(ns.getMaNhanSu() + "");
            txtchucdanh.setText(ns.getChucDanh()+"");
            txtphongban.setText(ns.getTenPhongBan()+"");
            txthoten.setText(ns.getHoTen()+"");
            txtdiachi.setText(ns.getDiaChi()+"");
            if (ns.getGioiTinh().trim().compareTo("Nam")==0)
                rdonam.setSelected(true);
            else
                rdonu.setSelected(true);
            txtemail.setText(ns.getEmail()+"");
            txtsodt.setText(ns.getSoDT()+"");
            txtngaysinh.setText(ns.getNgaySinh()+"");
        }
    }//GEN-LAST:event_tbnhansuMouseClicked

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
            java.util.logging.Logger.getLogger(QLNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNhanSu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnload;
    private javax.swing.JButton btnluufile;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnthoat;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton btnxoatrang;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rdonam;
    private javax.swing.JRadioButton rdonu;
    private javax.swing.JTable tbnhansu;
    private javax.swing.JTextField txtchucdanh;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JTextField txtphongban;
    private javax.swing.JTextField txtsodt;
    // End of variables declaration//GEN-END:variables
}