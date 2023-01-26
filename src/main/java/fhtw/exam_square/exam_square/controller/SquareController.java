package fhtw.exam_square.exam_square.controller;

import fhtw.exam_square.exam_square.service.SquareService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareController {

    private final SquareService sqService;

    public SquareController(SquareService sqService) {

        this.sqService = sqService;

    }

    @GetMapping("/square")
    Integer getNum() {
        return sqService.getNum();
    }

    @PostMapping("/square/{num}")
    Integer setNum(@PathVariable Integer num) {
        sqService.setNum(num);
        return num;
    }

    @GetMapping("/calcSquare")
    Integer calcSquare() {
        return sqService.calcSquare();
    }
}
