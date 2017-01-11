package com.example.thanhthuy.myapplication;

/**
 * Created by THANHTHUY on 1/10/2017.
 */

public class NhanVien {
    private String tenNhanVien;
    private Integer tuoiNhanVien;

    public  NhanVien(){
        this.tenNhanVien = "";
        this.tuoiNhanVien = 0;
    }
    public NhanVien(String tenNhanVien, Integer tuoiNhanVien) {
        this.tenNhanVien = tenNhanVien;
        this.tuoiNhanVien = tuoiNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public Integer getTuoiNhanVien() {
        return tuoiNhanVien;
    }

    public void setTuoiNhanVien(Integer tuoiNhanVien) {
       // this.tuoiNhanVien = tuoiNhanVien;
        if(tuoiNhanVien <= 24)
            this.tuoiNhanVien = 24;
        else
            this.tuoiNhanVien = tuoiNhanVien;
    }
}
