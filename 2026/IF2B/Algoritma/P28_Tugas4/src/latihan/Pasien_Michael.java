package latihan;

public class Pasien_Michael {

    private int nomorUrut_Michael;
    private String kodePasien_Michael;
    private String namaPasien_Michael;

    public Pasien_Michael(String kodePasien_Michael, String namaPasien_Michael) {
        this.kodePasien_Michael = kodePasien_Michael;
        this.namaPasien_Michael = namaPasien_Michael;
    }

    public int getNomorUrut_Michael() {
        return nomorUrut_Michael;
    }

    public void setNomorUrut_Michael(int nomorUrut_Michael) {
        this.nomorUrut_Michael = nomorUrut_Michael;
    }

    public String getKodePasien_Michael() {
        return kodePasien_Michael;
    }

    public void setKodePasien_Michael(String kodePasien_Michael) {
        this.kodePasien_Michael = kodePasien_Michael;
    }

    public String getNamaPasien_Michael() {
        return namaPasien_Michael;
    }

    public void setNamaPasien_Michael(String namaPasien_Michael) {
        this.namaPasien_Michael = namaPasien_Michael;
    }

    @Override
    public String toString() {
        return nomorUrut_Michael + " - " + kodePasien_Michael + " - " + namaPasien_Michael;
    }
}