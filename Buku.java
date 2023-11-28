
package tugaspbo_kel6;


public class Buku {
    private String judul;
    private String pengarang;
    private String nomorISBN;
    private String statusKetersediaan;

    public Buku(String judul, String pengarang, String nomorISBN) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.nomorISBN = nomorISBN;
        this.statusKetersediaan = "Tersedia";
    }

    public void informasiBuku() {
        System.out.println("Informasi Buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Nomor ISBN: " + nomorISBN);
    }

    public void cekKetersediaan() {
        System.out.println("Status Ketersediaan: " + statusKetersediaan);
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getNomorISBN() {
        return nomorISBN;
    }

    public String getStatusKetersediaan() {
        return statusKetersediaan;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setNomorISBN(String nomorISBN) {
        this.nomorISBN = nomorISBN;
    }

    public void setStatusKetersediaan(String statusKetersediaan) {
        this.statusKetersediaan = statusKetersediaan;
    }

}
