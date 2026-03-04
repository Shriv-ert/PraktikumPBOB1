public class Garis {
    
    /****************ATRIBUT******************/
    Titik Tawal;
    Titik Takhir;
    static int jumlahGaris = 0;
    /****************METHOD******************/
    // konstruktor untuk membuat garis dengan titik awal (0,0) dan titik akhir (0,0)
    Garis() {
        Tawal = new Titik(0, 0);
        Takhir = new Titik(1, 1);
        jumlahGaris++;
    }
    // konstruktor untuk membuat garis dengan titik awal (x1,y1) dan titik akhir (x2,y2)
    Garis(double x1, double y1, double x2, double y2) {
        Tawal = new Titik(x1, y1);
        Takhir = new Titik(x2, y2);
        jumlahGaris++;
    }

    // mengembalikan titik awal garis
    public Titik getTitikAwal() {
        return Tawal;
    }
    // mengembalikan titik akhir garis
    public Titik getTitikAkhir() {
        return Takhir;
    }
    // mengeset titik awal garis dengan nilai baru (x,y)
    void setTitikAwal(double x, double y) {
        Tawal.setAbsis(x);
        Tawal.setOrdinat(y);
    }
    // mengeset titik akhir garis dengan nilai baru (x,y)
    void setTitikAkhir(double x, double y) {
        Takhir.setAbsis(x);
        Takhir.setOrdinat(y);
    }
    // menghitung panjang garis menggunakan rumus jarak antara dua titik
    int getPanjangGaris() {
        double dx = Takhir.getAbsis() - Tawal.getAbsis();
        double dy = Takhir.getOrdinat() - Tawal.getOrdinat();
        return (int) Math.sqrt(dx * dx + dy * dy);
    }
    // menghitung gradien garis menggunakan rumus (y2 - y1) / (x2 - x1)
    double getGradien() {
        double dx = Takhir.getAbsis() - Tawal.getAbsis();
        double dy = Takhir.getOrdinat() - Tawal.getOrdinat();
        if (dx == 0) {
            return Integer.MAX_VALUE; // gradien tak terhingga untuk garis vertikal
        }
        return (dy / dx);
    }
    // menghitung titik tengah garis menggunakan rumus ((x1 + x2) / 2, (y1 + y2) / 2)
    public Titik getTitikTengah() {
        double x = (Tawal.getAbsis() + Takhir.getAbsis()) / 2;
        double y = (Tawal.getOrdinat() + Takhir.getOrdinat()) / 2;
        return new Titik(x, y);
    }
    // menentukan apakah garis ini sejajar dengan garis g dengan membandingkan gradien kedua garis
    boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }
    // menentukan apakah garis ini tegak lurus dengan garis g dengan memeriksa apakah hasil perkalian gradien kedua garis adalah -1
    boolean isTegakLurus(Garis g) {
        double gradien1 = this.getGradien();
        double gradien2 = g.getGradien();
        if (gradien1 == 0 && gradien2 == Integer.MAX_VALUE) {
            return true; // garis horizontal dan vertikal saling tegak lurus
        }
        if (gradien1 == Integer.MAX_VALUE && gradien2 == 0) {
            return true; // garis vertikal dan horizontal saling tegak lurus
        }
        return gradien1 * gradien2 == -1; // gradien saling negatif invers
    }
    // mencetak koordinat titik awal dan titik akhir garis ke layar
    void printGaris() {
        System.out.println("Titik Awal: (" + Tawal.getAbsis() + ", " + Tawal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + Takhir.getAbsis() + ", " + Takhir.getOrdinat() + ")");
    }

    void printPersamaanGaris() {
        double a = Takhir.getOrdinat() - Tawal.getOrdinat();
        double b = Tawal.getAbsis() - Takhir.getAbsis();
        double c = a * Tawal.getAbsis() + b * Tawal.getOrdinat();
        System.out.println("Persamaan Garis: " + a + "x + " + b + "y = " + c);
    }
}
