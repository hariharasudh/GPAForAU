package net.gpaau.ADS_F;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import net.gpaau.ADS_B.ThrdYr;
import net.gpaau.GradeIO.bldr;
import net.gpaau.R;

public class adsYear3Sem6 extends AppCompatActivity {

    Spinner CS3691,OEC_1,PEC_3,PEC_4,PEC_5,PEC_6,NCC;

    String CS3691Value,OEC_1Value,PEC_3Value,PEC_4Value,PEC_5Value,PEC_6Value,NCCValue;

    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads_year3_sem6);

        CS3691=findViewById(R.id.spinner);
        OEC_1=findViewById(R.id.spinner7);
        PEC_3=findViewById(R.id.spinner6);
        PEC_4=findViewById(R.id.spinner5);
        PEC_5=findViewById(R.id.spinner4);
        PEC_6=findViewById(R.id.spinner3);
        NCC=findViewById(R.id.spinner1);


        CS3691Value= (String) CS3691.getSelectedItem();
        OEC_1Value= (String) OEC_1.getSelectedItem();
        PEC_3Value= (String) PEC_3.getSelectedItem();
        PEC_4Value= (String) PEC_4.getSelectedItem();
        PEC_5Value= (String) PEC_5.getSelectedItem();
        PEC_6Value= (String) PEC_6.getSelectedItem();
        NCCValue= (String) NCC.getSelectedItem();

        ThrdYr obj=new ThrdYr();

        double gpa=obj.GPA_even(CS3691Value,OEC_1Value,PEC_3Value,PEC_4Value,PEC_5Value,PEC_6Value,NCCValue);
        calculate.setOnClickListener(v ->{
            bldr bldro = new bldr(this);
            bldro.how(String.valueOf(gpa));
        });



    }
}