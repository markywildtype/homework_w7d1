public class Jeep extends Vehicle {

    private int minigunDamageValue;

    public Jeep(String type, int healthValue, int attackValue){
        super(type, healthValue, attackValue);
        this.minigunDamageValue = 15;
    }

    public void minigunAttack(Kaiju kaiju) {
        int damage = kaiju.getHealthValue() - this.minigunDamageValue;
        kaiju.setHealthValue(damage);
    }
}
