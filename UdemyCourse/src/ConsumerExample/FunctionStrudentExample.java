package ConsumerExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionStrudentExample {
	
	static Function<List<Student>, Map <String, Double>> StudentFunction = (students -> {
		
		 Map <String, Double> studentGradeMap = new HashMap();
		 
		 students.forEach(Student -> {
//			 if (PredicateAndConsumerExample.p1.test(Student)) 
//				 	studentGradeMap.put(Student.getName(), Student.getGpa());
			 if (PredicateAndConsumerExample.bipredicate.test(Student.getGradeLevel(),Student.getGpa())) {
				 studentGradeMap.put(Student.getName(), Student.getGpa());
			 }
				 
			 
		 });
		 return studentGradeMap;
	});
	
	
	static UnaryOperator<String> unExample = s -> s.concat("hola!");
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(StudentFunction.apply(StudentDataBase.getAllStudents()));
		System.out.println(unExample.apply("Enrico "));	

	}

}
