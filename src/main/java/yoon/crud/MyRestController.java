package yoon.crud;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

    @PostMapping("/products")
    String Create() {
        return "상품을 생성하였습니다.";
    }

    @GetMapping("/products")
    String Read() {
        return "상품을 조회하였습니다.";
    }

    @PutMapping("/products/{productId}")
    String Update(@PathVariable(name = "productId") Long productId) {
        return "상품을 수정하였습니다." + productId;
    }

    @DeleteMapping("/products/125")
    String Delete() {
        return "상품을 삭제하였습니다";
    }


}
