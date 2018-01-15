public class Tank extends Vehicle {

    int rocketAttackValue;

    public Tank(String type, int healthValue, int attackValue){
        super(type, healthValue, attackValue);
        this.rocketAttackValue = 30;
    }

    public void rocketAttack(Kaiju kaiju) {
        int damage = kaiju.getHealthValue() - this.rocketAttackValue;
        kaiju.setHealthValue(damage);
    }

}
