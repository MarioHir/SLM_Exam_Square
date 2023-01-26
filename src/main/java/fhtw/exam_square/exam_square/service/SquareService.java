package fhtw.exam_square.exam_square.service;

import fhtw.exam_square.exam_square.dto.Square;
import org.springframework.stereotype.Service;

@Service
public class SquareService {

    private final Square sq = new Square();

    public void setNum(Integer num) {
        this.sq.setNum(num);
    }

    public Integer getNum() {
        return sq.getNum();
    }

    public Integer calcSquare() {
        return sq.calcSquare();
    }
}
