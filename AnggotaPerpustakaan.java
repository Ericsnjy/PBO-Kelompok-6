
package tugaspbo_kel6;

import java.util.ArrayList;
import java.util.List;


public class AnggotaPerpustakaan extends Notifikasi {
    private String nama;
    private int nomorAnggota;
    private String alamat;
    private List<TransaksiPeminjaman> riwayatPeminjaman;

    public AnggotaPerpustakaan(String nama, int nomorAnggota, String alamat) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.alamat = alamat;
        this.riwayatPeminjaman = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public int getNomorAnggota() {
        return nomorAnggota;
    }

    public String getAlamat() {
        return alamat;
    }

    public List<TransaksiPeminjaman> getRiwayatPeminjaman() {
        return riwayatPeminjaman;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomorAnggota(int nomorAnggota) {
        this.nomorAnggota = nomorAnggota;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setRiwayatPeminjaman(List<TransaksiPeminjaman> riwayatPeminjaman) {
        this.riwayatPeminjaman = riwayatPeminjaman;
    }
    
    
    public void pinjamBuku(Buku buku, TransaksiPeminjaman transaksi) {
        transaksi.setAnggota(this);
        transaksi.setBuku(buku);
        transaksi.catatPeminjaman();
        riwayatPeminjaman.add(transaksi);
    }

    public void kembalikanBuku(Buku buku, TransaksiPengembalian transaksi) {
        transaksi.setAnggota(this);
        transaksi.setBuku(buku);
        transaksi.catatPengembalian();
    }

    public void lihatRiwayatPeminjaman() {
    System.out.println("Riwayat Peminjaman untuk Anggota: " + nama);
    if (!riwayatPeminjaman.isEmpty()) {
        riwayatPeminjaman.stream().forEach((transaksi) -> {
            System.out.println(transaksi);
        });
    
    }else{
    System.out.println("Tidak ada riwayat peminjaman.");
    }

  }
}

