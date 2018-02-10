package id.xyzsystem.budiono.kuismerdeka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ActTiga extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_tiga);
        //ambil nilai
        String namapeserta = getIntent().getStringExtra("vpeserta");
        //isi nilai
        Toast.makeText(this, namapeserta, Toast.LENGTH_SHORT).show();
        TextView ambil_nilai = (TextView) findViewById(R.id.lbl_nilai);
        ambil_nilai.setText("Nilai: " + namapeserta);
    }

    //panggil Activity TIGA
    public void KunciJawaban(View view){
        Intent budi2 = new Intent(ActTiga.this, ActEnam.class);
        startActivity(budi2);
    }
    //panggil activity DUA
    public void CobaLagi(View view){
        Intent budi3 = new Intent(ActTiga.this,ActDua.class);
        startActivity(budi3);
    }

}
