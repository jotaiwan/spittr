package com.spittr.data;

import java.util.List;

import com.spittr.dto.Spittle;
import org.springframework.stereotype.Repository;

public interface SpittleRepository {

  List<Spittle> findRecentSpittles();

  List<Spittle> findSpittles(long max, int count);

  Spittle findOne(long id);

  void save(Spittle spittle);

}
