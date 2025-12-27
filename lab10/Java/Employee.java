public class Employee {

	private int id;
	private String name;
	private String email;

	/**
	 *
	 * @param id
	 * @param name
	 * @param email
	 */
	public Employee(int id, String name, String email) {
		this.id = id;
		this.setEmail(email);
		this.setName(name);
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
}