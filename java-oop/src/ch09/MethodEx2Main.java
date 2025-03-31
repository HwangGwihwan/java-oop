package ch09;

import java.util.ArrayList;
import java.util.HashMap;

public class MethodEx2Main {

	public static void main(String[] args) {
		MethodEx2 m2 = new MethodEx2();
		
//		int[] arr = new int[7];
//		System.out.println(m2.m24b(arr));
//		
//		// Student 변수를 디버깅하는 메서드
//		// 반환타입 String
//		// 매개타입 Student
//		Student s = new Student();
//		s.num = 2;
//		s.name = "조로";
//		System.out.println(m2.m25a(s));
//		
//		Student s2 = new Student();
//		s2.num = 3;
//		s2.name = "나미";
//		System.out.println(m2.m25a(s2));
//		
//		// Student 변수를 비교하는 메서드
//		Student s3 = new Student();
//		s3.num = 3;
//		s3.name = "나미";
//		
//		System.out.println(s2 == s3); // false
//		System.out.println(s2.equals(s3));
//		System.out.println(m2.m24c(s2, s3));
//		
//		//
//		ArrayList<String> list = new ArrayList<String>();
//		
//		list.add("101");
//		list.add("200");
//		list.add("999");
//		int[] result = m2.m4a(list);
//		for (int n : result) {
//			System.out.println(n);
//		}
//		
		int[] result2 = m2.m5a(3293);
		for (int n : result2) {
			System.out.print(n + " ");
		}
		System.out.println();
//		
//		String[] result3 = m2.m5b(1004);
//		for (String str : result3) {
//			System.out.print(str + " ");
//		}
//		System.out.println();
//		
//		Student student = m2.m6a(8, "로빈");
//	    System.out.println(m2.m25a(student));
	    
	    ArrayList<HashMap<String, Object>> list2 = new ArrayList<HashMap<String,Object>>();
	   
	    HashMap<String, Object> map1 = new HashMap<String, Object>();
	    map1.put("num", 11);
	    map1.put("name", "샹크스");
	    list2.add(map1);
	    
	    HashMap<String, Object> map2 = new HashMap<String, Object>();
	    map2.put("num", 21);
	    map2.put("name", "버기");
	    list2.add(map2);
	    
	    HashMap<String, Object> map3 = new HashMap<String, Object>();
	    map3.put("num", 7);
	    map3.put("name", "프랑키");
	    list2.add(map3);
	    
	    Student[] arr5 = m2.m7a(list2);
	    for (Student stu : arr5) {
	    	System.out.println(m2.m25a(stu));
	    }

	    ArrayList<String> nameList = m2.m8a("루피", "조로", "상디", "나미", "우솦");
	    for (String n : nameList) {
	    	System.out.println(n);
	    }
	    
	    Student s = new Student();
	    s.num = 99;
	    s.name = "티치";
	    HashMap<String, Object> map9 = m2.m9a(s);
	    System.out.println(map9.get("num"));
	    System.out.println(map9.get("name"));
	}
}
