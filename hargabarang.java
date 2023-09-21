import java.util.Scanner;

public class hargabarang {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("masukkan jumlah item yang dibeli :");
        int jumlahitem = input.nextInt();
        
        int i = 1;
        int harga = 0;
        int jumlahBarang = 0;
        int totalPembelian = 0;
        while (jumlahitem >= i) {
            
        System.out.println(i +"." + "Nama Barang :");
        String namaBarang = input.next();
        
        System.out.println(i + "." +"Harga : ");
        harga = input.nextInt();
        
        System.out.println(i +"." +"Jumlah : ");
        jumlahBarang = input.nextInt();
        System.out.println("=================");
        
        totalPembelian += harga* jumlahBarang;
        i++;
        }
        
        System.out.println("Jumlah Item yang Dibeli : " + jumlahitem);
        System.out.println("Total Pembelian : " + totalPembelian);
    }
}
