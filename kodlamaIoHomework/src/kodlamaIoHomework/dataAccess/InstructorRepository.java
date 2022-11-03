package kodlamaIoHomework.dataAccess;

import kodlamaIoHomework.entities.Instructor;

public interface InstructorRepository {

	public void add(Instructor instructor);
	public void delete(Instructor instructor);
	public void update(Instructor instructor);
}
