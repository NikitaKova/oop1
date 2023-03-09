package prodycti.grupe;

import java.time.LocalDate;

import prodycti.grupe.classi.product;

public class Food extends product {
    LocalDate expirationDate;

    public Food(String name, Double price, Double quantity, String unit, LocalDate expirationDate) {
        super(name, price, quantity, unit);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("Expiration date: %s  ", this.expirationDate));
        return sb.toString();
    }
}