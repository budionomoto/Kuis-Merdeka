package id.xyzsystem.budiono.kuismerdeka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActSatu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_satu);
    }

    public void goto_kuis (View view)
    {
        //ambil nama peserta
        TextView obj_peserta = (TextView) findViewById(R.id.lbl_namapeserta);
        String nama = obj_peserta.getText().toString();

        // pindah ke activity kuis
        //Intent intent = new Intent(ActSatu.this, ActDua.class);
        Intent intent = new Intent(view.getContext(), ActDua.class);
        intent.putExtra("vpeserta",nama);

        startActivity(intent);
    }
}
