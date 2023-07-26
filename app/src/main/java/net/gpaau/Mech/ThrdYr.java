package net.gpaau.Mech;

import androidx.annotation.Nullable;

import net.gpaau.GradeIO.GradeIO;

public class ThrdYr {
	//Calculating marks for 3rd year Faculty of Information and Communication IT Engg
	GradeIO grd = new GradeIO();
	//Calculating marks for ODD semester
	public double GPA_odd(String me3591, String me3592, String pec1, String pec2, String pec3, String me3511, String me3581){
		double ui = grd.Grade_4(me3591)+grd.Grade_3(me3592)+grd.Grade_3(pec1)+grd.Grade_3(pec2)+grd.Grade_3(pec3)+grd.Grade_1(me3511)+grd.Grade_2(me3581);
		double credits = 19;
		return grd.round_off(ui/credits);
	}
	//Calculating marks for EVEN semester excluding NCC
	public double GPA_even(String me3691, String pec4, String pec5, String pec6, String pec7, String oec1, String me3681, String me3682){
		double ui = grd.Grade_4(me3691)+ grd.Grade_3(pec4)+ grd.Grade_3(pec5)+ grd.Grade_3(pec6)+ grd.Grade_3(pec7)+ grd.Grade_3(oec1)+grd.Grade_2(me3681)+grd.Grade_2(me3682);
		double credits = 23;
		return grd.round_off(ui/credits);
	}
	//Calculating marks for EVEN semester including NCC
	public double GPA_even(String me3691, String pec4, String pec5, String pec1, String pec2, String oec1, String me3681, String me3682, @Nullable String ncc){
		double ui = grd.Grade_4(me3691)+ grd.Grade_3(pec4)+ grd.Grade_3(pec5)+ grd.Grade_3(pec1)+ grd.Grade_3(pec2)+ grd.Grade_3(oec1)+grd.Grade_2(me3681)+grd.Grade_2(me3682);
		double credits = 26;
		return grd.round_off(ui/credits);
	}
}
