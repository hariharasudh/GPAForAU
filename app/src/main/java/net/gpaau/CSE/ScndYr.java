package net.gpaau.CSE;

import androidx.annotation.Nullable;

import net.gpaau.GradeIO.GradeIO;

public class ScndYr {
	//Calculating marks for 2nd year Faculty of Information and Communication CSE Engg
	GradeIO grd = new GradeIO();
	//Calculating marks for Odd Semester
	public double GPA_odd(String ma3354, String cs3351, String cs3352, String cs3301, String cs3391, String cs3311, String cs3381, String cs3361, String ge3361){
		double ui = grd.Grade_4(ma3354)+grd.Grade_4(cs3351)+ grd.Grade_3(cs3352)+grd.Grade_3(cs3301)+grd.Grade_3(cs3391)+grd.Grade_1$5(cs3311)+grd.Grade_1$5(cs3381)+grd.Grade_2(cs3361)+grd.Grade_1(ge3361);
		double credit = 23;
		return grd.round_off(ui/credit);
	}
	//Calculating Marks for Even Semester excluding NCC
	public double GPA_even(String cs3452, String cs3491, String cs3492, String cs3401, String cs3451, String ge3451, String cs3461, String cs3481){
		double ui = grd.Grade_3(cs3452)+grd.Grade_4(cs3491)+grd.Grade_3(cs3492)+grd.Grade_4(cs3401)+grd.Grade_3(cs3451)+grd.Grade_2(ge3451)+grd.Grade_1$5(cs3461)+grd.Grade_1$5(cs3481);
		double credit = 22;
		return grd.round_off((ui/credit));
	}
	//Calculating Marks for Even Semester including NCC
	public double GPA_even(String cs3452, String cs3491, String cs3492, String cs3401, String cs3451, String ge3451, String cs3461, String cs3481, @Nullable String ncc){
		double ui = grd.Grade_3(cs3452)+grd.Grade_4(cs3491)+grd.Grade_3(cs3492)+grd.Grade_4(cs3401)+grd.Grade_3(cs3451)+grd.Grade_2(ge3451)+grd.Grade_1$5(cs3461)+grd.Grade_1$5(cs3481)+grd.Grade_3(ncc);
		double credit = 25;
		return grd.round_off((ui/credit));
	}
}
