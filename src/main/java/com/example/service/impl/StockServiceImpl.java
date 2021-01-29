package com.example.service.impl;

import com.example.entity.Stock;
import com.example.mapper.StockMapper;
import com.example.service.StockService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 胡晓波
 * @since 2020-12-17
 */
@Service
public class StockServiceImpl extends ServiceImpl<StockMapper, Stock> implements StockService {

}
