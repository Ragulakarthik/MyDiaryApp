package com.example.MyDiary.Service;

import java.util.List;

import com.example.MyDiary.Entity.Entries;

public interface EntriesService {

	public Entries saveEntry(Entries entry);
	public Entries updateEntry(Entries entry);
	public void deleteEntry(Entries entry);
	public Entries findById(Long id);
	public List<Entries> findByUserid(long id);
}