public class Student{
	public static int total_students;
	public static int total_marks;

	private String name;
	private int cMarks;
	private int tMarks;
	private int id;

	Student(String n){
		name = n;
		id = ++total_students;
	}
	Student(String n,int c, int t){
		name = n;
		cMarks = c;
		tMarks = t;
		id = total_students++;
		total_marks+=c+t;
	}

	public void setCodingMarks(int m){
		cMarks = m;
		total_marks+=m;
	}
	public void setTracingMarks(int m){
		tMarks = m;
		total_marks+=m;
	}

	public void individualDetail(){
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Coding Marks: "+cMarks);
		System.out.println("Tracing Marks: "+tMarks);
		if(cMarks+tMarks<50)
			System.out.println(name+" has failed with "+(cMarks+tMarks)+" marks");
		else
			System.out.println(name+" has passed with "+(cMarks+tMarks)+" marks");
	}

	public static double averageMarks(){
		return((total_students>0)?(total_marks/total_students):0);
	}
}
