package dell.example.com.tupaph06266_lab7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.Button;

import android.widget.ImageView;


public class Bai2Activity extends AppCompatActivity {
    private Button btnall;
    private Button btndoraemon;
    private Button btnnobita;
    private Button btnsuka;
    private Button btnsuneo;
    private Button btngoda;
    private ImageView imgall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai2_main);
        viiew2();
        btnall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage("All");
            }
        });
        btndoraemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage("Doraemon");
            }
        });
        btnnobita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage("Nobita");
            }
        });
        btnsuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage("Shizuka");
            }
        });
        btnsuneo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage("Suneo");
            }
        });
        btngoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage("Goda");
            }
        });
    }
private void showImage(String img){
        //Hide
    ObjectAnimator anim = ObjectAnimator.ofFloat(imgall, "translationX", 0f, 500f);
    anim.setDuration(2000);
    ObjectAnimator anim1 = ObjectAnimator.ofFloat(imgall, "alpha", 1f, 0f);
    anim1.setDuration(2000);
    //show
    ObjectAnimator anim2=ObjectAnimator.ofFloat(imgall,"translationX",-500f,0f  );
    anim2.setDuration(2000);
    ObjectAnimator anim3 = ObjectAnimator.ofFloat(imgall, "alpha", 0f, 1f);
    anim3.setDuration(2000);

//    ObjectAnimator anim4 = ObjectAnimator.ofFloat(imgall, "alpha", 0f, 1f);
//    anim4.setDuration(2000);
//    ObjectAnimator anim5 = ObjectAnimator.ofFloat(imgall, "alpha", 0f, 1f);
//    anim3.setDuration(2000);
//    ObjectAnimator anim6 = ObjectAnimator.ofFloat(imgall, "alpha", 0f, 1f);
//    anim3.setDuration(2000);

    //next
    AnimatorSet ans = new AnimatorSet();
    ans.play(anim2).with(anim3).after(anim).after(anim1);
    ans.start();
    final String imgName=img;
    anim1.addListener(new Animator.AnimatorListener() {
        @Override
        public void onAnimationStart(Animator animation) {

        }

        @Override
        public void onAnimationEnd(Animator animation) {
            if (imgName == "Nobita") {
                imgall.setImageResource(R.drawable.ic_favorite_black);
            } if (imgName == "Doraemon"){
                imgall.setImageResource(R.drawable.ic_people_black);
            }
            if (imgName == "Shizuka"){
                imgall.setImageResource(R.drawable.ic_language_black);
            }
            if (imgName == "Suneo"){
                imgall.setImageResource(R.drawable.ic_local_airport_black);
            }
            if (imgName == "Goda"){
                imgall.setImageResource(R.drawable.ic_toys_black);
            }
        }
        @Override
        public void onAnimationCancel(Animator animation) {

        }

        @Override
        public void onAnimationRepeat(Animator animation) {

        }
    });
    }


    private void viiew2() {
        imgall = findViewById(R.id.imgall);
        btnall =  findViewById(R.id.btnall);
        btndoraemon = findViewById(R.id.btndoraemon);
        btnnobita =  findViewById(R.id.btnnobita);
        btnsuka =  findViewById(R.id.btnsuka);
        btnsuneo =  findViewById(R.id.btnsuneo);
        btngoda =  findViewById(R.id.btngoda);

    }

    public void backb2(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
