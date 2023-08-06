package net.gpaau.ADS_F;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import net.gpaau.ADS_B.ScndYr;
import net.gpaau.GradeIO.bldr;
import net.gpaau.R;

public class adsYear2sem4 extends AppCompatActivity {

    Spinner MA3391,AL3452,AL3451,AD3491,CS3591,GE3451,NCC,AD3411,AD3461;

    String MA3391Value,AL3452Value,AL3451Value,AD3491Value,CS3591Value,GE3451Value,NCCValue,AD3411Value,AD3461Value;

    Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads_year2sem4);

        MA3391=findViewById(R.id.spinner);
        AL3452=findViewById(R.id.spinner7);
        AL3451=findViewById(R.id.spinner6);
        AD3491=findViewById(R.id.spinner5);
        CS3591=findViewById(R.id.spinner4);
        GE3451=findViewById(R.id.spinner3);
        NCC=findViewById(R.id.spinner2);
        AD3411=findViewById(R.id.spinner1);
        AD3461=findViewById(R.id.spinner8);

        MA3391Value= (String) MA3391.getSelectedItem();
        AL3452Value= (String) AL3452.getSelectedItem();
        AL3451Value= (String) AL3451.getSelectedItem();
        AD3491Value= (String) AD3491.getSelectedItem();
        CS3591Value= (String) CS3591.getSelectedItem();
        GE3451Value= (String) GE3451.getSelectedItem();
        NCCValue= (String) NCC.getSelectedItem();
        AD3411Value= (String) AD3411.getSelectedItem();
        AD3461Value= (String) AD3461.getSelectedItem();

        ScndYr obj=new ScndYr();

        double gpa = obj.GPA_even(MA3391Value,AL3452Value,AL3451Value,AD3491Value,CS3591Value,GE3451Value,NCCValue,AD3411Value,AD3461Value);

        calculate.setOnClickListener(v ->{
            bldr bldro = new bldr(this);
            bldro.how(String.valueOf(gpa));
        });

    }
}