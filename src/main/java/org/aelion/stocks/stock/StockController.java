package org.aelion.stocks.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/stocks")
public class StockController {
    @Autowired
    private StockService service;

    @PostMapping("/addMovement")
    public ResponseEntity<Stock> addStockMovement(@RequestBody Stock stock) {
        Stock savedStock = service.addStock(stock);
        return new ResponseEntity<>(savedStock, HttpStatus.CREATED);
    }

}
