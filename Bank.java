
public class Bank {

    public static void main(String[] args) {

        final String bank="Bank A";
        System.out.println("Nama Bank : " + bank);

        Nasabah n=new Nasabah();
        Nasabah.noAntrian++;
        System.out.println(n.noAntrian);
        n.Nasabah("Rina");
        n.tabungan(20000000);
        n.ambilUang(40000000);
        n.ambilUang(200000,"Uang belanja bulanan");

        System.out.println();
        Nasabah n1=new Nasabah();
        Nasabah.noAntrian++;
        System.out.println(n1.noAntrian);
        n1.Nasabah("Ramadan");
        n1.tabungan(25000000);
        n1.ambilUang(400000);
        n1.ambilUang(300000,"Uang service motor");
        
        
    }
    
}
