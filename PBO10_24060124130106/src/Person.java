// Nama : Shofwan Fikrul Huda
// NIM : 24060124130106
// Tanggal : 13 Mei 2026
// Deskripsi:
public class Person {
    // Atribut
    private String id;
    private String name;

    // Konstruktor
    public Person(String name) {
        this.name = name;
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Selektor
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    

}
