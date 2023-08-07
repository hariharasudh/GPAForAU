package net.gpaau.ECE_B;

import net.gpaau.GradeIO.CreditIO;

public class FrthYr {
	//Calculating marks for 4th year Faculty of Information and Communication ECE Engg
	CreditIO grd = new CreditIO();
	//Calculating Credits for ODD & EVEN semester
	public double GPA_odd_even(String ge3719, String hsmc, String oec1, String oec2, String oec3, String ec3711, String ec3811){
		double ui = grd.Grade_2(ge3719)+grd.Grade_3(hsmc)+grd.Grade_2(oec1)+ grd.Grade_3(oec2)+grd.Grade_2(oec3)+ grd.Grade_2(ec3711)+grd.Grade_10(ec3811);
		double credits = 26;
		return grd.round_off(ui/credits);
	}
}
