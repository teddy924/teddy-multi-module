package com.board.multimodule.core;

import org.springframework.stereotype.Repository;

@Repository
public class CoreRepository {
    public String getTest(){
        return "module-core call Test";
    }
}
