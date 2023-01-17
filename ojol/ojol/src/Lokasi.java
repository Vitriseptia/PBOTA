public class Lokasi {
    private String lok_awal;
    private String tujuan;
    private int jarak;

    public void getLok_awal(String lok_awal) {
        this.lok_awal = lok_awal;
    }

    public void getTujuan(String tujuan){
        this.tujuan = tujuan;
    }

    public void getJarak(int jarak){
        this.jarak  = jarak;
    }

    public void lok(){
        System.out.println("Lokasi awal : " + this.lok_awal);
        System.out.println("Tujuan      : " + this.tujuan);
        System.out.println("Jarak (KM)  : " + this.jarak);
    }
}
