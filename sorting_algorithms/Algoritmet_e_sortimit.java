import java.util.*;
public class Algoritmet_e_sortimit {

	//printing methods
    public static void printArray(int [] vargu){
        for(int i =0;i<vargu.length;i++){
            System.out.print(vargu[i]+ " ");
        }
    }
	
	public static void printTitle(String titulli){
		printThickLine();
		System.out.println("\n"+titulli+": ");
	}
	
	public static void printResults(int [] vargu_origjinal, int [] vargu, double kohaKaluar){
		printThickLine();
		System.out.print("\nVargu origjinal: ");
		printArray(vargu_origjinal);
		System.out.print("\nVargu i sortuar: ");
		printArray(vargu);
		System.out.println("\nKoha e kalkulimit: "+kohaKaluar+"ms");
		printThickLine();
	}
	
	public static void printLine(){
		System.out.println("\n-------------");
	}
	
	public static void printThickLine(){
		System.out.println("\n######################################");
	}
	
	public static void printMainOptions(){
		System.out.println("\n1) Krijo vargun e numrave sipas deshires");
		System.out.println("2) Gjenero nje varg me 40 numra te rendomte");
		System.out.println("3) Mbyll aplikacionin");
		System.out.print("\nZgjidhni nje nga opsionet (1-3): ");
	}
	
	public static void printAlgoOptions(){
		System.out.println("\n1) Selection Sort");
		System.out.println("2) Insertion Sort");
		System.out.println("3) Shellsort");
		System.out.println("4) Bubble Sort");
		System.out.println("5) Shfaq performancen e te gjithave");
		System.out.print("\nZgjidhni njerin nga opsjonet (1-5): ");
	}
	
	
	//sorting algorithms
	public static int[] selectionSort(int [] vargu,boolean showIterations){
		//printon iterations
		if(showIterations){
			for (int i = 0; i < vargu.length - 1; i++){ 
				
				//iterations
				System.out.println("\nIterimi "+i+": ");
				printArray(vargu);
				System.out.println("\n");
				
				int index = i; //pointer 
				for (int j = i + 1; j < vargu.length; j++){  
					if (vargu[j] < vargu[index]){  
						index = j;
					}  
				}  
				int numriMeIVogel = vargu[index];   
				vargu[index] = vargu[i];  
				vargu[i] = numriMeIVogel;  
			}
		}
		//nuk printon iterations
		else{
			for (int i = 0; i < vargu.length - 1; i++){	
				int index = i; //pointer 
				for (int j = i + 1; j < vargu.length; j++){  
					if (vargu[j] < vargu[index]){  
						index = j;
					}  
				}  
				int numriMeIVogel = vargu[index];   
				vargu[index] = vargu[i];  
				vargu[i] = numriMeIVogel;  
			
			}
		}
		return vargu;
	}
		
	public static int[] insertionSort(int [] vargu,boolean showIterations){
		//printon iterations
		if(showIterations){
			for (int i = 1; i < vargu.length; i++) {  
				System.out.println("\nIterimi "+(i-1)+": ");
				printArray(vargu);
				System.out.println("\n");
				
				int index = vargu[i]; //pointer
				int j = i-1;  
				while ( (j > -1) && ( vargu[j] > index ) ) {  
					vargu[j+1] = vargu[j];  
					j--;  
				}  
				vargu[j+1] = index;  
			}
		}
		//nuk printon iterations
		else{
			for (int i = 1; i < vargu.length; i++) {  				
				int index = vargu[i]; //pointer
				int j = i-1;  
				while ( (j > -1) && ( vargu[j] > index ) ) {  
					vargu[j+1] = vargu[j];  
					j--;  
				}  
				vargu[j+1] = index;  
			}
		}
		return vargu;
	}
	
	public static int[] shellSort(int [] vargu,boolean showIterations){
		if(showIterations){
			int count=0;
			System.out.println("\nIterimi "+(count++)+": ");
			printArray(vargu);
			System.out.println("\n");
			
			for (int sekuenca = vargu.length / 2; sekuenca > 0; sekuenca /= 2) {
				for (int i = sekuenca; i < vargu.length; i++) {
					int index = vargu[i];
					int j = i;
					while (j >= sekuenca && vargu[j - sekuenca] > index) {
						vargu[j] = vargu[j - sekuenca];
						j = j - sekuenca;
					}
					vargu[j] = index;
				}
				
				System.out.println("\nIterimi "+(count++)+": ");
				printArray(vargu);
				System.out.println("\n");
			}
		}
		else{
			for (int sekuenca = vargu.length / 2; sekuenca > 0; sekuenca /= 2) {				
				for (int i = sekuenca; i < vargu.length; i++) {
					int index = vargu[i];
					int j = i;
					while (j >= sekuenca && vargu[j - sekuenca] > index) {
						vargu[j] = vargu[j - sekuenca];
						j = j - sekuenca;
					}
					vargu[j] = index;
				}
			}
		}
		return vargu;
	}

	public static int[] bubbleSort(int [] vargu,boolean showIterations){
		if(showIterations){
			int n = vargu.length;  
			int temp = 0;  
			for(int i=0; i < n; i++){  
			
			System.out.println("\nIterimi "+i+": ");
			printArray(vargu);
			System.out.println("\n");
			
				for(int j=1; j < (n-i); j++){  
					if(vargu[j-1] > vargu[j]){  
						temp = vargu[j-1];  
						vargu[j-1] = vargu[j];  
						vargu[j] = temp;  
					}         
				}  
			}
		}
		else{
			int n = vargu.length;  
			int temp = 0;  
			for(int i=0; i < n; i++){  
				for(int j=1; j < (n-i); j++){  
					if(vargu[j-1] > vargu[j]){  
						temp = vargu[j-1];  
						vargu[j-1] = vargu[j];  
						vargu[j] = temp;  
					}         
				}  
			}
		}
		return vargu;
	}

	//check if String is not 2-10
	public static boolean isNumber(String gjatesia_vargut){
		return !gjatesia_vargut.equals("2") && !gjatesia_vargut.equals("3") && !gjatesia_vargut.equals("4") 
					&& !gjatesia_vargut.equals("5") && !gjatesia_vargut.equals("6") && !gjatesia_vargut.equals("7") 
					&& !gjatesia_vargut.equals("8") && !gjatesia_vargut.equals("9") && !gjatesia_vargut.equals("10");
	}
	
	//metoda main
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		//intro
		System.out.println("\n\n**********************");
        System.out.println("ALGORITMET E SORTIMIT");
		System.out.println("**********************\n");
		
		
		//sigurimi i korrektesise se inputit dhe kontinuitetit te aplikacionit
		String option = "";
		while(!option.equals("1") && !option.equals("2") && !option.equals("3")){
			
			//opsionet e aplikacionit
			printMainOptions();
			option = sc.nextLine();		
			printLine();
			
			//vargu sipas deshires
			if(option.equals("1")){
				
				//sigurimi i korrektesise se inputit
				String gjatesia_vargut ="";
				while(isNumber(gjatesia_vargut)){
					System.out.print("\nGjatesia e vargut(2-10): ");
					gjatesia_vargut = sc.nextLine();				
				}
				
				//konvertimi i string ne int per me ja caktu gjatesine vargut
				int length=Integer.parseInt(gjatesia_vargut);  
				int[] vargu_origjinal = new int[length];
				
				//marrja e vlerave per vargun duke u siguruar qe inputi eshte int
				String inputi_vargut = "";
				for(int i=0;i<length;i++){
					inputi_vargut=" ";
					while(!inputi_vargut.matches("[0-9]+") || inputi_vargut.contains(" ")){					
						System.out.print("Numri ne poziten "+ (i+1) + ": ");
						inputi_vargut = sc.nextLine();
					}
					vargu_origjinal[i] = Integer.parseInt(inputi_vargut);
				}
				
				//paraqitja e vargut te krijuar
				System.out.println("\n-------------");
				System.out.println("Vargu juaj: ");
				printArray(vargu_origjinal);
				System.out.println("\n-------------");
				
				//duplikimi i vargut te dhene nga perdoruesi
				int [] vargu = new int [vargu_origjinal.length];
				for(int i = 0;i<vargu_origjinal.length;i++){
					vargu[i] = vargu_origjinal[i];
				}

				//opsionet e algoritmeve dhe vertetimi i korrektesise se inputit
				String opsioni_algoritmit = "";				
				while(!opsioni_algoritmit.equals("1") && !opsioni_algoritmit.equals("2") && !opsioni_algoritmit.equals("3") && !opsioni_algoritmit.equals("4") && !opsioni_algoritmit.equals("5")){
					printAlgoOptions();
					opsioni_algoritmit = sc.nextLine();
				}				
				
				//selection sort
				if(opsioni_algoritmit.equals("1")){
					
					printTitle("Selection Sort");
					
					long fillimi = System.nanoTime();
					
					selectionSort(vargu,true);
					
					long fundi = System.nanoTime();
					double kohaKaluar = (fundi-fillimi)/(double)1000000;
					
					printResults(vargu_origjinal,vargu,kohaKaluar);
				}
				
				//insertion sort
				if(opsioni_algoritmit.equals("2")){
					
					printTitle("Insertion Sort");
					
					long fillimi = System.nanoTime();
					
					insertionSort(vargu,true);
					
					long fundi = System.nanoTime();
					double kohaKaluar = (fundi-fillimi)/(double)1000000;
					
					printResults(vargu_origjinal,vargu,kohaKaluar);
				}
				
				//shellsort 
				if(opsioni_algoritmit.equals("3")){
					
					printTitle("Shellsort");
					
					long fillimi = System.nanoTime();
					
					shellSort(vargu,true);

					long fundi = System.nanoTime();
					double kohaKaluar = (fundi-fillimi)/(double)1000000;

					printResults(vargu_origjinal,vargu,kohaKaluar);
				}
				
				//bubble sort
				if(opsioni_algoritmit.equals("4")){
					
					printTitle("Bubble Sort");
					
					long fillimi = System.nanoTime();
					
					bubbleSort(vargu,true);

					long fundi = System.nanoTime();
					double kohaKaluar = (fundi-fillimi)/(double)1000000;

					printResults(vargu_origjinal,vargu,kohaKaluar);
				}
				
				//opsioni 5
				if(opsioni_algoritmit.equals("5")){
					
					printThickLine();
					System.out.print("\nVargu origjinal: ");
					printArray(vargu_origjinal);
					System.out.print("\nVargu i sortuar: ");
					selectionSort(vargu,false);
					printArray(vargu);
					System.out.println("\n");
					printLine();
					
					
					
					//selection sort
					
					long fillimi = System.nanoTime();
					selectionSort(vargu,false);
					long fundi = System.nanoTime();
					double kohaKaluar = (fundi-fillimi)/(double)1000000;
					System.out.println("\nSelection Sort:");
					System.out.println("\n"+ kohaKaluar+"ms");
					
					//insertion sort
					printLine();
					fillimi = System.nanoTime();
					insertionSort(vargu,false);
					fundi = System.nanoTime();
					kohaKaluar = (fundi-fillimi)/(double)1000000;
					System.out.println("\nInsertion Sort:");
					System.out.println("\n"+ kohaKaluar+"ms");
					
					//selection sort
					printLine();
					fillimi = System.nanoTime();
					shellSort(vargu,false);
					fundi = System.nanoTime();
					kohaKaluar = (fundi-fillimi)/(double)1000000;
					System.out.println("\nShellsort:");
					System.out.println("\n"+ kohaKaluar+"ms");
					
					//selection sort
					printLine();
					fillimi = System.nanoTime();
					bubbleSort(vargu,false);
					fundi = System.nanoTime();
					kohaKaluar = (fundi-fillimi)/(double)1000000;
					System.out.println("\nBubble Sort");
					System.out.println("\n"+ kohaKaluar+"ms");
					printThickLine();
				}
				
				option="";
				
			}
		
			//vargu i gjeneruar
			while(option.equals("2")){
				System.out.println("\nDuke gjeneruar vargun...");
				int[] vargu_origjinal = new int[40];
				
				//gjenerimi i vargut
				for(int i =0;i<vargu_origjinal.length;i++){
					vargu_origjinal[i]=random.nextInt(100);
				}
				
				//delay per mos mu dok fake generating
				try {
					Thread.sleep(1000); // 1 sekonda
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
				System.out.println("\nVargu i gjeneruar: \n");
				printArray(vargu_origjinal);
				System.out.println("\n");
				
				//duplikimi i vargut te dhene nga perdoruesi
				int [] vargu = new int [vargu_origjinal.length];
				for(int i = 0;i<vargu_origjinal.length;i++){
					vargu[i] = vargu_origjinal[i];
				}
				
				//opsionet e algoritmeve dhe vertetimi i korrektesise se inputit
				String opsioni_algoritmit = "";				
				while(!opsioni_algoritmit.equals("1") && !opsioni_algoritmit.equals("2") && !opsioni_algoritmit.equals("3") && !opsioni_algoritmit.equals("4") && !opsioni_algoritmit.equals("5")){
					printAlgoOptions();
					opsioni_algoritmit = sc.nextLine();
				}
				
				//selection sort
				if(opsioni_algoritmit.equals("1")){
					
					printTitle("Selection Sort");
					
					long fillimi = System.nanoTime();
					
					selectionSort(vargu,true);
					
					long fundi = System.nanoTime();
					double kohaKaluar = (fundi-fillimi)/(double)1000000;
					
					printResults(vargu_origjinal,vargu,kohaKaluar);
				}
				
				//insertion sort
				if(opsioni_algoritmit.equals("2")){
					
					printTitle("Insertion Sort");
					
					long fillimi = System.nanoTime();
					
					insertionSort(vargu,true);
					
					long fundi = System.nanoTime();
					double kohaKaluar = (fundi-fillimi)/(double)1000000;
					
					printResults(vargu_origjinal,vargu,kohaKaluar);
				}
				
				//shellsort 
				if(opsioni_algoritmit.equals("3")){
					
					printTitle("Shellsort");
					
					long fillimi = System.nanoTime();
					
					shellSort(vargu,true);

					long fundi = System.nanoTime();
					double kohaKaluar = (fundi-fillimi)/(double)1000000;

					printResults(vargu_origjinal,vargu,kohaKaluar);
				}
				
				//bubble sort
				if(opsioni_algoritmit.equals("4")){
					
					printTitle("Bubble Sort");
					
					long fillimi = System.nanoTime();
					
					bubbleSort(vargu,true);

					long fundi = System.nanoTime();
					double kohaKaluar = (fundi-fillimi)/(double)1000000;

					printResults(vargu_origjinal,vargu,kohaKaluar);
				}
				
				//opsioni 5
				if(opsioni_algoritmit.equals("5")){
					
					printThickLine();
					System.out.print("\nVargu origjinal: ");
					printArray(vargu_origjinal);
					System.out.print("\nVargu i sortuar: ");
					selectionSort(vargu,false);
					printArray(vargu);
					System.out.println("\n");
					printLine();
					
					
					
					//selection sort
					
					long fillimi = System.nanoTime();
					selectionSort(vargu,false);
					long fundi = System.nanoTime();
					double kohaKaluar = (fundi-fillimi)/(double)1000000;
					System.out.println("\nSelection Sort:");
					System.out.println("\n"+ kohaKaluar+"ms");
					
					//insertion sort
					printLine();
					fillimi = System.nanoTime();
					insertionSort(vargu,false);
					fundi = System.nanoTime();
					kohaKaluar = (fundi-fillimi)/(double)1000000;
					System.out.println("\nInsertion Sort:");
					System.out.println("\n"+ kohaKaluar+"ms");
					
					//selection sort
					printLine();
					fillimi = System.nanoTime();
					shellSort(vargu,false);
					fundi = System.nanoTime();
					kohaKaluar = (fundi-fillimi)/(double)1000000;
					System.out.println("\nShellsort:");
					System.out.println("\n"+ kohaKaluar+"ms");
					
					//selection sort
					printLine();
					fillimi = System.nanoTime();
					bubbleSort(vargu,false);
					fundi = System.nanoTime();
					kohaKaluar = (fundi-fillimi)/(double)1000000;
					System.out.println("\nBubble Sort");
					System.out.println("\n"+ kohaKaluar+"ms");
					printThickLine();
				}
				
				option="";
			}
			
		}
		
		
		//outro
		System.out.println("\n\n**********************");
        System.out.println("ALGORITMET E SORTIMIT by");
		System.out.println("Rron Haxhiu, Medina Mustafa");
		System.out.println("**********************\n");
	}
		
}