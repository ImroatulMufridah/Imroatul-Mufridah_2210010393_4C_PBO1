package pbo;
public class Kue {
    // atribut dan enkapsulasi
    private String nama;
    private String kodeKue;
    // konstruktor
    public Kue(String nama, String kodeKue) {
        this.nama = nama;
        this.kodeKue = kodeKue;
    }
    // setter (mutator)
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setKodeKue(String kodeKue) {
        this.kodeKue = kodeKue;
    }
    // getter (aksesor)
    public String getNama() {
        return nama;
    }
    public String getKodeKue() {
        return kodeKue;
    }
    // metode untuk menampilkan informasi kue
    public String tampilkanInfo(){
        return "Nama Pembeli : " + getNama() +
                "\nKode Kue : " + getKodeKue();
    }
    // overloading 
    public String tampilkanInfo(double harga){
        return tampilkanInfo() + "\nHarga Kue : " + harga;
    }
}



