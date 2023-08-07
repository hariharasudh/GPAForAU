package net.gpaau;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import net.gpaau.ECE_F.eceYear1Sem1;
import net.gpaau.ECE_F.eceYear1Sem2;
import net.gpaau.ECE_F.eceYear2Sem3;
import net.gpaau.ECE_F.eceYear2Sem4;
import net.gpaau.ECE_F.eceYear3Sem5;
import net.gpaau.ECE_F.eceYear3Sem6;
import net.gpaau.ECE_F.eceYear4Sem7;

public class eceSemester extends AppCompatActivity {


	Button sem1,sem2,sem3,sem4,sem5,sem6,sem7;
	Intent isem1,isem2,isem3,isem4,isem5,isem6,isem7;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ece_semester);

		sem1=findViewById(R.id.button);
		sem2=findViewById(R.id.button8);
		sem3=findViewById(R.id.button7);
		sem4=findViewById(R.id.button6);
		sem5=findViewById(R.id.button5);
		sem6=findViewById(R.id.button4);
		sem7=findViewById(R.id.button3);


		isem1=new Intent(this, eceYear1Sem1.class);

		isem2=new Intent(this, eceYear1Sem2.class);

		isem3=new Intent(this, eceYear2Sem3.class);

		isem4=new Intent(this, eceYear2Sem4.class);

		isem5=new Intent(this, eceYear3Sem5.class);

		isem6=new Intent(this, eceYear3Sem6.class);

		isem7=new Intent(this, eceYear4Sem7.class);


		sem1.setOnClickListener(v -> startActivity(isem1));

		sem2.setOnClickListener(v -> startActivity(isem2));

		sem3.setOnClickListener(v -> startActivity(isem4));

		sem4.setOnClickListener(v -> startActivity(isem4));

		sem5.setOnClickListener(v -> startActivity(isem5));

		sem6.setOnClickListener(v -> startActivity(isem6));

		sem7.setOnClickListener(v -> startActivity(isem7));

	}
}