package net.gpaau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import net.gpaau.ADS_F.adsYear1Sem1;
import net.gpaau.ADS_F.adsYear1Sem2;
import net.gpaau.ADS_F.adsYear2Sem3;
import net.gpaau.ADS_F.adsYear2sem4;
import net.gpaau.ADS_F.adsYear3Sem5;
import net.gpaau.ADS_F.adsYear3Sem6;
import net.gpaau.ADS_F.adsYear4Sem7;

public class aidsSemester extends AppCompatActivity {

    Button sem1,sem2,sem3,sem4,sem5,sem6,sem7;
    Intent isem1,isem2,isem3,isem4,isem5,isem6,isem7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aids_semester);

        sem1=findViewById(R.id.button);
        sem2=findViewById(R.id.button8);
        sem3=findViewById(R.id.button7);
        sem4=findViewById(R.id.button6);
        sem5=findViewById(R.id.button5);
        sem6=findViewById(R.id.button4);
        sem7=findViewById(R.id.button3);


        isem1=new Intent(this, adsYear1Sem1.class);

        isem2=new Intent(this, adsYear1Sem2.class);

        isem3=new Intent(this, adsYear2Sem3.class);

        isem4=new Intent(this, adsYear2sem4.class);

        isem5=new Intent(this, adsYear3Sem5.class);

        isem6=new Intent(this, adsYear3Sem6.class);

        isem7=new Intent(this, adsYear4Sem7.class);

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(isem1);
            }
        });
        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(isem2);
            }
        });

        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(isem4);
            }
        });

        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(isem4);
            }
        });

        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(isem5);
            }
        });

        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(isem6);
            }
        });

        sem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(isem7);
            }
        });





    }
}