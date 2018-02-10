package id.xyzsystem.budiono.kuismerdeka;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActLima extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_lima);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run (){
                Intent i = new Intent(ActLima.this, ActSatu.class);
                startActivity(i);
                finish();
            }
        },2500);
    }
}