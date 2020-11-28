/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harrypotter;

import java.util.*;

/**
 *
 * @author KELVIN
 */
public class unit {
    public int str, intel, instantKill, agi, basicAtk, hp, mana, magicDmg,dmg;
    public String nama;
    public double stunt,dmgBlock;
    public ArrayList<String>spell = new ArrayList<>();
    
    
}

class player extends unit implements Cloneable{
    public int stop = 0;
    public int busy = 0;
    public patronus Patronus;
    public String dorm = "";
    public String patronusName = "NO PATRONUS";
    public int strGrowth, intGrowth, agiGrowth;
    public ArrayList<Integer> idSpell = new ArrayList<>();
    public ArrayList<usable> listItem = new ArrayList<>();
    public wand usedWand;
    public int gold = 2000;
    public usable[] usedItem = new usable[3];
    public int a = 0,b = 0,c = 0,d = 0;
    public int level = 1, xp = 0;
    public int story = 1;
    public int hh = 0,mm = 0,ss = 0;
    player(){
        for (int i = 0; i < 3; i++) {
            usedItem[i] = new usable(-1);
        }
        
        
    }
    @Override
    public Object clone(){
        try{
            super.clone();
        }catch(CloneNotSupportedException e){
            System.out.println("Cloning not allowed.");
            return this;
        }
        return this;
    }
}

class bot extends unit{
    public int spd, xpDrop, level, goldDrop;
    
    bot(int id){
        if(id == 0){
            this.level = 0;
            this.nama = "dummy";
            this.str = 1;
            this.intel = 1;
            this.agi = 1;
            this.hp = str * 30;
            this.mana = intel * 20;
            this.basicAtk = agi * 2;
            this.magicDmg = intel * 3;
            this.spd = 0;
            this.xpDrop = 0;
        }else if (id == 1){
            this.level = 1;
            this.nama = "giant";
            this.str = 36;
            this.intel = 14;
            this.agi = 25;
            this.hp = str * 30;
            this.mana = intel * 20;
            this.basicAtk = agi * 2;
            this.magicDmg = intel * 3;
            this.spd = 1600;
            this.xpDrop = 400;
            this.goldDrop = 250;
            this.spell.add("incendio");
            this.spell.add("attack");
        }else if (id==2){
            this.level=3;
            this.nama="Quirinus";
            this.str=63;
            this.intel=48;
            this.agi=48;
            this.hp=str*30;
            this.mana=intel*20;
            this.basicAtk=agi*2;
            this.magicDmg=intel*3;
            this.spd=1500;
            this.xpDrop=900;
            this.goldDrop = 500;
            this.spell.add("incendio");
            this.spell.add("petrificus totalus");
            this.spell.add("attack");
        }else if (id==3){
            this.level=6;
            this.nama="Tom";
            this.str=91;
            this.intel=72;
            this.agi=49;
            this.hp=str*30;
            this.mana=intel*20;
            this.basicAtk=agi*2;
            this.magicDmg=intel*3;
            this.spd=1450;
            this.xpDrop=1800;
            this.goldDrop = 980;
            this.spell.add("incendio");
            this.spell.add("petrificus totalus");
            this.spell.add("lumos");
            this.spell.add("attack");
        }else if (id==4){
            this.level=9;
            this.nama="Basilisk";
            this.str=118;
            this.intel=96;
            this.agi=72;
            this.hp=str*30;
            this.mana=intel*20;
            this.basicAtk=agi*2;
            this.magicDmg=intel*3;
            this.spd=1500;
            this.xpDrop=2700;
            this.goldDrop = 1350;
            this.spell.add("incendio");
            this.spell.add("petrificus totalus");
            this.spell.add("diffindo");
            this.spell.add("attack");
        }else if (id==5){
            this.level=12;
            this.nama="Pixie";
            this.str=143;
            this.intel=120;
            this.agi=96;
            this.hp=str*30;
            this.mana=intel*20;
            this.basicAtk=agi*2;
            this.magicDmg=intel*3;
            this.spd=1300;
            this.xpDrop=3600;
            this.goldDrop = 1800;
            this.spell.add("petrificus totalus");
            this.spell.add("diffindo");
            this.spell.add("attack");
        }else if (id==6){
            this.level=21;
            this.nama="Dementor";
            this.str=215;
            this.intel=183;
            this.agi=180;
            this.hp=str*30;
            this.mana=intel*20;
            this.basicAtk=agi*2;
            this.magicDmg=intel*3;
            this.spd=1200;
            this.xpDrop=6900;
            this.goldDrop = 3400;
            this.spell.add("stupify");
            this.spell.add("protego");
            this.spell.add("attack");
        }else if (id==7){
            this.level=23;
            this.nama="Warewolf";
            this.str=235;
            this.intel=188;
            this.agi=227;
            this.hp=str*30;
            this.mana=intel*20;
            this.basicAtk=agi*2;
            this.magicDmg=intel*3;
            this.spd=1180;
            this.xpDrop=7200;
            this.goldDrop = 3600;
            this.spell.add("attack");
        }else if (id==8){
            this.level=28;
            this.nama="Dolores";
            this.str=276;
            this.intel=224;
            this.agi=220;
            this.hp=str*30;
            this.mana=intel*20;
            this.basicAtk=agi*2;
            this.magicDmg=intel*3;
            this.spd=1130;
            this.xpDrop=9000;
            this.goldDrop = 4500;
            this.spell.add("stupify");
            this.spell.add("bombarda");
            this.spell.add("attack");
            this.spell.add("bombarda maxima");
        }else if (id==9){
            this.level=33;
            this.nama="Draco";
            this.str=316;
            this.intel=264;
            this.agi=260;
            this.hp=str*30;
            this.mana=intel*20;
            this.basicAtk=agi*2;
            this.magicDmg=intel*3;
            this.spd=1020;
            this.xpDrop=10900;
            this.goldDrop = 5200;
            this.spell.add("stupify");
            this.spell.add("bombarda");
            this.spell.add("attack");
            this.spell.add("sectumsepmra");
        }else if (id==10){
            this.level=35;
            this.nama="Inferi";
            this.str=334;
            this.intel=230;
            this.agi=324;
            this.hp=str*30;
            this.mana=intel*20;
            this.basicAtk=agi*2;
            this.magicDmg=intel*3;
            this.spd=980;
            this.xpDrop=11800;
            this.goldDrop = 6000;
            this.spell.add("attack");
        }else if (id==11){
            this.level=36;
            this.nama="Scabior";
            this.str=340;
            this.intel=240;
            this.agi=330;
            this.hp=str*30;
            this.mana=intel*20;
            this.basicAtk=agi*2;
            this.magicDmg=intel*3;
            this.spd=830;
            this.xpDrop=12000;
            this.goldDrop = 6300;
            this.spell.add("attack");
            this.spell.add("confringo");
        }else if (id==12){
            this.level=40;
            this.nama="Belatrix";
            this.str=374;
            this.intel=320;
            this.agi=320;
            this.hp=str*30;
            this.mana=intel*20;
            this.basicAtk=agi*2;
            this.magicDmg=intel*3;
            this.spd=700;
            this.xpDrop=13400;
            this.goldDrop = 6700;
            this.spell.add("stupify");
            this.spell.add("confringo");
            this.spell.add("attack");
            this.spell.add("sectumsepmra");
            this.spell.add("confringo");
        }else if (id==13){
            this.level=43;
            this.nama="Snape";
            this.str=396;
            this.intel=388;
            this.agi=393;
            this.hp=str*30;
            this.mana=intel*20;
            this.basicAtk=agi*2;
            this.magicDmg=intel*3;
            this.spd=630;
            this.xpDrop=14200;
            this.goldDrop = 7100;
            this.spell.add("incendio");
            this.spell.add("confringo");
            this.spell.add("attack");
            this.spell.add("sectumsepmra");
            this.spell.add("confringo");
            this.spell.add("expelliarmus");
        }else if (id==14){
            this.level=46;
            this.nama="Nagini";
            this.str=430;
            this.intel=100;
            this.agi=450;
            this.hp=str*30;
            this.mana=intel*20;
            this.basicAtk=agi*2;
            this.magicDmg=intel*3;
            this.spd=800;
            this.xpDrop=15700;
            this.goldDrop = 7800;
            this.spell.add("attack");
        }else if (id==15){
            this.level=50;
            this.nama="voldemort";
            this.str=480;
            this.intel=450;
            this.agi=490;
            this.hp=str*30;
            this.mana=intel*20;
            this.basicAtk=agi*2;
            this.magicDmg=intel*3;
            this.spd=500;
            this.xpDrop=17000;
            this.goldDrop = 8600;
            this.spell.add("avada kedavra");
            this.spell.add("crucio");
            this.spell.add("attack");
        }
    }
}