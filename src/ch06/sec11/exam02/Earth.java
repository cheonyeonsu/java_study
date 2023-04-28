package ch06.sec11.exam02;

public class Earth {
	// 상수 필드
	// 상수명은 대문자로 작성. 단어 두개 이상이면 언더바로 끊어서 작성.
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;

//인스턴스 필드
	int personCount;

//정적블록으로 상수초기화
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
