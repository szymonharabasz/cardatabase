package com.packt.cardatabase.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface CarRepository extends PagingAndSortingRepository<Car, Long> {

   // @Query("select c from Car where c.brand = ?1")
    List<Car> findByBrand(@Param("brand") String brand);
   // @Query("select c from Car where c.brand like %?1")
   // List<Car> fincByBrandEndsWith(String brand);
    List<Car> findByColor(@Param("color") String color);
    List<Car> findByYear(int year);
    List<Car> findByBrandAndModel(String brand, String model);
    List<Car> findByBrandAndColor(String brand, String color);
    List<Car> findByBrandOrderByYearAsc(String brand);

}

