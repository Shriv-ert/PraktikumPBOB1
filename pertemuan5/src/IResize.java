/* Nama File   : IResize.java
 * Deskripsi   : berisi class IResize untuk interface resize
 * Pembuat     : Shofwan Fikrul Huda 24060124130106
 * Tanggal     : 18 Maret 2026
 */
public interface IResize {

    //METHOD
    // menambah ukuran 10% dari ukuran semula
    public void zoomIn();

    // mengurangi ukuran 10% dari ukuran semula
    public void zoomOut();

    // merubah ukuran sesuai input persentase
    public void zoom(int percent);
    
}
