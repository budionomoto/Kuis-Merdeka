package id.xyzsystem.budiono.kuismerdeka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ActDua extends AppCompatActivity {
    int var_loop =1;
    int var_nilai = 0;
    boolean lanjut = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_dua);

        //visible yang terkahir
        LinearLayout ln2 = (LinearLayout) findViewById(R.id.layout_final);
        ln2.setVisibility(View.INVISIBLE);

        //ambil nama peserta
        String namapeserta = getIntent().getStringExtra("vpeserta");
        //Toast.makeText(this, namapeserta, Toast.LENGTH_SHORT).show();

        TextView ambil_nama = (TextView) findViewById(R.id.lbl_namapeserta);
        ambil_nama.setText(namapeserta);

        //untuk dihasil akhir
        TextView ambil_nama2 = (TextView) findViewById(R.id.lbl_namapesertafinal);
        ambil_nama2.setText("Hallo, " + namapeserta);

        //Kosongkan jawaban
        TextView jwb = (TextView) findViewById(R.id.lbl_jawab);
        jwb.setText("");

        //nomer pertanyaan
        TextView vlbl_nomer = (TextView) findViewById((R.id.lbl_nomer));
        vlbl_nomer.setText("1/10");
        //ini pertanyaan
        TextView vlbl_pertanyaan = (TextView) findViewById((R.id.lbl_pertanyaan));
        vlbl_pertanyaan.setText("Tokoh Dari Jawa Timur");
        //gambar load
        ImageView img_pahlawan = (ImageView) findViewById((R.id.img_pahlawan));
        img_pahlawan.setImageResource(R.drawable.soekarno1);

        //ini radio pilihan a
        RadioButton radio_a = (RadioButton) findViewById((R.id.radio_piliha));
        radio_a.setText("Dr. Ir. Mohammad hatta");
        //ini radio pilihan b
        RadioButton radio_b = (RadioButton) findViewById((R.id.radio_pilihb));
        radio_b.setText("Dr. Ir. Soekarno"); //jawaban benar nomer 1
        //ini radio pilihan c
        RadioButton radio_c = (RadioButton) findViewById((R.id.radio_pilihc));
        radio_c.setText("Kapitan Pattimura");
        //tombol awal
        Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
        btn_jawab.setText("PERIKSA JAWABAN");
        btn_jawab.setEnabled(false);

    }

    public void PeriksaAtauLanjut(View view){
        //var_loop +=1;
        //hilangkan Linear Nilai Akhir


        RadioButton opt_a = (RadioButton) findViewById(R.id.radio_piliha);
        RadioButton opt_b = (RadioButton) findViewById(R.id.radio_pilihb);
        RadioButton opt_c = (RadioButton) findViewById(R.id.radio_pilihc);
        RadioButton opt_d = (RadioButton) findViewById(R.id.radio_pilihd);

        Button btnoke = (Button) findViewById((R.id.btn_jawab));
        TextView jwb = (TextView) findViewById(R.id.lbl_jawab);
        jwb.setText("");

        if (lanjut == true){
            opt_a.setChecked(false);
            opt_b.setChecked(false);
            opt_c.setChecked(false);
            opt_d.setChecked(true);

            opt_a.setEnabled(true);
            opt_b.setEnabled(true);
            opt_c.setEnabled(true);

            btnoke.setEnabled(false);
        }else{
            //periksa jawaban
            opt_a.setEnabled(false);
            opt_b.setEnabled(false);
            opt_c.setEnabled(false);
            btnoke.setEnabled(true);
        }


        if (var_loop == 1){
            if (lanjut == false){
                //periksa jawaban
                if (opt_b.isChecked()){
                    var_nilai +=1;
                    //Toast.makeText(this, "Kamu Benar!!!", Toast.LENGTH_SHORT).show();
                    jwb.setText("Kamu Benar !!!");
                    opt_b.setChecked(false);
                }else{
                    jwb.setText("Ups, Salah !!!");
                    //Toast.makeText(this, "Ups, Salah!!!", Toast.LENGTH_SHORT).show();
                }

                // button menjadi lanjut
                lanjut = true;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("LANJUT");
            }else{
                //Tampilkan Pertanyaan Berikutnya::::::
                TextView vlbl_nomer = (TextView) findViewById((R.id.lbl_nomer));
                vlbl_nomer.setText("2/10");
                //gambar load
                ImageView img_pahlawan = (ImageView) findViewById((R.id.img_pahlawan));
                img_pahlawan.setImageResource(R.drawable.hatta2);
                //ini pertanyaan
                TextView vlbl_pertanyaan = (TextView) findViewById((R.id.lbl_pertanyaan));
                vlbl_pertanyaan.setText("Pahlawan Nasional Dari Sumatra Barat");
                //ini radio pilihan
                opt_a.setText("Teuku Umar");
                opt_b.setText("Jenderal Soedirman");
                opt_c.setText("Dr. Ir. Mohammad Hatta"); //Jawaban C

                //tombol berubah menjadi PERIKSA JAWABAN
                lanjut = false;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("PERIKSA JAWABAN");
                var_loop +=1;
            }
        } else if (var_loop == 2){
            if (lanjut == false){
                //periksa jawaban
                if (opt_c.isChecked()){
                    var_nilai +=1;
                    jwb.setText("Kamu Benar !!!");
                    opt_c.setChecked(false);
                }else{
                    jwb.setText("Ups, Salah !!!");
                }

                //tombol berubah menjadi LANJUT
                lanjut = true;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("LANJUT");

            }else{
                //Tampilkan Pertanyaan Berikutnya::::::
                TextView vlbl_nomer = (TextView) findViewById((R.id.lbl_nomer));
                vlbl_nomer.setText("3/10");
                //gambar load
                ImageView img_pahlawan = (ImageView) findViewById((R.id.img_pahlawan));
                img_pahlawan.setImageResource(R.drawable.pattimura3);
                //ini pertanyaan
                TextView vlbl_pertanyaan = (TextView) findViewById((R.id.lbl_pertanyaan));
                vlbl_pertanyaan.setText("Pahlawan Nasional dari Maluku");
                //ini radio pilihan a
                opt_a.setText("Kapitan Pattimura"); //Jawaban Benar Nomer A
                opt_b.setText("Teuku Umar");
                opt_c.setText("Agus Salim");


                //tombol berubah menjadi PERIKSA JAWABAN
                lanjut = false;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("PERIKSA JAWABAN");
                var_loop +=1;
            }
        }else if (var_loop == 3) {
            if (lanjut == false) {
                //periksa jawaban
                if (opt_a.isChecked()){
                    var_nilai +=1;
                    jwb.setText("Kamu Benar !!!");
                    opt_a.setChecked(false);
                }else{
                    jwb.setText("Ups, Salah !!!");
                }

                //tombol berubah menjadi LANJUT
                lanjut = true;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("LANJUT");

            } else {
                //Tampilkan Pertanyaan Berikutnya::::::
                TextView vlbl_nomer = (TextView) findViewById((R.id.lbl_nomer));
                vlbl_nomer.setText("4/10");
                //gambar load
                ImageView img_pahlawan = (ImageView) findViewById((R.id.img_pahlawan));
                img_pahlawan.setImageResource(R.drawable.umar4);
                //ini pertanyaan
                TextView vlbl_pertanyaan = (TextView) findViewById((R.id.lbl_pertanyaan));
                vlbl_pertanyaan.setText("Pahlawan Nasional Dari Meulaboh Aceh");
                //ini radio pilihan a
                opt_a.setText("Pangeran Diponegoro");
                opt_b.setText("Agus Salim");
                opt_c.setText("Teuku Umar");  //Jawaban Benar Nomer c

                //tombol berubah menjadi PERIKSA JAWABAN
                lanjut = false;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("PERIKSA JAWABAN");
                var_loop += 1;
            }
        }else if (var_loop == 4) {
            if (lanjut == false) {
                //periksa jawaban
                if (opt_c.isChecked()){
                    var_nilai +=1;
                    jwb.setText("Kamu Benar !!!");
                    opt_c.setChecked(false);
                }else {
                    jwb.setText("Ups, Salah !!!");
                }
                //   Toast.makeText(this, "Kamu Benar!!!", Toast.LENGTH_SHORT).show();
                //}else{
                //    Toast.makeText(this, "Ups, Salah!!!", Toast.LENGTH_SHORT).show();
                //}

                //tombol berubah menjadi LANJUT
                lanjut = true;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("LANJUT");

            } else {
                //Tampilkan Pertanyaan Berikutnya::::::
                TextView vlbl_nomer = (TextView) findViewById((R.id.lbl_nomer));
                vlbl_nomer.setText("5/10");
                //gambar load
                ImageView img_pahlawan = (ImageView) findViewById((R.id.img_pahlawan));
                img_pahlawan.setImageResource(R.drawable.agussalim5);
                //ini pertanyaan
                TextView vlbl_pertanyaan = (TextView) findViewById((R.id.lbl_pertanyaan));
                vlbl_pertanyaan.setText("Pahlawan Nasional Dari Sumatra Barat");
                //ini radio pilihan a
                opt_a.setText("Agus Salim"); //jawaban benar nomer a
                opt_b.setText("Pangeran Diponegoro");
                opt_c.setText("Tuanku Imam Bonjol");

                //tombol berubah menjadi PERIKSA JAWABAN
                lanjut = false;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("PERIKSA JAWABAN");
                var_loop += 1;
            }
        }else if (var_loop == 5) {
            if (lanjut == false) {
                //periksa jawaban
                if (opt_a.isChecked()){
                    var_nilai +=1;
                    jwb.setText("Kamu Benar !!!");
                    opt_a.setChecked(false);
                    //Toast.makeText(this, "Kamu Benar!!!", Toast.LENGTH_SHORT).show();
                }else {
                    jwb.setText("Ups, Salah !!!");
                    //Toast.makeText(this, "Ups, Salah!!!", Toast.LENGTH_SHORT).show();
                }

                //tombol berubah menjadi LANJUT
                lanjut = true;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("LANJUT");

            } else {
                //Tampilkan Pertanyaan Berikutnya::::::
                TextView vlbl_nomer = (TextView) findViewById((R.id.lbl_nomer));
                vlbl_nomer.setText("6/10");
                //gambar load
                ImageView img_pahlawan = (ImageView) findViewById((R.id.img_pahlawan));
                img_pahlawan.setImageResource(R.drawable.ponegoro6);
                //ini pertanyaan
                TextView vlbl_pertanyaan = (TextView) findViewById((R.id.lbl_pertanyaan));
                vlbl_pertanyaan.setText("Pahlawan Nasional Dari Yogyakarta");
                //ini radio pilihan a
                opt_a.setText("I Gusti Ngurah Rai");
                opt_b.setText("Tuanku Imam Bonjol");
                opt_c.setText("Pangeran Diponegoro"); //jawaban benar nomer c

                //tombol berubah menjadi PERIKSA JAWABAN
                lanjut = false;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("PERIKSA JAWABAN");
                var_loop += 1;
            }
        }else if (var_loop == 6) {
            if (lanjut == false) {
                //periksa jawaban
                if (opt_c.isChecked()){
                    var_nilai +=1;
                    jwb.setText("Kamu Benar !!!");
                    opt_c.setChecked(false);
                    //Toast.makeText(this, "Kamu Benar!!!", Toast.LENGTH_SHORT).show();
                }else{
                    jwb.setText("Ups, Salah !!!");
                    //Toast.makeText(this, "Ups, Salah!!!", Toast.LENGTH_SHORT).show();
                }

                //tombol berubah menjadi LANJUT
                lanjut = true;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("LANJUT");

            } else {
                //Tampilkan Pertanyaan Berikutnya::::::
                TextView vlbl_nomer = (TextView) findViewById((R.id.lbl_nomer));
                vlbl_nomer.setText("7/10");
                //gambar load
                ImageView img_pahlawan = (ImageView) findViewById((R.id.img_pahlawan));
                img_pahlawan.setImageResource(R.drawable.bonjol7);
                //ini pertanyaan
                TextView vlbl_pertanyaan = (TextView) findViewById((R.id.lbl_pertanyaan));
                vlbl_pertanyaan.setText("Pahlawan Nasional Dari Sumatra Barat");
                //ini radio pilihan a
                opt_a.setText("I Gusti Ngurah Rai");
                opt_b.setText("Tuanku Imam Bonjol"); //jawaban benar B
                opt_c.setText("Jenderal Soedirman");

                //tombol berubah menjadi PERIKSA JAWABAN
                lanjut = false;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("PERIKSA JAWABAN");
                var_loop += 1;
            }
        }else if (var_loop == 7) {
            if (lanjut == false) {
                //periksa jawaban
                if (opt_b.isChecked()){
                    var_nilai +=1;
                    jwb.setText("Kamu Benar !!!");
                    opt_b.setChecked(false);
                    //Toast.makeText(this, "Kamu Benar!!!", Toast.LENGTH_SHORT).show();
                }else{
                    jwb.setText("Ups, Salah !!!");
                    //Toast.makeText(this, "Ups, Salah!!!", Toast.LENGTH_SHORT).show();
                }

                //tombol berubah menjadi LANJUT
                lanjut = true;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("LANJUT");

            } else {
                //Tampilkan Pertanyaan Berikutnya::::::
                TextView vlbl_nomer = (TextView) findViewById((R.id.lbl_nomer));
                vlbl_nomer.setText("8/10");
                //gambar load
                ImageView img_pahlawan = (ImageView) findViewById((R.id.img_pahlawan));
                img_pahlawan.setImageResource(R.drawable.rai8);

                //ini pertanyaan
                TextView vlbl_pertanyaan = (TextView) findViewById((R.id.lbl_pertanyaan));
                vlbl_pertanyaan.setText("Pahlawan Nasional Dari Bali");
                //ini radio pilihan a
                RadioButton radio_a = (RadioButton) findViewById((R.id.radio_piliha));
                opt_a.setText("Teuku Umar");
                opt_b.setText("I Gusti Ngurah Rai"); //Jawaban Benar b nomer 8
                opt_c.setText("Jenderal Soedirman");

                //tombol berubah menjadi PERIKSA JAWABAN
                lanjut = false;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("PERIKSA JAWABAN");
                var_loop += 1;
            }
        }else if (var_loop == 8) {
            if (lanjut == false) {
                //periksa jawaban
                if (opt_b.isChecked()){
                    var_nilai +=1;
                    jwb.setText("Kamu Benar !!!");
                    opt_b.setChecked(false);
                    //Toast.makeText(this, "Kamu Benar!!!", Toast.LENGTH_SHORT).show();
                }else{
                    jwb.setText("Ups, Salah !!!");
                    //Toast.makeText(this, "Ups, Salah!!!", Toast.LENGTH_SHORT).show();
                }

                //tombol berubah menjadi LANJUT
                lanjut = true;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("LANJUT");

            } else {
                //Tampilkan Pertanyaan Berikutnya::::::
                TextView vlbl_nomer = (TextView) findViewById((R.id.lbl_nomer));
                vlbl_nomer.setText("9/10");
                //gambar load
                ImageView img_pahlawan = (ImageView) findViewById((R.id.img_pahlawan));
                img_pahlawan.setImageResource(R.drawable.kartini9);
                //ini pertanyaan
                TextView vlbl_pertanyaan = (TextView) findViewById((R.id.lbl_pertanyaan));
                vlbl_pertanyaan.setText("Pahlawan Nasional Dari Jepara");
                //ini radio pilihan a
                opt_a.setText("R.A. Kartini"); //jawaban benar A nomer 9
                opt_b.setText("Cut Nyak Dien");
                opt_c.setText("Megawati Soekarno Putri");

                //tombol berubah menjadi PERIKSA JAWABAN
                lanjut = false;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("PERIKSA JAWABAN");
                var_loop += 1;
            }
        }else if (var_loop == 9) {
            if (lanjut == false) {
                //periksa jawaban
                if (opt_a.isChecked()){
                    var_nilai +=1;
                    jwb.setText("Kamu Benar !!!");
                    opt_a.setChecked(false);
                    //Toast.makeText(this, "Kamu Benar!!!", Toast.LENGTH_SHORT).show();
                }else{
                    jwb.setText("Ups, Salah !!!");
                    //Toast.makeText(this, "Ups, Salah!!!", Toast.LENGTH_SHORT).show();
                }

                //tombol berubah menjadi LANJUT
                lanjut = true;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("LANJUT");

            } else {
                //Tampilkan Pertanyaan Berikutnya::::::
                TextView vlbl_nomer = (TextView) findViewById((R.id.lbl_nomer));
                vlbl_nomer.setText("10/10");
                //gambar load
                ImageView img_pahlawan = (ImageView) findViewById((R.id.img_pahlawan));
                img_pahlawan.setImageResource(R.drawable.soedirman10);

                //ini pertanyaan
                TextView vlbl_pertanyaan = (TextView) findViewById((R.id.lbl_pertanyaan));
                vlbl_pertanyaan.setText("Pahlawan Nasional Purbalingga");
                //ini radio pilihan a
                RadioButton radio_a = (RadioButton) findViewById((R.id.radio_piliha));
                radio_a.setText("Dr. Ir. Mohammad hatta");
                //ini radio pilihan b
                RadioButton radio_b = (RadioButton) findViewById((R.id.radio_pilihb));
                radio_b.setText("Dr. Ir. Soekarno");
                //ini radio pilihan c
                RadioButton radio_c = (RadioButton) findViewById((R.id.radio_pilihc));
                radio_c.setText("Jenderal Soedirman"); //Jawaban Benar C nomer 10

                //tombol berubah menjadi PERIKSA JAWABAN
                lanjut = false;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("PERIKSA JAWABAN");
                var_loop += 1;
            }
        }else if (var_loop == 10) {
            //periksa jawaban terakhir
            if (lanjut == false) {
                if (opt_c.isChecked()){
                    var_nilai +=1;
                    jwb.setText("Kamu Benar !!!");
                    opt_c.setChecked(false);
                    //Toast.makeText(this, "Kamu Benar!!!", Toast.LENGTH_SHORT).show();
                }else{
                    jwb.setText("Ups, Salah !!!");
                    //Toast.makeText(this, "Ups, Salah!!!", Toast.LENGTH_SHORT).show();
                }

                //tombol berubah menjadi LANJUT
                lanjut = true;
                Button btn_jawab = (Button) findViewById((R.id.btn_jawab));
                btn_jawab.setText("LIHAT NILAI AKHIR");
            } else {
                //panggil Activity TIGA
                //hilangkan linear utama
                LinearLayout ln3 = (LinearLayout) findViewById(R.id.layout_utama);
                ln3.setVisibility(View.GONE);
                //panggil Linear terakhir
                //VISIBLE=terllihat
                LinearLayout ln1 = (LinearLayout) findViewById(R.id.layout_final);
                ln1.setVisibility(View.VISIBLE);

                //nilai akhir
                var_nilai = var_nilai * 10;
                TextView ambil_nilai = (TextView) findViewById(R.id.lbl_nilaifinal);
                ambil_nilai.setText("Nilai Kamu: " + var_nilai);

                //Intent budi = new Intent(ActDua.this, ActTiga.class);
                //budi.putExtra("vpeserta",var_nilai);
                //startActivity(budi);
            }
        }
    }

    public void piliha(View view){
        //Toast.makeText(this, "Pilih A", Toast.LENGTH_SHORT).show();
        Button oke = (Button) findViewById(R.id.btn_jawab);
        oke.setEnabled(true);
    }
    public void pilihb(View view){
        //Toast.makeText(this, "Pilih B", Toast.LENGTH_SHORT).show();
        Button oke = (Button) findViewById(R.id.btn_jawab);
        oke.setEnabled(true);
    }
    public void pilihc(View view){
        //Toast.makeText(this, "Pilih C", Toast.LENGTH_SHORT).show();
        Button oke = (Button) findViewById(R.id.btn_jawab);
        oke.setEnabled(true);
    }
    //panggil Kunci Jawaban
    public void KunciJawaban(View view){
        Intent budi2 = new Intent(ActDua.this,ActEnam.class);
        startActivity(budi2);
    }
    //panggil Coba Lagi
    public void CobaLagi(View view){
        Intent budi3 = new Intent(ActDua.this, ActSatu.class);
        startActivity(budi3);
    }

}
