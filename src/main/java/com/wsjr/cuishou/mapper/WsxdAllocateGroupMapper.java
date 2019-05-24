package com.wsjr.cuishou.mapper;

import com.wsjr.cuishou.entity.WsxdAllocateGroup;
import com.wsjr.cuishou.entity.WsxdAllocateGroupExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WsxdAllocateGroupMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsxdAllocateGroup record);

    int insertSelective(WsxdAllocateGroup record);

    List<WsxdAllocateGroup> selectByExample(WsxdAllocateGroupExample example);

    WsxdAllocateGroup selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsxdAllocateGroup record);

    int updateByPrimaryKey(WsxdAllocateGroup record);
}