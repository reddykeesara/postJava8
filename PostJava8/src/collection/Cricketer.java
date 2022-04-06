package collection;

public class Cricketer {
	String name;
	int runs;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", runs=" + runs + "]";
	}
	public Cricketer(String name, int runs) {
		super();
		this.name = name;
		this.runs = runs;
	}
	
	

}
