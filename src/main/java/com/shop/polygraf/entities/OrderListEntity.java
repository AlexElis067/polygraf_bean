package com.shop.polygraf.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="MyOrders")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderListEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String product;
    private  String paper;
    private  String color;
    private  String size;
    private  String amount;
    private  String price;

}
