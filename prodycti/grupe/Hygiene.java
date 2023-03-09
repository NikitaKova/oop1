package prodycti.grupe;
import prodycti.grupe.classi.product;

public class Hygiene extends product {
    int piecesInPackaging;

    public Hygiene(String name, Double price, Double quantity, String unit, int piecesInPackaging) {
        super(name, price, quantity, unit);
        this.piecesInPackaging = piecesInPackaging;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("Pieces in packaging: %d  ", this.piecesInPackaging));
        return sb.toString();
    }
}