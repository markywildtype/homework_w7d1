public class Dragon extends Kaiju {

    public Dragon(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }

    public String roar(){
        return this.name + " " + super.roar();
    }

}
