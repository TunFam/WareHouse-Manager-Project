/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
import view.nhanvienview;
import ws.Nhanvien;

/**
 *
 * @author Admin
 */
public final class nhanviencontroller {

    int k = 0;

    nhanvienview n;
    List<Nhanvien> arr;
    FileOutputStream fos = null;
    BufferedOutputStream bos = null;
    XSSFWorkbook excel = null;

    public nhanviencontroller(nhanvienview n) {
        this.n = n;
    }

    public nhanviencontroller() {
        n = new nhanvienview();
        arr = new ArrayList<>();
        n.action_add(new add());
        n.action_edit(new edit());
        n.action_delete(new delete());
        n.action_save(new save());
        n.action_tim(new search());
        n.action_xuatfile(new xuatfile());
        load();
        click_table();
        chucvu();
    }

    public JPanel getPanel() {
        return n;
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
            int i = 1;
            if (n.cbogioitinh.getSelectedItem().equals("nam")) {
                i = 0;
            }

            updateNv(n.t_ma.getText(), n.t_ten.getText(), n.t_ngaysinh.getText(), i, n.t_diachi.getText(), n.t_dienthoai.getText(), (String) n.cbochucvu.getSelectedItem(), Double.parseDouble(n.t_luong.getText()));
            load();
            JOptionPane.showMessageDialog(n, "sửa thành công");
            n.xoatrang();
        }

    }

    class delete implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String ma = n.t_ma.getText();
            deleteNv(ma);
            load();
            JOptionPane.showMessageDialog(n, "Xóa thành công");
            n.xoatrang();
        }

    }

    class save implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (check_null()) {
                JOptionPane.showMessageDialog(n, "Vui lòng nhập đủ thông tin");
            }else if (kt(n.t_ma.getText()) == true) {
                JOptionPane.showMessageDialog(n, "mã đã tồn tại");
            } else {

                int i = 1;
                if (n.cbogioitinh.getSelectedItem().equals("nam")) {
                    i = 0;
                }

                insertNv(n.t_ma.getText(), n.t_ten.getText(), n.t_ngaysinh.getText(), i, n.t_diachi.getText(), n.t_dienthoai.getText(), (String) n.cbochucvu.getSelectedItem(), Double.parseDouble(n.t_luong.getText()));
                load();
                JOptionPane.showMessageDialog(n, "Thêm thành công");
                n.xoatrang();

            }

        }

    }

    class search implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            arr = new ArrayList<Nhanvien>();
            arr = find(n.tim.getText());
            int i = 0;
            n.model.setRowCount(0);
            for (Nhanvien c : arr) {
                i++;
                n.model.addRow(new Object[]{i, c.getManhanvien(), c.getTennhanvien(), c.getNgaysinh(), c.getGioitinh() == 0 ? "Nam" : "Nữ", c.getDiachi(), c.getDienthoai(), c.getChucvu(), c.getLuong()});
            }
        }

    }

    public boolean kt(String a) {
        boolean t = false;
        arr = getData();
        for (Nhanvien n1 : arr) {
            t = n1.getManhanvien().equals(a);
        }
        return t;
    }

    public boolean check_null() {
        boolean t = false;
        t = n.t_ma.getText().equals("") || n.t_ten.getText().equals("") || n.t_ngaysinh.getText().equals("") || n.t_dienthoai.getText().equals("") || n.t_luong.getText().equals("");
        return t;
    }

    public void load() {

        arr = getData();
        int i = 0;
        n.model.setRowCount(0);
        for (Nhanvien c : arr) {
            i++;
            n.model.addRow(new Object[]{i, c.getManhanvien(), c.getTennhanvien(), c.getNgaysinh(), c.getGioitinh() == 0 ? "Nam" : "Nữ", c.getDiachi(), c.getDienthoai(), c.getChucvu(), c.getLuong()});
        }
    }

    public void chucvu() {

    }

    public void click_table() {

        n.table1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                k = n.table1.getSelectedRow();

                String gioitinh = n.table1.getValueAt(k, 4).toString();

                String chucvu = n.table1.getValueAt(k, 7).toString();
                Nhanvien nv1 = new Nhanvien();
                nv1 = arr.get(k);
                n.t_ma.setText(nv1.getManhanvien());
                n.t_ten.setText(nv1.getTennhanvien());
                n.t_ngaysinh.setText(nv1.getNgaysinh());
                n.t_diachi.setText(nv1.getDiachi());
                n.t_dienthoai.setText(nv1.getDienthoai());
                n.t_luong.setText(nv1.getLuong() + "");
                int i = 0;
                while (true) {
                    String s = "";
                    s = n.cbogioitinh.getItemAt(i).toString();
                    if (s.equalsIgnoreCase(gioitinh)) {
                        n.cbogioitinh.setSelectedIndex(i);
                        break;
                    }
                    i++;
                }

                int m = 0;
                while (true) {
                    String s = "";
                    s = n.cbochucvu.getItemAt(m).toString();
                    if (s.equalsIgnoreCase(chucvu)) {
                        n.cbochucvu.setSelectedIndex(m);
                        break;
                    }
                    m++;
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

    private static java.util.List<ws.Nhanvien> getData() {
        ws.NhanvienService_Service service = new ws.NhanvienService_Service();
        ws.NhanvienService port = service.getNhanvienServicePort();
        return port.getData();
    }

    private static void deleteNv(java.lang.String a) {
        ws.NhanvienService_Service service = new ws.NhanvienService_Service();
        ws.NhanvienService port = service.getNhanvienServicePort();
        port.deleteNv(a);
    }

    private static void insertNv(java.lang.String a, java.lang.String b, java.lang.String c, int d, java.lang.String e, java.lang.String g, java.lang.String h, double k) {
        ws.NhanvienService_Service service = new ws.NhanvienService_Service();
        ws.NhanvienService port = service.getNhanvienServicePort();
        port.insertNv(a, b, c, d, e, g, h, k);
    }

    private static void updateNv(java.lang.String a, java.lang.String b, java.lang.String c, int d, java.lang.String e, java.lang.String g, java.lang.String h, double k) {
        ws.NhanvienService_Service service = new ws.NhanvienService_Service();
        ws.NhanvienService port = service.getNhanvienServicePort();
        port.updateNv(a, b, c, d, e, g, h, k);
    }

    private static java.util.List<ws.Nhanvien> find(java.lang.String a) {
        ws.NhanvienService_Service service = new ws.NhanvienService_Service();
        ws.NhanvienService port = service.getNhanvienServicePort();
        return port.find(a);
    }

}
