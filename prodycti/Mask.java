package prodycti;

import prodycti.grupe.classi.product;

public class Mask extends ForChildren {
    public Mask(String name, Double price, Double quantity, String unit, int minAge, boolean isHypoallergenic) {
        super(name, price, quantity, unit, minAge, isHypoallergenic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Mask: " + super.toString());
        return sb.toString();
    }
}