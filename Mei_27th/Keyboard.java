package Mei_27th;

public class Keyboard extends AlatMusik implements BisaDinyalakan {
    private boolean dayaTersambung;

    public Keyboard(String nama, String jenis, boolean dayaTersambung) {
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }

    @Override
    public void nyalakan() {
        if (cekListrik()) {
            System.out.println(nama+" dinyalakan.");
        } else {
            System.out.println("Tidak ada listrik, "+nama+" tidak bisa dinyalakan.");
        }
    }

    @Override
    public void matikan() {
        System.out.println("Keyboard dimatikan.");
    }

    @Override
    public boolean cekListrik() {
        return dayaTersambung;
    }

    @Override
    public void mainkan() {
        System.out.println(nama+" sedang dimainkan dengan menekan tuts.");
    }

    @Override
    public void stem() {
        System.out.println("Keyboard "+nama+" sedang distem digital melalui softwarenya.");
    }
}
