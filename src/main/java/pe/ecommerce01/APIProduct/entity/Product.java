/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.ecommerce01.APIProduct.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.Data;

/**
 *
 * @author SUITE
 */
@Entity
@Table(name = "Productos")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idProducto")
    private Long id;
    
    @Column(name = "nombreProducto", length=100)
    private String name;
    
    @Column(name = "descripcion", length=100)
    private String description;
    
    @Column(name = "precioUnitario" )
    private BigDecimal unitPrice;
    
    @Column(name = "imagenURl")
    private String imagenUrl;
}
