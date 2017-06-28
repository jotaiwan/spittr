package com.spittr.data;

import com.spittr.dto.Spitter;
import org.springframework.stereotype.Repository;

@Repository
public interface SpitterRepository {

  Spitter save(Spitter spitter);

  Spitter findByUsername(String username);

}
