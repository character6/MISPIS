public class Participation {

	private int hours;
	ResearchStaff researchStaff;
	Project project;

	public int getHours() {
		return this.hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public Participation(int hours, ResearchStaff researchStaff, Project project) {
		this.hours = hours;
		this.researchStaff = researchStaff;
		this.project = project;
	}

	@Override
	public String toString() {
		return "Participation{" +
				"hours=" + hours +
				", researcher=" + (researchStaff != null ? researchStaff.getName() : "null") +
				", project=" + (project != null ? project.getName() : "null") +
				'}';
	}
}