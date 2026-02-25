/* Nama File   : Titik.java
 * Deskripsi   : berisi atribut dan method dalam class Titik
 * Pembuat     : Shofwan Fikrul Huda 24060124130106
 * Tanggal     : 19 Februari 2026
 */


public class Titik {

    /****************ATRIBUT******************/
    double absis;
    double ordinat;

    /****************METHOD******************/
    // konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    // mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + x;
    }

    // menentukan kuadran dari titik
    int getKuadran() {
        if(absis > 0 && ordinat > 0){
            return 1;
        }else if(absis < 0 && ordinat > 0){
            return 2;
        }else if(absis < 0 && ordinat < 0){
            return 3;
        }else if(absis > 0 && ordinat < 0){
            return 4;
        }
        return 0;
    }

    // menghitung jarak titik ke pusat koordinat (0,0)
    double getJarakPusat() {
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    // menghitung jarak titik ke titik t
    double getJarak(Titik t) {
        return Math.sqrt((absis - t.absis)*(absis - t.absis) + (ordinat - t.ordinat)*(ordinat - t.ordinat));
    }

    // mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // merefleksi titik terhadap sumbu x
    void refleksiX(){
        ordinat *= -1;
    }

    // merefleksi titik terhadap sumbu y
    void refleksiY(){
        absis *= -1;
    }

    // kembalikan titik refleksi terhadap sumbu x
    public Titik getRefleksiX(){
        Titik t = new Titik();
        t.setAbsis(absis);
        t.setOrdinat(-ordinat);
        return t;
    }

    // kembalikan titik refleksi terhadap sumbu y
    public Titik getRefleksiY(){
        Titik t = new Titik();
        t.setAbsis(-absis);
        t.setOrdinat(ordinat);
        return t;
    }
}

// end class Titik