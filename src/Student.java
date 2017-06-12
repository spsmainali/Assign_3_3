import java.util.Scanner; 											// Imported class for taking input
class Sub_Marks{
	String sub[] = new String[5];								//Subject name array for multiple subject
	int marks[] = new int[5];									//Subject marks integer array for taking marks
	Scanner scan =new Scanner(System.in);
	public void getNoOfSub(int n){								//Method to take number of subject along with subject name and marks
		for(int i=0;i<n;i++){									//Names and marks for corresponding subject	are taken through this loop
			System.out.print("Enter the Sub -"+(i+1)+" Name: ");
			this.sub[i] = scan.next(); 
			System.out.print("Enter the Marks for "+this.sub[i]+": ");
			this.marks[i] = scan.nextInt(); 
		}
	}
	public void DisplayMarks(int n){				//The method declared inside the Sub_marks Class to display marks obtained on all subjct
			int SumMarks=0;
			int TotalMarks=0;
			for(int i=0;i<n;i++){
			System.out.print("The Marks for-"+sub[i]+"	-	"+marks[i]); 
			System.out.println();	
			SumMarks=SumMarks + marks[i];
			TotalMarks=TotalMarks+100;
		}
	for (int i=0;i<60;i++)					//loop to draw stright line to format the display
			System.out.print("_");
		System.out.println();
		System.out.println(SumMarks +" "+ TotalMarks);
		double x = (double)SumMarks/TotalMarks;	//type conversion from in to doubl to calculate percentage
		
		System.out.println("Percentage of Marks obtained: "+ x*100 + "%" );
	}
}
class Student_ extends Sub_Marks{ 				//the class Student_ is extended to Sub_Marks to inherit the properties of marks for each student
	String NameOfStudent;
	int ClassOfStudent;
	char Section;
	int rollNoOfStudent;
	Student_(String str,int c, char s, int r){			//student detail is initialised using constructor 
		NameOfStudent = str;
		ClassOfStudent = c;
		Section = s;
		rollNoOfStudent = r;
		System.out.println("Enter Marks obtained by :"+ NameOfStudent);
		getNoOfSub(2);									//call of function declared in parent class to get the no. of subject, name and marks obtained
		
	}
	void displayStudDetail(){							//the method displayStudDetail is defined  which is call above in the same class
		for (int i=0;i<60;i++)
			System.out.print("=");
		System.out.println();
		System.out.println("\t\tResult Card For "+ NameOfStudent); //heading
		System.out.println();
		for (int i=0;i<60;i++)
			System.out.print("=");						//format straight double line
		System.out.println();
		for (int i=0;i<60;i++)
			System.out.print("_");
		System.out.println();
		System.out.println("Class -"+ClassOfStudent+"\t Section -"+Section+"\t Roll No."+rollNoOfStudent); // student detail displayed
		for (int i=0;i<60;i++)
			System.out.print("_");
		System.out.println();
	}
}
class Student {								//Class student is creatd with main 
	public static void main(String args[]){
		Student_ obj1 = new Student_("Gaurav Sharma", 6, 'A', 45);  //object of Student_ is created with passing argument in Costructor
		Student_ obj2 = new Student_("Saurav Sharma", 9, 'B', 56);
		Student_ obj3 = new Student_("Sagar Joshi", 7, 'c', 56);
		
		obj1.displayStudDetail();							//method to display the student detail in output screen report caard
		obj1.DisplayMarks(2);								//method to display marks  obtained form parent class
		
		obj2.displayStudDetail();							//method to display the student detail in output screen report caard
		obj2.DisplayMarks(2);
		
		obj3.displayStudDetail();							//method to display the student detail in output screen report caard
		obj3.DisplayMarks(2);
	}
}