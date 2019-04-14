package com.ssq.www.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper

public interface CustomerDao {

	public List<Map<?, ?>> getAll();
}
