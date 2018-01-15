public class Jeep extends Vehicle {

    int rocketDamageValue;

    public Jeep(String type, int healthValue, int attackValue){
        super(type, healthValue, attackValue);
        this.rocketDamageValue = 15;
    }

    public void minigunAttack(Kaiju kaiju) {
        int damage = kaiju.getHealthValue() - this.rocketDamageValue;
        kaiju.setHealthValue(damage);
    }
}
