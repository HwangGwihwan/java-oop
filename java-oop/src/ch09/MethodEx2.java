package ch09;

import java.util.ArrayList;
import java.util.HashMap;

public class MethodEx2 {
	// 반환타입 숫자
	// 매개타입: 배열 -> length Api 사용x
	// 배열을 입력하면 반환값으로 배열의 길이 반환
	public int m24(int[] arr) { // 
		int result = 0;
		
		for (int a : arr) {
			result++;
		}
		return result;
	}
	
	public int m24b(int[] arr) {
		int i = 0;
		boolean flag = true;
		while (flag) {
			try {
				int temp = arr[i];
			} catch (Exception e) {
				return i;
			}
			i++;
		}
		return i;
	}
	
	// Student타입을 디버깅하는 메서드
	// 반환타입 : String
	// 매개타입 : 클래스 하나
	public String m25a(Student s) {
		String result = "";
		result += "번호는 " + s.num + "이고, 이름은 " + s.name + " 입니다";
		return result; // 번호는 ?이고, 이름은 ? 입니다
	}
	
	// 반환타입 : boolean
	// 매개타입 : 클래스 두개
	public boolean m24c(Student s1, Student s2) {
		boolean result = false;
		if (s1.num == s2.num && s1.name.equals(s2.name)) {	
			result = true;
		}
		return result;
	}
	
	// 반환타입 : 배열
	// 매개타입 : List
	// List를 입력받아서 배열로 변경하여 반환
	public int[] m4a(ArrayList<String> list) {
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = Integer.parseInt(list.get(i));
		}
		return result;
	}
	
	// 반환타입 : 배열
	// 매개타입 : int
	// 252 -> {2, 5, 2}
	public int[] m5a(int num){ // 나누기
		int[] result = null;
		// 숫자 복사
		int num2 = num;
		
		// 몇자리 숫자인지 구하기
		int i = 0;
		while (num > 0) {
			num = num / 10;
			i++;
		}
		
		// 배열에 숫자 넣기
		result = new int[i];
		for (int j = i-1; j >= 0; j--) {
			result[j] = num2 % 10;
			num2 = num2 / 10;
		}
		return result;
	}
	
	
	// 252 -> {"2", "5", "2"}
	public String[] m5b(int num) { // substring() 메서드
		String[] result = null;
		String str = num + "";
		
		result = new String[str.length()];
		
		int i;
		for (i = 0; i < str.length() - 1; i++) {
			result[i] = str.substring(i, i+1);
		}
		result[i] = str.substring(i);
		return result;
	}
	
	// 반환타입 : 클래스
	// 입력타입 : int, String
	public Student m6a(int num, String name) {
		Student s = new Student();
		s.num = num;
		s.name = name;
		return s;
	}
	
	// 반환타입 : Student[]
	// 매개타입 : List<Map>
	public Student[] m7a(ArrayList<HashMap<String, Object>> list) {
		Student[] arr = new Student[list.size()];
		int i = 0;
		for (HashMap<String, Object> m : list) {
			arr[i] = new Student();
			arr[i].num = (Integer)m.get("num");
			arr[i].name = (String)m.get("name");
			i++;
		}
		return arr;
	}

	// 반환타입 : List<String>
	// 매개타입 : 임의의 개수의 문자열
	public ArrayList<String> m8a(String... name) {
		ArrayList<String> result = new ArrayList<String>();
		for (String s : name) {
			result.add(s);
		}
		return result;
	}
	
	// 반환타입 : Map
	// 매개타입 : Student
	public HashMap<String, Object> m9a(Student s) {
		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("num", s.num);
		result.put("name", s.name);
		return result;
	}
}
