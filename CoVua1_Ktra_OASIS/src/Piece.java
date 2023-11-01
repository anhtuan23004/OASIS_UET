public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * afhasfhaslif.
     * @param coordinatesX the x coordinate
     * @param coordinatesY the y coordinate
     */
    public Piece(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = "white";
    }

    /**
     * askjfkadaf.
     * @param coordinatesX the x coordinate
     * @param coordinatesY the y coordinate
     * @param color the color
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int coordinatesX, int coordinatesY);

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Check.
     * @param piece given piece
     * @return true if they are in the same position, false otherwise
     */
    public boolean checkPosition(Piece piece) {
        boolean check = (piece.getCoordinatesX() == this.coordinatesX)
                && (piece.getCoordinatesY() == this.coordinatesY);
        return check;
    }
}
