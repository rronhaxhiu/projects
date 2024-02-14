import java.util.*;
public class kalkulori_matricave {
	
	//funksioni per gjetjen e determinantes se matrices se nivelit 2
	static double determinanta2(double x11, double x12, double x21, double x22){
		return (x11*x22)-(x21*x12);
	}
	
	//funksioni per gjetjen e determinantes se matrices se nivelit 3
	static double determinanta3(double x11,double x12, double x13, double x21, double x22, double x23, double x31, double x32, double x33){
		return (((x11*x22*x33)+(x12*x23*x31)+(x13*x21*x32))-((x12*x21*x33)+(x11*x23*x32)+(x13*x22*x31)));
	}
	
	//funksioni per gjetjen e komplementit te elementit te matrices se rendit 4
	static double komplementi4(double koeficienti, double x11,double x12, double x13, double x21, double x22, double x23, double x31, double x32, double x33){
		return (koeficienti * determinanta3(x11,x12,x13,x21,x22,x23,x31,x32,x33));
	}
	
	//funksioni per gjetjen e determinantes se matrices se nivelit 4
	//static double determinanta4(){}
		
	
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		//titulli
		System.out.println("\n--------------------------------------");
		System.out.println("\tKALKULATOR PER MATRICA"); 
		System.out.println("--------------------------------------");
		
		/*System.out.println("\nCfare deshironi te llogaritni: ");
		System.out.println("\n1)Gjetja e determinantes\n2)Veprime mes dy matricave");
		System.out.print("\nSheno 1 ose 2:");
		int veprimi = sc.nextInt();
		
		//wrong input
		while(veprimi!=1 && veprimi!=2){
			System.out.println("\nJu lutem shenoni 1 ose 2: ");
			veprimi = sc.nextInt();
		}
			
		if(veprimi == 1 ){*/
							
			//input
			System.out.print("\nShkruaj rendin e matricave (1-5) : ");
			int rendi = sc.nextInt();
			
			
			//wrong input
			while (rendi!=1 && rendi!=2 && rendi!=3 && rendi!=4 && rendi!=5){
				System.out.println("\nDeterminanta e matrices se rendit " + rendi + " nuk mund te zgjidhet");
				System.out.print("\nShkruaj rendin e matrices (1-5): ");
				rendi = sc.nextInt();
			}
			
			
			System.out.println("\n--------------------------------------\n");
			
			
			//rendi 1
			if (rendi == 1){
				double n[] = new double[1];
				System.out.println("Sheno vleren e matrices :\n");
				System.out.print("x11 = ");
				n[0] = sc.nextDouble();
				System.out.println("\n" + Arrays.toString(n) + " = " + n[0]); 
				System.out.println("\n--------------------------------------\n");
			}
			
			
			//rendi 2 
			if (rendi == 2){
				
				//mbledhja e informatave
				System.out.println("Sheno vlerat e matrices :\n");
				double n1[] = new double[2];
				System.out.print("x11 = ");
				n1[0] = sc.nextDouble();
				System.out.print("x12 = ");
				n1[1] = sc.nextDouble();
			
				double n2[] = new double[2];
				System.out.print("x21 = ");
				n2[0] = sc.nextDouble();
				System.out.print("x22 = ");
				n2[1] = sc.nextDouble();
				
				System.out.println("\n--------------------------------------\n");
				
				System.out.println("Matrica juaj: \n");
				System.out.println(Arrays.toString(n1));
				System.out.println(Arrays.toString(n2) + " = ("+n1[0]+" * "+n2[1]+") - ("+n2[0]+" * "+n1[1]+") = " +(n1[0]*n2[1])+ " - "+ (n2[0]*n1[1]) + " = " + determinanta2(n1[0],n1[1],n2[0],n2[1]));
				System.out.println("\n--------------------------------------\n");
			}
		
		
			//rendi 3
			if (rendi == 3){
				
				//mbledhja e informatave
				System.out.println("Sheno vlerat e matrices :\n");
				
				double n1[] = new double[3];
				System.out.print("x11 = ");
				n1[0] = sc.nextDouble();
				System.out.print("x12 = ");
				n1[1] = sc.nextDouble();
				System.out.print("x13 = ");
				n1[2] = sc.nextDouble();
				
				double n2[] = new double[3];
				System.out.print("\nx21 = ");
				n2[0] = sc.nextDouble();
				System.out.print("x22 = ");
				n2[1] = sc.nextDouble();
				System.out.print("x23 = ");
				n2[2] = sc.nextDouble();
				
				double n3[] = new double[3];
				System.out.print("\nx31 = ");
				n3[0] = sc.nextDouble();
				System.out.print("x32 = ");
				n3[1] = sc.nextDouble();
				System.out.print("x33 = ");
				n3[2] = sc.nextDouble();
			
				//vlera e kalkuluar e determinantes
				double determinanta = determinanta3(n1[0],n1[1],n1[2],n2[0],n2[1],n2[2],n3[0],n3[1],n3[2]);
				
				System.out.println("\n--------------------------------------\n");
			
				System.out.println("Matrica juaj: \n");
				System.out.println(Arrays.toString(n1));
				System.out.println(Arrays.toString(n2));
				System.out.println(Arrays.toString(n3));
				
				System.out.println("\n--------------------------------------\n");
				
				System.out.println("1)Metoden e Sarusit\n2)Metoden e trekendeshit\n3)Metoden e zberthimit ne kofaktore\n4)Shfaq te gjitha metodat\n");
				System.out.print("Me cilen metode deshironi te gjeni determinanten(1-4): ");
				int metoda = sc.nextInt();
					
				//wrong input
				while(metoda!=1 && metoda!=2 && metoda!=3 && metoda!=4){
					System.out.print("Ju lutem zgjedhni njeren metode(1-4): ");
					metoda = sc.nextInt();
				}
				
				System.out.println("\n--------------------------------------");
				
				//metoda sarusit
				if(metoda == 1){
					System.out.println("\nMetoda e Sarusit: \n");
					System.out.println(Arrays.toString(n1) +" "+ n1[0]+"  "+n1[1]+ " |");
					System.out.println(Arrays.toString(n2) +" "+ n2[0]+"  "+n2[1]+ " | =");
					System.out.println(Arrays.toString(n3) +" "+ n3[0]+"  "+n3[1]+ " |\n\n");
					System.out.println(" = (" + n1[0]+" * "+ n2[1]+" * "+ n3[2] + ") + ("+ n1[1]+" * "+ n2[2]+" * "+ n3[0] + ") + ("+ n1[2]+" * "+ n2[0]+" * "+ n3[1] + ") - ("+ n1[1]+" * "+ n2[0]+" * "+ n3[2] + ") - ("+ n1[0]+" * "+ n2[2]+" * "+ n3[1] + ") - ("+ n1[2]+" * "+ n2[1]+" * "+ n3[0] + ") = \n\n");
					System.out.println(" = "+ (n1[0]*n2[1]*n3[2]) +" + "+ (n1[1]*n2[2]*n3[0]) +" + "+ (n1[2]*n2[0]*n3[1]) + " - " + (n1[1]*n2[0]*n3[2])+ " - "+ (n1[0]*n2[2]*n3[1])+ " - "+ (n1[2]*n2[1]*n3[0]) +" = " + determinanta);
					System.out.println("\n--------------------------------------\n");
				}
				
				//metoda trekendeshit
				else if(metoda == 2){
					System.out.println("\nMetoda e trekendeshit: \n");
					System.out.println(Arrays.toString(n1)+ "   "+Arrays.toString(n1) + "   " + Arrays.toString(n1));
					System.out.println(Arrays.toString(n2)+ " = "+Arrays.toString(n2) + " - " + Arrays.toString(n2) + " = ");
					System.out.println(Arrays.toString(n3)+ "   "+Arrays.toString(n3) + "   " + Arrays.toString(n3)+"\n\n");
					System.out.println("= ("+(n1[0]*n2[1]*n3[2])+" + "+(n1[1]*n2[2]*n3[0])+" + "+(n1[2]*n2[0]*n3[1])+") - ("+(n1[1]*n2[0]*n3[2])+" + "+(n1[0]*n2[2]*n3[1])+" + "+(n1[2]*n2[1]*n3[0])+") = \n\n");
					System.out.println(" = "+( (n1[0]*n2[1]*n3[2]) + (n1[1]*n2[2]*n3[0]) + (n1[2]*n2[0]*n3[1]) ) +" - "+ ( (n1[1]*n2[0]*n3[2]) + (n1[0]*n2[2]*n3[1]) + (n1[2]*n2[1]*n3[0]) ) + " = " + determinanta );
					System.out.println("\n--------------------------------------\n");
				}
				
				//metoda zberthimit
				else if(metoda == 3){
					System.out.println("\nMetoda e zberthimit ne kofaktore: \n");
					System.out.println(Arrays.toString(n1));
					System.out.println(Arrays.toString(n2)+ " = ");
					System.out.println(Arrays.toString(n3)+"\n\n");
					System.out.println(" = "+ n1[0] + " * (" + (n2[1]*n3[2]) + " - " + (n3[1]*n2[2])+ ") + (-1)" + n1[1] + " * (" + (n2[0]*n3[2]) + " - " + (n3[0]*n2[2]) + ") + " + n1[2] + " * (" + (n2[0]*n3[1]) + " - "+ (n3[0]*n2[1]) + ") = ");
					System.out.println("\n\n = (" + n1[0] + " * " + ((n2[1]*n3[2])-(n3[1]*n2[2])) + ") + ("+ (-(n1[1])) + " * " + ((n2[0]*n3[2])-(n3[0]*n2[2])) + ") + (" + n1[2] + " * " + ((n2[0]*n3[1])-(n3[0]*n2[1]))+") = \n\n" ); 
					System.out.println(" = " + (n1[0]*determinanta2(n2[1],n2[2],n3[1],n3[2])) + " + " + ((-(n1[1]))*determinanta2(n2[0],n2[2],n3[0],n3[2])) + " + " + (n1[2]*determinanta2(n2[0],n2[1],n3[0],n3[1])) + " = " + determinanta); 
					System.out.println("\n--------------------------------------\n");
				}
				
				//te gjitha metodat
				else if(metoda == 4){
					
					System.out.println("Te gjita metodat: ");
					
					System.out.println("--------------------------------------");
					
					System.out.println("\n1) Metoda e Sarusit: \n");
					System.out.println(Arrays.toString(n1) +" "+ n1[0]+"  "+n1[1]+ " |");
					System.out.println(Arrays.toString(n2) +" "+ n2[0]+"  "+n2[1]+ " | =");
					System.out.println(Arrays.toString(n3) +" "+ n3[0]+"  "+n3[1]+ " |\n\n");
					System.out.println(" = (" + n1[0]+" * "+ n2[1]+" * "+ n3[2] + ") + ("+ n1[1]+" * "+ n2[2]+" * "+ n3[0] + ") + ("+ n1[2]+" * "+ n2[0]+" * "+ n3[1] + ") - ("+ n1[1]+" * "+ n2[0]+" * "+ n3[2] + ") - ("+ n1[0]+" * "+ n2[2]+" * "+ n3[1] + ") - ("+ n1[2]+" * "+ n2[1]+" * "+ n3[0] + ") = \n\n");
					System.out.println(" = "+ (n1[0]*n2[1]*n3[2]) +" + "+ (n1[1]*n2[2]*n3[0]) +" + "+ (n1[2]*n2[0]*n3[1]) + " - " + (n1[1]*n2[0]*n3[2])+ " - "+ (n1[0]*n2[2]*n3[1])+ " - "+ (n1[2]*n2[1]*n3[0]) +" = " + determinanta);
					System.out.println("\n--------------------------------------\n");
					
					System.out.println("\n2) Metoda e trekendeshit: \n");
					System.out.println(Arrays.toString(n1)+ "   "+Arrays.toString(n1) + "   " + Arrays.toString(n1));
					System.out.println(Arrays.toString(n2)+ " = "+Arrays.toString(n2) + " - " + Arrays.toString(n2) + " = ");
					System.out.println(Arrays.toString(n3)+ "   "+Arrays.toString(n3) + "   " + Arrays.toString(n3)+"\n\n");
					System.out.println("= ("+(n1[0]*n2[1]*n3[2])+" + "+(n1[1]*n2[2]*n3[0])+" + "+(n1[2]*n2[0]*n3[1])+") - ("+(n1[1]*n2[0]*n3[2])+" + "+(n1[0]*n2[2]*n3[1])+" + "+(n1[2]*n2[1]*n3[0])+") = \n\n");
					System.out.println(" = "+( (n1[0]*n2[1]*n3[2]) + (n1[1]*n2[2]*n3[0]) + (n1[2]*n2[0]*n3[1]) ) +" - "+ ( (n1[1]*n2[0]*n3[2]) + (n1[0]*n2[2]*n3[1]) + (n1[2]*n2[1]*n3[0]) ) + " = " + determinanta );
					System.out.println("\n--------------------------------------");
					
					System.out.println("\n3) Metoda e zberthimit ne kofaktore: \n");
					System.out.println(Arrays.toString(n1));
					System.out.println(Arrays.toString(n2)+ " = ");
					System.out.println(Arrays.toString(n3)+"\n\n");
					System.out.println(" = "+ n1[0] + " * (" + (n2[1]*n3[2]) + " - " + (n3[1]*n2[2])+ ") + (-1)" + n1[1] + " * (" + (n2[0]*n3[2]) + " - " + (n3[0]*n2[2]) + ") + " + n1[2] + " * (" + (n2[0]*n3[1]) + " - "+ (n3[0]*n2[1]) + ") = ");
					System.out.println("\n\n = (" + n1[0] + " * " + ((n2[1]*n3[2])-(n3[1]*n2[2])) + ") + ("+ (-(n1[1])) + " * " + ((n2[0]*n3[2])-(n3[0]*n2[2])) + ") + (" + n1[2] + " * " + ((n2[0]*n3[1])-(n3[0]*n2[1]))+") = \n\n" ); 
					System.out.println(" = " + (n1[0]*determinanta2(n2[1],n2[2],n3[1],n3[2])) + " + " + ((-(n1[1]))*determinanta2(n2[0],n2[2],n3[0],n3[2])) + " + " + (n1[2]*determinanta2(n2[0],n2[1],n3[0],n3[1])) + " = " + determinanta); 
					System.out.println("\n--------------------------------------");
					System.out.println("--------------------------------------\n");

				}
			}
			
			
			//rendi 4
			if (rendi == 4){
				
				
				//mbledhja e informatave te matrices
				System.out.println("Sheno vlerat e matrices :\n");
				
				double n1[] = new double[4];
				System.out.print("x11 = ");
				n1[0] = sc.nextDouble();
				System.out.print("x12 = ");
				n1[1] = sc.nextDouble();
				System.out.print("x13 = ");
				n1[2] = sc.nextDouble();
				System.out.print("x14 = ");
				n1[3] = sc.nextDouble();
				
				double n2[] = new double[4];
				System.out.print("\nx21 = ");
				n2[0] = sc.nextDouble();
				System.out.print("x22 = ");
				n2[1] = sc.nextDouble();
				System.out.print("x23 = ");
				n2[2] = sc.nextDouble();
				System.out.print("x24 = ");
				n2[3] = sc.nextDouble();
				
				double n3[] = new double[4];
				System.out.print("\nx31 = ");
				n3[0] = sc.nextDouble();
				System.out.print("x32 = ");
				n3[1] = sc.nextDouble();
				System.out.print("x33 = ");
				n3[2] = sc.nextDouble();
				System.out.print("x34 = ");
				n3[3] = sc.nextDouble();
				
				double n4[] = new double[4];
				System.out.print("\nx41 = ");
				n4[0] = sc.nextDouble();
				System.out.print("x42 = ");
				n4[1] = sc.nextDouble();
				System.out.print("x43 = ");
				n4[2] = sc.nextDouble();
				System.out.print("x44 = ");
				n4[3] = sc.nextDouble();
			
			
				System.out.println("\n--------------------------------------\n");
			
				//zgjedhja e rreshtit
				System.out.println("Matrica juaj: \n");
				System.out.println(Arrays.toString(n1));
				System.out.println(Arrays.toString(n2));
				System.out.println(Arrays.toString(n3));
				System.out.println(Arrays.toString(n4));
				
				System.out.println("\n--------------------------------------\n");
				
				System.out.print("Shenoni rreshtin me te cilen deshironi \nte zgjedhim determinanten (1-4): ");
				int rreshti = sc.nextInt();
				
				//wrong input
				while(rreshti!=1 && rreshti!=2 && rreshti!=3 && rreshti!=4){
					System.out.print("\nJu lutem shenoni rreshtin qe keni vendosur (1-4) :");
					rreshti = sc.nextInt();
				}
				
				System.out.println("\n--------------------------------------\n");
				
				//rreshti 1
				if(rreshti == 1){
					
					//minori i x11
					double rr2234[] = {n2[1],n2[2],n2[3]};
					double rr3234[] = {n3[1],n3[2],n3[3]};
					double rr4234[] = {n4[1],n4[2],n4[3]};
					
					double minorix11 = determinanta3(n2[1],n2[2],n2[3],n3[1],n3[2],n3[3],n4[1],n4[2],n4[3]);
					double komplementix11 = minorix11 * n1[0];
					
					//minori i x12
					double rr2134[] = {n2[0],n2[2],n2[3]};
					double rr3134[] = {n3[0],n3[2],n3[3]};
					double rr4134[] = {n4[0],n4[2],n4[3]};
					
					double minorix12 = determinanta3(n2[0],n2[2],n2[3],n3[0],n3[2],n3[3],n4[0],n4[2],n4[3]);
					double komplementix12 = minorix12 * (-(n1[1]));
					
					//minori i x13
					double rr2124[] = {n2[0],n2[1],n2[3]};
					double rr3124[] = {n3[0],n3[1],n3[3]};
					double rr4124[] = {n4[0],n4[1],n4[3]};
					
					double minorix13 = determinanta3(n2[0],n2[1],n2[3],n3[0],n3[1],n3[3],n4[0],n4[1],n4[3]);
					double komplementix13 = minorix13 * n1[2];
					
					//minori i x14
					double rr2123[] = {n2[0],n2[1],n2[2]};
					double rr3123[] = {n3[0],n3[1],n3[2]};
					double rr4123[] = {n4[0],n4[1],n4[2]};
					
					double minorix14 = determinanta3(n2[0],n2[1],n2[2],n3[0],n3[1],n3[2],n4[0],n4[1],n4[2]);
					double komplementix14 = minorix14 * (-(n1[3]));
					
					System.out.println("Minoret e rreshtit te pare: \n");
	
					System.out.println(Arrays.toString(rr2234));
					System.out.println(Arrays.toString(rr3234) + " * "+n1[0]+ " * 1 = "+ minorix11 + " * (" + n1[0] + ") = " + komplementix11 );
					System.out.println(Arrays.toString(rr4234)+"\n");
					
					System.out.println(Arrays.toString(rr2134));
					System.out.println(Arrays.toString(rr3134) + " * "+n1[1]+ " * (-1) = "+ minorix12 + " * " + (-(n1[1])) + " = " + komplementix12 );
					System.out.println(Arrays.toString(rr4134)+"\n");
					
					System.out.println(Arrays.toString(rr2124));
					System.out.println(Arrays.toString(rr3124) + " * "+n1[2]+ " * 1 = "+ minorix13 + " * (" + n1[2] + ") = " + komplementix13 );
					System.out.println(Arrays.toString(rr4124)+"\n");
					
					System.out.println(Arrays.toString(rr2123));
					System.out.println(Arrays.toString(rr3123) + " * "+n1[3]+ " * (-1) = "+ minorix14 + " * " + (-(n1[3])) + " = " + komplementix14 );
					System.out.println(Arrays.toString(rr4123)+"\n");
					
					System.out.println("\n--------------------------------------\n");
					
					System.out.println("Determinanta e matrices se dhene eshte: \n");
					System.out.println(komplementix11 +" + "+komplementix12+" + "+komplementix13+" + "+komplementix14+" = " + (komplementix11+komplementix12+komplementix13+komplementix14));
					System.out.println("\n--------------------------------------\n");
					
					
				}
				
				
				//rreshti2
				if(rreshti == 2){
					
					//minori i x21
					double rr1234[] = {n1[1],n1[2],n1[3]};
					double rr3234[] = {n3[1],n3[2],n3[3]};
					double rr4234[] = {n4[1],n4[2],n4[3]};
					
					double minorix21 = determinanta3(n1[1],n1[2],n1[3],n3[1],n3[2],n3[3],n4[1],n4[2],n4[3]);
					double komplementix21 = minorix21 * (-(n2[0]));
					
					//minori i x22
					double rr1134[] = {n1[0],n1[2],n1[3]};
					double rr3134[] = {n3[0],n3[2],n3[3]};
					double rr4134[] = {n4[0],n4[2],n4[3]};
					
					double minorix22 = determinanta3(n1[0],n1[2],n1[3],n3[0],n3[2],n3[3],n4[0],n4[2],n4[3]);
					double komplementix22 = minorix22 * n2[1];
					
					//minori i x23
					double rr1124[] = {n1[0],n1[1],n1[3]};
					double rr3124[] = {n3[0],n3[1],n3[3]};
					double rr4124[] = {n4[0],n4[1],n4[3]};
					
					double minorix23 = determinanta3(n1[0],n1[1],n1[3],n3[0],n3[1],n3[3],n4[0],n4[1],n4[3]);
					double komplementix23 = minorix23 * (-(n2[2]));
					
					//minori i x24
					double rr1123[] = {n1[0],n1[1],n1[2]};
					double rr3123[] = {n3[0],n3[1],n3[2]};
					double rr4123[] = {n4[0],n4[1],n4[2]};
					
					double minorix24 = determinanta3(n1[0],n1[1],n1[2],n3[0],n3[1],n3[2],n4[0],n4[1],n4[2]);
					double komplementix24 = minorix24 * n2[3];
					
					System.out.println("Minoret e rreshtit te dyte: \n");
	
					System.out.println(Arrays.toString(rr1234));
					System.out.println(Arrays.toString(rr3234) + " * "+n2[0]+ " * (-1) = "+ minorix21 + " * (" + (n2[0]*(-1)) + ") = " + komplementix21 );
					System.out.println(Arrays.toString(rr4234)+"\n");
					
					System.out.println(Arrays.toString(rr1134));
					System.out.println(Arrays.toString(rr3134) + " * "+n2[1]+ " * 1 = "+ minorix22 + " * " + n2[1] + " = " + komplementix22 );
					System.out.println(Arrays.toString(rr4134)+"\n");
					
					System.out.println(Arrays.toString(rr1124));
					System.out.println(Arrays.toString(rr3124) + " * "+n2[2]+ " * (-1) = "+ minorix23 + " * (" + (n2[2]*(-1)) + ") = " + komplementix23 );
					System.out.println(Arrays.toString(rr4124)+"\n");
					
					System.out.println(Arrays.toString(rr1123));
					System.out.println(Arrays.toString(rr3123) + " * "+n2[3]+ " * 1 = "+ minorix24 + " * " + n2[3] + " = " + komplementix24 );
					System.out.println(Arrays.toString(rr4123)+"\n");
					
					System.out.println("\n--------------------------------------\n");
					
					System.out.println("Determinanta e matrices se dhene eshte: \n");
					System.out.println(komplementix21 +" + "+komplementix22+" + "+komplementix23+" + "+komplementix24+" = " + (komplementix21+komplementix22+komplementix23+komplementix24));
					System.out.println("\n--------------------------------------\n");
					
					
				}
				
				
				//rreshti3
				if(rreshti == 3){
					
					//minori i x31
					double rr1234[] = {n1[1],n1[2],n1[3]};
					double rr2234[] = {n2[1],n2[2],n2[3]};
					double rr4234[] = {n4[1],n4[2],n4[3]};
					
					double minorix31 = determinanta3(n1[1],n1[2],n1[3],n2[1],n2[2],n2[3],n4[1],n4[2],n4[3]);
					double komplementix31 = minorix31 * n3[0];
					
					//minori i x32
					double rr1134[] = {n1[0],n1[2],n1[3]};
					double rr2134[] = {n2[0],n2[2],n2[3]};
					double rr4134[] = {n4[0],n4[2],n4[3]};
					
					double minorix32 = determinanta3(n1[0],n1[2],n1[3],n2[0],n2[2],n2[3],n4[0],n4[2],n4[3]);
					double komplementix32 = minorix32 * (-(n3[1]));
					
					//minori i x33
					double rr1124[] = {n1[0],n1[1],n1[3]};
					double rr2124[] = {n2[0],n2[1],n2[3]};
					double rr4124[] = {n4[0],n4[1],n4[3]};
					
					double minorix33 = determinanta3(n1[0],n1[1],n1[3],n2[0],n2[1],n2[3],n4[0],n4[1],n4[3]);
					double komplementix33 = minorix33 * n3[2];
					
					//minori i x34
					double rr1123[] = {n1[0],n1[1],n1[2]};
					double rr2123[] = {n2[0],n2[1],n2[2]};
					double rr4123[] = {n4[0],n4[1],n4[2]};
					
					double minorix34 = determinanta3(n1[0],n1[1],n1[2],n2[0],n2[1],n2[2],n4[0],n4[1],n4[2]);
					double komplementix34 = minorix34 * (-(n3[3]));
					
					System.out.println("Minoret e rreshtit te trete: \n");
	
					System.out.println(Arrays.toString(rr1234));
					System.out.println(Arrays.toString(rr2234) + " * "+n3[0]+ " * 1 = "+ minorix31 + " * (" + n3[0] + ") = " + komplementix31 );
					System.out.println(Arrays.toString(rr4234)+"\n");
					
					System.out.println(Arrays.toString(rr1134));
					System.out.println(Arrays.toString(rr2134) + " * "+n3[1]+ " * (-1) = "+ minorix32 + " * " + (-(n3[1])) + " = " + komplementix32 );
					System.out.println(Arrays.toString(rr4134)+"\n");
					
					System.out.println(Arrays.toString(rr1124));
					System.out.println(Arrays.toString(rr2124) + " * "+n3[2]+ " * 1 = "+ minorix33 + " * (" + n3[2] + ") = " + komplementix33 );
					System.out.println(Arrays.toString(rr4124)+"\n");
					
					System.out.println(Arrays.toString(rr1123));
					System.out.println(Arrays.toString(rr2123) + " * "+n3[3]+ " * (-1) = "+ minorix34 + " * " + (-(n3[3])) + " = " + komplementix34 );
					System.out.println(Arrays.toString(rr4123)+"\n");
					
					System.out.println("\n--------------------------------------\n");
					
					System.out.println("Determinanta e matrices se dhene eshte: \n");
					System.out.println(komplementix31 +" + "+komplementix32+" + "+komplementix33+" + "+komplementix34+" = " + (komplementix31+komplementix32+komplementix33+komplementix34));
					System.out.println("\n--------------------------------------\n");
			
				}
			
			
				//rreshti4
				if(rreshti == 4){
					
					//minori i x41
					double rr1234[] = {n1[1],n1[2],n1[3]};
					double rr2234[] = {n2[1],n2[2],n2[3]};
					double rr3234[] = {n3[1],n3[2],n3[3]};
					
					double minorix41 = determinanta3(n1[1],n1[2],n1[3],n2[1],n2[2],n2[3],n3[1],n3[2],n3[3]);
					double komplementix41 = minorix41 * (-(n4[0]));
					
					//minori i x42
					double rr1134[] = {n1[0],n1[2],n1[3]};
					double rr2134[] = {n2[0],n2[2],n2[3]};
					double rr3134[] = {n3[0],n3[2],n3[3]};
					
					double minorix42 = determinanta3(n1[0],n1[2],n1[3],n2[0],n2[2],n2[3],n3[0],n3[2],n3[3]);
					double komplementix42 = minorix42 * n4[1];
					
					//minori i x23
					double rr1124[] = {n1[0],n1[1],n1[3]};
					double rr2124[] = {n3[0],n3[1],n3[3]};
					double rr3124[] = {n4[0],n4[1],n4[3]};
					
					double minorix43 = determinanta3(n1[0],n1[1],n1[3],n3[0],n3[1],n3[3],n4[0],n4[1],n4[3]);
					double komplementix43 = minorix43 * (-(n4[2]));
					
					//minori i x24
					double rr1123[] = {n1[0],n1[1],n1[2]};
					double rr2123[] = {n2[0],n2[1],n2[2]};
					double rr3123[] = {n3[0],n3[1],n3[2]};
					
					double minorix44 = determinanta3(n1[0],n1[1],n1[2],n2[0],n2[1],n2[2],n3[0],n3[1],n3[2]);
					double komplementix44 = minorix44 * n4[3];
					
					System.out.println("Minoret e rreshtit te katert: \n");
	
					System.out.println(Arrays.toString(rr1234));
					System.out.println(Arrays.toString(rr2234) + " * "+n4[0]+ " * (-1) = "+ minorix41 + " * (" + (n4[0]*(-1)) + ") = " + komplementix41 );
					System.out.println(Arrays.toString(rr3234)+"\n");
					
					System.out.println(Arrays.toString(rr1134));
					System.out.println(Arrays.toString(rr2134) + " * "+n4[1]+ " * 1 = "+ minorix42 + " * " + n4[1] + " = " + komplementix42 );
					System.out.println(Arrays.toString(rr3134)+"\n");
					
					System.out.println(Arrays.toString(rr1124));
					System.out.println(Arrays.toString(rr2124) + " * "+n4[2]+ " * (-1) = "+ minorix43 + " * (" + (n4[2]*(-1)) + ") = " + komplementix43 );
					System.out.println(Arrays.toString(rr3124)+"\n");
					
					System.out.println(Arrays.toString(rr1123));
					System.out.println(Arrays.toString(rr2123) + " * "+n4[3]+ " * 1 = "+ minorix44 + " * " + n4[3] + " = " + komplementix44 );
					System.out.println(Arrays.toString(rr3123)+"\n");
					
					System.out.println("\n--------------------------------------\n");
					
					System.out.println("Determinanta e matrices se dhene eshte: \n");
					System.out.println(komplementix41 +" + "+komplementix42+" + "+komplementix43+" + "+komplementix44+" = " + (komplementix41+komplementix42+komplementix43+komplementix44));
					System.out.println("\n--------------------------------------\n");
					
					
				}
				
			}
			
			
			//rendi 5
			if (rendi == 5){
			
				//mbledhja e informatave te matrices
				System.out.println("Sheno vlerat e matrices :\n");
				
				double n1[] = new double[5];
				System.out.print("\nx11 = ");
				n1[0] = sc.nextDouble();
				System.out.print("x12 = ");
				n1[1] = sc.nextDouble();
				System.out.print("x13 = ");
				n1[2] = sc.nextDouble();
				System.out.print("x14 = ");
				n1[3] = sc.nextDouble();
				System.out.print("x15 = ");
				n1[4] = sc.nextDouble();
				
				double n2[] = new double[5];
				System.out.print("\nx11 = ");
				n2[0] = sc.nextDouble();
				System.out.print("x12 = ");
				n2[1] = sc.nextDouble();
				System.out.print("x13 = ");
				n2[2] = sc.nextDouble();
				System.out.print("x14 = ");
				n2[3] = sc.nextDouble();
				System.out.print("x15 = ");
				n2[4] = sc.nextDouble();
				
				double n3[] = new double[5];
				System.out.print("\nx11 = ");
				n3[0] = sc.nextDouble();
				System.out.print("x12 = ");
				n3[1] = sc.nextDouble();
				System.out.print("x13 = ");
				n3[2] = sc.nextDouble();
				System.out.print("x14 = ");
				n3[3] = sc.nextDouble();
				System.out.print("x15 = ");
				n3[4] = sc.nextDouble();
				
				double n4[] = new double[5];
				System.out.print("\nx11 = ");
				n4[0] = sc.nextDouble();
				System.out.print("x12 = ");
				n4[1] = sc.nextDouble();
				System.out.print("x13 = ");
				n4[2] = sc.nextDouble();
				System.out.print("x14 = ");
				n4[3] = sc.nextDouble();
				System.out.print("x15 = ");
				n4[4] = sc.nextDouble();
				
				double n5[] = new double[5];
				System.out.print("\nx11 = ");
				n5[0] = sc.nextDouble();
				System.out.print("x12 = ");
				n5[1] = sc.nextDouble();
				System.out.print("x13 = ");
				n5[2] = sc.nextDouble();
				System.out.print("x14 = ");
				n5[3] = sc.nextDouble();
				System.out.print("x15 = ");
				n5[4] = sc.nextDouble();
				
				//minoret e numrave te rreshtit te pare
				
				//minoret e numrit te pare
				double minori1rreshti2[] = {n2[1],n2[2],n2[3],n2[4],};
				double minori1rreshti3[] = {n3[1],n3[2],n3[3],n3[4],};
				double minori1rreshti4[] = {n4[1],n4[2],n4[3],n4[4],};
				double minori1rreshti5[] = {n5[1],n5[2],n5[3],n5[4],};
									
				//minoret e numrit te dyte
				double minori2rreshti2[] = {n2[0],n2[2],n2[3],n2[4],};
				double minori2rreshti3[] = {n3[0],n3[2],n3[3],n3[4],};
				double minori2rreshti4[] = {n4[0],n4[2],n4[3],n4[4],};
				double minori2rreshti5[] = {n5[0],n5[2],n5[3],n5[4],};
									
				//minoret e numrit te trete
				double minori3rreshti2[] = {n2[0],n2[1],n2[3],n2[4],};
				double minori3rreshti3[] = {n3[0],n3[1],n3[3],n3[4],};
				double minori3rreshti4[] = {n4[0],n4[1],n4[3],n4[4],};
				double minori3rreshti5[] = {n5[0],n5[1],n5[3],n5[4],};
									
				//minoret e numrit te katert
				double minori4rreshti2[] = {n2[0],n2[1],n2[2],n2[4],};
				double minori4rreshti3[] = {n3[0],n3[1],n3[2],n3[4],};
				double minori4rreshti4[] = {n4[0],n4[1],n4[2],n4[4],};
				double minori4rreshti5[] = {n5[0],n5[1],n5[2],n5[4],};
									
				//minoret e numrit te peste
				double minori5rreshti2[] = {n2[0],n2[1],n2[2],n2[3],};
				double minori5rreshti3[] = {n3[0],n3[1],n3[2],n3[3],};
				double minori5rreshti4[] = {n4[0],n4[1],n4[2],n4[3],};
				double minori5rreshti5[] = {n5[0],n5[1],n5[2],n5[3],};
				
				
				
				//llogaritja e minoreve dhe komplementeve
				
				//komplementi dhe minori i x11
					
				//komplementi i x22
				double rr33451[] = {n3[2],n3[3],n3[4]};
				double rr43451[] = {n4[2],n4[3],n4[4]};
				double rr53451[] = {n5[2],n5[3],n5[4]};
				
				double minorix221 = determinanta3(n3[2],n3[3],n3[4],n4[2],n4[3],n4[4],n5[2],n5[3],n5[4]);
				double komplementix221 = minorix221 * n2[1];
				
				//komplementi i x23
				double rr32451[] = {n3[1],n3[3],n3[4]};
				double rr42451[] = {n4[1],n4[3],n4[4]};
				double rr52451[] = {n5[1],n5[3],n5[4]};
				
				double minorix231 = determinanta3(n3[1],n3[3],n3[4],n4[1],n4[3],n4[4],n5[1],n5[3],n5[4]) ;
				double komplementix231 = minorix231 * (-(n2[2]));
				
				
				//komplementi i x24
				double rr32351[] = {n3[1],n3[2],n3[4]};
				double rr42351[] = {n4[1],n4[2],n4[4]};
				double rr52351[] = {n5[1],n5[2],n5[4]};
				
				double minorix241 = determinanta3(n3[1],n3[2],n3[4],n4[1],n4[2],n4[4],n5[1],n5[2],n5[4]);
				double komplementix241 = minorix241 * n2[3];
				
				
				//komplementi i x25
				double rr32341[] = {n3[1],n3[2],n3[3]};
				double rr42341[] = {n4[1],n4[2],n4[3]};
				double rr52341[] = {n5[1],n5[2],n5[3]};
				
				double minorix251 = determinanta3(n3[1],n3[2],n3[3],n4[1],n4[2],n4[3],n5[1],n5[2],n5[3]);
				double komplementix251 = minorix251 * (-(n2[4]));
				
				
				//minori i x11
				double minorix111 = komplementix221 + komplementix231 + komplementix241 + komplementix251;
				//komplementi i x11
				double komplementix111 = minorix111 * n1[0];
				
				
				
				
				
				//komplementi dhe minori i x12
					
				//komplementi i x21
				double rr33452[] = {n3[2],n3[3],n3[4]};
				double rr43452[] = {n4[2],n4[3],n4[4]};
				double rr53452[] = {n5[2],n5[3],n5[4]};
				
				double minorix212 = determinanta3(n3[2],n3[3],n3[4],n4[2],n4[3],n4[4],n5[2],n5[3],n5[4]);
				double komplementix212 = minorix212 * n2[0];
				
				//komplementi i x23
				double rr31452[] = {n3[0],n3[3],n3[4]};
				double rr41452[] = {n4[0],n4[3],n4[4]};
				double rr51452[] = {n5[0],n5[3],n5[4]};
				
				double minorix232 =determinanta3(n3[0],n3[3],n3[4],n4[0],n4[3],n4[4],n5[0],n5[3],n5[4]);
				double komplementix232 = minorix232 * (-(n2[2]));
				
				//komplementi i x24
				double rr31352[] = {n3[0],n3[2],n3[4]};
				double rr41352[] = {n4[0],n4[2],n4[4]};
				double rr51352[] = {n5[0],n5[2],n5[4]};
				
				double minorix242 = determinanta3(n3[0],n3[2],n3[4],n4[0],n4[2],n4[4],n5[0],n5[2],n5[4]);
				double komplementix242 = minorix242 * n2[3];
				
				//komplementi i x25
				double rr31342[] = {n3[0],n3[2],n3[3]};
				double rr41342[] = {n4[0],n4[2],n4[3]};
				double rr51342[] = {n5[0],n5[2],n5[3]};
							
				double minorix252 = determinanta3(n3[0],n3[2],n3[3],n4[0],n4[2],n4[3],n5[0],n5[2],n5[3]);
				double komplementix252 = minorix252 * (-(n2[4]));
				
				
				//minori i x12
				double minorix122 = komplementix212 + komplementix232 + komplementix242 + komplementix252;
				//komplementi i x13
				double komplementix122 = minorix122 * (-(n1[1]));
					
					
				
				
				
				//komplementi dhe minori i x13
					
				//komplementi i x21
				double rr32453[] = {n3[1],n3[3],n3[4]};
				double rr42453[] = {n4[1],n4[3],n4[4]};
				double rr52453[] = {n5[1],n5[3],n5[4]};
				
				double minorix213 = determinanta3(n3[1],n3[3],n3[4],n4[1],n4[3],n4[4],n5[1],n5[3],n5[4]);
				double komplementix213 = minorix213 * n2[0];
				
				//komplementi i x22
				double rr31453[] = {n3[0],n3[3],n3[4]};
				double rr41453[] = {n4[0],n4[3],n4[4]};
				double rr51453[] = {n5[0],n5[3],n5[4]};
				
				double minorix223 = determinanta3(n3[0],n3[3],n3[4],n4[0],n4[3],n4[4],n5[0],n5[3],n5[4]);
				double komplementix223 = minorix223 * (-(n2[1]));
				
				//komplementi i x24
				double rr31253[] = {n3[0],n3[1],n3[4]};
				double rr41253[] = {n4[0],n4[1],n4[4]};
				double rr51253[] = {n5[0],n5[1],n5[4]};
				
				double minorix243 = determinanta3(n3[0],n3[1],n3[4],n4[0],n4[1],n4[4],n5[0],n5[1],n5[4]);
				double komplementix243 = minorix243 * n2[3];
				
				//komplementi i x25
				double rr31243[] = {n3[0],n3[1],n3[3]};
				double rr41243[] = {n4[0],n4[1],n4[3]};
				double rr51243[] = {n5[0],n5[1],n5[3]};
							
				double minorix253 = determinanta3(n3[0],n3[1],n3[3],n4[0],n4[1],n4[3],n5[0],n5[1],n5[3]);
				double komplementix253 = minorix253 * (-(n2[4]));
				
				
				//minori i x13
				double minorix133 = komplementix213 + komplementix223 + komplementix243 + komplementix253;
				//komplementi i x13
				double komplementix133 = minorix133 * n1[2];
				
				
				
				
				
				//komplementi dhe minori i x14
					
				//komplementi i x21
				double rr32354[] = {n3[1],n3[2],n3[4]};
				double rr42354[] = {n4[1],n4[2],n4[4]};
				double rr52354[] = {n5[1],n5[2],n5[4]};
				
				double minorix214 = determinanta3(n3[1],n3[2],n3[4],n4[1],n4[2],n4[4],n5[1],n5[2],n5[4]);
				double komplementix214 = minorix214 * n2[0];
				
				//komplementi i x22
				double rr31354[] = {n3[0],n3[2],n3[4]};
				double rr41354[] = {n4[0],n4[2],n4[4]};
				double rr51354[] = {n5[0],n5[2],n5[4]};
				
				double minorix224 = determinanta3(n3[0],n3[2],n3[4],n4[0],n4[2],n4[4],n5[0],n5[2],n5[4]);
				double komplementix224 = minorix224 * (-(n2[1]));
				
				//komplementi i x23
				double rr31254[] = {n3[0],n3[1],n3[4]};
				double rr41254[] = {n4[0],n4[1],n4[4]};
				double rr51254[] = {n5[0],n5[1],n5[4]};
				
				double minorix234 = determinanta3(n3[0],n3[1],n3[4],n4[0],n4[1],n4[4],n5[0],n5[1],n5[4]);
				double komplementix234 = minorix234 * n2[2];
				
				//komplementi i x25
				double rr31234[] = {n3[0],n3[1],n3[2]};
				double rr41234[] = {n4[0],n4[1],n4[2]};
				double rr51234[] = {n5[0],n5[1],n5[2]};
				
				double minorix254 = determinanta3(n3[0],n3[1],n3[2],n4[0],n4[1],n4[2],n5[0],n5[1],n5[2]);
				double komplementix254 = minorix254 * (-(n1[4]));
				
				//minori i x14
				double minorix144 = komplementix214 + komplementix224 + komplementix234 + komplementix254;
				//komplementi i x14
				double komplementix144 = minorix144 * (-(n1[3]));
				
				
				
				
				
				//komplementi dhe minori i x15
					
				//komplementi i x21
				double rr32345[] = {n3[1],n3[2],n3[3]};
				double rr42345[] = {n4[1],n4[2],n4[3]};
				double rr52345[] = {n5[1],n5[2],n5[3]};
				
				double minorix215 = determinanta3(n3[1],n3[2],n3[3],n4[1],n4[2],n4[3],n5[1],n5[2],n5[3]);
				double komplementix215 = minorix215 * n2[0];
				
				//komplementi i x22
				double rr31345[] = {n3[0],n3[2],n3[3]};
				double rr41345[] = {n4[0],n4[2],n4[3]};
				double rr51345[] = {n5[0],n5[2],n5[3]};
							
				double minorix225 = determinanta3(n3[0],n3[2],n3[3],n4[0],n4[2],n4[3],n5[0],n5[2],n5[3]);
				double komplementix225 = minorix225 * (-(n2[1]));
				
				//komplementi i x23
				double rr31245[] = {n3[0],n3[1],n3[3]};
				double rr41245[] = {n4[0],n4[1],n4[3]};
				double rr51245[] = {n5[0],n5[1],n5[3]};
							
				double minorix235 = determinanta3(n3[0],n3[1],n3[3],n4[0],n4[1],n4[3],n5[0],n5[1],n5[3]);
				double komplementix235 = minorix235 * n2[2];
				
				//komplementi i x24
				double rr31235[] = {n3[0],n3[1],n3[2]};
				double rr41235[] = {n4[0],n4[1],n4[2]};
				double rr51235[] = {n5[0],n5[1],n5[2]};
				
				double minorix245 = determinanta3(n3[0],n3[1],n3[2],n4[0],n4[1],n4[2],n5[0],n5[1],n5[2]);
				double komplementix245 = minorix245 * (-(n2[3]));
				
				//minori i x15
				double minorix155 = komplementix215 + komplementix225 + komplementix235 + komplementix245;
				//komplementi i x15
				double komplementix155 = minorix155 * n1[4];
				
				
				
				
				
				//shfaqja e llogaritjeve te determinantes
				
				double determinanta5 = komplementix111 + komplementix122 + komplementix133 + komplementix144+ komplementix155;
			
				System.out.println("\n--------------------------------------\n");
				
				System.out.println("Matrica juaj: \n");
				System.out.println(Arrays.toString(n1));
				System.out.println(Arrays.toString(n2));
				System.out.println(Arrays.toString(n3));
				System.out.println(Arrays.toString(n4));
				System.out.println(Arrays.toString(n5));
				
				System.out.println("\n--------------------------------------\n");
				
				System.out.println("Marrim minoret e numrave te rreshtit te pare: \n");
				
				//numri1
				System.out.println(n1[0]+".");
				System.out.println(Arrays.toString(minori1rreshti2));
				System.out.println(Arrays.toString(minori1rreshti3));
				System.out.println(Arrays.toString(minori1rreshti4)+ " = ");
				System.out.println(Arrays.toString(minori1rreshti5)+"\n");
				
				System.out.println(Arrays.toString(rr33451));
				System.out.println(Arrays.toString(rr43451)+ " * "+n2[1]+" = "+ minorix221+ " * " + n2[1] + " = " + komplementix221 );
				System.out.println(Arrays.toString(rr53451)+ "\n");
				
				System.out.println(Arrays.toString(rr32451));
				System.out.println(Arrays.toString(rr42451)+ " * "+n2[2]+" = "+ minorix231+ " * " + (-(n2[2])) + " = " + komplementix231);
				System.out.println(Arrays.toString(rr52451)+ "\n");
				
				System.out.println(Arrays.toString(rr32351));
				System.out.println(Arrays.toString(rr42351)+ " * "+n2[3]+" = "+ minorix241+ " * " + n2[3] + " = " + komplementix241);
				System.out.println(Arrays.toString(rr52351)+ "\n");
				
				System.out.println(Arrays.toString(rr32341));
				System.out.println(Arrays.toString(rr42341)+ " * "+n2[4]+" = "+ minorix251+ " * " + (-(n2[4])) + " = " + komplementix251);
				System.out.println(Arrays.toString(rr52341)+ "\n");
				
				System.out.println("Minori i numrit te pare : \n" + komplementix221 + " + "+komplementix231+" + "+komplementix241+" + "+komplementix251+" = "+minorix111 +"\n");
				System.out.println("Komplementi i numrit te pare : \n" + minorix111 +" * "+n1[0] + " = " + komplementix111 );
				
				System.out.println("\n-  -  -  -  -  -  -  -  -  -  -  -  -  -\n");
				
				//numri2
				System.out.println(n1[1]+".");
				System.out.println(Arrays.toString(minori2rreshti2));
				System.out.println(Arrays.toString(minori2rreshti3));
				System.out.println(Arrays.toString(minori2rreshti4)+ " = ");
				System.out.println(Arrays.toString(minori2rreshti5)+"\n");
				
				System.out.println(Arrays.toString(rr33452));
				System.out.println(Arrays.toString(rr43452)+ " * "+n2[0]+" = "+ minorix212+ " * " + n2[0] + " = " + komplementix212);
				System.out.println(Arrays.toString(rr53452)+ "\n");
														
				System.out.println(Arrays.toString(rr31452));
				System.out.println(Arrays.toString(rr41452)+ " * "+n2[2]+" = "+ minorix232+ " * " + (-(n2[2])) + " = " + komplementix232);
				System.out.println(Arrays.toString(rr51452)+ "\n");
														
				System.out.println(Arrays.toString(rr31352));
				System.out.println(Arrays.toString(rr41352)+ " * "+n2[3]+" = "+ minorix242+ " * " + n2[3] + " = " + komplementix242);
				System.out.println(Arrays.toString(rr51352)+ "\n");
														
				System.out.println(Arrays.toString(rr31342));
				System.out.println(Arrays.toString(rr41342)+ " * "+n2[4]+" = "+ minorix252+ " * " + (-(n2[4])) + " = " + komplementix252);
				System.out.println(Arrays.toString(rr51342)+ "\n");
				
				System.out.println("Minori i numrit te dyte : \n" + komplementix212 + " + "+komplementix232+" + "+komplementix242+" + "+komplementix252+" = "+minorix122 +"\n");
				System.out.println("Komplementi i numrit te dyte : \n" + minorix122 +" * "+n1[1] + " = " + komplementix122 );
				
				System.out.println("\n-  -  -  -  -  -  -  -  -  -  -  -  -  -\n");
	
		
				//numri3
				System.out.println(n1[2]+".");
				System.out.println(Arrays.toString(minori3rreshti2));
				System.out.println(Arrays.toString(minori3rreshti3));
				System.out.println(Arrays.toString(minori3rreshti4)+ " = ");
				System.out.println(Arrays.toString(minori3rreshti5)+"\n");
				
				System.out.println(Arrays.toString(rr32453));
				System.out.println(Arrays.toString(rr42453)+ " * "+n2[0]+" = "+ minorix213+ " * " + n2[0] + " = " + komplementix213);
				System.out.println(Arrays.toString(rr52453)+ "\n");
														
				System.out.println(Arrays.toString(rr31453));
				System.out.println(Arrays.toString(rr41453)+ " * "+n2[1]+" = "+ minorix223+ " * " + (-(n2[1])) + " = " + komplementix223);
				System.out.println(Arrays.toString(rr51453)+ "\n");
														
				System.out.println(Arrays.toString(rr31253));
				System.out.println(Arrays.toString(rr41253)+ " * "+n2[3]+" = "+ minorix243+ " * " + n2[3] + " = " + komplementix243);
				System.out.println(Arrays.toString(rr51253)+ "\n");
														
				System.out.println(Arrays.toString(rr31243));
				System.out.println(Arrays.toString(rr41243)+ " * "+n2[4]+" = "+ minorix253+ " * " + (-(n2[4])) + " = " + komplementix253);
				System.out.println(Arrays.toString(rr51243)+ "\n");
				
				System.out.println("Minori i numrit te trete : \n" + komplementix213 + " + "+komplementix223+" + "+komplementix243+" + "+komplementix253+" = "+minorix133 +"\n");
				System.out.println("Komplementi i numrit te trete : \n" + minorix133 +" * "+ n1[2] + " = " + komplementix133 );
				
				System.out.println("\n-  -  -  -  -  -  -  -  -  -  -  -  -  -\n");
	
				//numri4
				System.out.println(n1[3]+".");
				System.out.println(Arrays.toString(minori4rreshti2));
				System.out.println(Arrays.toString(minori4rreshti3));
				System.out.println(Arrays.toString(minori4rreshti4)+ " = ");
				System.out.println(Arrays.toString(minori4rreshti5)+"\n");
				
				System.out.println(Arrays.toString(rr32354));
				System.out.println(Arrays.toString(rr42354)+ " * "+n2[0]+" = "+ minorix214+ " * " + n2[0] + " = " + komplementix214);
				System.out.println(Arrays.toString(rr52354)+ "\n");
														
				System.out.println(Arrays.toString(rr31354));
				System.out.println(Arrays.toString(rr41354)+ " * "+n2[1]+" = "+ minorix224+ " * " + (-(n2[1])) + " = " + komplementix224);
				System.out.println(Arrays.toString(rr51354)+ "\n");
														
				System.out.println(Arrays.toString(rr31254));
				System.out.println(Arrays.toString(rr41254)+ " * "+n2[2]+" = "+ minorix234+ " * " + n2[2] + " = " + komplementix234);
				System.out.println(Arrays.toString(rr51254)+ "\n");
														
				System.out.println(Arrays.toString(rr31234));
				System.out.println(Arrays.toString(rr41234)+ " * "+n2[4]+" = "+ minorix254+ " * " + (-(n2[4])) + " = " + komplementix254);
				System.out.println(Arrays.toString(rr51234)+ "\n");
				
				System.out.println("Minori i numrit te katert : \n" + komplementix214 + " + "+komplementix224+" + "+komplementix234+" + "+komplementix254+" = "+minorix144 +"\n");
				System.out.println("Komplementi i numrit te katert : \n" + minorix144 +" * "+n1[3] + " = " + komplementix144 );
				
				System.out.println("\n-  -  -  -  -  -  -  -  -  -  -  -  -  -\n");
	
	
				//numri5
				System.out.println(n1[4]+".");
				System.out.println(Arrays.toString(minori5rreshti2));
				System.out.println(Arrays.toString(minori5rreshti3));
				System.out.println(Arrays.toString(minori5rreshti4)+ " = ");
				System.out.println(Arrays.toString(minori5rreshti5)+"\n");
				
				System.out.println(Arrays.toString(rr32345));
				System.out.println(Arrays.toString(rr42345)+ " * "+n1[0]+" = "+ minorix215+ " * " + n2[0] + " = " + komplementix215);
				System.out.println(Arrays.toString(rr52345)+ "\n");
														
				System.out.println(Arrays.toString(rr31345));
				System.out.println(Arrays.toString(rr41345)+ " * "+n2[1]+" = "+ minorix225+ " * " + (-(n2[1])) + " = " + komplementix225);
				System.out.println(Arrays.toString(rr51345)+ "\n");
														
				System.out.println(Arrays.toString(rr31245));
				System.out.println(Arrays.toString(rr41245)+ " * "+n2[2]+" = "+ minorix235+ " * " + n2[2] + " = " + komplementix235);
				System.out.println(Arrays.toString(rr51245)+ "\n");
														
				System.out.println(Arrays.toString(rr31235));
				System.out.println(Arrays.toString(rr41235)+ " * "+n2[3]+" = "+ minorix245+ " * " + (-(n2[3])) + " = " + komplementix245);
				System.out.println(Arrays.toString(rr51235)+ "\n");
				
				System.out.println("Minori i numrit te peste : \n" + komplementix215 + " + "+komplementix225+" + "+komplementix235+" + "+komplementix245+" = "+minorix155 +"\n");
				System.out.println("Komplementi i numrit te peste : \n" + minorix155 +" * "+n1[4] + " = " + komplementix155 );
				
				System.out.println("\n--------------------------------------\n");
				System.out.println("Determinanta e matrices se dhene: \n");
				System.out.println("Komplementi i x11 + komplementi i x12 + komplementi i x13 + komplementi i x14 + komplementi i x15 ;\n");
				System.out.println(komplementix111 +" + "+komplementix122+" + "+komplementix133+" + "+komplementix144+" + "+ komplementix155+" = "+ determinanta5  );
			
			}
			
		//}
		
		/*else if(veprimi == 2){
			
			//input
			System.out.print("\nShkruaj rendin e matrices (1-5) : ");
			int rendi = sc.nextInt();
			
			
			//wrong input
			while (rendi!=1 && rendi!=2 && rendi!=3 && rendi!=4 && rendi!=5){
				System.out.println("\Veprimet mes matricave se rendit " + rendi + " nuk mund te kryhen");
				System.out.print("\nShkruaj rendin e matrices (1-5): ");
				rendi = sc.nextInt();
			}
			
			
			System.out.println("\n--------------------------------------\n");
			
			if(rendi == 1){
				
			}
			
			
		}
		*/
		sc.close();
		
	}
}