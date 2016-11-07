package ManyToMany;

import java.io.File;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToManyMain {

	static Session session; 
	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));
		SessionFactory factory = configuration.buildSessionFactory();
		
		session = factory.openSession();

//		addCourse("C1");
//		addStudent("S1");
		
		addCourseToStudent(56,55);
		
		session.flush();
		session.close();
		
	}

	private static void addCourseToStudent(int i, int j) {
		session.beginTransaction();
		Student student = session.get(Student.class, i);
		Course course = session.get(Course.class, j);
		student.getCourses().add(course);
		session.getTransaction().commit();
	}

	private static void addStudent(String string) {
		session.beginTransaction();
		session.save(new Student(string, new HashSet<Course>()));
		session.getTransaction().commit();
	}

	private static void addCourse(String name) {
		session.beginTransaction();
		session.save(new Course(name, new HashSet<Student>()));
		session.getTransaction().commit();
	}

}