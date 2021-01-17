// 2020.12.24
// 문제 2)
// 클래스 구성 및 사용 방법을 정확하게 사용했으나, 하나의 메서드는 하나의 목적을 위해서 사용하는 것이 좋음
// 현재는 CalArea 메서드가 넓이 및 둘레의 길이를 모두 출력하는 형태로 구현되어 있음
// 2개의 메서드로 나누어서 사용하는 것이 바람직함
public class Square {
	int width;
	int height;
	
	public void CalArea() {
		System.out.println("세로 : " + height + "\n가로 : " + width + "\n넓이 : " + (height * width) + "\n네 변의 합 : " + (2 * (height + width)));
	}
}
