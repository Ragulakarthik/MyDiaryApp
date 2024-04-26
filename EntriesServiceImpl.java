package com.example.MyDiary.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MyDiary.Entity.Entries;
import com.example.MyDiary.Repositories.EntriesRepository;

@Service
public class EntriesServiceImpl implements EntriesService {

	@Autowired
	private EntriesRepository entriesRepository;
	
	@Override
	public Entries saveEntry(Entries entry) {
		return entriesRepository.save(entry);
	}

	@Override
	public Entries updateEntry(Entries entry) {
		return entriesRepository.save(entry);
	}

	@Override
	public void deleteEntry(Entries entry) {
		entriesRepository.delete(entry);
	}

	@Override
	public Entries findById(Long id) {
		return entriesRepository.findById(id).get();
	}

	@Override
	public List<Entries> findByUserid(long id) {
		return entriesRepository.findByUserid(id);
	}

}
