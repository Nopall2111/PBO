package Apr_15th;

public class PesawatDemo {
    public static void main(String[] args) {
        Pesawat p = new Pesawat("Lion Air", 2010, true, 120);

        System.out.println();
        p.cetak();

        System.out.println("-------------");
        System.out.println("Setelah reset");
        System.out.println("-------------");
        
        p.reset("Garuda", 2015, false, 200);
        p.cetak();
        System.out.println();
    }
}
