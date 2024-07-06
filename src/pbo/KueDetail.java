package pbo;
public class KueDetail extends Kue{
    
    public KueDetail(String nama, String kodeKue) {
        super(nama, kodeKue);
    }
    public int getJumlahBeli() throws Exception {
        int jml = Integer.parseInt(getKodeKue().substring(0,2));
        if (jml > 50) {
            throw new Exception("Maksimal Pembelian 50 pcs");
        }
        return jml;
    }
    public String getJenisKue() {
        String kodeJenis = getKodeKue().substring(2, 4);
        switch (kodeJenis) {
            case "NT":
                return "Nastar";
            case "KT":
                return "Kastangel";
            default:
                return "Jenis kue tidak diketahui.";
        }
    }
    public int getNomorAntrian() throws Exception {
        int nmr = Integer.parseInt(getKodeKue().substring(4));
        if (nmr > 50) {
            throw new Exception("Nomor antrian tidak sesuai");
        }
        return nmr;
    }
    // override 
    @Override 
    public String tampilkanInfo() {
        try { //error handling
            return super.tampilkanInfo() +
                    "\nJumlah Beli (pcs) : " + getJumlahBeli() +
                    "\nNama Kue : " + getJenisKue() +
                    "\nNomor Antrian : " + getNomorAntrian();
        } catch (Exception error) {
            return super.tampilkanInfo() +
                    "\nKesalahan: " + error.getMessage();
        }
    }
}


