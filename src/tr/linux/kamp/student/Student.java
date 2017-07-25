package tr.linux.kamp.student;

public class Student {
private String name;		//buraya özel name değişkeni tanımladık.
private double average;		//buraya özel average değişkeni tanımladık.

public Student (String name, double average) {
	this.name=name;
	if (average<=100) {
		this.average=average;
	}
	
}

public String getName() {		//getName isimli isim değişkenini geri döndüren metod tanımladık.
	return name;
}

public double getAverage () {		//getAverage isimli notu değişkenini geri döndüren metod tanımladık.
	return average;
}
public void setAverage (double average) {		//setAverage isimli not değişkenini harfe döndüren ve  geri döndüren metod tanımladık.
	if ( average >=0.0){
		if (average >=0.0) {
			this.average=average ;
		}
	}
}

public String getLetterGrade() {
	String letterGrade ="";
	
	if (average>=90.0) {
		letterGrade="A";
	}
	
	else if (average>=80.0) {
		letterGrade="B";
	}
	
	else if (average>=70.0) {
		letterGrade="c";
	}
	
	else if (average>=60.0) {
		letterGrade="D";
	}
	
	
	else letterGrade="F";
	
	return letterGrade ;
}
	}