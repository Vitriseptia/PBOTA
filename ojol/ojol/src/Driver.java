public class Driver extends Orang {

    private String nama_Driver;
    private int no_hp;

    private int pilihan;

    public void setPilihan(int pilihan){
        this.pilihan = pilihan;

    }

    @Override
    public void setNama() {
        if (this.pilihan == 1) {
            this.nama_Driver = "Ujang";
        } else if (this.pilihan == 2) {
            this.nama_Driver = "Slamet";
        } else if (this.pilihan == 3) {
            this.nama_Driver = "Rani";
        } else {
            throw new ArithmeticException("Pilihan hanya 1 - 3 saja !!!");
        }
    }

    @Override
    public void setNoHp() {
        if (this.pilihan == 1) {
            this.no_hp = 831234325;
        } else if (this.pilihan == 2) {
            this.no_hp = 823214544;
        } else if (this.pilihan == 3) {
            this.no_hp = 812321232;
        } else {
            throw new ArithmeticException("Pilihan hanya 1 - 3 saja !!!");
        }
    }


        public void driverr(){
            if (this.pilihan == 1) {
                System.out.println("Driver anda  : " + this.nama_Driver);
                System.out.println("No Hp Driver : " + this.no_hp);
            } else if (this.pilihan == 2) {
                System.out.println("Driver anda  : " + this.nama_Driver);
                System.out.println("No Hp Driver : " + this.no_hp);
            } else if (this.pilihan == 3) {
                System.out.println("Driver anda  : " + this.nama_Driver);
                System.out.println("No Hp Driver : " + this.no_hp);
            } else {
                throw new ArithmeticException("Pilihan hanya 1 - 3 saja !!!");
            }
        }


    }

