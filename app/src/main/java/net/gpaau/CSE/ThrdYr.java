package net.gpaau.CSE;

import androidx.annotation.Nullable;

import net.gpaau.GradeIO.GradeIO;

public class ThrdYr {
	//Calculating marks for 3rd year Faculty of Information and Communication CSE Engg
	GradeIO grd = new GradeIO();
	//Calculating marks for ODD Semester
	public double GPA_odd(String cs3591, String cs3501, String cb3491, String cs3551, String pec1, String pec2){
		double ui = grd.Grade_4(cs3591)+ grd.Grade_4(cs3501)+ grd.Grade_3(cb3491)+grd.Grade_3(cs3551)+grd.Grade_3(pec1)+grd.Grade_3(pec2);
		double credits = 20;
		return grd.round_off(ui/credits);
	}
	// Calculating marks for Even Semester excluding NCC
	public double GPA_even(String ccs356, String cs3691, String oec, String pec1, String pec2, String pec3, String pec4){
		double ui = grd.Grade_4(ccs356)+grd.Grade_4(cs3691)+grd.Grade_3(oec)+grd.Grade_3(pec1)+grd.Grade_3(pec2)+grd.Grade_3(pec3)+grd.Grade_3(pec4);
		double credits = 23;
		return grd.round_off(ui/credits);
	}
	// Calculating marks for Even Semester including NCC
	public double GPA_even(String ccs356, String cs3691, String oec, String pec1, String pec2, String pec3, String pec4, @Nullable String ncc){
		double ui = grd.Grade_4(ccs356)+grd.Grade_4(cs3691)+grd.Grade_3(oec)+grd.Grade_3(pec1)+grd.Grade_3(pec2)+grd.Grade_3(pec3)+grd.Grade_3(pec4)+ grd.Grade_3(ncc);
		double credits = 26;
		return grd.round_off(ui/credits);
	}

}
