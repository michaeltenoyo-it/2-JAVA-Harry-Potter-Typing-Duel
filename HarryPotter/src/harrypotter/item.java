/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harrypotter;

/**
 *
 * @author KELVIN
 */
public class item {
    public String nama;
}

class wand extends item{
    public int idWand;
    wand(int id){
        if(id == -1){
            idWand = -1;
            nama = "original";
        }else if(id == 0){
            idWand = 0;
            nama = "cedric";
        }else if(id == 1){
            idWand = 1;
            nama = "draco";
        }else if(id == 2){
            idWand = 2;
            nama = "longbottom";
        }else if(id == 3){
            idWand = id;
            nama = "ron";
        }else if(id == 4){
            idWand = id;
            nama = "remus";
        }else if(id == 5){
            idWand = id;
            nama = "hagrid";
        }else if(id == 6){
            idWand = id;
            nama = "ginny";
        }else if(id == 7){
            idWand = id;
            nama = "slughorn";
        }else if(id == 8){
            idWand = id;
            nama = "dolores";
        }else if(id == 9){
            idWand = id;
            nama = "hermione";
        }else if(id == 10){
            idWand = id;
            nama = "lucius";
        }else if(id == 11){
            idWand = id;
            nama = "minerva";
        }else if(id == 12){
            idWand = id;
            nama = "krum";
        }else if(id == 13){
            idWand = id;
            nama = "bellatrix";
        }
    }
}

class usable extends item{
    public int idEffect;
    usable(int id){
        this.idEffect = id;
        if(id == -1){
            this.nama = "no item";
        }else if(id == 0){
            this.nama = "ash wood";
        }else if(id == 1){
            this.nama = "hawthorn wood";
        }else if(id == 2){
            this.nama = "cypress wood";
        }else if(id == 3){
            this.nama = "birch wood";
        }else if(id == 4){
            this.nama = "elm wood";
        }else if(id == 5){
            this.nama = "hornbean wood";
        }else if(id == 6){
            this.nama = "galleon";
        }else if(id == 7){
            this.nama = "marvolo gaunt's ring";
        }else if(id == 8){
            this.nama = "gillyweed";
        }else if(id == 9){
            this.nama = "nimbus";
        }
    }
    
}
