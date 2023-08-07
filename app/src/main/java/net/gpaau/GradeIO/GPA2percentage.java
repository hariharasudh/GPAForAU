package net.gpaau.GradeIO;

public class GPA2percentage {
	public double percent(double cgpa){
		return new CreditIO().round_off(cgpa*9.5);
	}
}
