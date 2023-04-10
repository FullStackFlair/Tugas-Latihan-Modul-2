package TugasLatihan2;

import java.util.ArrayList;

public class DaftarHewan {
    public static void main(String[] args) {
        ArrayList<String> ObjekHewan = new ArrayList<>();


        ObjekHewan.add("Sapi");
        ObjekHewan.add("Kelinci");
        ObjekHewan.add("Kambing");
        ObjekHewan.add("Unta");
        ObjekHewan.add("Domba");

        System.out.println("Hewan : " + ObjekHewan);

        ArrayList<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        System.out.println("Hewan yang Di Hapus : " + DeleteHewan);
        ObjekHewan.removeAll(DeleteHewan);
        System.out.println("Hewan Setelah Perubahan : " + ObjekHewan);

    }
}
