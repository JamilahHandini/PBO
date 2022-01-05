package genericInterface;

class MyClass<T extends Comparable<T>> implements MinMax<T> {	//generic class
	T[] vals;
	MyClass(T[] o) {	//constructor
		vals = o;
	}
	public T max() {	//untuk mencari nilai maksimum
		T v = vals[0];
		for (int i = 1; i < vals.length; i++) {
			if (vals[i].compareTo(v) > 0) {		//membandingkan nilai array indeks satu dengan lainnya
				v = vals[i];
			}
		}
		return v;		//mengembalikan nilai yang terbesar
	}
}
