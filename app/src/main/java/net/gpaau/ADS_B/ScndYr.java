package net.gpaau.ADS_B;

import androidx.annotation.Nullable;

import net.gpaau.GradeIO.CreditIO;

public class ScndYr {
	//Calculating marks for 2nd year Faculty of Information and Communication ADS Engg
	CreditIO grd = new CreditIO();
	//Calculating marks for Odd Semester
	public double GPA_odd(String ma3354, String cs3351, String as3391, String ad3351, String ad3301, String al3391, String ad3381, String ad3311, String ge3361) {
		double ui = grd.Grade_4(ma3354) + grd.Grade_4(cs3351) + grd.Grade_3(as3391) + grd.Grade_4(ad3351) + grd.Grade_4(ad3301) + grd.Grade_3(al3391) + grd.Grade_1$5(ad3381) + grd.Grade_1$5(ad3311) + grd.Grade_1(ge3361);
		double credit = 26;
		return new CreditIO().round_off(ui/credit);
	}
	//Calculating Marks for Even Semester excluding NCC
	public double GPA_even(String ma3391, String al3452, String al3451, String ad3491, String cs3591, String ge3451, String ad3411, String ad3461){
		double ui = grd.Grade_4(ma3391)+ grd.Grade_4(al3452)+grd.Grade_3(al3451)+ grd.Grade_3(ad3491)+grd.Grade_4(cs3591)+grd.Grade_2(ge3451)+grd.Grade_2(ad3411)+grd.Grade_2(ad3461);
		double credit = 24;
		return grd.round_off(ui/credit);
	}
	//Calculating Marks for Even Semester including NCC
	public double GPA_even(String ma3391, String al3452, String al3451, String ad3491, String cs3591, String ge3451, String ad3411, String ad3461, @Nullable String nss){
		double ui = grd.Grade_4(ma3391)+ grd.Grade_4(al3452)+grd.Grade_3(al3451)+ grd.Grade_3(ad3491)+grd.Grade_4(cs3591)+grd.Grade_2(ge3451)+grd.Grade_2(ad3411)+grd.Grade_2(ad3461)+grd.Grade_3(nss);
		double credit = 27;
		return grd.round_off(ui/credit);
	}
}
