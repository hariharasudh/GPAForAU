package net.gpaau.ADS;

import androidx.annotation.Nullable;

import net.gpaau.GradeIO.GradeIO;

public class ThrdYr {
	//Calculating marks for 3nd year Faculty of Information and Communication ADS Engg
	GradeIO grd = new GradeIO();
	//Calculating marks for Odd Semester
	public double GPA_odd(String ad3501, String cw3551, String cs3551, String ccs334, String pec1, String pec2, String ad3511, String ad3512){
		double ui = grd.Grade_3(ad3501)+grd.Grade_3(cw3551)+ grd.Grade_3(cs3551)+ grd.Grade_3(ccs334)+ grd.Grade_3(pec1)+grd.Grade_3(pec2)+grd.Grade_2(ad3511)+grd.Grade_2(ad3512);
		double credits = 22;
		return grd.round_off(ui/credits);
	}
	//Calculating marks for Even Semester
	public double GPA_even(String cs3691, String oec, String pec1, String pec2, String pec3, String pec4){
		double ui = grd.Grade_4(cs3691)+ grd.Grade_3(oec)+grd.Grade_3(pec1)+grd.Grade_3(pec2)+grd.Grade_3(pec3)+grd.Grade_3(pec4);
		double credits = 19;
		return grd.round_off(ui/credits);
	}
	public double GPA_even(String cs3691, String oec, String pec1, String pec2, String pec3, String pec4, @Nullable String ncc){
		double ui = grd.Grade_4(cs3691)+ grd.Grade_3(oec)+grd.Grade_3(pec1)+grd.Grade_3(pec2)+grd.Grade_3(pec3)+grd.Grade_3(pec4)+grd.Grade_3(ncc);
		double credits = 22;
		return grd.round_off(ui/credits);
	}
}
