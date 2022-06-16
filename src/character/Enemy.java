package character;

import util.Poin;

public class Enemy {
    //hp, agi, stamina, attk, tinggi
    private int hp, agi, def, stamina, attk, tinggi;

    //posisi
    private Poin posisi;
    private String nama;


    public Enemy(int hp, int agi, int def, int stamina, int attk, int tinggi, Poin posisi, String nama) {
        this.hp = hp;
        this.agi = agi;
        this.def = def;
        this.stamina = stamina;
        this.attk = attk;
        this.tinggi = tinggi;
        this.posisi = posisi;
        this.nama = nama;
    }


    public Enemy() {

    }
    public void serang(Player player){
        if (player.getPosisi().getX() == posisi.getX() && player.getPosisi().getY() == posisi.getY() ) {
            player.setHp(player.getHp() - attk);
            System.out.println("Serangan " + getNama() + " Kena");
        }
        else {
            System.out.println("Serangan " + getNama() + " Meleset");
        }
    }
    public void jalan(){
        tinggi = 10;
        stamina += (stamina>=100? 0:3);
        posisi.setX(posisi.getX()-5);
        System.out.println(getNama() + " sedang berjalan");
    }
    public void lari(){
        tinggi = 10;
        if (stamina-5>0){
            this.stamina-=5;
            posisi.setX(posisi.getX() - 10);
            System.out.println(getNama() + " sedang berlari");
        }else{
            System.out.println("Stamina habis, " + getNama() + " tidak bisa berlari");
        }
    }
    public boolean mati(){
        if (hp <= 0) {
            System.out.println(getNama() + " Mati");
            Player.uang+=5000;
            return true;
        } 
        else{
            System.out.println(getNama() + " belum mati");
        }
        return false;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAgi() {
        return this.agi;
    }

    public void setAgi(int agi) {
        this.agi = agi;
    }

    public int getDef() {
        return this.def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getStamina() {
        return this.stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getAttk() {
        return this.attk;
    }

    public void setAttk(int attk) {
        this.attk = attk;
    }

    public int getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public Poin getPosisi() {
        return this.posisi;
    }

    public void setPosisi(Poin posisi) {
        this.posisi = posisi;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}
