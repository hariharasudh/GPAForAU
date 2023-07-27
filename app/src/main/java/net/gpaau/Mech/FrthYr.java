package net.gpaau.Mech;

import net.gpaau.GradeIO.GradeIO;

public class FrthYr {
	//Calculating marks for 4th year Faculty of Mechanical Engineering Mech Engg
	GradeIO grd = new GradeIO();
	//Calculating marks for ODD & EVEN Semester
	public double GPA_odd_even(String me3791, String me3792, String ge3791, String ge3792, String oec1, String oec2, String oec3, String me3781, String me3711, String me3811){
		double ui = grd.Grade_3(me3791)+grd.Grade_3(me3792)+grd.Grade_2(ge3791)+grd.Grade_3(ge3792)+grd.Grade_3(oec1)+grd.Grade_3(oec2)+grd.Grade_3(oec3)+grd.Grade_2(me3781)+grd.Grade_1(me3711)+grd.Grade_10(me3811);
		double credits = 33;
		return grd.round_off(ui/credits);
	}
}
