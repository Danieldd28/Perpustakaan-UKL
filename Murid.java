import java.util.*;

public class Murid {
    static Scanner input = new Scanner(System.in);

    //ArrayList declare
    ArrayList<String>namaSiswa = new ArrayList<String>();
    ArrayList<String>alamatSiswa = new ArrayList<String>();
    ArrayList<String>telefonSiswa = new ArrayList<String>();
    ArrayList<Boolean>statusSiswa = new ArrayList<Boolean>();
    ArrayList<Integer>idSiswa = new ArrayList<Integer>();

    public Murid(){

        //Siswa 1
        this.namaSiswa.add("Daniel");
        this.alamatSiswa.add("Surabaya");
        this.telefonSiswa.add("08321556586");
        this.idSiswa.add(1);
        this.statusSiswa.add(true);

        //Siswa 2
        this.namaSiswa.add("Ale");
        this.alamatSiswa.add("Malang");
        this.telefonSiswa.add("08321593638");
        this.idSiswa.add(2);
        this.statusSiswa.add(false);

        //Siswa 3
        this.namaSiswa.add("Hadyan");
        this.alamatSiswa.add("Nganjuk");
        this.telefonSiswa.add("0832150283");
        this.idSiswa.add(3);
        this.statusSiswa.add(true);

        //Siswa 4
        this.namaSiswa.add("Isam");
        this.alamatSiswa.add("Malang");
        this.telefonSiswa.add("08329373920");
        this.idSiswa.add(4);
        this.statusSiswa.add(false);       
    }

    public void getSiswa() {
        System.out.print("Masukkan ID anda: ");
        int id = input.nextInt();
    
        // Flag untuk melacak apakah ID ditemukan atau tidak
        boolean idDitemukan = false;
    
        // Pencarian ID
        for (int i = 0; i < idSiswa.size(); i++) {
            if (id == idSiswa.get(i)) {
                System.out.println("Nama: " + namaSiswa.get(i));
                System.out.println("Alamat: " + alamatSiswa.get(i));
                System.out.println("Telepon: " + telefonSiswa.get(i));
    
                // Setel flag ID ditemukan menjadi true
                idDitemukan = true;
                break;
            }
        }
    
        // Cetak pesan jika ID tidak ditemukan
        if (!idDitemukan) {
            System.out.println("ID tidak ditemukan");
        }
    }    
}