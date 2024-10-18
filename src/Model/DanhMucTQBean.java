/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class DanhMucTQBean {
    private String kind;
    private JPanel jpn;
    private JPanel jpn1;
    private JLabel jlb;

    public DanhMucTQBean() {
    }

    public DanhMucTQBean(String kind, JPanel jpn, JPanel jpn1,JLabel jlb) {
        this.kind = kind;
        this.jpn = jpn;
        this.jpn1 = jpn1;
        this.jlb = jlb;
    }

    public String getKind() {
        return kind;
    }

    public JPanel getJpn() {
        return jpn;
    }

    public JPanel getJpn1() {
        return jpn1;
    }

    public JLabel getJlb() {
        return jlb;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setJpn(JPanel jpn) {
        this.jpn = jpn;
    }

    public void setJpn1(JPanel jpn1) {
        this.jpn1 = jpn1;
    }

    public void setJlb(JLabel jlb) {
        this.jlb = jlb;
    }

   
}
