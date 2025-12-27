import java.util.*;

public class University {

	Collection<Faculty> faculties;
	private String name;
	private int numberOfEmployees;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfEmployees() {
		return this.numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public void setFaculties(Collection<Faculty> faculties) {
		this.faculties = faculties;
	}
	/**
	 * 
	 * @param name
	 * @param numberOfEmployees
	 */
	public University(String name, int numberOfEmployees) {
		this.name = name;
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public String toString() {
		return "University{" +
				"name='" + name + '\'' +
				", numberOfEmployees=" + numberOfEmployees +
				", facultiesCount=" + (faculties != null ? faculties.size() : 0) +
				'}';
	}
}