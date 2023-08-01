package net.gpaau.ADS_F;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import net.gpaau.ADS_B.FstYr;
import net.gpaau.R;

public class adsYear1Sem1 extends AppCompatActivity {
//    Spinner HS3152,MA3151,PH3151,CY3151,GE3151,GE3152,GE3171,BS3171,GE3172;
//    String HS3152Value,MA3151Value,PH3151Value,CY3151Value,GE3151Value,GE3152Value,GE3171Value,BS3171Value,GE3172Value;

    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads_year1_sem1);

//        HS3152=findViewById(R.id.spinner);
//        MA3151=findViewById(R.id.spinner7);
//        PH3151=findViewById(R.id.spinner6);
//        CY3151=findViewById(R.id.spinner5);
//        GE3151=findViewById(R.id.spinner4);
//        GE3152=findViewById(R.id.spinner3);
//        GE3171=findViewById(R.id.spinner2);
//        BS3171=findViewById(R.id.spinner1);
//        GE3172=findViewById(R.id.spinner9);
//
        calculate=findViewById(R.id.button9);
//
//        HS3152Value= (String) HS3152.getSelectedItem();
//        MA3151Value = (String) MA3151.getSelectedItem();
//        PH3151Value=(String) PH3151.getSelectedItem();
//        CY3151Value=(String) CY3151.getSelectedItem();
//        GE3151Value=(String) GE3151.getSelectedItem();
//        GE3152Value= (String) GE3152.getSelectedItem();
//        GE3171Value=(String) GE3171.getSelectedItem();
//        BS3171Value=(String) BS3171.getSelectedItem();
//        GE3172Value=(String) GE3172.getSelectedItem();

        FstYr obj=new FstYr();
        double gpa = obj.GPA_odd("A", "A", "A", "A", "A", "A", "A", "A", "A");
        Toast.makeText(this, String.valueOf(gpa), Toast.LENGTH_SHORT).show();
    }
}