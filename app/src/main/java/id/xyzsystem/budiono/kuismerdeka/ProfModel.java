package id.xyzsystem.budiono.kuismerdeka;

/**
 * Created by budiono on 10/02/18.
 */

public class ProfModel {
    String eng, indo;
    int gambar;

    public ProfModel(int gambar, String eng, String indo) {
        this.gambar = gambar;
        this.eng = eng;
        this.indo = indo;
    }

    public int getGambar() {
        return gambar;
    }

    public String getEng() {
        return eng;
    }

    public String getIndo() {
        return indo;
    }
}