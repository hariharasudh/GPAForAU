package net.gpaau.CSE_F;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import net.gpaau.CSE_B.FstYr;
import net.gpaau.GradeIO.GradeIO;
import net.gpaau.GradeIO.bldr;
import net.gpaau.R;

public class cseYear1Sem1 extends AppCompatActivity {
	//Variable Declaration
	Spinner hs3152, ma3152, ph3152, cy3151, ge3152, ge3151, ge3171, bs3172, ge3172;
	Button calculate;
	@Override
	protected void onCreate(Bundle savedInstance){
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_cse_year1_sem1);

		//Variable Mapping
		hs3152 = findViewById(R.id.spinner);
		ma3152 = findViewById(R.id.spinner7);
		ph3152 = findViewById(R.id.spinner6);
		cy3151 = findViewById(R.id.spinner5);
		ge3152 = findViewById(R.id.spinner3);
		ge3151 = findViewById(R.id.spinner4);
		ge3171 = findViewById(R.id.spinner2);
		bs3172 = findViewById(R.id.spinner1);
		ge3172 = findViewById(R.id.spinner9);
		calculate = findViewById(R.id.button9);

		//Getting values
		String st_hs3152 = hs3152.getSelectedItem().toString();
		String st_ma3152 = ma3152.getSelectedItem().toString();
		String st_ph3152 = ph3152.getSelectedItem().toString();
		String st_cy3151 = cy3151.getSelectedItem().toString();
		String st_ge3152 = ge3152.getSelectedItem().toString();
		String st_ge3151 = ge3151.getSelectedItem().toString();
		String st_ge3171 = ge3171.getSelectedItem().toString();
		String st_bs3172 = bs3172.getSelectedItem().toString();
		String st_ge3172 = ge3172.getSelectedItem().toString();

		//Calling Class
		FstYr gap = new FstYr();
		//Getting the calculated value
		double gpa = gap.GPA_odd(st_hs3152,st_ma3152,st_ph3152,st_cy3151,st_ge3151,st_ge3152,st_ge3171,st_bs3172,st_ge3172);

		//Getting output from builder
		calculate.setOnClickListener(view -> {
			bldr bldro = new bldr(this);
			bldro.how(String.valueOf(gpa));
		});
	}
}
