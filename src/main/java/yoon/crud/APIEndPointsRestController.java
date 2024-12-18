package yoon.crud;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;



@RestController
public class APIEndPointsRestController {

    @GetMapping("/time")
    LocalDateTime getTime() {
        return LocalDateTime.now();
    }

    @GetMapping("/lotto-number")
    int getNumber() {
        return new Random().nextInt(45) + 1;
    }

    @GetMapping("/lotto-numbers")
    List<Integer> getNumbers() {
        List<Integer> getNumbers = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            getNumbers.add(new Random().nextInt(45) + 1);
        }
        return getNumbers;
    }

    @GetMapping("/square")
    int squareQuery(@RequestParam int numberToSquare) {
        return numberToSquare * numberToSquare;
    }

    @GetMapping("/fahrenhueit")
    double fahrenheit(@RequestParam double celsiusDegree) {
        return celsiusDegree*((double) 9 / 5) + 32;
    }

    @GetMapping("/square/{numberToSquare}")
    int squarePath(@PathVariable("numberToSquare") int num) {
        return num * num;
    }

    @GetMapping("/fahrenheit/{celsiusDegree}")
    double fahrenheitPath(@PathVariable("celsiusDegree") double celsiusDegree) {
        return celsiusDegree*((double) 9 / 5) + 32;
    }

    @PostMapping("/square")
    public int square(@RequestBody SquareDto dto){
        return dto.getNum() * dto.getNum();
    }


}
