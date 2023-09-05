package BMI;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
										
					Scanner scanner = new Scanner(System.in);	
					
					System.out.println("BMI 계산기");					
					System.out.print("몸무게를 입력하시오. ");					
					String weight = scanner.nextLine();				
					System.out.print("키를 입력하시오. ");	
					
					String height = scanner.nextLine();
					
					double w = Double.parseDouble(weight);
					
					double h = Double.parseDouble(height);
					
					h /= 100;
					
					double bmi = w / (h * h);
					
					bmi = (int)(bmi*100)/100.0;

					if(bmi < 20) {
						System.out.println("키 = " + height + "cm /" + " 몸무게 = " + weight + "kg");
					    System.out.println("나의 BMI = " + bmi + " / 판정 = 저체중 입니다.");
					}				

					else if(bmi <= 24) {
						System.out.println("키 = " + height + "cm /" + " 몸무게 = " + weight + "kg");
					    System.out.println("나의 BMI = " + bmi + " / 판정 = 정상 입니다.");
					}
					
					else if(bmi <= 29) {
						System.out.println("키 = " + height + "cm /" + " 몸무게 = " + weight + "kg");
					    System.out.println("나의 BMI = " + bmi + " / 판정 = 과체중 입니다.");
					}					
				    else {
						System.out.println("키 = " + height +  "cm /" + " 몸무게 = " + weight + "kg");
				        System.out.println("나의 BMI = " + bmi + " / 판정 = 비만 입니다.");
				    }
				        	
					scanner.close();
	}

}
