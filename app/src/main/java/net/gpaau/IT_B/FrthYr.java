package net.gpaau.IT_B;

import net.gpaau.GradeIO.CreditIO;

public class FrthYr {
	//Calculating marks for 4th year Faculty of Information and Communication IT Engg
	CreditIO grd = new CreditIO();
	//Calculating marks for ODD & EVEN Semester
	public double GPA_odd_even(String ge3791, String hsmc, String oec1, String oec2, String oec3, String it3711, String it3811){
		double ui = grd.Grade_2(ge3791)+grd.Grade_3(hsmc)+grd.Grade_3(oec1)+grd.Grade_3(oec2)+grd.Grade_3(oec3)+ grd.Grade_2(it3711)+grd.Grade_10(it3811);
		double credits = 26;
		return grd.round_off(ui/credits);
	}
}
