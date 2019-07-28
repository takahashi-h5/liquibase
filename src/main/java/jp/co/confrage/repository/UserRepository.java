package jp.co.confrage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jp.co.confrage.entity.UserEntity;

@Repository
public interface UserRepository  extends JpaRepository<UserEntity, Long> {
	

	@Query(value = "select m from UserEntity m")
	public List<String> findByPk();	
}
