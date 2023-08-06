package net.gpaau.CSE_F;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import net.gpaau.CSE_B.FrthYr;
import net.gpaau.GradeIO.bldr;
import net.gpaau.R;

public class cseYear4Sem7 extends AppCompatActivity {
	//Variable Declaration
	Spinner ge3791, hsmc, oec2, oec3, oec4, eecSummer, eecProject;
	Button Calculate;
	@Override
	protected void onCreate(Bundle savedInstance){
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_cse_year4_sem7);
		//Variable Mapping
		ge3791 = findViewById(R.id.spinner);
		hsmc = findViewById(R.id.spinner7);
		oec2 = findViewById(R.id.spinner6);
		oec3 = findViewById(R.id.spinner5);
		oec4 = findViewById(R.id.spinner4);
		eecSummer = findViewById(R.id.spinner3);
		eecProject = findViewById(R.id.spinner11);
		Calculate = findViewById(R.id.button9);
		//Getting values
		String st_ge3791 = ge3791.getSelectedItem().toString();
		String st_hsmc = hsmc.getSelectedItem().toString();
		String st_oec2 = oec2.getSelectedItem().toString();
		String st_oec3 = oec3.getSelectedItem().toString();
		String st_oec4 = oec4.getSelectedItem().toString();
		String st_eecSummer = eecSummer.getSelectedItem().toString();
		String st_eecProject = eecProject.getSelectedItem().toString();

		//Calling Class
		FrthYr gap = new FrthYr();
		//Getting the calculated value
		double gpa = gap.GPA_odd_even(st_ge3791,st_hsmc,st_oec2,st_oec3,st_oec4,st_eecProject,st_eecSummer);
		//Getting output from builder
		Calculate.setOnClickListener(view -> {
			bldr bldro = new bldr(this);
			bldro.how(String.valueOf(gpa));
		});
	}
}
