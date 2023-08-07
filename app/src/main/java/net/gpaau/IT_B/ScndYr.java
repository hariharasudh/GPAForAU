package net.gpaau.IT_B;

import androidx.annotation.Nullable;

import net.gpaau.GradeIO.CreditIO;

public class ScndYr {
	//Calculating marks for 2nd year Faculty of Information and Communication IT Engg
	CreditIO grd = new CreditIO();
	//Calculating marks for Odd Semester
	public double GPA_odd(String ma3354, String cs3351, String cs3352, String cd3291, String cs3391, String cd3281, String cs3381, String cs3361, String ge3361) {
		double ui = grd.Grade_4(ma3354) + grd.Grade_4(cs3351) + grd.Grade_3(cs3352) + grd.Grade_3(cd3291) + grd.Grade_3(cs3391) + grd.Grade_2(cd3281) + grd.Grade_1$5(cs3381) + grd.Grade_2(cs3361) + grd.Grade_1(ge3361);
		double credit = 23.5;
		return new CreditIO().round_off(ui/credit);
	}
	//Calculating Marks for Even Semester excluding NCC
	public double GPA_even(String cs3452, String cs3491, String cs3492, String it3401, String cs3451, String ge3451, String cs3461, String cs3481){
		double ui = grd.Grade_3(cs3452)+ grd.Grade_4(cs3491)+grd.Grade_3(cs3492)+ grd.Grade_4(it3401)+grd.Grade_3(cs3451)+grd.Grade_2(ge3451)+grd.Grade_1$5(cs3461)+grd.Grade_1$5(cs3481);
		double credit = 22;
		return grd.round_off(ui/credit);
	}
	//Calculating Marks for Even Semester including NCC
	public double GPA_even(String cs3452, String cs3491, String cs3492, String it3401, String cs3451, String ge3451, String cs3461, String cs3481, @Nullable String nss){
		double ui = grd.Grade_3(cs3452)+ grd.Grade_4(cs3491)+grd.Grade_3(cs3492)+ grd.Grade_4(it3401)+grd.Grade_3(cs3451)+grd.Grade_2(ge3451)+grd.Grade_1$5(cs3461)+grd.Grade_1$5(cs3481)+grd.Grade_3(nss);
		double credit = 25;
		return grd.round_off(ui/credit);
	}
}
