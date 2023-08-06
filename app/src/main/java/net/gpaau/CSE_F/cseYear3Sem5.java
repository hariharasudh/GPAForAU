package net.gpaau.CSE_F;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import net.gpaau.CSE_B.ThrdYr;
import net.gpaau.GradeIO.bldr;
import net.gpaau.R;

public class cseYear3Sem5 extends AppCompatActivity {
	//Variable Declaration
	Spinner cs3591, cs3501, cb3491, cs3551, pec1, pec2;
	Button calculate;
	@Override
	protected void onCreate(Bundle savedInstance){
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_cse_year3_sem5);
		//Variable Mapping
		cs3591 = findViewById(R.id.spinner);
		cs3501 = findViewById(R.id.spinner7);
		cb3491 = findViewById(R.id.spinner6);
		cs3551 = findViewById(R.id.spinner5);
		pec1 = findViewById(R.id.spinner4);
		pec2 = findViewById(R.id.spinner3);
		calculate = findViewById(R.id.button9);

		//Getting values
		String st_cs3591 = cs3591.getSelectedItem().toString();
		String st_cs3501 = cs3501.getSelectedItem().toString();
		String st_cb3491 = cb3491.getSelectedItem().toString();
		String st_cs3551 = cs3551.getSelectedItem().toString();
		String st_pec1 = pec1.getSelectedItem().toString();
		String st_pec2 = pec2.getSelectedItem().toString();

		//Calling Class
		ThrdYr gap = new ThrdYr();
		//Getting the calculated value
		double gpa = gap.GPA_odd(st_cs3591,st_cs3501,st_cb3491,st_cs3551,st_pec1,st_pec2);

		//Getting output from builder
		calculate.setOnClickListener(view -> {
			bldr bldro = new bldr(this);
			bldro.how(String.valueOf(gpa));
		});
	}
}
