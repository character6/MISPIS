import java.util.*;

public class Faculty {

	Employee dean;
	private String name;
	Collection<Institute> institutes;
	University university;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param name
	 */
	public Faculty(String name, Collection<Institute> institutes, University university) {
		this.name = name;
		this.institutes = institutes;
		this.university = university;
	}

	@Override
	public String toString() {
		return "Faculty{" +
				"name='" + name + '\'' +
				", dean=" + (dean != null ? dean.getName() : "null") +
				", institutesCount=" + (institutes != null ? institutes.size() : 0) +
				'}';
	}
}