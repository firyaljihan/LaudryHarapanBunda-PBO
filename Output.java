package laundryharapanbunda;
import java.util.Scanner;
public class Output {
    static Pembeli pembeli=new Pembeli();//funsi static adalah karna di public main jika tdk ad mka error
    static Karyawan karyawan=new Karyawan();//buat new inisiasi / pemberian nilai awal 
    static Pembayaran pembayaran=new Pembayaran();//pemanggilan semua kelas
    static JenisLaundry jenislaundry=new JenisLaundry();
    static Scanner input=new Scanner(System.in);//kalo ada scanner harus ada ini
    static boolean tetap=true;
    static String key;//untuk kembali ke menu awal
    //yang
    public static void main(String[] args) {
        System.out.println("Apakah anda sudah memiliki akun?(y/n)");
        String jawab = input.next();//input jawab
        if(jawab.equalsIgnoreCase("y")){//fungsi ignore case ga harus y kecil atau besar
            System.out.println("Masukkan ID anda");
            int id = input .nextInt();// id firyal 12345
            System.out.println("Selamat Datang "+pembeli.getNama(pembayaran.getPembeli(id)));
            System.out.println("ID anda "+id);
            menu(id);//method
        }
        else{//untuk jawaban selain y yaitu untuk daftar blm punya akun
            System.out.println("Masukkan nama");//tidak bolh spasi karna string klo mau spasi maka pake _
            String nama = input.next(); 
            pembeli.setNama(nama);
            System.out.println("Masukkan ID untuk anda");
            int Id= input.nextInt();
            pembayaran.setIDPembeli(Id);
            System.out.println("Masukkan alamat");
            String alamat = input.next();
            pembeli.setAlamat(alamat);
            System.out.println("Masukkan nomor telepon");
            String telepon = input.next();
            pembeli.setTelepon(telepon);
            System.out.println("Masukkan saldo");
            int saldo=input.nextInt();
            pembeli.addSaldo(saldo);
            System.out.println("Terimakasih telah mendaftar "+nama);
            int id= pembayaran.getIDPembeli(pembeli.getId(nama));
            System.out.println("ID anda "+id);
            menu(id);
            
        }
    }
    public static void tampilLaundry(){//menampilkan laundry 
        int n= jenislaundry.size();
        for(int i=0;i<n;i++){//kenapa ada disini karena id tidak ada di jenislaundry
            System.out.println("-------------------");
            System.out.println(" "+jenislaundry.getLaundry(i));
            System.out.println("Harga = "+jenislaundry.getHarga(i));
            System.out.println("Waktu = "+jenislaundry.getWaktu(i));
            System.out.println("ID = "+pembayaran.getIDJenisLaundry(i));
        }
    }
    public static void menu(int id){//menu utama
        while(tetap){//selama pilihan true maka dapat mengakses menu
            System.out.println("-- Laundry --");
            System.out.println("1. List Laundry");
            System.out.println("2. List Karyawan");
            System.out.println("3. List pembeli");
            System.out.println("4. Laundry");
            System.out.println("5. Exit");
            System.out.println("Pilih menu: ");
            int menu = input.nextInt();
            if(menu==1){
                tampilLaundry();
                System.out.println("Ketik apapun dan enter untuk keluar");
                key=input.next();
            }
            else if(menu==2){
                karyawan.tampilKaryawan();
                System.out.println("Ketik apapun dan enter untuk keluar");
                key=input.next();
            }
            else if(menu==3){
                pembeli.tampilPembeli();
                System.out.println("Ketik apapun dan enter untuk keluar");
                key=input.next();
            }
            else if(menu==4){
                tampilLaundry();
                System.out.println("Masukkan Id laundry yang diinginkan");
                int laundry = input.nextInt();
                System.out.println("Masukkan berapa banyak laundry anda");
                int banyak = input.nextInt();
                pembayaran.setBanyak(banyak);
                int harga = jenislaundry.getHarga(pembayaran.getIDJenisLaundry(laundry))*banyak;
                if(pembeli.getSaldo(pembayaran.getPembeli(id))>=harga){
                    System.out.println("----------Total----------");
                    System.out.println("Jenis Laundry = "+jenislaundry.getLaundry(laundry));
                    System.out.println("Total Harga   = "+harga);
                    System.out.println("Durasi        = "+jenislaundry.getWaktu(laundry)+" menit");
                    pembeli.setSaldo(pembayaran.getPembeli(id), pembeli.getSaldo(pembayaran.getPembeli(id))-harga);
                    System.out.println("Terimakasih telah menggunkaan jasa kami");
                    System.out.println("Ketik apapun dan enter untuk kembali");
                    key = input.next();
                }
                else{//jika saldo kurang
                    System.out.println("Saldo anda tidak cukup");
                    System.out.println("Ketik apapun dan enter untuk kembali");
                    key=input.next();
                }
            }
            else if(menu==5){
                System.out.println("Ditunggu order selanjutnya");
                tetap = false;
            }
            else{//untuk kembali ke menu awal
                System.out.println("input tidsk sesuai");
                System.out.println("ketik apapun dan enter untuk kembali");
                key = input.next();
            }
        }
    }
    
    
}
