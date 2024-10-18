/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import view.them_donhang_view;
import view.xuat_hoadon_view;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import ws.Donhang;
import ws.DonhangDetail;
import ws.Sanpham;

/**
 *
 * @author DELL
 */
public class them_don_hang_controller {

   
    private Sanpham m;
    protected them_donhang_view view;
    private xuat_hoadon_view hoadon;
    DonhangDetail DonhangDetail;
    private Donhang Donhang;
    int k = 0;
    int k1 = 0;
    int conlai;
    PreparedStatement ps, ps1;
    ResultSet rs, rs1;
    int soluong;
    Double gia;
    Double thanhtien;
    PDDocument doc = null;
    PDPage page = null;
    List<Sanpham> arr_sp = null;
    List<DonhangDetail> arr = null;
    int i = 0;

    public them_don_hang_controller() {
        
        hoadon = new xuat_hoadon_view();
        hoadon.setVisible(false);
        view = new them_donhang_view();
        arr = new ArrayList<>();
//            view.action_tang_soluong(new them_donhang_controller.tang_sl());
//            view.action_giam_soluong(new them_donhang_controller.giam_sl());
        view.action_tim(new search());
        
        click_table();
        click_table_sp();
        load();
        hoadon.action_xacnhan(new xacnhan());
        hoadon.action_huy(new huy());
        hoadon.action_tang_soluong(new tang_sl());
        hoadon.action_giam_soluong(new giam_sl());
        view.action_thanhtoan(new thanhtoan());
        hoadon.action_xoa(new delete());
//         

    }

   

    public void load() {
        
        arr_sp = getAllSanpham();
        int i = 0;
        view.model.setRowCount(0);

        for (Sanpham n1 : arr_sp) {
            i++;
            view.model.addRow(new Object[]{n1.getMasp(), n1.getTensp(), n1.getAnh(), n1.getMota(), n1.getGia()});

        }
    }

    class search implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            arr_sp = new ArrayList<>();
            load();
        }

    }

    
    public void ktra_Arraylist(){
        if (arr.isEmpty()) {
            hoadon.lb_tenkhachhang.setEditable(true);
            hoadon.lb_madon.setEnabled(true);
        } else {
            hoadon.lb_tenkhachhang.setEnabled(false);
            hoadon.lb_madon.setEnabled(false);
        }
    }
    public void click_table() {

        view.table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                  ktra_Arraylist();
                k1 = view.table.getSelectedRow();
                Sanpham nv1 = arr_sp.get(k1);
                hoadon.setVisible(true);
                hoadon.delete.setEnabled(false);
                view.setVisible(false);
                hoadon.lb_tensanpham.setText(nv1.getTensp());
                hoadon.lb_masp.setText(nv1.getMasp());
                hoadon.duongdananh = nv1.getAnh();
                hoadon.hinhanh.setIcon(hoadon.set_anh(hoadon.duongdananh));
                hoadon.lb_gia.setText(nv1.getGia() + "");
                hoadon.lb_mota.setText(nv1.getMota());
                hoadon.lb_soluong.setText("1");
                tinhtien();
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

            private void Display(int k, String tenkhachhang) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    public void click_table_sp() {

        view.table_sp.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
              
                k = view.table_sp.getSelectedRow();
                DonhangDetail nv1 = arr.get(k);

                hoadon.setVisible(true);
                hoadon.delete.setEnabled(true);
                hoadon.lb_tensanpham.setText(nv1.getTensanpham());
                hoadon.lb_masp.setText(nv1.getMasanpham());

                hoadon.duongdananh = nv1.getHinhanh();
                hoadon.hinhanh.setIcon(hoadon.set_anh(hoadon.duongdananh));
                hoadon.lb_gia.setText(nv1.getGia() + "");
                hoadon.lb_tenkhachhang.setText(nv1.getTenkhachhang());
                hoadon.lb_madon.setText(nv1.getMadon());
                hoadon.lb_soluong.setText(nv1.getSoluong() + "");
                
                hoadon.lb_thanhtien.setText(nv1.getTongtien()+"");
                tinhtien();
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

            private void Display(int k, String tenkhachhang) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    class tang_sl implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            hoadon.soluong = Integer.parseInt(hoadon.lb_soluong.getText());
            hoadon.soluong = hoadon.soluong + 1;
            hoadon.lb_soluong.setText(hoadon.soluong + "");
            tinhtien();
        }

    }

    class giam_sl implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int k = Integer.parseInt(hoadon.lb_soluong.getText());
            if (k == 0) {
                hoadon.showMessage("Không thể giảm số lượng sản phẩm");
            } else {
                hoadon.soluong = view.soluong - 1;
                hoadon.lb_soluong.setText(view.soluong + "");
            }
            tinhtien();

        }

    }

    public void tinhtien() {
        hoadon.soluong = Integer.parseInt(hoadon.lb_soluong.getText());
        hoadon.gia = Double.parseDouble(hoadon.lb_gia.getText());
        hoadon.thanhtien = hoadon.soluong * hoadon.gia;
        hoadon.lb_thanhtien.setText(hoadon.thanhtien + "");
    }

    public void load_sp() {
        view.model_sp.setRowCount(0);
        for (DonhangDetail s : arr) {
            i++;
            view.model_sp.addRow(new Object[]{i, s.getMadon(), s.getTenkhachhang(), s.getTensanpham(), s.getGia(), s.getSoluong()});
        }
        view.thanhtien.setText("Tổng hoá đơn: " + thanhtien(arr));

    }
    public boolean check_soluongsp()  {
        Sanpham nv1 = arr_sp.get(k1);
        int  a =0;
        List<Sanpham> ar_sp1 = checkSoluong(nv1.getMasp());
        for (Sanpham s : ar_sp1) {
            a= s.getSoluong();
        }
        if (a == 0) {
            hoadon.showMessage("Hết hàng");
            i = 1;

            } else if (a < Integer.parseInt(hoadon.lb_soluong.getText())) {
                hoadon.showMessage("số lượng vượt quá số lượng hàng trong kho");
                i = 2;
            } else {
                i = 0;
            }
            switch (i) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return true;
        }
    }
    public boolean NotNull(){
         if(hoadon.lb_tenkhachhang.getText().equals("")){
             hoadon.showMessage("Không để trống dữ liệu");
             return false;
         }
          if(hoadon.lb_madon.getText().equals("")){
             hoadon.showMessage("Không để trống dữ liệu");
             return false;
         }
         return true;
     }

    class xacnhan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (ktTrung(hoadon.lb_madon.getText())&& check_soluongsp()&& NotNull()) {
                view.setVisible(true);
                    hoadon.setVisible(false);
                    DonhangDetail = new DonhangDetail();
                    DonhangDetail.setTenkhachhang(hoadon.lb_tenkhachhang.getText());
                    DonhangDetail.setTensanpham(hoadon.lb_tensanpham.getText());            
                    DonhangDetail.setMasanpham(hoadon.lb_masp.getText());
                    DonhangDetail.setHinhanh(hoadon.duongdananh);            
                    DonhangDetail.setMadon(hoadon.lb_madon.getText());
                    DonhangDetail.setSoluong(Integer.parseInt(hoadon.lb_soluong.getText()));            
                    
                    DonhangDetail.setGia(Double.parseDouble(hoadon.lb_gia.getText())); 
                     DonhangDetail.setTongtien(Double.parseDouble(hoadon.lb_thanhtien.getText()));  
                    arr.add(DonhangDetail);
                    load_sp();
            }

        }

    }

    class huy implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setVisible(true);
            hoadon.setVisible(false);
        }

    }

    public void xoa(int k) {

        arr.remove(k);
        load_sp();
        hoadon.setVisible(false);
        view.setVisible(true);

    }

    class delete implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            xoa(k);

        }

    }

    class thanhtoan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                insertDonhang(hoadon.lb_madon.getText(), hoadon.lb_tenkhachhang.getText(), thanhtien(arr));

                for (DonhangDetail s : arr) {
                    insertDonhangdetail(s.getMadon(), s.getMasanpham(), s.getSoluong(), s.getGia());
                }
                   
                

                for (DonhangDetail s : arr) {
                    updateSoluong(s.getMasanpham(), s.getSoluong());
                }

                view.showMessage("Thanh toán thành công !");
                xuatfile_PDF();
            } catch (IOException ex) {
                Logger.getLogger(them_don_hang_controller.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        private void xuatfile_PDF() throws IOException {
           PDDocument doc = new PDDocument();
            PDPage page = new PDPage();

            doc.addPage(page);
            PDFont font = PDType0Font.load(doc, new File("D:\\neatbenas\\Ojuju-VariableFont_wght.ttf"));
            PDPageContentStream content = new PDPageContentStream(doc, page);

            content.beginText();
            content.setFont(font, 14);
            content.setNonStrokingColor(Color.BLACK);
            content.setLeading(16.0f);
            content.newLineAtOffset(28, page.getTrimBox().getHeight()-28);

            content.showText("NEW FASHION");
            content.newLine();
            content.showText("_________________________________________________________________");
            content.newLine();
                for(DonhangDetail m: arr){
                    
                    content.showText("Tên khách hàng:" +""+m.getTenkhachhang());
                    content.newLine();
                    
                    content.showText("Tên sản phẩm:" +""+m.getTensanpham());
                    content.newLine();
                    content.showText("Giá:" +""+m.getGia());
                    content.newLine();
                    content.showText("số lượng:" +""+m.getSoluong());
                    content.newLine();
                    content.showText("Thành tiền:" +""+m.getTongtien());
                    content.newLine();
                    content.showText("_________________________________________________________________");
                    content.newLine();
                }
                    content.showText("Tổng hóa đơn: "+ hoadon.thanhtien);
                    content.newLine();
                content.showText("Cảm ơn bạn đã mua hàng của chúng tôi");
            content.endText();
            content.close();

            doc.save("D:\\neatbenas\\pdf_with_text.pdf");
            doc.close();
        }

    }

    public Double thanhtien(List<DonhangDetail> arr) {
        Double k = 0.0;
        for (DonhangDetail s : arr) {
            k = k + s.getTongtien();
        }
        return k;
    }

    public static void main(String[] args) {
        them_don_hang_controller m = new them_don_hang_controller();
    }

    private static java.util.List<ws.Sanpham> checkSoluong(java.lang.String a) {
        ws.Donhangservice_Service service = new ws.Donhangservice_Service();
        ws.Donhangservice port = service.getDonhangservicePort();
        return port.checkSoluong(a);
    }

    private static void insertDonhang(java.lang.String a, java.lang.String b, double c) {
        ws.Donhangservice_Service service = new ws.Donhangservice_Service();
        ws.Donhangservice port = service.getDonhangservicePort();
        port.insertDonhang(a, b, c);
    }

    private static void insertDonhangdetail(java.lang.String a, java.lang.String b, int c, double d) {
        ws.Donhangservice_Service service = new ws.Donhangservice_Service();
        ws.Donhangservice port = service.getDonhangservicePort();
        port.insertDonhangdetail(a, b, c, d);
    }

    private static boolean ktTrung(java.lang.String a) {
        ws.Donhangservice_Service service = new ws.Donhangservice_Service();
        ws.Donhangservice port = service.getDonhangservicePort();
        return port.ktTrung(a);
    }

    private static void updateSoluong(java.lang.String a, int b) {
        ws.Donhangservice_Service service = new ws.Donhangservice_Service();
        ws.Donhangservice port = service.getDonhangservicePort();
        port.updateSoluong(a, b);
    }

    private static java.util.List<ws.Sanpham> getAllSanpham() {
        ws.SanphamWebService_Service service = new ws.SanphamWebService_Service();
        ws.SanphamWebService port = service.getSanphamWebServicePort();
        return port.getAllSanpham();
    }
    
}
