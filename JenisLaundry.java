package laundryharapanbunda;
import java.util.ArrayList;

/**
 *
 * @author FAM COMPUTINDO
 */
public class JenisLaundry {
    private ArrayList<String>jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer>harga = new ArrayList<Integer>();//menggunakan int karna dimulai tdk dri 0
    private ArrayList<Integer>waktu = new ArrayList<Integer>();
    
    public int size(){//jumlah indeks sesuai dgn jenis laundry = 3
        return this.jenisLaundry.size();
    }
    public JenisLaundry(){
        this.jenisLaundry.add("Cuci Basah");
        this.harga.add(2000);
        this.waktu.add(60);
        
        this.jenisLaundry.add("Cuci Kering");
        this.harga.add(3000);
        this.waktu.add(70);
        
        this.jenisLaundry.add("Cuci Setrika");
        this.harga.add(6000);
        this.waktu.add(90);
    }
    public void setLaundry(String jenis){
        this.jenisLaundry.add(jenis);//memanggil atribut kelas trsbt dlm kls ini saja kalo super digunakan untuk memanggil dikelas superclass
    }
     public void setHarga(int harga){
        this.harga.add(harga);//memanggil atribut kelas trsbt dlm kls ini saja kalo super digunakan untuk memanggil dikelas superclass
    }
      public void setWaktu(int waktu){
        this.waktu.add(waktu);//memanggil atribut kelas trsbt dlm kls ini saja kalo super digunakan untuk memanggil dikelas superclass
    }
      public String getLaundry(int id){
          return this.jenisLaundry.get(id);//mengembalikan nilai
    }
      public int getHarga(int id){
          return this.harga.get(id);//kalau diisi 0 maka keluar cuci basah
    }
    public int getWaktu(int id){
        return this.waktu.get(id);//mengembalikan nilai
    }
}
