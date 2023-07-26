package net.gpaau.IT;

import androidx.annotation.Nullable;

import net.gpaau.GradeIO.GradeIO;

public class ThrdYr {
	//Calculating marks for 3rd year Faculty of Information and Communication IT Engg
	GradeIO grd = new GradeIO();
	//Calculating marks for ODD semester
	public double GPA_odd(String cs3591, String it3501, String cs3551, String cs3691, String pec1, String pec2, String it3511){
		double ui = grd.Grade_4(cs3591)+ grd.Grade_3(it3501)+grd.Grade_3(cs3551)+grd.Grade_4(cs3691)+grd.Grade_3(pec1)+grd.Grade_3(pec2)+grd.Grade_2(it3511);
		double credits = 22;
		return grd.round_off(ui/credits);
	}
	//Calculating marks for EVEN semester excluding NCC
	public double GPA_even(String ccs356, String oec, String pec1, String pec2, String pec3, String pec4, String it3691){
		double ui = grd.Grade_4(ccs356)+ grd.Grade_3(oec)+ grd.Grade_3(pec1)+ grd.Grade_3(pec2)+ grd.Grade_3(pec3)+ grd.Grade_3(pec4)+grd.Grade_1$5(it3691);
		double credits = 20.5;
		return grd.round_off(ui/credits);
	}
	//Calculating marks for EVEN semester including NCC
	public double GPA_even(String ccs356, String oec, String pec1, String pec2, String pec3, String pec4, String it3691, @Nullable String ncc){
		double ui = grd.Grade_4(ccs356)+ grd.Grade_3(oec)+ grd.Grade_3(pec1)+ grd.Grade_3(pec2)+ grd.Grade_3(pec3)+ grd.Grade_3(pec4)+grd.Grade_1$5(it3691)+ grd.Grade_3(ncc);
		double credits = 23.5;
		return grd.round_off(ui/credits);
	}
}
