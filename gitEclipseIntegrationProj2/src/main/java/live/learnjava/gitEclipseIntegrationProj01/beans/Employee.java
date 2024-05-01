package live.learnjava.gitEclipseIntegrationProj01.beans;

public class Employee {
	private String ename;

	public Employee(String ename) {
		super();
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + "]";
	}
	
}
