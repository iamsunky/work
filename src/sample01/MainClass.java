package sample01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("헬로우 자바");
		
		System.out.println("수정하였음");
		
		// 한 줄 주석문
		
		/*
		  
		  범위 주석문
		  
		 */
		
		System.out.println("Hello World");
		
		System.out.print("Hello");
		System.out.print("월드");
		
		// escape sequence
		// \n : 줄바꿈
		// \" : 따옴표 넣기
		// \t : 한 칸 띄어쓰기
		
		System.out.print("World\n");
		System.out.printf("헬로우%n");
		System.out.println("\"Hello World\"");
		System.out.println("\tHello\tWorld");
		System.out.println("\t헬로우\t월드");
		System.out.println("\t\\헬로우월드\\");
	}
}