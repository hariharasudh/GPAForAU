package net.gpaau.ADS;

import net.gpaau.GradeIO.GradeIO;

//Calculating marks for 4th year Faculty of Information and Communication ADS Engg
public class FrthYr {
	GradeIO grd = new GradeIO();
	//Calculating marks for ODD & Even semester
	public double GPA_odd_even(String ge3791, String hsmc, String oec1, String oec2, String oec3, String ad3811){
		double ui = grd.Grade_2(ge3791)+grd.Grade_3(hsmc)+grd.Grade_3(oec1)+grd.Grade_3(oec2)+grd.Grade_3(oec3)+grd.Grade_10(ad3811);
		double credits = 24;
		return grd.round_off(ui/credits);
	}

}
