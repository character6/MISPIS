import java.util.Date;
import java.util.*;

public class Project {

	private String name;
	private Date start;
	private Date end;
	Collection<Participation> participation;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStart() {
		return this.start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return this.end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	/**
	 * 
	 * @param name
	 * @param start
	 * @param end
	 */
	public Project(String name, Date start, Date end, Collection<Participation> participation) {
		this.name = name;
		this.start = start;
		this.end = end;
		this.participation = participation;
	}

	@Override
	public String toString() {
		return "Project{" +
				"name='" + name + '\'' +
				", start=" + start +
				", end=" + end +
				", participationCount=" + (participation != null ? participation.size() : 0) +
				'}';
	}
}