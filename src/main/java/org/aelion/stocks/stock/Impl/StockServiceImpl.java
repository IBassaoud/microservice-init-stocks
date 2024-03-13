package org.aelion.stocks.stock.Impl;

import org.aelion.stocks.stock.Stock;
import org.aelion.stocks.stock.StockRepository;
import org.aelion.stocks.stock.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockRepository repository;


    /**
     * @param stock
     */
    @Override
    public void addStock(Stock stock) {

    }
}
