package net.gpaau.Mech_B;

import androidx.annotation.Nullable;

import net.gpaau.GradeIO.CreditIO;

public class ScndYr {
	//Calculating marks for 2nd year Faculty of Information and Communication ADS Engg
	CreditIO grd = new CreditIO();
	//Calculating marks for Odd Semester
	public double GPA_odd(String ma3351, String me3351, String me3391, String ce3391, String me3392, String me3393, String me3381, String me3382, String ge3361) {
		double ui = grd.Grade_4(ma3351) + grd.Grade_3(me3351) + grd.Grade_3(me3391) + grd.Grade_4(ce3391) + grd.Grade_3(me3392) + grd.Grade_3(me3393) + grd.Grade_2(me3381) + grd.Grade_2(me3382) + grd.Grade_1(ge3361);
		double credit = 25;
		return new CreditIO().round_off(ui/credit);
	}
	//Calculating Marks for Even Semester excluding NCC
	public double GPA_even(String me3491, String me3451, String me3492, String me3493, String ce3491, String ge3451, String ce3481, String me3461){
		double ui = grd.Grade_3(me3491)+ grd.Grade_4(me3451)+grd.Grade_3(me3492)+ grd.Grade_3(me3493)+grd.Grade_3(ce3491)+grd.Grade_2(ge3451)+grd.Grade_2(ce3481)+grd.Grade_2(me3461);
		double credit = 22;
		return grd.round_off(ui/credit);
	}
	//Calculating Marks for Even Semester including NCC
	public double GPA_even(String me3491, String me3451, String me3492, String me3493, String ce3491, String ge3451, String ce3481, String me3461, @Nullable String nss){
		double ui = grd.Grade_3(me3491)+ grd.Grade_4(me3451)+grd.Grade_3(me3492)+ grd.Grade_3(me3493)+grd.Grade_3(ce3491)+grd.Grade_2(ge3451)+grd.Grade_2(ce3481)+grd.Grade_2(me3461)+grd.Grade_3(nss);
		double credit = 25;
		return grd.round_off(ui/credit);
	}
}
