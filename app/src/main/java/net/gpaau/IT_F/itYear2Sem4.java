package net.gpaau.IT_F;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import net.gpaau.GradeIO.bldr;
import net.gpaau.IT_B.ScndYr;
import net.gpaau.R;

public class itYear2Sem4 extends AppCompatActivity {
	//Variable Declaration
	Spinner cs3452, cs3491, cs3492, it3401, cs3451, ge3451, ncc, cs3461, cs3481;
	Button calculate;
	@Override
	protected void onCreate(Bundle savedInstance){
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_it_year2_sem4);
		//Variable Mapping
		cs3452 = findViewById(R.id.spinner);
		cs3491 = findViewById(R.id.spinner7);
		cs3492 = findViewById(R.id.spinner6);
		it3401 = findViewById(R.id.spinner5);
		cs3451 = findViewById(R.id.spinner4);
		ge3451 = findViewById(R.id.spinner3);
		cs3461 = findViewById(R.id.spinner2);
		cs3481 = findViewById(R.id.spinner1);
		ncc = findViewById(R.id.spinner14);
		calculate = findViewById(R.id.button9);

		//Getting values
		String st_cs3452 = cs3452.getSelectedItem().toString();
		String st_cs3491 = cs3491.getSelectedItem().toString();
		String st_cs3492 = cs3492.getSelectedItem().toString();
		String st_it3401 = it3401.getSelectedItem().toString();
		String st_cs3451 = cs3451.getSelectedItem().toString();
		String st_ge3451 = ge3451.getSelectedItem().toString();
		String st_ncc = ncc.getSelectedItem().toString();
		String st_cs3461 = cs3461.getSelectedItem().toString();
		String st_cs3481 = cs3481.getSelectedItem().toString();

		//Calling Class
		ScndYr gap = new ScndYr();
		//Getting the calculated value
		double gpa = gap.GPA_even(st_cs3452,st_cs3491,st_cs3492,st_it3401,st_cs3451,st_ge3451,st_cs3461,st_cs3481,st_ncc);

		//Getting output from builder
		calculate.setOnClickListener(view -> {
			bldr bldro = new bldr(this);
			bldro.how(String.valueOf(gpa));
		});

	}
}
