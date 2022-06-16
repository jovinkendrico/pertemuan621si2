package character;

import util.Poin;

public class Player {
    //hp, agi, stamina, attk, tinggi
    private int agi, stamina, attk, tinggi;
    public static int hp;

    //posisi
    private Poin posisi;

    //uang
    public static int uang = 0;


    public Player(int hp, int agi, int stamina, int attk, int tinggi, Poin posisi, int uang) {
        Player.hp = hp;
        this.agi = agi;
        this.stamina = stamina;
        this.attk = attk;
        this.tinggi = tinggi;
        this.posisi = posisi;
        Player.uang = uang;
    }

    //ulti, jalan, lari, lompat, jongkok, serang
    public void jalan(){
        tinggi = 10;
        stamina += (stamina>=100? 0:3);
        posisi.setX(posisi.getX()+5);
        System.out.println("Player sedang berjalan");
    }

    public void lari(){
        tinggi = 10;
        if (stamina-5>0) {
            this.stamina -= 5;
            posisi.setX(posisi.getX()+10);
            System.out.println("Player sedang berlari");
        }

        else {
            System.out.println("Stamina habis, player tidak bisa berlari");
        }
    }

    public void lompat(){
        posisi.setY(posisi.getY()+10);
        System.out.println("Player sedang melompat");
        posisi.setY(posisi.getY()-10);
    }

    public void jongkok(){
        tinggi = 5;
        System.out.println("Player sedang jongkok");
    }

    public void serang(Enemy enemy){
        //player - enemy berada di lokasi yg sama
        if (enemy.getPosisi().getX() == posisi.getX() && enemy.getPosisi().getY() == posisi.getY() ) {
            enemy.setHp(enemy.getHp() - attk);
            System.out.println("Serangan Kena");
        }
        else {
            System.out.println("Serangan Meleset");
        }

    }

    public void ulti(Enemy enemy){
        //player - enemy berada di lokasi yg sama
        if (enemy.getPosisi().getX() == posisi.getX() && enemy.getPosisi().getY() == posisi.getY() ) {
            enemy.setHp(enemy.getHp() - (attk*2));
            System.out.println("Serangan ulti Kena");
        }
        else {
            System.out.println("Serangan ulti Meleset");
        }
    }
    public boolean mati(){
        if (hp <= 0) {
            System.out.println("Anda kalah");
            return true;
        } 
        return false;
    }

    public int getHp() {
        return Player.hp;
    }

    public void setHp(int hp) {
        Player.hp = hp;
    }

    public int getAgi() {
        return this.agi;
    }

    public void setAgi(int agi) {
        this.agi = agi;
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

    public int getUang() {
        return Player.uang;
    }

    public void setUang(int uang) {
        Player.uang = uang;
    }
    

}
