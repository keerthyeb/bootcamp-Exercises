package meassurments;

import java.math.BigDecimal;

public class Quantity {
    private BigDecimal value;
    private Unit unit;

    Quantity(BigDecimal value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object newQuantity) {
        Quantity anotherQuantity = (Quantity) newQuantity;
        BigDecimal firstQuantityBaseValue = this.unit.convertToBaseUnitValue(this.value);
        BigDecimal secondQuantityBaseValue = anotherQuantity.unit.convertToBaseUnitValue(anotherQuantity.value);
        return firstQuantityBaseValue.equals(secondQuantityBaseValue);
    }
}
