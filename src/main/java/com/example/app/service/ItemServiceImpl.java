package com.example.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.app.domain.Item;
import com.example.app.domain.Location;
import com.example.app.mapper.ItemMapper;
import com.example.app.mapper.LocationMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{

		private final ItemMapper itemMapper;
		private final LocationMapper locationMapper;


		@Override
		public List<Item> getAllItems() {
			// TODO 自動生成されたメソッド・スタブ
			return itemMapper.selectAll();
		}

		@Override
		public void addItem(Item item) {
			// TODO 自動生成されたメソッド・スタブ
			itemMapper.insert(item);
		}

		@Override
		public void editItem(Item item) {
			// TODO 自動生成されたメソッド・スタブ
			itemMapper.update(item);
		}

		@Override
		public void deleteItem(Integer id) {
			// TODO 自動生成されたメソッド・スタブ
			itemMapper.delete(id);

		}

		@Override
		public List<Location> getItemLocations() {
			// TODO 自動生成されたメソッド・スタブ
			return locationMapper.selectAll();
		}

		@Override
		public Item getItemById(Integer id) {
			// TODO 自動生成されたメソッド・スタブ
			return itemMapper.selectById(id);
		}
		@Override
		public List<Item>getItemListByPage(int page,int numPerPage){
			int offset=numPerPage*(page-1);
			return itemMapper.selectLimited(offset,numPerPage);
		}
		@Override
		public int getTotalPages(int numPerPage) {
			double totalNum=(double)itemMapper.count();
			return (int)Math.ceil(totalNum/numPerPage);
		}
		
}
