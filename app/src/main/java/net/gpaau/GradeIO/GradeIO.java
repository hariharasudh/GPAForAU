package net.gpaau.GradeIO;

import java.math.BigDecimal;
import java.math.RoundingMode;

//Calculating the Grade by getting the inputs through Spinner and Receiving the outputs from the Constructor
public class GradeIO {
	double sub1 = 0;
	/*Calculating the marks for 3 Credit Subject*/
	public double Grade_3(String s) {
		switch (s) {
			case "O":
				sub1 = 3 * 10;
				break;
			case "A+":
				sub1 = 3 * 9;
				break;
			case "A":
				sub1 = 3 * 8;
				break;
			case "B+":
				sub1 = 3 * 7;
				break;
			case "B":
				sub1 = 3 * 6;
				break;
			default:
				sub1 = 0;
		}
		return sub1;
	}
	/*Calculating for 4 Credit*/
	public double Grade_4(String s) {
		switch (s) {
			case "O":
				sub1 = 4 * 10;
				break;
			case "A+":
				sub1 = 4 * 9;
				break;
			case "A":
				sub1 = 4 * 8;
				break;
			case "B+":
				sub1 = 4 * 7;
				break;
			case "B":
				sub1 = 4 * 6;
				break;
			default:
				sub1 = 0;
		}
		return sub1;
	}
	/*Calculating credit for 2 Credit Subject*/
	public double Grade_2(String s) {
		switch (s) {
			case "O":
				sub1 = 2 * 10;
				break;
			case "A+":
				sub1 = 2 * 9;
				break;
			case "A":
				sub1 = 2 * 8;
				break;
			case "B+":
				sub1 = 2 * 7;
				break;
			case "B":
				sub1 = 2 * 6;
				break;
			default:
				sub1 = 0;
		}
		return sub1;
	}
	/*Calculating Credit for 1 Credit Subject*/
	public double Grade_1(String s) {
		switch (s) {
			case "O":
				sub1 = 10;
				break;
			case "A+":
				sub1 = 9;
				break;
			case "A":
				sub1 = 8;
				break;
			case "B+":
				sub1 = 7;
				break;
			case "B":
				sub1 = 6;
				break;
			default:
				sub1 = 0;
		}
		return sub1;
	}
	public double Grade_1$5(String s) {
		switch (s) {
			case "O":
				sub1 = 1.5*10;
				break;
			case "A+":
				sub1 = 1.5*9;
				break;
			case "A":
				sub1 = 1.5*8;
				break;
			case "B+":
				sub1 = 1.5*7;
				break;
			case "B":
				sub1 = 1.5*6;
				break;
			default:
				sub1 = 0;
		}
		return sub1;
	}
	//Rounding off Purposes
	public double round_off(double nmb){
		return new BigDecimal(Double.toString(nmb)).setScale(3,RoundingMode.HALF_UP).doubleValue();
	}
}
