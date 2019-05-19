package com.wsjr.cuishou.mapper;

import com.wsjr.cuishou.entity.WsxdAllocateRule;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WsxdAllocateRuleMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsxdAllocateRule record);

    int insertSelective(WsxdAllocateRule record);

    WsxdAllocateRule selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsxdAllocateRule record);

    int updateByPrimaryKey(WsxdAllocateRule record);

    WsxdAllocateRule selectByNum(Integer num);
}