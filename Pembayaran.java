package laundryharapanbunda;
import java.util.ArrayList;
/**
 *
 * @author FAM COMPUTINDO
 */
public class Pembayaran { //enkapsulasi untuk information hiding
    private ArrayList <Integer>idPembeli = new ArrayList<Integer>();  // arraylist merupakan tipe data yang memuat banyak nilai  atau value 
    private ArrayList <Integer>idJenisLaundry = new ArrayList<Integer>(); //private merupakan data dan method hnya dpt diakses oleh kelas yg memilikinya
    private ArrayList <Integer> banyak = new ArrayList<Integer>();
   
    public JenisLaundry laundry = new JenisLaundry();//memanggil sesuatu dari jenislaundry
    
    public int size (){ //method
        return this.idPembeli.size();
    }
    public Pembayaran(){//method //public dapat diakses sembarang object
        this.idPembeli.add(12345);//id indeks ke-0 bisa kustom
        this.idPembeli.add(67890);//id indeks ke-1 bisa kustom
        for (int i=0;i<laundry.size();i++){//memanggil indeks array dari jenis laundry 
            this.idJenisLaundry.add(i);//menambah id jenis laundry indeks
        }
    }
    public void setIDPembeli(int id){// setIDPembeli= atribut
        this.idPembeli.add(id);
    }
    public void setIDJenisLaundry(int id){
        this.idJenisLaundry.add(id);
    }
    public void setBanyak(int banyak){
         this.banyak.add(banyak);
    }
    public int getPembeli(int id){ //accesor getter untuk mengambil data
        return this.idPembeli.indexOf(id);
    }
    public int getIDPembeli(int id){//ini menampilkan indeks sedangkan indeksOf menampilkan isi ("Fonda"=0)
        return this.idPembeli.get(id);
    }
    public int getIDJenisLaundry(int id){
        return this.idJenisLaundry.get(id);
    }
    public int getIDBanyak(int id){
        return this.banyak.get(id);
    }
}
