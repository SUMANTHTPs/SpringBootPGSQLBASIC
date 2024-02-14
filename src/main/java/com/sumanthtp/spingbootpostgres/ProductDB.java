package com.sumanthtp.spingbootpostgres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {

}
