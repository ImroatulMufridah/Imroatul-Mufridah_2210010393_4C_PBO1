# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pemesanan sebuah toko kue menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama pembeli dan kode kue/pesanan, dan memberikan output berupa informasi detail dari kode kue tersebut seperti jumlah beli, nama kue, dan nomor antrian.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kue`, `KueDetail`, dan `Main` adalah contoh dari class.

```bash
public class Kue {
    ...
}

public class KueDetail extends Kue{
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `kue[i] = new KueDetail(nama, kodeKue);` adalah contoh pembuatan object.

```bash
kue[i] = new KueDetail(nama, kodeKue);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `kodeKue` adalah contoh atribut.

```bash
String nama;
String kodeKue;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Kue` dan `KueDetail`.

```bash
public Kue(String nama, String kodeKue) {
        this.nama = nama;
        this.kodeKue = kodeKue;
}

public KueDetail(String nama, String kodeKue) {
        super(nama, kodeKue);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setKodeKue` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
    }
public void setKodeKue(String kodeKue) {
        this.kodeKue = kodeKue;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getKodeKue`, `getJumlahBeli`, `getJenisKue`, dan `getNomorAntrian` adalah contoh method accessor.

```bash
public String getNama() {
        return nama;
    }
public String getKodeKue() {
        return kodeKue;
    }
"\nJumlah Beli (pcs) : " + getJumlahBeli() +
"\nNama Kue : " + getJenisKue() +
"\nNomor Antrian : " + getNomorAntrian();
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `kodeKue` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String kodeKue;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KueDetail` mewarisi `Kue` dengan sintaks `extends`.

```bash
public class KueDetail extends Kue{
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo(String)` di `Mahasiswa` merupakan overloading method `tampilkanInfo()` dan `tampilkanInfo()` di `KueDetail` merupakan override dari method `tampilkanInfo()` di `Kue`.

```bash
public String tampilkanInfo(double harga){
        return tampilkanInfo() + "\nHarga Kue : " + harga;
    }

 @Override 
    public String tampilkanInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `case` dalam method `getJenisKue` dan seleksi `if` dalam method `getJumlahBeli` dan `getNomorAntrian`.

```bash
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


```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < kue.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.println("Masukkan Pesanan ke " + (i + 1));
System.out.print("Nama Pembeli : ");
System.out.print("Kode Kue (contoh: 20NT34): ");
String kodeKue = scanner.nextLine();

System.out.println("Detail Pesanan ");
System.out.println(data.tampilkanInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `KueDetail[] kue = new KueDetail[2];` adalah contoh penggunaan array.

```bash
KueDetail[] kue = new KueDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
        try { //error handling
            return super.tampilkanInfo() +
                    "\nJumlah Beli (pcs) : " + getJumlahBeli() +
                    "\nNama Kue : " + getJenisKue() +
                    "\nNomor Antrian : " + getNomorAntrian();
        } catch (Exception error) {
            return super.tampilkanInfo() +
                    "\nKesalahan: " + error.getMessage();
        }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Imroatul Mufridah
NPM: 2210010393
