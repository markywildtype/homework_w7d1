public abstract class Kaiju {

    protected String name;
    protected int healthValue;
    protected int attackValue;

    public Kaiju(String name, int healthValue, int attackValue){
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String roar(){
        return "ROOOAAAR!!!";
    }

    public String getName() {
        return this.name;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public void setHealthValue(int healthValue){
        this.healthValue = healthValue;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

    public void attack(Vehicle vehicle){
        int damage = vehicle.getHealthValue() - this.attackValue;
        vehicle.setHealthValue(damage);
    }

    public abstract String move();

}
