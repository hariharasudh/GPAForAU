package net.gpaau.ADS_F;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import net.gpaau.ADS_B.FstYr;
import net.gpaau.GradeIO.bldr;
import net.gpaau.R;

public class adsYear1Sem2 extends AppCompatActivity {

//    TextView fill;
    String HS3252,MA3251,PH3256,BE3251,GE3251,AD3251,GE3252,GE3271,AD3271,GE3272,NCC;
    Spinner HS3252Value,MA3251Value,PH3256Value,BE3251Value,GE3251Value,AD3251Value,GE3252Value,GE3271Value,AD3271Value,GE3272Value,NCCValue;

    Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads_year1_sem2);

        HS3252Value=findViewById(R.id.spinner);
        MA3251Value=findViewById(R.id.spinner7);
        PH3256Value=findViewById(R.id.spinner6);
        BE3251Value=findViewById(R.id.spinner5);
        GE3251Value=findViewById(R.id.spinner4);
        AD3251Value=findViewById(R.id.spinner3);
        GE3252Value=findViewById(R.id.spinner2);
        GE3271Value=findViewById(R.id.spinner1);
        AD3271Value=findViewById(R.id.spinner9);
        GE3272Value=findViewById(R.id.spinner8);
        NCCValue=findViewById(R.id.spinner10);
        calculate = findViewById(R.id.button9);

        HS3252= (String) HS3252Value.getSelectedItem();
        MA3251= (String) MA3251Value.getSelectedItem();
        PH3256= (String) PH3256Value.getSelectedItem();
        BE3251= (String) BE3251Value.getSelectedItem();
        GE3251= (String) GE3251Value.getSelectedItem();
        AD3251= (String) AD3251Value.getSelectedItem();
        GE3252= (String) GE3252Value.getSelectedItem();
        GE3271= (String) GE3271Value.getSelectedItem();
        AD3271= (String) AD3271Value.getSelectedItem();
        GE3272= (String) GE3272Value.getSelectedItem();
        NCC= (String) NCCValue.getSelectedItem();

        FstYr obj=new FstYr();

        double gpa= obj.GPA_even(HS3252,MA3251,PH3256,BE3251,GE3251,AD3251,GE3252,GE3271,AD3271,GE3272,NCC);

        calculate.setOnClickListener(v ->{
            bldr bldro = new bldr(this);
            bldro.how(String.valueOf(gpa));
        });
    }
}