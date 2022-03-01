package com.xxxx.service.impl;

import com.xxxx.dao.GoodsDao;
import com.xxxx.entity.Goods;
import com.xxxx.service.SaleService;

import java.util.List;

public class SaleServiceImpl implements SaleService {
    public GoodsDao getGoodsDao() {
        return goodsDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    GoodsDao goodsDao;

    @Override
    public int upGoods(Goods goods) {
        Goods goods1 = new Goods();
        return 0;
    }

    @Override
    public List<Goods> queryGoodsById() {
        List<Goods> goods = goodsDao.selectGoods();
        return goods;
    }
}
