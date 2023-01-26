package fhtw.exam_square.exam_square.dto;

public class Square {

    private int sq = 0;

    public void setNum(int num) {
        sq = num;
    }

    public int getNum() {
        return sq;
    }

    public int calcSquare() {
        this.sq = (int)Math.pow(sq, 2);
        return sq;
    }
}
