public class Nasabah {
    private String  namaNasabah;
    private int saldo;
    private String pesan;
    public static long noAntrian=0;
    
    public void Nasabah(String nama){
        namaNasabah=nama;
        System.out.println("Nama Nasabah : " +namaNasabah);
    }
    public int  tabungan(int jumlah){
        return saldo=saldo+jumlah;
    }
     public int getSaldo(){
        return saldo;
    }
     public String getPesan(){
         return pesan;
     }
    public int ambilUang(int uang){
        if(saldo- uang < 50 ){
            System.out.println("Maaf saldo anda tidak cukup");
            return saldo;
        }else{
            System.out.println("Penarikan tunai sebesar sukses");
           return saldo-=uang;
        }
        
    }
     public int ambilUang(int uang, String isi){
        System.out.println(isi);
        if(saldo - uang < 50 ){
            System.out.println("Maaf saldo anda tidak cukup.");
            return saldo;
        }else{
            System.out.println("Penarikan tunai sebesar " + uang + " sukses.");
            pesan=isi;
           return saldo-=uang;
           
        }
        
    }
   
}
