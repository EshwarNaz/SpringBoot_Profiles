package in.eshwar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.eshwar.entity.Bikes;

public interface BikeRepository extends JpaRepository<Bikes, Integer> {

}
