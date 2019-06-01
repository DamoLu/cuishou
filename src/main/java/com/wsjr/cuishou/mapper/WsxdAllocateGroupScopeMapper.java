package com.wsjr.cuishou.mapper;

import com.wsjr.cuishou.entity.WsxdAllocateGroupScope;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WsxdAllocateGroupScopeMapper {
    int deleteByPrimaryKey(String id);

    int insert(WsxdAllocateGroupScope record);

    int insertSelective(WsxdAllocateGroupScope record);

    WsxdAllocateGroupScope selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WsxdAllocateGroupScope record);

    int updateByPrimaryKey(WsxdAllocateGroupScope record);

    List<WsxdAllocateGroupScope> selectByGroupId(String groupId);
}