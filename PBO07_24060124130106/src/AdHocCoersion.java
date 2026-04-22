// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 22 April 2026
// Deskripsi : Program untuk menunjukkan polimorfisme ad-hoc coersion

public class AdHocCoersion {
    public static void main(String[] args) throws Exception {
        
        // a. Ilustrasi umum ad-hoc coersion
        System.out.println("Ilustrasi Ad-Hoc Coersion:");
        int nilaiInt = 65;
        double nilaiIntToDouble = (double) nilaiInt; // Coersion dari int ke double
        char nilaiIntToChar = (char) nilaiInt; // Coersion dari int ke char
        String nilaiIntToString = Integer.toString(nilaiInt); // Coersion dari int ke String
        Double nilaiStringToDouble = Double.parseDouble(nilaiIntToString); // Coersion dari String ke Double
        Integer nilaiStringToInteger = Integer.parseInt(nilaiIntToString); // Coersion dari String ke Integer

        // Menampilkan hasil coersion
        System.out.println("Nilai int               : " + nilaiInt);
        System.out.println("Nilai int ke double     : " + nilaiIntToDouble);
        System.out.println("Nilai int ke char       : " + nilaiIntToChar);
        System.out.println("Nilai int ke String     : " + nilaiIntToString);
        System.out.println("Nilai String ke double  : " + nilaiStringToDouble);
        System.out.println("Nilai String ke integer : " + nilaiStringToInteger + "\n");

        // b. Ilustrasi ad-hoc coersion nilai integer yang sudah diubah jadi double kembali ke integer
        System.out.println("Ilustrasi Ad-Hoc Coersion Nilai Integer ke Double dan Kembali ke Integer:");
        int nilaiDoubleToInt = (int) nilaiIntToDouble; // Coersion dari double ke int
        System.out.println("Nilai double ke int     : " + nilaiDoubleToInt + "\n");

        // c. Ilustrasi penjumlahan objek Integer dan konkatenasi dengan ad-hoc coersion
        System.out.println("Ilustrasi Penjumlahan dan Konkatenasi dengan Ad-Hoc Coersion:");
        String X = "1234";
        String Y = "5678";
        String S = X + Y; // Coersion dari String ke String (konkatenasi)
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y); // Coersion dari String ke Integer untuk penjumlahan
        System.out.println("Nilai String X          : " + X);
        System.out.println("Nilai String Y          : " + Y);
        System.out.println("Hasil konkatenasi String X dan Y : " + S);
        System.out.println("Hasil penjumlahan Integer X dan Y : " + Z + "\n");

        // d. Ilustrasi penjumlahan objek Double dan konkatenasi dengan ad-hoc coersion
        System.out.println("Ilustrasi Penjumlahan dan Konkatenasi dengan Ad-Hoc Coersion pada Double:");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q; // Coersion dari String ke String (konkatenasi)
        Double D = Double.parseDouble(P) + Double.parseDouble(Q); // Coersion
        System.out.println("Nilai String P          : " + P);
        System.out.println("Nilai String Q          : " + Q);
        System.out.println("Hasil konkatenasi String P dan Q : " + R);
        System.out.println("Hasil penjumlahan Double P dan Q : " + D + "\n");

        // e. Objek Integer A diisi dengan konversi S
        System.out.println("Ilustrasi Konversi String ke Integer:");
        Integer A = Integer.parseInt(S); // Coersion dari String ke Integer
        System.out.println("Nilai String S          : " + S);
        System.out.println("Nilai Integer A         : " + A);

        // f. Objek String T diisi dengan konversi A
        System.out.println("\nIlustrasi Konversi Integer ke String:");
        String T = Integer.toString(A); // Coersion dari Integer ke String
        System.out.println("Nilai Integer A         : " + A);
        System.out.println("Nilai String T          : " + T);
    }
}
