package Apr_22nd;

public class Silinder extends Lingkaran{
    private double tinggi;

    public Silinder(){
        super();
    }

    public Silinder(double r, double t){
        super(r);
        tinggi = t;
    }

    public void setTinggi(double t){
        tinggi = t;
    }

    public double getTinggi(){
        return tinggi;
    }

    public double getVolume(){
        return getLuas() * tinggi;
    }

    @Override
    public double getLuas(){
        return (2 * 3.14 * getR() * getR()) + (2 * 3.14 * getR() * tinggi);
    }

    @Override
    public String toString(){
        return "Silinder dengan jari jari: "+getR()+
        ", tinggi: "+tinggi+
        "\nMenghasilkan Volume: "+getVolume()+
        "\ndan Luas Permukaan : "+getLuas();
    }
}
