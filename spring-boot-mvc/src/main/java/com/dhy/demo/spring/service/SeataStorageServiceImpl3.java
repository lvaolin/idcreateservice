package com.dhy.demo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("seataStorageService3")
public class SeataStorageServiceImpl3 implements ISeataStorageService {

    @Autowired
    private SeataStorageDao seataStorageDao;

    @Override
    public List<SeataStoragePo> selectAll() {
       return seataStorageDao.productSelectAll();
    }


    @Override
    public int selectCount(){
        return seataStorageDao.productCount();
    }


    @Override
    public int insert(SeataStoragePo po){
        return seataStorageDao.productInsert(po);
    }

    @Override
    public int delete(SeataStoragePo po) {
        return seataStorageDao.productDelete(po);
    }

    @Override
    public int update(SeataStoragePo po) {
        return seataStorageDao.productUpdate(po);
    }
}
