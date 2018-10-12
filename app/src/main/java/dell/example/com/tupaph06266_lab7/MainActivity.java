package dell.example.com.tupaph06266_lab7;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button btnb2;
    private Button btnb3;
    private ImageView imgall;
    private Button btnrotation;
    private Button btnmoving;
    private Button btnzoom;
    Animation moving,rotation,zoom;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view1();
        animation();
        oclick();
        btnb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai2Activity.class);
                startActivity(intent);
            }
        });
        btnb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai3Activity.class);
                startActivity(intent);
            }
        });

    }

    private void oclick() {
        btnrotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgall.startAnimation(rotation);
            }
        });
        btnmoving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgall.startAnimation(moving);
            }
        });
        btnzoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgall.startAnimation(zoom);
            }
        });
    }

    private void animation() {
        moving = AnimationUtils.loadAnimation(this, R.anim.moving);
        rotation = AnimationUtils.loadAnimation(this, R.anim.rotation);
        zoom = AnimationUtils.loadAnimation(this, R.anim.zoom);

    }

    private void view1() {
        imgall = (ImageView) findViewById(R.id.imgall);
        btnrotation = (Button) findViewById(R.id.btnrotation);
        btnmoving = (Button) findViewById(R.id.btnmoving);
        btnzoom = (Button) findViewById(R.id.btnzoom);

        btnb2 = (Button) findViewById(R.id.btnb2);
        btnb3 = (Button) findViewById(R.id.btnb3);

    }
}
