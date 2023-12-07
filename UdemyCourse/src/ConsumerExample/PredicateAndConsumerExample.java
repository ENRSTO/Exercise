package ConsumerExample;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;

    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;

    static Predicate<Student> p3 = s -> s.getGender().equals("female");
    
    BiPredicate<Integer, Double> bipredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9; 
    
    
    
    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

    Consumer<Student> studentConsumer = (student) -> {

    	if (bipredicate.test(student.getGradeLevel(), student.getGpa())){
    		studentBiConsumer.accept(student.getName(), student.getActivities());    		
    	}
    	
    	
//        if(p1.and(p2).and(p3).test(student)){
//            studentBiConsumer.accept(student.getName(),student.getActivities());
//        }
    };

//    Consumer<Student> studentConsumer1 = ((student) -> {
//
//        if(p1.and(p2).test(student)){
//            studentBiConsumer.accept(student.getName(),student.getActivities());
//        }
//    });

    public void printNameandActivities(List<Student> studentList){

        studentList.forEach(studentConsumer);

    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();

        new PredicateAndConsumerExample().printNameandActivities(studentList);

    }
}
