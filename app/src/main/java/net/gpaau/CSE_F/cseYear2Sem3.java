package net.gpaau.CSE_F;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import net.gpaau.CSE_B.ScndYr;
import net.gpaau.GradeIO.bldr;
import net.gpaau.R;

public class cseYear2Sem3 extends AppCompatActivity {
	//Variable Declaration
	Spinner ma3354, cs3351, cs3352, cs3301, cs3391, cs3311, cs3381, cs3361, ge3361;
	Button calculate;
	@Override
	protected void onCreate(Bundle savedInstance){
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_cse_year2_sem3);

		//Variable Mapping
		ma3354 = findViewById(R.id.spinner);
		cs3351 = findViewById(R.id.spinner7);
		cs3352 = findViewById(R.id.spinner6);
		cs3301 = findViewById(R.id.spinner5);
		cs3391 = findViewById(R.id.spinner4);
		cs3311 = findViewById(R.id.spinner3);
		cs3381 = findViewById(R.id.spinner2);
		cs3361 = findViewById(R.id.spinner1);
		ge3361 = findViewById(R.id.spinner8);
		calculate = findViewById(R.id.button9);

		//Getting values
		String st_ma3354 = ma3354.getSelectedItem().toString();
		String st_cs3351 = cs3351.getSelectedItem().toString();
		String st_cs3352 = cs3352.getSelectedItem().toString();
		String st_cs3301 = cs3301.getSelectedItem().toString();
		String st_cs3391 = cs3391.getSelectedItem().toString();
		String st_cs3381 = cs3381.getSelectedItem().toString();
		String st_cs3311 = cs3311.getSelectedItem().toString();
		String st_cs3361 = cs3361.getSelectedItem().toString();
		String st_ge3361 = ge3361.getSelectedItem().toString();

		//Calling Class
		ScndYr gap = new ScndYr();
		//Getting the calculated value
		double gpa = gap.GPA_odd(st_ma3354,st_cs3351,st_cs3352,st_cs3301,st_cs3391,st_cs3311,st_cs3381,st_cs3361,st_ge3361);

		//Getting output from builder
		calculate.setOnClickListener(view -> {
			bldr bldro = new bldr(this);
			bldro.how(String.valueOf(gpa));
		});
	}
}
