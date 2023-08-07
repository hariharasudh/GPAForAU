package net.gpaau.ADS_F;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import net.gpaau.ADS_B.ThrdYr;
import net.gpaau.GradeIO.bldr;
import net.gpaau.R;

public class adsYear3Sem5 extends AppCompatActivity {

    Spinner AD3501,CW3551,CS3551,CCS334,PEC_1,PEC_2,AD3511,AD3512;

    String AD3501Value,CW3551Value,CS3551Value,CCS334Value,PEC_1Value,PEC_2Value,AD3511Value,AD3512Value;

    Button Calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads_year3_sem5);

        AD3501=findViewById(R.id.spinner);
        CW3551=findViewById(R.id.spinner7);
        CS3551=findViewById(R.id.spinner6);
        CCS334=findViewById(R.id.spinner5);
        PEC_1=findViewById(R.id.spinner4);
        PEC_2=findViewById(R.id.spinner3);
        AD3511=findViewById(R.id.spinner2);
        AD3512=findViewById(R.id.spinner1);
        Calculate = findViewById(R.id.button9);

        AD3501Value= (String) AD3501.getSelectedItem();
        CW3551Value= (String) CW3551.getSelectedItem();
        CS3551Value= (String) CS3551.getSelectedItem();
        CCS334Value= (String) CCS334.getSelectedItem();
        PEC_1Value= (String) PEC_1.getSelectedItem();
        PEC_2Value= (String) PEC_2.getSelectedItem();
        AD3511Value= (String) AD3511.getSelectedItem();
        AD3512Value= (String) AD3512.getSelectedItem();

        ThrdYr obj=new ThrdYr();

        double gpa =obj.GPA_odd(AD3501Value,CW3551Value,CS3551Value,CCS334Value,PEC_1Value,PEC_2Value,AD3511Value,AD3512Value);

            Calculate.setOnClickListener(v ->{
            bldr bldro = new bldr(this);
            bldro.how(String.valueOf(gpa));
        });


    }
}