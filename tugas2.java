package SDA.Linkylist;

import java.util.LinkedList;

public class tugas2 {
    public static void main(String[] args) {
        LinkedList<String> saya = new LinkedList<>();
        saya.add("C");
        saya.add("I");
        saya.add("T");
        saya.add("R");
        saya.add("A");
        saya.add(" ");
        saya.add("A");
        saya.add("U");
        saya.add("L");
        saya.add("I");
        saya.add("A");

        System.err.println("Diketahui nama lengkap :");
        System.out.println(saya);

        //1. add karakter lain yang anda inginkan

        saya.addFirst(" ");
        saya.addFirst("M");
        saya.addFirst("I");
        saya.addLast(" ");
        saya.addLast("H");
        saya.addLast("I");

        System.err.println("Penambahan elemen :");
        System.out.println(saya);

        //2. sisipkan karakter lain yang anda inginkan

        saya.set(10, "N");
        saya.set(11, "D");
        saya.set(12, " ");
        saya.set(13, "U");
        saya.set(14, " ");
        saya.set(15, "R");
        saya.set(16, "?");

        System.err.println("Penyisipan elemen :");
        System.out.println(saya);

        //3. hapus beberapa karaker yang ingin anda hapus

        saya.remove(0);
        saya.remove(1);
        saya.remove(1);
        saya.remove(2);
        saya.remove(2);
        saya.remove(2);
        saya.remove(2);
        saya.remove(2);
        saya.remove(4);
        saya.remove(4);
        saya.remove(4);
        saya.remove(4);
        saya.remove(4);
      
        System.err.println("Penghapusan elemen :");
        System.out.println(saya);

        //4. buat fungsi POP dan PUSH pada project anda

        saya.pop();
        System.out.println("Fungsi POP :");
        System.out.println(saya);
        System.out.println("");

        saya.push("K");
        System.out.println("Fungsi PUSH :");
        System.out.println(saya);
        System.out.println("");
        


    }
    
}
