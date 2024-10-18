/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import view.sanphamview;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import ws.Danhmuc;
import ws.Sanpham;

/**
 *
 * @author Admin
 */
public final class sanphamcontroller {

    sanphamview spv;

    List<Danhmuc> arr_cvd;
    List<Sanpham> arr_n;
    FileOutputStream fos = null;
    BufferedOutputStream bos = null;
    XSSFWorkbook excel = null;

    public sanphamcontroller() {
        spv = new sanphamview();
        danhmuc();
        load();
        click_table();
        spv.action_chonanh(new chonanh());
        spv.action_add(new add());
        spv.action_edit(new edit());
        spv.action_delete(new delete());
        spv.action_save(new save());
        spv.action_tim(new search());
        spv.action_xuatfile(new xuatfile());
        spv.action_loc(new loc());
    }

    public JPanel getPanel() {
        return spv;
    }

    class xuatfile implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser jf = new JFileChooser("D:\\neatbenas");
            FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
            jf.setFileFilter(fnef);
            int f = jf.showSaveDialog(null);
            if (f == JFileChooser.APPROVE_OPTION) {
                excel = new XSSFWorkbook();
                XSSFSheet sheet = excel.createSheet("sheet1");
                for (int i = 0; i < spv.model.getRowCount(); i++) {
                    XSSFRow r = sheet.createRow(i);
                    for (int j = 0; j < spv.model.getColumnCount(); j++) {
                        XSSFCell c = r.createCell(j);
                        c.setCellValue(spv.model.getValueAt(i, j).toString());
                    }
                }
                try {
                    fos = new FileOutputStream(jf.getSelectedFile() + ".xlsx");
                    bos = new BufferedOutputStream(fos);
                    try {
                        excel.write(bos);
                        JOptionPane.showMessageDialog(null, "thanh cong");
                    } catch (IOException ex) {
                    }
                } catch (FileNotFoundException ex) {
                } finally {
                    try {
                        if (bos != null) {
                            bos.close();
                        } else if (fos != null) {
                            fos.close();
                        } else if (excel != null) {
                            excel.close();
                        }
                    } catch (IOException ex) {
                    }
                }
            }

        }

    }

    class chonanh implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser f = new JFileChooser("C:\\Users\\DELL\\Documents\\NetBeansProjects\\BTLthongke\\src\\Image\\img");
            f.setDialogTitle("Mở file");
            f.showOpenDialog(null);
            File tenanh = f.getSelectedFile();
            spv.duongdananh = tenanh.getAbsolutePath();

            try {

                spv.anh.setIcon(spv.ResizeImage(String.valueOf(spv.duongdananh)));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(spv, "Bạn chưa chọn ảnh");

            }
        }

    }

    class add implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            spv.xoatrang();
        }

    }

    class edit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                updateSanpham(spv.duongdananh, spv.t_masp.getText(), spv.t_tensp.getText(), (String) spv.cbodanhmuc.getSelectedItem(), Double.parseDouble(spv.t_gia.getText()), spv.t_mota.getText(), Integer.parseInt(spv.t_soluong.getText()), (String) spv.cbtt.getSelectedItem());
                JOptionPane.showMessageDialog(null, "Sửa thành công");
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            load();
        }

    }

    class delete implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                deleteSanpham(spv.t_masp.getText());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            load();
            spv.xoatrang();
            JOptionPane.showMessageDialog(null, "Xóa thành công");
        }

    }

    class save implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(check_null()){
                JOptionPane.showMessageDialog(spv, "Vui lòng nhập đủ thông tin");
            }else if (kt(spv.t_masp.getText()) ) {
                JOptionPane.showMessageDialog(spv, "Mã đã tồn tại");
            } else {
                saveSanpham(spv.duongdananh, spv.t_masp.getText(), spv.t_tensp.getText(), (String) spv.cbodanhmuc.getSelectedItem(), Double.parseDouble(spv.t_gia.getText()), spv.t_mota.getText(), Integer.parseInt(spv.t_soluong.getText()), (String) spv.cbtt.getSelectedItem());
                load();
                JOptionPane.showMessageDialog(null, "Lưu thành công");
                spv.xoatrang();
            }
            

        }

    }

    class loc implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String loc = (String) spv.cbodanhmuc1.getSelectedItem();

            arr_n = loc(loc);
            int i = 0;
            spv.model.setRowCount(0);
            for (Sanpham n1 : arr_n) {
                i++;
                int kt = n1.getSoluong();
                String tt = n1.getTinhtrang();
                if (kt != 0) {
                    tt = "Còn hàng";
                } else {
                    tt = "Hết hàng";
                }

                spv.model.addRow(new Object[]{i, n1.getMasp(), n1.getTensp(), n1.getLoaihang(), n1.getGia(), n1.getMota(), kt, tt});
            }

        }

    }

    class search implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            arr_n = findSanpham(spv.tim.getText());
            int i = 0;
            spv.model.setRowCount(0);
            for (Sanpham s : arr_n) {
                i++;
                int kt = s.getSoluong();
                String tt = s.getTinhtrang();
                if (kt != 0) {
                    tt = "Còn hàng";
                } else {
                    tt = "Hết hàng";
                }

                spv.model.addRow(new Object[]{i, s.getMasp(), s.getTensp(), s.getLoaihang(), s.getGia(), s.getMota(), kt, tt});
            }
        }

    }

    public boolean kt(String a) {
        boolean t = false;
        arr_n = getAllSanpham();
        for (Sanpham n1 : arr_n) {
            t = n1.getMasp().equals(a);
        }
        return t;
    }

    public boolean check_null() {
        boolean b = false;
        if (spv.t_masp.getText().equals("") || spv.t_tensp.getText().equals("") || spv.t_soluong.getText().equals("") || spv.t_gia.getText().equals("")) {
            
            b = true;
        }
        return b;
    }

    public void load() {

        arr_n = getAllSanpham();
        int i = 0;
        spv.model.setRowCount(0);
        for (Sanpham n1 : arr_n) {
            i++;
            int kt = n1.getSoluong();
            String tt = n1.getTinhtrang();
            if (kt != 0) {
                tt = "Còn hàng";
            } else {
                tt = "Hết hàng";
            }

            spv.model.addRow(new Object[]{i, n1.getMasp(), n1.getTensp(), n1.getLoaihang(), n1.getGia(), n1.getMota(), kt, tt});
        }
    }

    public void click_table() {

        spv.table1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int h = spv.table1.getSelectedRow();
                Sanpham sp1 = arr_n.get(h);
                spv.duongdananh = sp1.getAnh();
                spv.anh.setIcon(spv.ResizeImage(String.valueOf(spv.duongdananh)));
                spv.t_masp.setText(sp1.getMasp());
                spv.t_tensp.setText(sp1.getTensp());
                int k = 0;
                while (true) {
                    String t = spv.cbodanhmuc.getItemAt(k).toString();
                    if (sp1.getLoaihang().equalsIgnoreCase(t)) {
                        spv.cbodanhmuc.setSelectedIndex(k);
                        break;
                    }
                    k++;
                }
                spv.t_gia.setText(sp1.getGia() + "");
                spv.t_mota.setText(sp1.getMota());
                spv.t_soluong.setText(sp1.getSoluong() + "");

                spv.t_ngaynhap.setText(sp1.getNgaynhap());
                spv.cbtt.setSelectedItem(sp1.getTinhtrang());
                int i = 0;
                while (true) {
                    String tt = spv.cbtt.getItemAt(i).toString();
                    if (sp1.getTinhtrang().equalsIgnoreCase(tt)) {
                        spv.cbtt.setSelectedIndex(i);
                        break;
                    }
                    i++;
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public void danhmuc() {
        arr_cvd = getAllDanhmuc();
        for (Danhmuc c : arr_cvd) {
            spv.cbodanhmuc.addItem(c.getTendanhmuc());
            spv.cbodanhmuc1.addItem(c.getTendanhmuc());
        }
    }

    public static void deleteSanpham(java.lang.String a) {
        ws.SanphamWebService_Service service = new ws.SanphamWebService_Service();
        ws.SanphamWebService port = service.getSanphamWebServicePort();
        port.deleteSanpham(a);
    }

    public static java.util.List<ws.Danhmuc> getAllDanhmuc() {
        ws.SanphamWebService_Service service = new ws.SanphamWebService_Service();
        ws.SanphamWebService port = service.getSanphamWebServicePort();
        return port.getAllDanhmuc();
    }

    public static java.util.List<ws.Sanpham> getAllSanpham() {
        ws.SanphamWebService_Service service = new ws.SanphamWebService_Service();
        ws.SanphamWebService port = service.getSanphamWebServicePort();
        return port.getAllSanpham();
    }

    private static java.util.List<ws.Sanpham> loc(java.lang.String a) {
        ws.SanphamWebService_Service service = new ws.SanphamWebService_Service();
        ws.SanphamWebService port = service.getSanphamWebServicePort();
        return port.loc(a);
    }

    private static void saveSanpham(java.lang.String a, java.lang.String b, java.lang.String c, java.lang.String d, double e, java.lang.String f, int g, java.lang.String h) {
        ws.SanphamWebService_Service service = new ws.SanphamWebService_Service();
        ws.SanphamWebService port = service.getSanphamWebServicePort();
        port.saveSanpham(a, b, c, d, e, f, g, h);
    }

    private static void updateSanpham(java.lang.String a, java.lang.String b, java.lang.String c, java.lang.String d, double e, java.lang.String f, int g, java.lang.String h) {
        ws.SanphamWebService_Service service = new ws.SanphamWebService_Service();
        ws.SanphamWebService port = service.getSanphamWebServicePort();
        port.updateSanpham(a, b, c, d, e, f, g, h);
    }

    private static java.util.List<ws.Sanpham> findSanpham(java.lang.String a) {
        ws.SanphamWebService_Service service = new ws.SanphamWebService_Service();
        ws.SanphamWebService port = service.getSanphamWebServicePort();
        return port.findSanpham(a);
    }

}
