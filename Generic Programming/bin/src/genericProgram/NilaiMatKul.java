package genericProgram;

public class NilaiMatKul <T extends Praktek>{
	private T nilai;
	public NilaiMatKul(T n){
		this.nilai = n;
	}
	public void RunNilai(){
		this.nilai.display();
	}
	
	public static <T> boolean isEmpty (Universitas[] mhs){ //generic method
		return (mhs.length == 0);
	}
}
