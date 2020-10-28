import java.util.Scanner;
public class Resume {

			public static void main(String[] args) {
				
					
					
					printName();
					printAge();
					printGender();
					printStatus();
					printHp();
					printAddress();
					printSkill();
					printWork();
					printTalents();
					printGrade();
					printCGPA();
					
					
					
					

					}
					
					public static void printName() {
						Scanner in = new Scanner (System.in);
						System.out.print("Enter your name:");
						String name = in.next();
						System.out.println("Name:"+name);
						
						
					}
					
					public static void printAge() {
						Scanner in = new Scanner (System.in);
						System.out.print("Enter your Age:");
						int age = in.nextInt();
						System.out.println("Age:"+age);
						
					
					}
					
					public static void printGender() {
						Scanner in = new Scanner (System.in);
						System.out.print("Enter your Gender:");
						char gender = in.next().charAt(0);
						System.out.println("Gender:"+gender);
						
					}
					
					public static void printStatus() {
						Scanner in = new Scanner (System.in);
						System.out.print("Enter your Marital Status:");
						String status = in.next();
						System.out.println("Marital status:"+status);
					}
					
					public static void printHp() {
						Scanner in = new Scanner (System.in);
						System.out.print("Enter your phone number:");
						long num = in.nextInt();
						System.out.println("HP number:"+num);
					}
					
					public static void printAddress(){
						Scanner in = new Scanner(System.in);
						System.out.println("Enter your address: ");
						System.out.print("\nFirst line: ");
						String add1 = in.next();
						System.out.print("\nSecond line: ");
						String add2 = in.next();
						System.out.print("\nThird line: ");
						String add3 = in.next();
						System.out.println("Your address is:" +add1 +",\n\t\t" +add2 +",\n\t\t" +add3 +".");
						
					}
					
					public static void printSkill() {
                        Scanner in = new Scanner (System.in);
                        System.out.print("Enter Microsoft word skill from 1 to 10:");
                        int skill1 = in.nextInt();
                        System.out.println("Enter Power point skill from 1 to 10:");
                        int skill2 = in.nextInt();
                        System.out.println("Enter Excel skill from 1 to 10:");
                        int skill3 = in.nextInt();
                        System.out.println("Enter Photoshop skill from 1 to 10:");
                        int skill4 = in.nextInt();
                        System.out.println("Enter Java Programing skill from 1 to 10:");
                        int skill5 = in.nextInt();
                        System.out.println("Skill: Microsoft word skill="+ skill1 +"\n\tPower point skill="+skill2 +"\n\tExcel skill="+skill3 +"\n\tPhotoshop skill="+skill4 +"\n\tJava Programing skill="+skill5 );
					    
					
					}
					
					public static void printWork() {
						Scanner in = new Scanner (System.in);
						System.out.print("Enter your Work experiences:");
						String work = in.next();
						System.out.println("Work experiences:"+work);
					}
					
					public static void printTalents() {
						Scanner in = new Scanner (System.in);
						System.out.print("Enter your Major Talents:");
						String talents = in.next();
						System.out.println("Major Talents:"+talents);
					}
					
					
					public static void printGrade() {
						Scanner in = new Scanner (System.in);
						System.out.print("Enter your Grade:");
						char grade = in.next().charAt(0);
						System.out.println("Grade:"+grade);
						
					}
					
					public static void printCGPA() {
						Scanner in = new Scanner (System.in);
						System.out.print("Enter first result:");
						double num1 = in.nextDouble();
						System.out.println("Enter second result:");
						double num2= in.nextDouble();
						double sum = num1 + num2;
						double CGPA = sum /2 ;
						System.out.println("Your CGPA:"+CGPA);
						in.close();
					
				 }

			}



	


