public class Bishop extends Piece {

    public Bishop(int x, int y) {
        super(x, y);
    }


    public Bishop(int x, int y, String color) {
        super(x, y, color);
    }

    public String getSymbol() {
        return "B";
    }

    /**
     * Check if the bishop can move.
     * @param board the board
     * @param x the x coordinate
     * @param y the y coordinate
     * @return true if it can move, false otherwise
     */
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y)) {
            return false;
        }
        if (x == getCoordinatesX() || y == getCoordinatesY()) {
            return false;
        }
        int curX = x - this.getCoordinatesX();
        int curY = y - this.getCoordinatesY();
        if (Math.abs(curX) != Math.abs(curY)) {
            return false;
        }
        int dirX = curX > 0 ? 1 : -1;
        int dirY = curY > 0 ? 1 : -1;
        int posX = this.getCoordinatesX() + dirX;
        int posY = this.getCoordinatesY() + dirY;
        while (posX != x && posY != y) {
            if (board.getAt(posX, posY) != null) {
                return false;
            }
            posX += dirX;
            posY += dirY;
        }
        return board.getAt(x, y) == null || board.getAt(x, y).getColor() != this.getColor();
    }
}
