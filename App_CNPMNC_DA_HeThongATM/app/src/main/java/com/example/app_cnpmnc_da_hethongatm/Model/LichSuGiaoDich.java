package com.example.app_cnpmnc_da_hethongatm.Model;

import java.io.Serializable;

public class LichSuGiaoDich implements Serializable {
    private String GioGiaoDich;
    private String NgayGiaoDich;
    private String NoiDungChuyenKhoan;
    private long SoTaiKhoan;
    private long SoTienGiaoDich;
    private long TaiKhoanNhan;

    public LichSuGiaoDich(){

    }
    public LichSuGiaoDich(String gioGiaoDich, String ngayGiaoDich, String noiDungChuyenKhoan, long soTaiKhoan, long soTienGiaoDich, long taiKhoanNhan) {
        GioGiaoDich = gioGiaoDich;
        NgayGiaoDich = ngayGiaoDich;
        NoiDungChuyenKhoan = noiDungChuyenKhoan;
        SoTaiKhoan = soTaiKhoan;
        SoTienGiaoDich = soTienGiaoDich;
        TaiKhoanNhan = taiKhoanNhan;
    }
    public String getGioGiaoDich() {
        return GioGiaoDich;
    }

    public void setGioGiaoDich(String gioGiaoDich) {
        GioGiaoDich = gioGiaoDich;
    }

    public String getNgayGiaoDich() {
        return NgayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        NgayGiaoDich = ngayGiaoDich;
    }

    public String getNoiDungChuyenKhoan() {
        return NoiDungChuyenKhoan;
    }

    public void setNoiDungChuyenKhoan(String noiDungChuyenKhoan) {
        NoiDungChuyenKhoan = noiDungChuyenKhoan;
    }

    public long getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        SoTaiKhoan = soTaiKhoan;
    }

    public long getSoTienGiaoDich() {
        return SoTienGiaoDich;
    }

    public void setSoTienGiaoDich(long soTienGiaoDich) {
        SoTienGiaoDich = soTienGiaoDich;
    }

    public long getTaiKhoanNhan() {
        return TaiKhoanNhan;
    }

    public void setTaiKhoanNhan(long taiKhoanNhan) {
        TaiKhoanNhan = taiKhoanNhan;
    }
}
