package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        //Não é necessário colocar, no entanto para ficar claro...
        //Coloquei que a posição vai receber o valor padrão null
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

}
