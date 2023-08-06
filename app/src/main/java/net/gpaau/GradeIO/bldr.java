package net.gpaau.GradeIO;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

import net.gpaau.R;

public class bldr extends AlertDialog.Builder{

	public bldr(@NonNull Context context) {
		super(context);
	}
	public void how(String gpau) {
		this.setTitle(R.string.app_name)
				.setIcon(R.mipmap.ic_launcher_round)
				.setMessage(gpau)
				.setCancelable(true)
				.setNegativeButton("Cancel", (y, d) -> y.dismiss())
				.show();
	}
}
