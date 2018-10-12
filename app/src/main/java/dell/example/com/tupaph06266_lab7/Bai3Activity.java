package dell.example.com.tupaph06266_lab7;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Bai3Activity extends AppCompatActivity {
    private ImageView imgclock;
    private ImageView imggiay;
    private ImageView imgphut;
    private ImageView imggio;
    private Button btnrun;
    Animation rotation;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai3_main);
        viw3();
        rotation = AnimationUtils.loadAnimation(this, R.anim.rotation);
        btnrun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imggiay.startAnimation(rotation);
                imgphut.startAnimation(rotation);
                imggio.startAnimation(rotation);
            }
        });
    }

//    private void run() {
//        int dest1 = 259200;
//        if (imggiay.getRotation() == 360) {
//            dest1 = 0;
//        }
//        ObjectAnimator animator = ObjectAnimator.ofFloat(imggiay, "rotation", dest1);
//        animator.setDuration(6000);
//        animator.setRepeatCount(720);
//        animator.start();
//
//
//        int dest2 = 360;
//        if (imgphut.getRotation() == 360) {
//            dest2 = 0;
//        }
//        ObjectAnimator animator1 = ObjectAnimator.ofFloat(imgphut, "rotation", dest2);
//        animator1.setDuration(60000);
//        animator1.setRepeatCount(12);
//        animator1.start();
//
//
//        int dest3 = 0;
//        if (imggio.getRotation() == 360) {
//            dest3 = 0;
//        }
//        ObjectAnimator animator2 = ObjectAnimator.ofFloat(imggio, "rotation", dest3);
//        animator2.setDuration(3600000);
//        animator2.setRepeatCount(720);
//        animator2.start();
//    }

    private void viw3() {
        imgclock = (ImageView) findViewById(R.id.imgclock);
        imggiay = (ImageView) findViewById(R.id.imggiay);
        imgphut = (ImageView) findViewById(R.id.imgphut);
        imggio = (ImageView) findViewById(R.id.imggio);
        btnrun = findViewById(R.id.btnrun);
    }


    public void backb3(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}