/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import view.khachhangview;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import ws.Khachhangmodel;

/**
 *
 * @author Admin
 */
public final class khachhangcontroller {

    int k = 0;
    khachhangview n;
    List<Khachhangmodel> arr_n;
    Khachhangmodel khmodel;
    FileOutputStream fos = null;
    BufferedOutputStream bos = null;
    XSSFWorkbook excel = null;

    public khachhangcontroller(khachhangview n) {
        this.n = n;
    }
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public JPanel getPanel() {
        return n;
    }

    public khachhangcontroller() {
        n = new khachhangview();
        n.action_add(new add());
        n.action_edit(new edit());
        n.action_delete(new delete());
        n.action_save(new save());
        n.action_search(new search());
        n.action_xuatfile(new xuatfile());
        load();
        click_table();
    }

    class xuatfile implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser jf = new JFileChooser("C:\\Users\\Dell\\Documents\\NetBeansProjects");
            FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
            jf.setFileFilter(fnef);
            int f = jf.showSaveDialog(null);
            if (f == JFileChooser.APPROVE_OPTION) {
                excel = new XSSFWorkbook();
                XSSFSheet sheet = excel.createSheet("sheet1");
                for (int i = 0; i < n.model.getRowCount(); i++) {
                    XSSFRow r = sheet.createRow(i);
                    for (int j = 0; j < n.model.getColumnCount(); j++) {
                        XSSFCell c = r.createCell(j);
                        c.setCellValue(n.model.getValueAt(i, j).toString());
                    }
                }
                try {
                    fos = new FileOutputStream(jf.getSelectedFile() + ".xlsx");
                    bos = new BufferedOutputStream(fos);
                    try {
                        excel.write(bos);
                        JOptionPane.showMessageDialog(null, "thanh cong");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
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

    class add implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            n.xoatrang();
        }
    }

    class edit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                update(n.t_ma.getText(), n.t_ten.getText(), n.t_ngaysinh.getText(), n.t_dienthoai.getText(), n.t_diachi.getText());
                System.out.println(n.t_ma.getText());
                System.out.println(n.t_ten.getText());
                System.out.println(n.t_ngaysinh.getText());
                System.out.println(n.t_dienthoai.getText());
                System.out.println(n.t_diachi.getText());

            } catch (Exception ex) {
            }
            load();
            JOptionPane.showMessageDialog(null, "Sửa thành công");
        }
    }

    class delete implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                deleteKhachhang(n.t_ma.getText());

            } catch (Exception ex) {
            }
            load();
            JOptionPane.showMessageDialog(n, "Xóa thành công");
            n.xoatrang();
        }
    }

    class save implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (check_null()) {
                JOptionPane.showMessageDialog(n, "Bạn cần nhập đủ thông tin");
            } else if (kt(n.t_ma.getText()) == true) {
                JOptionPane.showMessageDialog(n, "mã đã tồn tại");
            } else {

                addKhachhang(n.t_ma.getText(), n.t_ten.getText(), n.t_ngaysinh.getText(), n.t_dienthoai.getText(), n.t_diachi.getText());

                load();
                JOptionPane.showMessageDialog(n, "Thêm thành công");
                n.xoatrang();
            }

        }
    }

    class search implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            arr_n = new ArrayList<>();
            arr_n = findKhachhang(n.search.getText());
            int i = 0;
            n.model.setRowCount(0);
            for (Khachhangmodel n1 : arr_n) {
                i++;
                n.model.addRow(new Object[]{i, n1.getMakhachhang(), n1.getTenkhachhang(), n1.getNgaysinh(), n1.getDienthoai(), n1.getDiachiKH()});
            }
        }
    }

    public boolean kt(String a) {
        boolean t = false;
        arr_n = getAllKhachhang();
        for (Khachhangmodel n1 : arr_n) {
            t = n1.getMakhachhang().equals(a);
        }
        return t;
    }

    public boolean check_null() {
        boolean t = false;
        t = n.t_ma.getText().equals("") || n.t_ten.getText().equals("") || n.t_dienthoai.getText().equals("") || n.t_ngaysinh.getText().equals("");
        return t;
    }

    public void load() {

        arr_n = getAllKhachhang();
        int i = 0;
        n.model.setRowCount(0);
        for (Khachhangmodel n1 : arr_n) {
            i++;
            n.model.addRow(new Object[]{i, n1.getMakhachhang(), n1.getTenkhachhang(), n1.getNgaysinh(), n1.getDienthoai(), n1.getDiachiKH()});
        }
    }

    public void click_table() {
        n.table1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                k = n.table1.getSelectedRow();
                Khachhangmodel kh1 = arr_n.get(k);
                n.t_ma.setText(kh1.getMakhachhang());
                n.t_ten.setText(kh1.getTenkhachhang());
                n.t_ngaysinh.setText(kh1.getNgaysinh().toString());
                n.t_diachi.setText(kh1.getDiachiKH());
                n.t_dienthoai.setText(kh1.getDienthoai());
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

    private static java.util.List<ws.Khachhangmodel> getAllKhachhang() {
        ws.Khachhangservice_Service service = new ws.Khachhangservice_Service();
        ws.Khachhangservice port = service.getKhachhangservicePort();
        return port.getAllKhachhang();
    }

    private static void addKhachhang(java.lang.String a, java.lang.String b, java.lang.String c, java.lang.String d, java.lang.String e) {
        ws.Khachhangservice_Service service = new ws.Khachhangservice_Service();
        ws.Khachhangservice port = service.getKhachhangservicePort();
        port.addKhachhang(a, b, c, d, e);
    }

    private static void deleteKhachhang(java.lang.String a) {
        ws.Khachhangservice_Service service = new ws.Khachhangservice_Service();
        ws.Khachhangservice port = service.getKhachhangservicePort();
        port.deleteKhachhang(a);
    }

    private static void update(java.lang.String a, java.lang.String b, java.lang.String c, java.lang.String d, java.lang.String e) {
        ws.Khachhangservice_Service service = new ws.Khachhangservice_Service();
        ws.Khachhangservice port = service.getKhachhangservicePort();
        port.update(a, b, c, d, e);
    }

    private static java.util.List<ws.Khachhangmodel> findKhachhang(java.lang.String a) {
        ws.Khachhangservice_Service service = new ws.Khachhangservice_Service();
        ws.Khachhangservice port = service.getKhachhangservicePort();
        return port.findKhachhang(a);
    }

}
