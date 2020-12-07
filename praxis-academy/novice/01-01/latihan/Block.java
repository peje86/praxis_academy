public class Block {
    public static void main(String[] args) {

        int nilai = 10;

        {				// Blok awal
            int x = 5;
            nilai + = x;
        }				// akhir blok

        System.out.println("Nilai = " + nilai);
		System.out.println("X = " + x);		// Error
        
    }
}