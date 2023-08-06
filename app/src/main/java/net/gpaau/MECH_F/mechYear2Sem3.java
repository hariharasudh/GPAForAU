package net.gpaau.MECH_F;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import net.gpaau.GradeIO.bldr;
import net.gpaau.Mech_B.ScndYr;
import net.gpaau.R;

public class mechYear2Sem3 extends AppCompatActivity {

	Spinner MA3351,ME3351,ME3391,CE3391,ME3392,ME3393,ME3381,ME3382,GE3361;

	String MA3351Value,ME3351Value,ME3391Value,CE3391Value,ME3392Value,ME3393Value,ME3381Value,ME3382Value,GE3361Value;

	Button calculate;
	@Override
	protected void onCreate(Bundle savedInstance){
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_mech_year2_sem3);

		MA3351=findViewById(R.id.spinner);
		ME3351=findViewById(R.id.spinner7);
		ME3391=findViewById(R.id.spinner6);
		CE3391=findViewById(R.id.spinner5);
		ME3392=findViewById(R.id.spinner4);
		ME3392=findViewById(R.id.spinner3);
		ME3381=findViewById(R.id.spinner2);
		ME3382=findViewById(R.id.spinner1);
		GE3361=findViewById(R.id.spinner8);

		MA3351Value= (String) MA3351.getSelectedItem();
		ME3351Value= (String) ME3351.getSelectedItem();
		ME3391Value= (String) ME3391.getSelectedItem();
		CE3391Value= (String) CE3391.getSelectedItem();
		ME3392Value= (String) ME3392.getSelectedItem();
		ME3393Value= (String) ME3392.getSelectedItem();
		ME3381Value= (String) ME3381.getSelectedItem();
		ME3382Value= (String) ME3382.getSelectedItem();
		GE3361Value= (String) GE3361.getSelectedItem();

		ScndYr obj=new ScndYr();

		double gpa= obj.GPA_odd(MA3351Value,ME3351Value,ME3391Value,CE3391Value,ME3392Value,ME3393Value,ME3381Value,ME3382Value,GE3361Value);

		calculate.setOnClickListener(v ->{
			bldr bldro = new bldr(this);
			bldro.how(String.valueOf(gpa));
		});



	}
}
