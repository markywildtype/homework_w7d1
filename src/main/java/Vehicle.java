public abstract class Vehicle {

    protected String type;
    protected int healthValue;
    protected int attackValue;

    public Vehicle(String type, int healthValue, int attackValue){
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return this.type;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public void ramAttack(Kaiju kaiju){
        int damage = kaiju.healthValue - this.attackValue;
        kaiju.setHealthValue(damage);
    }

    public int getAttackValue() {
        return this.attackValue;
    }

}
