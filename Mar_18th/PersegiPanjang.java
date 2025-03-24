package Mar_18th;

public class PersegiPanjang {
    public int panjang;
    public int lebar;
    public static int jumlahObjek = 0;

    public PersegiPanjang(){
        jumlahObjek++;
    }
    public PersegiPanjang(int pjbaru, int lbrbaru){
        panjang = pjbaru;
        lebar = lbrbaru;
        jumlahObjek++;
    }

    public static int getJumlahObjek(){
        return jumlahObjek;
    }

    public int getLuas(){
        return panjang * lebar;
    }
    public int getKeliling(){
        return 2*(panjang+lebar);
    }
}
