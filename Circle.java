// 2020.12.24
// 백수정
// 문제 3)

public class Circle {
	String name;
	double radius;
	

	public void CalArae() {
		System.out.println("\n\n< " + name + " >\n");
		System.out.printf("이름 : " + name + "\n반지름 : " + radius + "\n넓이 : " + "%.3f",(Math.PI * Math.pow(radius, 2)));
	}
}
