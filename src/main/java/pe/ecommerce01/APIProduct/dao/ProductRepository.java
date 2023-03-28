/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.ecommerce01.APIProduct.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.ecommerce01.APIProduct.entity.Product;

/**
 *
 * @author SUITE
 */

// JPARepository ayuda para traer datos de la BD segun se necesite
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
