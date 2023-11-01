import java.util.ArrayList;
import java.util.Iterator;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces;

    public Board() {
        pieces = new ArrayList<>();
    }

    /**
     * add a piece to the board.
     * @param piece the piece to add
     */
    public void addPiece(Piece piece) {
        if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            for (int i = 0; i < pieces.size(); i++) {
                if (piece.checkPosition(pieces.get(i))) {
                    return;
                }
            }
            pieces.add(piece);
        }
    }

    public boolean validate(int x, int y) {
        return ((x >= 1 && x <= WIDTH) && (y >= 1 && y <= HEIGHT));
    }

    /**
     * get a piece from the board.
     * @param x the coordinates of the piece
     * @param y the coordinates of the index
     * @return p or null
     */
    public Piece getAt(int x, int y) {
        for (Piece p : pieces) {
            if (p.getCoordinatesX() == x && p.getCoordinatesY() == y) {
                return p;
            }
        }
        return null;
    }

    /**
     * remove.
     * @param x the coordinates of the piece
     * @param y the coordinates of the piece
     */
    public void removeAt(int x, int y) {
        Iterator<Piece> itr = pieces.iterator();
        while (itr.hasNext()) {
            Piece p = itr.next();
            if (p.getCoordinatesX() == x && p.getCoordinatesY() == y) {
                itr.remove();
                return;
            }
        }
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
 