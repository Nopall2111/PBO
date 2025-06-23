package Apr_22nd;

public class Kerucut extends Lingkaran{
    private double tinggi;

    public Kerucut(){
        super();
    }

    public Kerucut(double r, double t){
        super(r);
        tinggi = t;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double getTinggi(){
        return tinggi;
    }

    public double getVolume(){
        return (3.14 * getR() * getR() * tinggi) / 3;
    }

    @Override
    public double getLuas(){
        double s = Math.sqrt(getR() * getR() + tinggi * tinggi);
        return Math.PI * getR() * (getR() + s);
    }

    @Override
    public String toString(){
        return "Kerucut dengan jari jari: "+getR()+
        ", tinggi: "+tinggi+
        "\nMenghasilkan Volume: "+getVolume()+
        "\ndan Luas Permukaan : "+getLuas();
    }
}
