/*  Fiby Naya Sari
    227064516076
    Nadya Mahza Khairani
    227064516102
 */
package gaji;
public class Main {
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();
        karyawan.karyawan("227064516076", "Fiby Naya Sari", "Perempuan");
        karyawan.jmlHari = 4;
        karyawan.absenKerja();
        karyawan.hitungGaji(26);
        karyawan.hitungGaji();
        System.out.println();

        Dosen dosen = new Dosen();
        dosen.karyawan("227064516102", "Nadya Mahza Khairani", "Perempuan");
        dosen.gol = "golongan 1";
        dosen.jmlSks = 18;
        dosen.upahPerSks = 50000;
        dosen.jmlHari = 15;
        dosen.absenKerja();
        dosen.hitungGaji(15);
        dosen.hitungGaji();
        System.out.println();

        Staff staff = new Staff();
        staff.karyawan("227064516069", "Celah Cailah", "Perempuan");
        staff.jmlHari = 5;
        staff.absenKerja();
        staff.hitungGaji(25);
        staff.hitungGaji();
    }    
}