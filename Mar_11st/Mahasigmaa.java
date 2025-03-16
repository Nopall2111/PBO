package Mar_11st;

public class Mahasigmaa {
    String nama, nim;
    double tugas, uts, uas, quiz, nilaiAkhir;

    public Mahasigmaa(String nama, String nim, double tugas, double uts, double uas, double quiz){
        this.nama = nama;
        this.nim = nim;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        this.quiz = quiz;
        this.nilaiAkhir = hitungNilai();
    }

    public double hitungNilai(){
        return (0.25 * tugas) + (0.30 * uts) + (0.35 * uas) + (0.15 * quiz);
    }

    public void dataMahs(){
        System.out.println("Nama   : "+nama);
        System.out.println("NIM    : "+nim);
        System.out.println("Nilai  : "+nilaiAkhir);
        System.out.println("Grade  : "+grade());
        System.out.println("Lulus? : "+cekLulus());
    }

    public String grade(){
        if (nilaiAkhir >= 80)
            return "A";
        else if (nilaiAkhir >= 65)
            return "B";
        else if (nilaiAkhir >= 55)
            return "C";
        else if (nilaiAkhir >= 45)
            return "D";
        else
            return "E";
    }

    public String cekLulus(){
        return nilaiAkhir >= 70 ? "Lulus" : "Gagal";
    }
}
