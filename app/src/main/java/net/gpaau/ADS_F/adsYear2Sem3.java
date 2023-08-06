package net.gpaau.ADS_F;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import net.gpaau.ADS_B.ScndYr;
import net.gpaau.GradeIO.bldr;
import net.gpaau.R;

public class adsYear2Sem3 extends AppCompatActivity {

    Spinner MA3354,CS3351,AD3391,AD3351,AD3301,AL3391,AD3381,AD3311,GE3361;

    String MA3354Value,CS3351Value,AD3391Value,AD3351Value,AD3301Value,AL3391Value,AD3381Value,AD3311Value,GE3361Value;

    Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads_year2_sem3);

        calculate=findViewById(R.id.button9);

        MA3354=findViewById(R.id.spinner);
        CS3351=findViewById(R.id.spinner7);
        AD3391=findViewById(R.id.spinner6);
        AD3351=findViewById(R.id.spinner5);
        AD3301=findViewById(R.id.spinner4);
        AL3391=findViewById(R.id.spinner3);
        AD3381=findViewById(R.id.spinner2);
        AD3311=findViewById(R.id.spinner1);
        GE3361=findViewById(R.id.spinner8);

        MA3354Value= (String) MA3354.getSelectedItem();
        CS3351Value= (String) CS3351.getSelectedItem();
        AD3391Value= (String) AD3391.getSelectedItem();
        AD3351Value= (String) AD3351.getSelectedItem();
        AD3301Value= (String) AD3301.getSelectedItem();
        AL3391Value= (String) AL3391.getSelectedItem();
        AD3381Value= (String) AD3381.getSelectedItem();
        AD3311Value= (String) AD3311.getSelectedItem();
        GE3361Value= (String) GE3361.getSelectedItem();

        ScndYr obj =new ScndYr();

        double gpa=obj.GPA_odd(MA3354Value,CS3351Value,AD3391Value,AD3351Value,AD3301Value,AL3391Value,AD3381Value,AD3311Value,GE3361Value);

        calculate.setOnClickListener(v ->{
            bldr bldro = new bldr(this);
            bldro.how(String.valueOf(gpa));
        });




    }
}