package ConsumerExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

	static BiFunction<List<Student>, Predicate<Student>, Map <String, Double>> Bifunction = ((students, studentPredicate) -> {
		
		 Map <String, Double> mappaResult = new HashMap<>();
		 
		 students.forEach(student -> {
			 if (studentPredicate.test(student)) {
				 mappaResult.put(student.getName(),student.getGpa());
			 }
		 });
		return mappaResult;
	});

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Bifunction.apply(StudentDataBase.getAllStudents(), PredicateAndConsumerExample.p1));

	}



}
