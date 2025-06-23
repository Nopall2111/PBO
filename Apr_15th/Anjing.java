package Apr_15th;

public class Anjing extends Hewan{
    public Anjing(String nama){
        super(nama);
    }

    @Override
    public void Suara(){
        System.out.println(nama + " bersuara: Hau Hau");
    }
}
