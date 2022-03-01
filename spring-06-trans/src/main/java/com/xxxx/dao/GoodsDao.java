package com.xxxx.dao;

import com.xxxx.entity.Goods;

import java.util.List;

public interface GoodsDao {
    int updateGoods(Goods goods);
    List<Goods> selectGoods();
}
