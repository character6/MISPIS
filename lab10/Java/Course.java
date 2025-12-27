import java.util.*;

public class Course {

	private String name;
	private int id;
	private float hours;
	Collection<Lecturer> teaches;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getHours() {
		return this.hours;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}

	/**
	 * 
	 * @param name
	 * @param id
	 * @param hours
	 */
	public Course(String name, int id, int hours, Collection<Lecturer> teaches) {
		this.name = name;
		this.id = id;
		this.hours = hours;
		this.teaches = teaches;
	}
	@Override
	public String toString() {
		return "Course{" +
				"name='" + name + '\'' +
				", id=" + id +
				", hours=" + hours +
				", lecturersCount=" + (teaches != null ? teaches.size() : 0) +
				'}';
	}
}