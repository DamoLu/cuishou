package com.wsjr.cuishou.mapper;

import com.wsjr.cuishou.entity.WsxdAllocateGroup;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WsxdAllocateGroupMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsxdAllocateGroup record);

    int insertSelective(WsxdAllocateGroup record);

    WsxdAllocateGroup selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsxdAllocateGroup record);

    int updateByPrimaryKey(WsxdAllocateGroup record);
}