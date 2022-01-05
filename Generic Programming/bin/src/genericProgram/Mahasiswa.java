package genericProgram;


public class Mahasiswa<T extends Comparable<T>> implements GInterface<T>{ //generic class
	T[] nilai;
	
	Mahasiswa(T[] n) {	//constructor
		nilai = n;
	}
	public T[] sort() {

		for (int i = 0; i < nilai.length; i++) {
			for(int j = 0; j < nilai.length; j++) {
				T temp;
				if (nilai[j].compareTo(nilai[i]) > 0) {		//membandingkan nilai array indeks satu dengan lainnya
					temp = nilai[i];
					nilai[i] = nilai[j];
					nilai[j] = temp;
				}
			}
			
		}
		return nilai;
	}
	
}
