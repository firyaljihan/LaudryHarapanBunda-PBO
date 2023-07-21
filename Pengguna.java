//untuk implements pada kelas pembeli dan karywan
package laundryharapanbunda;

public interface Pengguna { 
    public void setNama(String nama); //
    public void setAlamat(String alamat);
    public void setTelepon(String telepon);
    
    public String getNama(int id);
    public String getAlamat(int id);
    public String getTelepon(int id);
}







//Object adalah implementasi dari kelas
//Class adalah deskripsi
//Variabel adalah item yang digunakan data untuk menyimpan pernyataan objek (String_nama)
//Method adalah aksi trhdp atribut(ada proses)
//atribut adalah bagian bagian class (tidak ada proses)
//Constructor adalah method dimana seluruh inisialisasi object ditempatkan
