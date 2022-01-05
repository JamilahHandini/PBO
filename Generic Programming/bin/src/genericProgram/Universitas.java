package genericProgram;

import java.util.ArrayList;
import java.util.Collection;


public class Universitas {
	String univ;
	Universitas(String univ){
		this.univ = univ;
	}
	
	public static void printCollection(Collection<?> c) {
		for (Object e : c) {
		System.out.println(e);
		}
	}


		public static void main(String[] args) {
			Collection<String> namaMahasiswa = new ArrayList<>(); //dari WildCard
			namaMahasiswa.add("Jamilah");
			namaMahasiswa.add("Handini");
			printCollection(namaMahasiswa);
			
			Universitas univ1= new Universitas("Polban");
			Universitas univ2= new Universitas("Politeknik Negeri Bandung");
			Universitas[] mhs = {univ1,univ2};
			
			NilaiMatKul<Praktek> nmp = new NilaiMatKul<Praktek>(new Praktek());		//dari bounded
			nmp.RunNilai();	
			NilaiMatKul<Teori> nmt = new NilaiMatKul<Teori>(new Teori());
			nmt.RunNilai();
			
			boolean IsEmpty =  NilaiMatKul.<String>isEmpty(mhs);	//generic methods
			System.out.println(IsEmpty);
			
			Integer inums[] = { 75, 84, 91, 58, 45 };			
			Character chs[] = { 'b', 'd', 'a', 'c' };
			Mahasiswa<Integer> a = new Mahasiswa<Integer>(inums);		//generic Interface dan generic class
			Mahasiswa<Character> b = new Mahasiswa<Character>(chs);
			Integer sort_inums[] = a.sort();
			Character sort_chs[] = b.sort();
			for(int i = 0; i<sort_inums.length; i++) {
				System.out.println(sort_inums[i]);
			}
			for(int i = 0; i<sort_chs.length; i++) {
				System.out.println(sort_chs[i]);
			}
		}
}

