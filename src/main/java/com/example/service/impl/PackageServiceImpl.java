package com.example.service.impl;

import com.example.entity.Package;
import com.example.mapper.PackageMapper;
import com.example.service.PackageService;
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
public class PackageServiceImpl extends ServiceImpl<PackageMapper, Package> implements PackageService {

}
