package laundryharapanbunda;
import java.util.ArrayList;//harus ada karna untuk membuat array list
/**
 *
 * @author FAM COMPUTINDO
 */
public class Pembeli implements Pengguna {
  private ArrayList<String>namaPembeli=new ArrayList<String>(); //fungsi array list untuk input lebih muda
  private ArrayList<String>alamat=new ArrayList<String>();
  private ArrayList<String>telepon=new ArrayList<String>();//karna dimulai dari 0
  private ArrayList<Integer>saldo=new ArrayList<Integer>();
  
  public int size(){//jumlah indeks
      return this.namaPembeli.size();
  }
  public Pembeli(){//method constractor untuk ototmatis bekerja  Constructor adalah method yg dijalankan ketika inisiasi object pemberian nilai awal object
      //indeks ke-0
      this.namaPembeli.add("Firyal");//add untuk menambahkan indeks
      this.alamat.add("Jl.Danau Ranau IV");
      this.telepon.add("085903121725");
      this.saldo.add(150000);
      //indeks ke-1
      this.namaPembeli.add("Putri");
      this.alamat.add("Jl.Danau Tambingan");
      this.telepon.add("083125679572");
      this.saldo.add(155000);
  }
  public int getId(String nama){
      return this.namaPembeli.indexOf(nama);
  }
  @Override// 
  public void setNama(String nama){ //mutator(setter getter)agar bisa diakses dikelas lain
      this.namaPembeli.add(nama);//biar berfungsi unruk menambahkan nama sifat semu
  }
  @Override//agar interface keluar isi
  public void setAlamat(String alamat){
      this.alamat.add(alamat);
  }
  @Override
  public void setTelepon(String telepon){
      this.telepon.add(telepon);
  }
  public void addSaldo(int Saldo){//nambah saldo
      this.saldo.add(Saldo);
  }
  public void setSaldo(int id,int saldo){//ubah saldo
      this.saldo.set(id,saldo);
  }
  @Override
  public String getNama(int id){//mendapatkan nilai
      return this.namaPembeli.get(id);//kalo ke 0 nanti keluar firyal
  }
  @Override
  public String getAlamat(int id){
      return this.alamat.get(id);//mengembalikan nilai
  }
  @Override
  public String getTelepon(int id){
      return this.telepon.get(id);//mengembalikan nilai
  }
 
  public int getSaldo(int id){
      return this.saldo.get(id);//mengembalikan nilai
  }
  public void tampilPembeli(){//untuk menampilkan kelas pembeli
      int n=this.namaPembeli.size();//jika size berubah maka ini berubah
      for(int i=0;i<n;i++){
          System.out.println("---------------------");
          System.out.println("Nama = "+getNama(i));
          System.out.println("Alamat = "+getAlamat(i));
          System.out.println("Telepon = "+getTelepon(i));
          System.out.println("Saldo = "+getSaldo(i));
      
  }
      
  }
}
