package com.dzkj.Service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dzkj.Service.IUsersDao;
import com.dzkj.mapper.IUsersMapper;
import com.dzkj.pojo.Address;
import com.dzkj.pojo.Users;
import com.dzkj.pojo.Region;

@Service
@Transactional
public class UsersDaoImp implements IUsersDao{
	
		@Autowired
		private IUsersMapper usersMapper;
		
		
	@Override
	public Users Login(Users person) {
		
		return usersMapper.Login(person);
	}

	@Override
	public Users selectname(Users person) {

		return usersMapper.selectname(person);
	}

	@Override
	public boolean update(Users person) {
		
		return usersMapper.update(person);
	}

	@Override
	public boolean AddAddress(Address address) {
		
		return usersMapper.AddAddress(address);
	}

	@Override
	public boolean updateStateAddress(Address address) {
		
		return usersMapper.updateStateAddress(address);
	}

	@Override
	public boolean UpdateDefaultAddress(Integer aid, Integer state) {
		
		return usersMapper.UpdateDefaultAddress(aid, state);
	}

	@Override
	public Address SelectByIdAddress(Integer aid) {
		
		return usersMapper.SelectByIdAddress(aid);
	}

	@Override
	public List<Address> QueryAll() {
		
		return usersMapper.QueryAll();
	}

	@Override
	public boolean delete(Integer aid) {
		
		return usersMapper.delete(aid);
	}

	@Override
	public List<Region> SelectRegion(Integer Parent_id) {
		
		return usersMapper.SelectRegion(Parent_id);
	}

	@Override
	public Region SelectRegionById(Integer Region_id) {
		
		return usersMapper.SelectRegionById(Region_id);
	}

	@Override
	public void add(Users person) {
		
		usersMapper.add(person);
	}
		
}
