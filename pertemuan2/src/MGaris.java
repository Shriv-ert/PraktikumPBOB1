public class MGaris {
    public static void main(String[] args) {
        // membuat objek garis dengan titik awal (0,0) dan titik akhir (1,1)
        Garis g1 = new Garis();
        // membuat objek garis dengan titik awal (2,3) dan titik akhir (4,5)
        Garis g2 = new Garis(2.0, 3.0, 4.0, 5.0);
        
        // menampilkan informasi tentang garis g1
        System.out.println("Garis g1:");
        g1.printGaris();
        System.out.println("Panjang: " + g1.getPanjangGaris());
        System.out.println("Gradien: " + g1.getGradien());
        System.out.println("Titik Tengah: (" + g1.getTitikTengah().getAbsis() + ", " + g1.getTitikTengah().getOrdinat() + ")");
        g1.printPersamaanGaris();

        
        // menampilkan informasi tentang garis g2
        System.out.println("\nGaris g2:");
        g2.printGaris();
        System.out.println("Panjang: " + g2.getPanjangGaris());
        System.out.println("Gradien: " + g2.getGradien());
        System.out.println("Titik Tengah: (" + g2.getTitikTengah().getAbsis() + ", " + g2.getTitikTengah().getOrdinat() + ")");
        g2.printPersamaanGaris();

        // memeriksa apakah g1 sejajar dengan g2
        if (g1.getGradien() == g2.getGradien()) {
            System.out.println("\nGaris g1 sejajar dengan garis g2");
        } else {
            System.out.println("\nGaris g1 tidak sejajar dengan garis g2");
        }


    }
}
