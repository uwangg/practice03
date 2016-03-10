package prob7;

abstract public class Bird {
	private String name;
	private int legs;
	private int length;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	abstract public void fly();
	abstract public void sing();
	abstract public String toString();
}
