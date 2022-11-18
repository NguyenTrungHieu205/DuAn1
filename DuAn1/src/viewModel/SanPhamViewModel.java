/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModel;

import java.math.BigDecimal;
import java.net.InterfaceAddress;
import model.SanPham;

/**
 *
 * @author phamtuyetnga
 */
public class SanPhamViewModel {

    private String maSp;
    private String tenSp;
    private String phanLoai;
    private String ram;
    private String pin;
    private String dungLuong;
    private String manHinh;
    private Integer soLuong;
    private BigDecimal giaSp;
    private Integer namBH;
    private Integer trangthai;

    public SanPhamViewModel() {
    }

    public SanPhamViewModel(String maSp, String tenSp, String phanLoai, String ram, String pin, String dungLuong, String manHinh, Integer soLuong, BigDecimal giaSp, Integer namBH, Integer trangthai) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.phanLoai = phanLoai;
        this.ram = ram;
        this.pin = pin;
        this.dungLuong = dungLuong;
        this.manHinh = manHinh;
        this.soLuong = soLuong;
        this.giaSp = giaSp;
        this.namBH = namBH;
        this.trangthai = trangthai;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getPhanLoai() {
        return phanLoai;
    }

    public void setPhanLoai(String phanLoai) {
        this.phanLoai = phanLoai;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(String dungLuong) {
        this.dungLuong = dungLuong;
    }

    public String getManHinh() {
        return manHinh;
    }

    public void setManHinh(String manHinh) {
        this.manHinh = manHinh;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getGiaSp() {
        return giaSp;
    }

    public void setGiaSp(BigDecimal giaSp) {
        this.giaSp = giaSp;
    }

    public Integer getNamBH() {
        return namBH;
    }

    public void setNamBH(Integer namBH) {
        this.namBH = namBH;
    }

    public Integer getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(Integer trangthai) {
        this.trangthai = trangthai;
    }

    public String trangThai(){
        if(trangthai == 0){
            return "Online";
        }else if(trangthai == 1){
            return "Offline";
        }else if(trangthai == 2){
            return "Đang chờ hàng về";
        }else{
            return "Hết hàng";
        }
    }

    @Override
    public String toString() {
        return "SanPhamViewModel{" + "maSp=" + maSp + ", tenSp=" + tenSp + ", phanLoai=" + phanLoai + ", ram=" + ram + ", pin=" + pin + ", dungLuong=" + dungLuong + ", manHinh=" + manHinh + ", soLuong=" + soLuong + ", giaSp=" + giaSp + ", namBH=" + namBH + '}';
    }

   
    
}
