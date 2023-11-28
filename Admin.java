
package tugaspbo_kel6;

import java.util.Scanner;

class Admin {
    private String laporan;

    public Admin() {
        this.laporan = "";
    }
    

    public void kelolaAnggota() {
        System.out.println("Mengelola Anggota...");
    }

    public void kelolaBuku() {
        
        System.out.println("Mengelola Buku...");
    }

    public void buatLaporan() {
        System.out.println("Membuat Laporan...");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan laporan: ");
        laporan = scanner.nextLine();

        System.out.println("Laporan berhasil dibuat.");
    }

    public String getLaporan() {
        return laporan;
    }

    public void setLaporan(String laporan) {
        this.laporan = laporan;
    }
    
}
