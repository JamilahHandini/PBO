

package PBO;

/**
 *
 * @author ASUS PRO
 */
public class Restaurant {
		private String[] nama_makanan;
		private double[] harga_makanan;
		private int[] stok;
		Restaurant() {
			this.nama_makanan = new String[10];
			this.harga_makanan = new double[10];
			this.stok = new int[10];
		}
		public void setNama_makanan(String nama, byte ID) {
			this.nama_makanan[ID] = nama;
		}
		public String getNama_makanan(byte ID) {
			return nama_makanan[ID];
		}
		public void setHarga_makanan(double harga, byte ID) {
			this.harga_makanan[ID] = harga;
		}
		public double getHarga_makanan(byte ID) {
			return harga_makanan[ID];
		}
		public void setStok(int stok, byte ID) {
			this.stok[ID] = stok;
		}
		public int getStok(byte id) {
			return stok[id];
		}
		public void penguranganStok(byte ID, int sold) {
			this.stok[ID] -= sold;
		}

} 
    
    

