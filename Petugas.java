
import java.util.*;

public class Petugas {  
    public static void Karyawan() {
        
        //ArrayList nama petugas
        ArrayList<String>namaPetugas = new ArrayList<String>();
        namaPetugas.add("Hudan");
        namaPetugas.add("Faril");
        namaPetugas.add("Daffa");
        namaPetugas.add("Isam");

        //Arraylist alamat karyawan
        ArrayList<String>alamatPetugas = new ArrayList<String>();
        alamatPetugas.add("Jalan Jalan");
        alamatPetugas.add("Jalanin Aja");
        alamatPetugas.add("Jalan?");
        alamatPetugas.add("Jalanin");

        //Arraylist telefon karyawan
        ArrayList<String>telefonPetugas = new ArrayList<String>();
        telefonPetugas.add("0817353829938");
        telefonPetugas.add("0812325259935");
        telefonPetugas.add("0819899897236");
        telefonPetugas.add("081235252525");
        
        //Menampilkan data karayawan
        System.out.println("Nama Petugas: "+namaPetugas.get(0));
        System.out.println("Alamat: "+alamatPetugas.get(0));
        System.out.println("Telefon: "+telefonPetugas.get(0));
    }
}