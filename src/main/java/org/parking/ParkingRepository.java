package org.parking;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by zlatan on 06.05.16.
 */
@RepositoryRestResource(collectionResourceRel = "parking", path = "parking")
public interface ParkingRepository extends CrudRepository<Parking, Long>,PagingAndSortingRepository<Parking, Long> {
    Parking findByName(@Param("name") String name);
}
