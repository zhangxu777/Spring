package com.xxxx.service;

import com.xxxx.entity.Goods;

import java.util.List;

public interface SaleService {
    int upGoods(Goods goods);
    List<Goods> queryGoodsById();
}
