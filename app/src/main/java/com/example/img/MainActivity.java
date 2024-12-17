package com.example.img;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView pec;
    int c = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pec = findViewById(R.id.im);
    }

    public void plus(View view) {
        if (c == 1) {
            pec.setImageResource(R.drawable.fish);
            c++;
        } else {
            if (c == 2) {
                pec.setImageResource(R.drawable.lion0);
                c++;
            } else {
                if (c == 3) {
                    pec.setImageResource(R.drawable.foxx);
                    c++;
                } else {
                    if (c == 4) {
                        pec.setImageResource(R.drawable.rabiit);
                        c++;
                    } else {
                        pec.setImageResource(R.drawable.anii);
                        c = 1;
                    }
                }
            }
        }
    }

    public void minus(View view) {
        if (c == 5) {
            pec.setImageResource(R.drawable.foxx);
            c--;
        } else {
            if (c == 4) {
                pec.setImageResource(R.drawable.lion0);
                c--;
            } else {
                if (c == 3) {
                    pec.setImageResource(R.drawable.fish);
                    c--;
                } else {
                    if (c == 2) {
                        pec.setImageResource(R.drawable.anii);
                        c--;
                    } else {
                        pec.setImageResource(R.drawable.rabiit);
                        c = 5;
                    }
                }
            }
        }
    }
}