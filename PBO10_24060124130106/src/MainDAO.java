// Nama : Shofwan Fikrul Huda
// NIM : 24060124130106
// Tanggal : 13 Mei 2026
// Deskripsi:
public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Nasuki");
        DAOManager daoManager = new DAOManager();
        daoManager.setPersonDao(new MySQLPersonDAO());
        try {
            daoManager.getPersonDao().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
