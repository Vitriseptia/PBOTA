class Pembayaran implements Proses{
    public int harga;
    private int tot_awal;
    public int jarak;
    public int uang_bayar;
    public int total;
    public int diskon;

    public void setHarga(){
        this.harga = 10000;
    }

    public void setJarak(int jarak){
        this.jarak = jarak;
    }

    public void setUang_bayar(int uang_bayar){
        this.uang_bayar = uang_bayar;
    }

    public void setTot_awal(){
        this.tot_awal = this.harga * this.jarak;
    }


    public void total(int pilihan){
        if (pilihan == 1) {
            this.total = this.tot_awal;
        } else if (pilihan == 2) {
            this.total = this.tot_awal - (this.tot_awal*15/100);
        } else if (pilihan == 3) {
            this.total = this.tot_awal - (this.tot_awal*10/100);
        } else {
            throw new ArithmeticException("Pilihan hanya 1 - 3 saja !!!");
        }
    }


    @Override
    public void totAwal() {
        System.out.println("Total awal : " + this.tot_awal);
    }

    @Override
    public void totall(){
        System.out.println("TOTAL AKHIR : " + this.total);
    }

    public void kembailan(){
        System.out.println("Kembalian : " + (this.uang_bayar - this.total));
    }




}
