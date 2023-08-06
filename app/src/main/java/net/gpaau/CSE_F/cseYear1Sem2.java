package net.gpaau.CSE_F;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import net.gpaau.CSE_B.FstYr;
import net.gpaau.GradeIO.bldr;
import net.gpaau.R;

public class cseYear1Sem2 extends AppCompatActivity {
	//Variable Declaration
	Spinner hs3252, ma3251, ph3256, be3251, ge3251, cs3251, ge3252, ge3271, cs3271, ge3272, ncc;
	Button calculate;
	@Override
	protected void onCreate(Bundle savedInstance){
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_cse_year1_sem2);

		//Variable Mapping
		hs3252 = findViewById(R.id.spinner);
		ma3251 = findViewById(R.id.spinner7);
		ph3256 = findViewById(R.id.spinner6);
		be3251 = findViewById(R.id.spinner5);
		ge3251 = findViewById(R.id.spinner4);
		cs3251 = findViewById(R.id.spinner3);
		ge3252 = findViewById(R.id.spinner2);
		ge3271 = findViewById(R.id.spinner1);
		cs3271 = findViewById(R.id.spinner9);
		ge3272 = findViewById(R.id.spinner8);
		ncc = findViewById(R.id.spinner10);
		calculate = findViewById(R.id.button9);

		//Getting values
		String st_hs3252 = hs3252.getSelectedItem().toString();
		String st_ma3251 = ma3251.getSelectedItem().toString();
		String st_ph3256 = ph3256.getSelectedItem().toString();
		String st_be3251 = be3251.getSelectedItem().toString();
		String st_ge3251 = ge3251.getSelectedItem().toString();
		String st_cs3251 = cs3251.getSelectedItem().toString();
		String st_ge3252 = ge3252.getSelectedItem().toString();
		String st_ge3271 = ge3271.getSelectedItem().toString();
		String st_cs3271 = cs3271.getSelectedItem().toString();
		String st_ge3272 = ge3272.getSelectedItem().toString();

		//Calling Class
		FstYr gap = new FstYr();
		//Getting the calculated value
		double gpa = gap.GPA_even(st_hs3252,st_ma3251,st_ph3256,st_be3251,st_ge3251,st_cs3251,st_ge3252,st_ge3271,st_ge3272,st_cs3271);

		//Getting output from builder
		calculate.setOnClickListener(view -> {
			bldr bldro = new bldr(this);
			bldro.how(String.valueOf(gpa));
		});
	}
}
