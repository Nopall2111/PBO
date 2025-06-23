package Apr_22nd;

public class Lingkaran {
    private double r;

    public Lingkaran(){

    }

    public Lingkaran(double r){
        this.r = r;
    }

    public void setR(double r){
        this.r = r;
    }

    public double getR(){
        return r;
    }

    public double getDiameter(){
        return 2 * r;
    }

    public double getKeliling(){
        return 2 * 3.14 * r;
    }

    public double getLuas(){
        return r * r * 3.14;
    }

    @Override
    public String toString(){
        return "Lingkaran dengan jari jari: "+getR()+
        "\nMenghasilkan Keliling: "+getKeliling()+
        "\ndan Luas : "+getLuas();
    }
}
