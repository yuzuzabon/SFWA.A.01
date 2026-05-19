package com.example.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.app.domain.Item;

@Mapper
public interface ItemMapper {

	//itemsテーブルから全備品のリストを登録日時の新し巡に取得する
	List<Item>selectAll();
	//ID番号に基づきitemsテーブルから1件分の備品データを取得する
	Item selectById(int id);
	//itemsテーブルに備品データを登録する
	void insert(Item item);
	//itemsテーブルの備品データを更新する
	void update(Item item);
	//ID番号に基づきitemsテーブルから１件分の備品データを削除する
	void delete(int id);
	//ページ分割機能用
	List<Item>selectLimited(@Param("offset") int offset,
													@Param("limit") int limit);
	long count();
	
}
