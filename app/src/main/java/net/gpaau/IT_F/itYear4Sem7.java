package net.gpaau.IT_F;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import net.gpaau.IT_B.FrthYr;
import net.gpaau.GradeIO.bldr;
import net.gpaau.R;

public class itYear4Sem7 extends AppCompatActivity {
	Spinner ge3791,hsmc,oec1,oec2,oec3,it3711,it3811;
	Button Calculate;
	@Override
	protected void onCreate(Bundle savedInstance){
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_it_year4_sem7);

		ge3791 = findViewById(R.id.spinner);
		hsmc = findViewById(R.id.spinner7);
		oec1 = findViewById(R.id.spinner6);
		oec2 = findViewById(R.id.spinner5);
		oec3 = findViewById(R.id.spinner4);
		it3711 = findViewById(R.id.spinner3);
		it3811 = findViewById(R.id.spinner2);
		Calculate = findViewById(R.id.button9);

		String st_ge3791 = ge3791.getSelectedItem().toString();
		String st_hsmc = hsmc.getSelectedItem().toString();
		String st_oec1 = oec1.getSelectedItem().toString();
		String st_oec2 = oec2.getSelectedItem().toString();
		String st_oec3 = oec3.getSelectedItem().toString();
		String st_it3711 = it3711.getSelectedItem().toString();
		String st_it3811 = it3811.getSelectedItem().toString();

		//Calling Class
		FrthYr gap = new FrthYr();
		//Getting the calculated value
		double gpa = gap.GPA_odd_even(st_ge3791,st_hsmc,st_oec1,st_oec2,st_oec3,st_it3711,st_it3811);
		//Getting output from builder
		Calculate.setOnClickListener(view -> {
			bldr bldro = new bldr(this);
			bldro.how(String.valueOf(gpa));
		});
	}
}