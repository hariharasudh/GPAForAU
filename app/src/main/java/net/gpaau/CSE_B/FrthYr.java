package net.gpaau.CSE_B;

import net.gpaau.GradeIO.GradeIO;

public class FrthYr {
	//Calculating marks for 4th year Faculty of Information and Communication CSE Engg
	GradeIO grd = new GradeIO();
	//Calculating marks for ODD & EVEN Semester
	public double GPA_odd_even(String ge3791, String hsmc, String oec1, String oec2, String oec3, String cs3711, String cs3811){
		double ui = grd.Grade_2(ge3791)+grd.Grade_3(hsmc)+grd.Grade_3(oec1)+grd.Grade_3(oec2)+grd.Grade_3(oec3)+ grd.Grade_2(cs3711)+grd.Grade_10(cs3811);
		double credits = 24;
		return grd.round_off(ui/credits);
	}
}
