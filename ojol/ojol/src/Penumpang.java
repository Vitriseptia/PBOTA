public class Penumpang extends Orang{

    private String nama_penumpang;
    private int no_hp;

    public void getNama(String nama_penumpang){
        this.nama_penumpang = nama_penumpang;
    }

    public void getNoHp(int no_hp){
        this.no_hp = no_hp;
    }

    @Override
    public void setNama() {
        System.out.println("Nama Penumpang  : " + this.nama_penumpang);
    }

    @Override
    public void setNoHp() {
        System.out.println("Nomor Hp Penumpang : " + this.no_hp);
    }
}
