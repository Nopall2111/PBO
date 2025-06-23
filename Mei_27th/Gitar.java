package Mei_27th;

public class Gitar extends AlatMusik{
    private int jmlSenar;

    public Gitar(String nama, String jenis, int jmlSenar){
        super(nama, jenis);
        this.jmlSenar = jmlSenar;
    }

    @Override
    public void mainkan(){
        System.out.println(nama+" diipetik dengan "+jmlSenar+" senar");
    }

    @Override
    public void stem(){
        System.out.println("Menyetem gitar "+nama+" secara manual");
    }
}
