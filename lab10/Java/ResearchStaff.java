import java.util.*;

public class ResearchStaff extends Employee {

	private String fieldOfStudy;
	Collection<Participation> participation;
	Collection<Institute> institutes;

	/**
	 * @param id
	 * @param name
	 * @param email
	 */
	public ResearchStaff(int id, String name, String email) {
		super(id, name, email);
	}


	public String getFieldOfStudy() {
		return this.fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy, Collection<Participation> participation, Collection<Institute> institutes) {
		this.fieldOfStudy = fieldOfStudy;
		this.participation = participation;
		this.institutes = institutes;
	}
}