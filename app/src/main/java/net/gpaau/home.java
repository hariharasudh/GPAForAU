package net.gpaau;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {
	ImageButton aids,cse,mech,it;
	Intent aidsSemester,cseSemester,mechSemester,itSemester;
	@SuppressLint("SetTextI18n")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		//Initial Declaration
		aids=findViewById(R.id.imageButton7);
		cse=findViewById(R.id.imageButton10);
		mech=findViewById(R.id.imageButton9);
		it=findViewById(R.id.imageButton8);

		//Creating Intents
		cseSemester=new Intent(this,cseSemester.class);
		mechSemester=new Intent(this,mechSemester.class);
		itSemester=new Intent(this,itSemester.class);
		aidsSemester=new Intent(this,aidsSemester.class);

		//Setting onClick and starting upon next page
		aids.setOnClickListener(v -> startActivity(aidsSemester));

		mech.setOnClickListener(v -> startActivity(mechSemester));

		cse.setOnClickListener(v -> startActivity(cseSemester));

		it.setOnClickListener(v -> startActivity(itSemester));
	}
}