package com.dhy.demo.spring.jdbc.service;

import java.util.List;

public interface ISeataStorageService {

     List<SeataStoragePo> selectAll();

     int selectCount();

     int insert(SeataStoragePo po);

     int delete(SeataStoragePo po);

     int update(SeataStoragePo po);
}
