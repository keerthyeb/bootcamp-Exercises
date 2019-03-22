package meassurments;

import java.math.BigDecimal;

public class Quantity {
    private BigDecimal value;
    private Unit unit;

    Quantity(BigDecimal value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    Quantity add(Quantity quantity){
        return new Quantity(this.value.add(quantity.value),this.unit);
    }

    @Override
    public boolean equals(Object newQuantity) {
        if (this == newQuantity) return true;
        if (newQuantity == null || getClass() != newQuantity.getClass()) return false;

        Quantity anotherQuantity = (Quantity) newQuantity;
        if(!(this.unit.isSameType(anotherQuantity.unit))) return false;
        BigDecimal firstQuantityBaseValue = this.unit.convertToBaseUnitValue(this.value);
        BigDecimal secondQuantityBaseValue = anotherQuantity.unit.convertToBaseUnitValue(anotherQuantity.value);
        return firstQuantityBaseValue.equals(secondQuantityBaseValue);
    }

}
