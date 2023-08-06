package net.gpaau.MECH_F;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import net.gpaau.GradeIO.bldr;
import net.gpaau.Mech_B.FstYr;
import net.gpaau.R;

public class mechYear1Sem2 extends AppCompatActivity {

	Spinner HS3252,MA3251,PH3251,BE3251,GE3251,NCC,GE3252,GE3271,BE3271,GE3272;

	String HS3252Value,MA3251Value,PH3251Value,BE3251Value,GE3251Value,NCCValue,GE3252Value,GE3271Value,BE3271Value,GE3272Value;

	Button calculate;

	@Override
	protected void onCreate(Bundle savedInstance){
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_mech_year1_sem2);

		HS3252 = findViewById(R.id.spinner);
		MA3251=findViewById(R.id.spinner7);
		PH3251=findViewById(R.id.spinner6);
		BE3251=findViewById(R.id.spinner5);
		GE3251=findViewById(R.id.spinner4);
		NCC=findViewById(R.id.spinner3);
		GE3252=findViewById(R.id.spinner2);
		GE3271=findViewById(R.id.spinner1);
		BE3271=findViewById(R.id.spinner9);
		GE3272=findViewById(R.id.spinner8);

		HS3252Value= (String) HS3252.getSelectedItem();
		MA3251Value= (String) MA3251.getSelectedItem();
		PH3251Value= (String) PH3251.getSelectedItem();
		BE3251Value= (String) BE3251.getSelectedItem();
		GE3251Value= (String) GE3251.getSelectedItem();
		NCCValue= (String) NCC.getSelectedItem();
		GE3252Value= (String) GE3252.getSelectedItem();
		GE3271Value= (String) GE3271.getSelectedItem();
		BE3271Value= (String) BE3271.getSelectedItem();
		BE3271Value= (String) GE3272.getSelectedItem();

		net.gpaau.Mech_B.FstYr obj=new FstYr();

		double gpa= obj.GPA_even(HS3252Value,MA3251Value,PH3251Value,BE3251Value,GE3251Value,NCCValue,GE3252Value,GE3271Value,BE3271Value,GE3272Value);

		calculate.setOnClickListener(v ->{
			bldr bldro = new bldr(this);
			bldro.how(String.valueOf(gpa));
		});

	}
}
