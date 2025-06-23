package Apr_15th;

public class Kucing extends Hewan {
    public Kucing(String nama){
        super(nama);
    }

    @Override
    public void Suara(){
        System.out.println(nama + " bersuara: Meeeeoowww");
    }
    
}
