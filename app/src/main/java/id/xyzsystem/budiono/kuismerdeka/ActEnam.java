package id.xyzsystem.budiono.kuismerdeka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ActEnam extends AppCompatActivity {
    RecyclerView rv;
    List<ProfModel> profList = new ArrayList<>();
    ProfAdapter profAdapter;
    ProfModel profModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_enam);

        rv = (RecyclerView) findViewById(R.id.rv);
        profAdapter = new ProfAdapter(getApplicationContext(), profList);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(lm);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(profAdapter);

        data();
    }

    private void tambahdata(int gambar, String eng, String indo) {
        profModel = new ProfModel(gambar, eng, indo);
        profList.add(profModel);
    }

    private void data() {
        tambahdata(R.drawable.soekarno1, "Dr. Ir. Soekarno", "Pahlawan Dari Jawa Timur");
        tambahdata(R.drawable.hatta2, "Dr. Ir. Mohammad Hatta", "Pahlawan Nasional Dari Sumatra Barat");
        tambahdata(R.drawable.pattimura3, "Kapitan Pattimura", "Pahlawan Nasional Dari Maluku");
        tambahdata(R.drawable.umar4, "Teuku Umar", "Pahlawan Nasional Dari Meulaboh Aceh");
        tambahdata(R.drawable.agussalim5, "KH. Agus Salim", "Pahlawan Nasional Dari Sumatra Barat");
        tambahdata(R.drawable.ponegoro6, "Pangeran Diponegoro", "Pahlawan Nasional Dari Yogyakarta");
        tambahdata(R.drawable.bonjol7, "Imam Bonjol", "Pahlawan Nasional Dari Sumatra Barat");
        tambahdata(R.drawable.rai8, "I Gusti Ngurah Rai", "Pahlawan Nasional Dari Bali");
        tambahdata(R.drawable.kartini9, "RA. Kartini", "Pahlawan Nasional Dari Jepara");
        tambahdata(R.drawable.soedirman10, "Jenderal Soedirman", "Pahlawan Nasional Dari Purbalingga");
        /*
        tambahdata(R.drawable.farmer, "Farmer", "Petani");
        tambahdata(R.drawable.judge, "Judge", "Hakim");
        tambahdata(R.drawable.pilot, "Pilot", "Pilot");
        tambahdata(R.drawable.policeman, "Policeman", "Polisi");
        tambahdata(R.drawable.teacher, "Teacher", "Guru");
        tambahdata(R.drawable.writer, "Writer", "Penulis");
        */
    }

}
