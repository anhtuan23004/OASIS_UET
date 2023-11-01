import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory;

    public Game(Board board) {
        this.board = board;
        moveHistory = new ArrayList<>();
    }

    /**
     * move.
     * @param p the piece to move
     * @param x the x position
     * @param y the y position
     */
    public void movePiece(Piece p, int x, int y) {
        if (p.canMove(board, x, y)) {
            if (board.getAt(x, y) == null) {
                Move move = new Move(p.getCoordinatesX(), x,
                        p.getCoordinatesY(), y, p);
                moveHistory.add(move);
            } else {
                Move move = new Move(p.getCoordinatesX(), x,
                        p.getCoordinatesY(), y, p, board.getAt(x, y));
                moveHistory.add(move);
                board.removeAt(x, y);
            }

            p.setCoordinatesX(x);
            p.setCoordinatesY(y);
        }
    }


    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }
}
