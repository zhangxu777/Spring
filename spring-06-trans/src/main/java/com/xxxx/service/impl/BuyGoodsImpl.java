package com.xxxx.service.impl;

import com.xxxx.dao.GoodsDao;
import com.xxxx.dao.SaleDao;
import com.xxxx.entity.Goods;
import com.xxxx.entity.Sale;
import com.xxxx.service.BuyGoods;

public class BuyGoodsImpl implements BuyGoods {



    private GoodsDao goodsDao;

    private SaleDao saleDao;


    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }





    @Override
    public void buy(Integer goodId, Integer amount) {
        Sale sale = new Sale();

        sale.setGid(goodId);
        sale.setNum(amount);
        String row;
        saleDao.insertSale(sale);


    }
}
