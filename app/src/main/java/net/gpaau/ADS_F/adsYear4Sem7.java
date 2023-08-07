package net.gpaau.ADS_F;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import net.gpaau.ADS_B.FrthYr;
import net.gpaau.GradeIO.bldr;
import net.gpaau.R;

public class adsYear4Sem7 extends AppCompatActivity {

    Spinner GE3791,HSMC,OEC_2,OEC_3,OEC_4,AD3811;

    String GE3791Value,HSMCValue,OEC_2Value,OEC_3Value,OEC_4Value,AD3811Value;

    Button calculate;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads_year4_sem7);

        GE3791=findViewById(R.id.spinner);
        HSMC=findViewById(R.id.spinner7);
        OEC_2=findViewById(R.id.spinner6);
        OEC_3=findViewById(R.id.spinner5);
        OEC_4=findViewById(R.id.spinner4);
        AD3811=findViewById(R.id.spinner9);
        calculate=findViewById(R.id.button9);

        GE3791Value= (String) GE3791.getSelectedItem();
        HSMCValue= (String) HSMC.getSelectedItem();
        OEC_2Value= (String) OEC_2.getSelectedItem();
        OEC_3Value= (String) OEC_3.getSelectedItem();
        OEC_4Value= (String) OEC_4.getSelectedItem();

        FrthYr obj=new FrthYr();

        double gpa=obj.GPA_odd_even(GE3791Value,HSMCValue,OEC_2Value,OEC_3Value,OEC_4Value,AD3811Value);

        calculate.setOnClickListener(v ->{
            bldr bldro = new bldr(this);
            bldro.how(String.valueOf(gpa));
        });

    }
}