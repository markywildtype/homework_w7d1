public class GiantLizard extends Kaiju {

    public GiantLizard(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }

    public String roar(){
        return this.name + " " + super.roar();
    }

    public String move(){
        return this.name + " STOMP!";
    }

}
