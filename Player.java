import java.util.Random;
/**
* Cette classe est 
*
* @author DJOCO
*/
public class Player {
    private String name;
    private int maxPv;
    private int pv;
    private int maxMana;
    private int mana;
    private String cultivation;
    private int nivCult;
    private float talent;

    public Player(String name){
        Random r = new Random();
        this.name=name;
        int mp = (int)(Math.random() *4)+100;
        this.maxPv=mp;
        this.pv=this.maxPv;
        this.maxMana=;
        this.mana=;
        int c=
        this.cultivation=;
        int nc = (int)(Math.random() *(5-1))+1;
        this.nivCult=nc;
        float random = (r.nextFloat() * (5f-1))+1;
        this.talent=random;
    }
    
    public String getLabel(){
        return this.name;
    }

    public int getMaxPv(){
        return this.maxPv;
    }
    public int getPv(){
        return this.pv;
    }

    public int getMaxMana(){
        return this.maxMana;
    }
    public int getMana(){
        return this.mana;
    }

    public String getCult(){
        return this.cultivation;
    }
    public int getNivCult(){
        return this.nivCult;
    }
    public String getCult(Boolean t){
        String res="";
        if(t==true){
            res=this.cultivation+this.nivCult;
        }else{
            res="";
        }
        return res;
    }

    public float getTalent(){
        return this.talent;
    }

}
