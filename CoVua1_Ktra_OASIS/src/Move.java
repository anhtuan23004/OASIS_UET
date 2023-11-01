public class Move {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private Piece movedPiece;
    private Piece killedPiece;

    /**
     * saifhaklifj.
     * @param startX the x coordinate of the piece to move
     * @param startY the y coordinate of the piece to move
     * @param endX the x coordinate of the destination
     * @param endY the y coordinate of the destination
     * @param movedPiece the piece to move
     */
    public Move(int startX, int startY, int endX, int endY, Piece movedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }

    /**
     * fhaoidflasifhdaslih.
     * @param startX the x coordinate of the piece to move
     * @param startY the y coordinate of the piece to move
     * @param endX the x coordinate of the destination
     * @param endY the y coordinate of the destination
     * @param movedPiece the piece to move
     * @param killedPiece the piece to kill
     */
    public Move(int startX, int startY, int endX, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    /**
     * slfkaslfjkj.
     * @return the string
     */
    public String toString() {
        String pieceSymbol = movedPiece.getSymbol();
        String colorName = movedPiece.getColor().toLowerCase();
        return colorName + "-" + pieceSymbol + (char) (endX + 96) + endY;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public Piece getMovedPiece() {
        return movedPiece;
    }

    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    public Piece getKilledPiece() {
        return killedPiece;
    }

    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }
}
