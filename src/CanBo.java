public class CanBo {
    private String hoTen;
    private String namSinh;
    private String gioiTinh;
    private String diaChi;

    public CanBo() {
    }

    public CanBo(String hoTen, String namSinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public  void hienThi(){
        System.out.println(" Cán Bộ {"  + " họ tên : " + getHoTen() +
                " năm sinh : " + getNamSinh() +
                " giới tính : " + getGioiTinh() +
                "  địa chỉ : " + getDiaChi() + "}");
    }

}
