package com.dzkj.mapper;

import java.util.List;

import com.dzkj.pojo.Address;
import com.dzkj.pojo.Users;
import com.dzkj.pojo.Region;

public interface IUsersMapper {
	//登录
	Users Login(Users person);
	
	//查询该用户是否存在
	Users selectname(Users person);
	
	//修改个人信息
	boolean update(Users person);
	
	//添加收货地址
	boolean AddAddress(Address address);
	
	//修改收获地址
	boolean updateStateAddress(Address address);
	
	//修改默认的收货地址
	boolean UpdateDefaultAddress(Integer aid,Integer state);
	
	//通过id查收货地址
	Address SelectByIdAddress(Integer aid);
	
	//查收货地址
	List<Address> QueryAll();
	
	//删除收货地址
	boolean delete(Integer aid);
	
	//查地区
	List<Region> SelectRegion(Integer Parent_id);
	
	//id查地区名
	Region SelectRegionById(Integer Region_id);

	//注册
	void add(Users person);
}
