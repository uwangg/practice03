package prob7;

public class Sparrow extends Bird {
	public void fly() {
		System.out.println("참새("+super.getName()+")는 날아다닙니다.");
	}
	public void sing() {
		System.out.println("참새("+super.getName()+")가 소리내어 웁니다.");
	}
	public String toString() {
		String str = "참새의 이름은 "+super.getName()+" 입니다.";
		return str;
	}
}
