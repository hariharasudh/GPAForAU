package net.gpaau.CSE_B;

import androidx.annotation.Nullable;

import net.gpaau.GradeIO.CreditIO;

//Calculating marks for 1st year Faculty of Information and Communication ADS Engg
public class FstYr {
	CreditIO grd = new CreditIO();
	//Calculating Marks for Odd Semester
	public double GPA_odd(String hs3152, String ma3151, String ph3151, String cy3151, String ge3151, String ge3152, String ge3171, String bs3171, String ge3172) {
		double ui = grd.Grade_3(hs3152) + grd.Grade_4(ma3151) + grd.Grade_3(ph3151) + grd.Grade_3(cy3151) + grd.Grade_3(ge3151) + grd.Grade_1(ge3152) + grd.Grade_2(ge3171) + grd.Grade_2(bs3171) + grd.Grade_1(ge3172);
		double credit = 22;
		return grd.round_off(ui/credit);
	}
	//Calculating Marks for Even Semester excluding NCC
	public double GPA_even(String hs3252, String ma3251, String ph3256, String be3251, String cs3251, String ge3251, String ge3252, String ge3271, String ge3272, String cs3271){
		double ui = grd.Grade_2(hs3252)+grd.Grade_4(ma3251)+grd.Grade_3(ph3256)+grd.Grade_3(be3251)+ grd.Grade_3(cs3251)+grd.Grade_4(ge3251)+grd.Grade_1(ge3252)+grd.Grade_2(ge3271)+grd.Grade_2(ge3272)+grd.Grade_2(cs3271);
		double credit = 26;
		return grd.round_off(ui/credit);
	}

	//Calculating Marks for Even Semester including NCC
	public double GPA_even(String hs3252, String ma32251, String ph3256, String be3251, String cs3251, String ge3251, String ge3252, String ge3271, String ge3272, String cs3271, @Nullable String ncc){
		assert ncc != null;
		double ui = grd.Grade_2(hs3252)+grd.Grade_4(ma32251)+grd.Grade_3(ph3256)+grd.Grade_3(be3251)+ grd.Grade_3(cs3251)+grd.Grade_4(ge3251)+grd.Grade_1(ge3252)+grd.Grade_2(ge3271)+grd.Grade_2(ge3272)+grd.Grade_2(cs3271)+grd.Grade_2(ncc);
		double credit = 28;
		return grd.round_off(ui/credit);
	}
}