package net.gpaau.ECE_B;

import androidx.annotation.Nullable;

import net.gpaau.GradeIO.CreditIO;

public class ThrdYr {
	CreditIO grd = new CreditIO();
	//Calculating marks for 3rd year Faculty of Information and Communication ECE Engg
	//Calculating marks for ODD Semester
	public double GPA_odd(String ec3501, String ec3552, String ec3551, String pec1, String pec2, String pec3, String ec3561){
		double ui = grd.Grade_4(ec3501)+grd.Grade_3(ec3552)+grd.Grade_3(ec3551)+grd.Grade_3(pec1)+grd.Grade_3(pec2)+grd.Grade_3(pec3);
		double credits = 21;
		return grd.round_off(ui/credits);
	}
	//Calculating marks for EVEN semester excluding NCC
	public double GPA_even(String et3491, String cs3491, String oec, String pec1, String pec2, String pec3){
		double ui = grd.Grade_4(et3491)+ grd.Grade_4(cs3491)+ grd.Grade_3(oec)+grd.Grade_3(pec1)+grd.Grade_3(pec2)+grd.Grade_3(pec3);
		double credits = 20;
		return grd.round_off(ui/credits);
	}
	//Calculating marks for EVEN semester including NCC
	public double GPA_even(String et3491, String cs3491, String oec, String pec1, String pec2, String pec3, @Nullable String ncc){
		double ui = grd.Grade_4(et3491)+ grd.Grade_4(cs3491)+ grd.Grade_3(oec)+grd.Grade_3(pec1)+grd.Grade_3(pec2)+grd.Grade_3(pec3)+grd.Grade_3(ncc);
		double credits = 23;
		return grd.round_off(ui/credits);
	}
}
