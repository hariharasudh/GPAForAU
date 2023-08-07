package net.gpaau.ECE_B;

import androidx.annotation.Nullable;

import net.gpaau.GradeIO.CreditIO;

public class ScndYr {
	//Calculating marks for 2nd year Faculty of Information and Communication ADS Engg
	CreditIO grd = new CreditIO();
	//Calculating marks for Odd Semester
	public double GPA_odd(String ma3355, String cs3353, String ec3354, String ec3353, String ec3351, String ec3352, String ec3361, String cs3362, String ge3361) {
		double ui = grd.Grade_4(ma3355) + grd.Grade_3(cs3353) + grd.Grade_4(ec3354) + grd.Grade_3(ec3353) + grd.Grade_3(ec3351) + grd.Grade_4(ec3352) + grd.Grade_1$5(ec3361) + grd.Grade_1$5(cs3362) + grd.Grade_1(ge3361);
		double credit = 25;
		return new CreditIO().round_off(ui/credit);
	}
	//Calculating Marks for Even Semester excluding NCC
	public double GPA_even(String ec3452, String ec3401, String ec3451, String ec3492, String ec3491, String ge3451, String ec3461, String ec3462){
		double ui = grd.Grade_3(ec3452)+ grd.Grade_4(ec3401)+grd.Grade_3(ec3451)+ grd.Grade_4(ec3492)+grd.Grade_3(ec3491)+grd.Grade_2(ge3451)+grd.Grade_1$5(ec3461)+grd.Grade_1$5(ec3462);
		double credit = 22;
		return grd.round_off(ui/credit);
	}
	//Calculating Marks for Even Semester including NCC
	public double GPA_even(String ec3452, String ec3401, String ec3451, String ec3492, String ec3491, String ge3451, String ec3461, String ec3462, @Nullable String nss){
		double ui = grd.Grade_3(ec3452)+ grd.Grade_4(ec3401)+grd.Grade_3(ec3451)+ grd.Grade_4(ec3492)+grd.Grade_3(ec3491)+grd.Grade_2(ge3451)+grd.Grade_1$5(ec3461)+grd.Grade_1$5(ec3462)+grd.Grade_3(nss);
		double credit = 25;
		return grd.round_off(ui/credit);
	}
}
