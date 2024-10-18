package Controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import view.allview;
import view.donhangview;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import ws.Donhang;
import ws.DonhangDetail;


/**
 *
 * @author DELL
 */
public class donhang_controller {
    private Donhang m;
    private DonhangDetail detail;
    private allview view;
    private them_don_hang_controller add;
    donhangview donhangview;
    int k=0;
     List<Donhang> arr_donhang = null;
      List<DonhangDetail> arr_DonhangDetail = null;
    public donhang_controller(){
       
            view = new allview();
            detail = new DonhangDetail();
            load_right();
            click_table_right();
            click_table_left();
            view.action_tim(new search());
            
            view.action_them_donhang(new themdonhang());
            view.action_delete(new delete());
    }
    
    
    public void load_right(){
        arr_donhang=getAllDonhang();
        int i=0;
        view.model.setRowCount(0);
        
        for(Donhang n1: arr_donhang){
            i++;
            view.model.addRow(new Object[]{i,n1.getMadon(),n1.getTenkhachhang(),n1.getTongtien(),n1.getTime()});
        }
    }
    public JPanel getJpanel(){
        return view;
    }
    public void load_left(String a){
      
        arr_DonhangDetail = getAllDonhangdetail(a);
        int i=0;
        view.model1.setRowCount(0);
        for(DonhangDetail n1: arr_DonhangDetail){
            i++;
            view.model1.addRow(new Object[]{i,n1.getMasanpham(),n1.getTensanpham(),n1.getGia(),n1.getSoluong()});
        }
    }

    class search implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            arr_donhang = new ArrayList<>();
            load_right();
        }

    }
    class load_all implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            donhang_controller m = new donhang_controller();
        }

    }
    class delete implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Donhang nv1 = arr_donhang.get(k);
            delete(nv1.getMadon());
            load_right();
        }

    }
    
      public void click_table_right() {

        view.table_right.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                k = view.table_right.getSelectedRow();
                Donhang nv1 = arr_donhang.get(k);
                view.lb_tenkhachhang.setText(nv1.getTenkhachhang());
                view.lb_madon.setText(nv1.getMadon());
                load_left(nv1.getMadon());
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
      public void click_table_left() {

        view.table_left.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                k = view.table_left.getSelectedRow();
                donhangview = new donhangview();
                donhangview.setVisible(true);
                DonhangDetail nv1 = arr_DonhangDetail.get(k);
                donhangview.lb_masp.setText(nv1.getMasanpham());
                donhangview.lb_tensanpham.setText(nv1.getTensanpham());
                donhangview.lb_gia.setText(nv1.getGia()+"");
                donhangview.lb_soluong.setText(nv1.getSoluong()+"");
                donhangview.thanhtien = nv1.getSoluong()* nv1.getGia();
                donhangview.lb_thanhtien.setText(donhangview.thanhtien+"");
                 donhangview.duongdananh =nv1.getHinhanh();
                 donhangview.hinhanh.setIcon(donhangview.set_anh(donhangview.duongdananh));
               
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
      
       class themdonhang implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           add= new them_don_hang_controller();
        }

    }
    public static void main(String[] args) {
        donhang_controller c = new donhang_controller();
    }

   
   
    private static void delete(java.lang.String a) {
        ws.Donhangservice_Service service = new ws.Donhangservice_Service();
        ws.Donhangservice port = service.getDonhangservicePort();
        port.delete(a);
    }

    private static java.util.List<ws.Donhang> getAllDonhang() {
        ws.Donhangservice_Service service = new ws.Donhangservice_Service();
        ws.Donhangservice port = service.getDonhangservicePort();
        return port.getAllDonhang();
    }

    private static java.util.List<ws.DonhangDetail> getAllDonhangdetail(java.lang.String a) {
        ws.Donhangservice_Service service = new ws.Donhangservice_Service();
        ws.Donhangservice port = service.getDonhangservicePort();
        return port.getAllDonhangdetail(a);
    }
    
}
