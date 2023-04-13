// buatlah program menghitung stok barang di toko Elektronik
import javax.swing.JOptionPane;
public class tugaspertanyaan {
    public static void main(String[] args) {
    int mesin_cuci = 10;
    int AC = 6;
    int Kulkas = 10;
    int speaker = 15;
    int televisi = 7;

    mesin_cuci += Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah mesin cuci yang datang?"));
    AC += Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah AC yg datang?"));
    Kulkas += Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah Kulkas yg datang?"));
    speaker += Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah speaker yg datang?"));
    televisi += Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah laptop yg datang?"));

    System.out.println("Berikut ini daftar stock barang elektronik yang ready di toko");
    System.out.println("Mesin cuci :" + mesin_cuci );
    System.out.println(" AC :" + AC );
    System.out.println("Kulkas :" + Kulkas );
    System.out.println("speaker :" + speaker );
    System.out.println("televisi :" + televisi );
    }
}
