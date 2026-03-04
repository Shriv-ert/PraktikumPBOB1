public class MTitik {
    public static void main(String[] args) {

        Titik T1 = new Titik(); // membuat objek titik T1 (0,0)

        T1.setAbsis(3);   // mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); // mengubah ordinat T1 dengan nilai 4

        T1.printTitik();  // mencetak koordinat T1 ke layar

        T1.geser(3, 4);   // menggeser T1 sejauh (3,4)

        T1.printTitik();  // menampilkan koordinat T1 setelah digeser

        System.out.println("Kuadran dari T1: "+T1.getKuadran());

        System.out.println("Jarak T1 ke pusat: "+T1.getJarakPusat());

        Titik T2 = new Titik();
        T2.setAbsis(6);
        T2.setOrdinat(8);
        System.out.println("Jarak T1 ke T2: "+T1.getJarak(T2));

        Titik T3 = T1.getRefleksiX();
        System.out.print("Refleksi X dari T1: ");
        T3.printTitik();

        Titik T4 = T1.getRefleksiY();
        System.out.print("Refleksi Y dari T1: ");
        T4.printTitik();

    }
}
