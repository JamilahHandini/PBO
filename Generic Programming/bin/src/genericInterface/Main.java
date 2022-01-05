package genericInterface;

public class Main {
	public static void main(String args[]) {
		Integer inums[] = { 3, 6, 2, 8, 6 };
		Character chs[] = { 'w', 'r', 'p', 'b' }; //mencoba menukar nilai indeks ke 0 dan ke 3 namun output yang dihasilkan tetap sama
		MyClass<Integer> a = new MyClass<Integer>(inums);
		MyClass<Character> b = new MyClass<Character>(chs);
		System.out.println(a.max());		//printout --> 8
		System.out.println(b.max());		//printout --> w (dibandingkan dari nilai ascii)
	}
}