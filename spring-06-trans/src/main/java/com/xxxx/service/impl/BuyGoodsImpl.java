package com.xxxx.service.impl;

import com.xxxx.dao.GoodsDao;
import com.xxxx.dao.SaleDao;
import com.xxxx.entity.Goods;
import com.xxxx.entity.Sale;
import com.xxxx.service.BuyGoods;

public class BuyGoodsImpl implements BuyGoods {

    private Goods goods;
    private Sale sale;
    private GoodsDao goodsDao;
    private SaleDao saleDao;

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    @Override
    public void buy(Integer goodId, Integer amount) {
        sale.setGid(goodId);
        sale.setNum(amount);
        saleDao.insertSale(sale);


    }
}
