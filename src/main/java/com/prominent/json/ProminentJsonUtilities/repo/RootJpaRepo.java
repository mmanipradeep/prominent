package com.prominent.json.ProminentJsonUtilities.repo;

import com.prominent.json.ProminentJsonUtilities.entity.Root;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RootJpaRepo extends JpaRepository<Root,Long> {

}
