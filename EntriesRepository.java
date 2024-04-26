package com.example.MyDiary.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.MyDiary.Entity.Entries;

//import jakarta.transaction.Transactional;

public interface EntriesRepository extends JpaRepository<Entries, Long> {

	@Query(value="select * from entries where userid=:id",nativeQuery=true)
	public List<Entries> findByUserid(long id);
//	
//	@Transactional
//	@Modifying
//	@Query(value="update entries set entrydate=:${$entries.entrydate}, description=:${$entries.description} where id=:id",nativeQuery = true)
//    public void updateEntry(Entries entries,Long id);
}
