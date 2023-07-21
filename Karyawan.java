package laundryharapanbunda;
import java.util.ArrayList;
/**
 *
 * @author FAM COMPUTINDO
 */
public class Karyawan implements Pengguna {
    private ArrayList<String> namaKaryawan = new ArrayList<String>(); //enkapsulasi private dimana hanya bisa diakses oleh class itu sendiri
    private ArrayList<String> alamat= new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
      // atribut : namaKaryawan, alamat, telepon, jabatan
      public Karyawan(){//menampilkan karywan => method
          this.namaKaryawan.add("Administrator X");//memanggil atribut kelas trsbt dlm kls ini saja kalo super digunakan untuk memanggil dikelas superclass
          this.alamat.add("Malang");//memanggil atribut kelas trsbt dlm kls ini saja kalo super digunakan untuk memanggil dikelas superclass
          this.telepon.add("087563219541");//memanggil atribut kelas trsbt dlm kls ini saja kalo super digunakan untuk memanggil dikelas superclass
          this.jabatan.add(0);//memanggil atribut kelas trsbt dlm kls ini saja kalo super digunakan untuk memanggil dikelas superclass
          
          this.namaKaryawan.add("Administrator Z");//memanggil atribut kelas trsbt dlm kls ini saja kalo super digunakan untuk memanggil dikelas superclass
          this.alamat.add("Sidoarjo");//memanggil atribut kelas trsbt dlm kls ini saja kalo super digunakan untuk memanggil dikelas superclass
          this.telepon.add("082134691052");//memanggil atribut kelas trsbt dlm kls ini saja kalo super digunakan untuk memanggil dikelas superclass
          this.jabatan.add(1);//memanggil atribut kelas trsbt dlm kls ini saja kalo super digunakan untuk memanggil dikelas superclass
      }
      @Override
      public void setNama(String nama){  //pararmeter 
          this.namaKaryawan.add(nama);//memanggil atribut kelas trsbt dlm kls ini saja kalo super digunakan untuk memanggil dikelas superclass
      }
      @Override
      public void setAlamat(String nama){ //method
          this.alamat.add(nama);//memanggil atribut kelas trsbt dlm kls ini saja kalo super digunakan untuk memanggil dikelas superclass
      }
      @Override
      public void setTelepon(String nama){
          this.telepon.add(nama);//memanggil atribut kelas trsbt dlm kls ini saja kalo super digunakan untuk memanggil dikelas superclass
      }
      @Override
      public String getNama(int id){
          return this.namaKaryawan.get(id); //return untuk mengembalikan nilai awal
      }
      @Override
      public String getAlamat(int id){
          return this.alamat.get(id);//return untuk mengembalikan nilai awal
      }
      @Override
      public String getTelepon(int id){
          return this.telepon.get(id);
      }
      public int getJabatan(int id){
          return this.jabatan.get(id);//return untuk mengembalikan nilai awal
      }
      public void setJabatan(int jabatan){
          this.jabatan.add(jabatan);//memanggil atribut kelas trsbt dlm kls ini saja kalo super digunakan untuk memanggil dikelas superclass
      }
      public void tampilKaryawan(){//menampilkan semua petugas
          int n= this.namaKaryawan.size();//hitung jumlah indeks
          for(int i=0;i<n;i++){ //nampilkan nama karyawan, i++ modifier perulangan 
              System.out.println("----------------------------");
              System.out.println("Nama = "+getNama(i));
              System.out.println("Alamat = "+getAlamat(i));
              System.out.println("Telepon = "+getTelepon(i));
              if(getJabatan(i)==0){
                  System.out.println("Jabatan = Owner");
              }
              else if (getJabatan(i)==1){
                  System.out.println("Jabatan = Karyawan");
              }
          }
      }
}
