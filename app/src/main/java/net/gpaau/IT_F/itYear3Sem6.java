package net.gpaau.IT_F;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import net.gpaau.IT_B.ThrdYr;
import net.gpaau.GradeIO.bldr;
import net.gpaau.R;

public class itYear3Sem6 extends AppCompatActivity {
	//Variable Declaration
	Spinner ccs356, it3681, oec, pec3, pec4, pec2, pec1, ncc;
	Button calculate;

	@Override
	protected void onCreate(Bundle savedInstance){
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_it_year3_sem6);
		//Variable Mapping
		ccs356 = findViewById(R.id.spinner);
		it3681 = findViewById(R.id.spinner2);
		oec = findViewById(R.id.spinner7);
		pec3 = findViewById(R.id.spinner4);
		pec4 = findViewById(R.id.spinner3);
		pec2 = findViewById(R.id.spinner5);
		pec1 = findViewById(R.id.spinner6);
		ncc = findViewById(R.id.spinner1);
		calculate = findViewById(R.id.button9);
		//Getting values
		String st_ccs356 = ccs356.getSelectedItem().toString();
		String st_it3681 = it3681.getSelectedItem().toString();
		String st_oec = oec.getSelectedItem().toString();
		String st_pec3 = pec3.getSelectedItem().toString();
		String st_pec4 = pec4.getSelectedItem().toString();
		String st_pec2 = pec2.getSelectedItem().toString();
		String st_pec1 = pec1.getSelectedItem().toString();
		String st_ncc = ncc.getSelectedItem().toString();

		//Calling Class
		ThrdYr gap = new ThrdYr();
		//Getting values
		double gpa = gap.GPA_even(st_ccs356,st_it3681,st_oec,st_pec3,st_pec4,st_pec2,st_pec1,st_ncc);

		//Getting output from builder
		calculate.setOnClickListener(view -> {
			bldr bldro = new bldr(this);
			bldro.how(String.valueOf(gpa));
		});

	}
}
