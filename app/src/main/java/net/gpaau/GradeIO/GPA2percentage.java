package net.gpaau.GradeIO;

import net.gpaau.GradeIO.GradeIO;

public class GPA2percentage {
	public double percent(double cgpa){
		return new GradeIO().round_off(cgpa*9.5);
	}
}
