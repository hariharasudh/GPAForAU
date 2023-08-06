package net.gpaau.CSE_F;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import net.gpaau.CSE_B.ThrdYr;
import net.gpaau.GradeIO.bldr;
import net.gpaau.R;

public class cseYear3Sem6 extends AppCompatActivity {
	//Variable Declaration
	Spinner ccs356, cs3691, oec1, pec3, pec4, pec5, pec6, ncc;
	Button calculate;
	@Override
	protected void onCreate(Bundle savedInstance){
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_cse_year3_sem6);
		//Variable Mapping
		ccs356 = findViewById(R.id.spinner);
		cs3691 = findViewById(R.id.spinner7);
		oec1 = findViewById(R.id.spinner6);
		pec3 = findViewById(R.id.spinner5);
		pec4 = findViewById(R.id.spinner4);
		pec5 = findViewById(R.id.spinner3);
		pec6 = findViewById(R.id.spinner2);
		ncc = findViewById(R.id.spinner1);

		//Getting values
		String st_ccs356 = ccs356.getSelectedItem().toString();
		String st_cs3691 = cs3691.getSelectedItem().toString();
		String st_oec1 = oec1.getSelectedItem().toString();
		String st_pec3 = pec3.getSelectedItem().toString();
		String st_pec4 = pec4.getSelectedItem().toString();
		String st_pec5 = pec5.getSelectedItem().toString();
		String st_pec6 = pec6.getSelectedItem().toString();
		String st_ncc = ncc.getSelectedItem().toString();

		//Calling Class
		ThrdYr gap = new ThrdYr();
		//Getting values
		double gpa = gap.GPA_even(st_ccs356,st_cs3691,st_oec1,st_pec3,st_pec4,st_pec5,st_pec6,st_ncc);

		//Getting output from builder
		calculate.setOnClickListener(view -> {
			bldr bldro = new bldr(this);
			bldro.how(String.valueOf(gpa));
		});
	}
}
