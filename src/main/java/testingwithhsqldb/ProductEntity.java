/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingwithhsqldb;

/**
 *
 * @author pedago
 */
public class ProductEntity {
        
    private int Id;
    private String Desc;
    private int cost;
    
    public ProductEntity(int id, String d , int c){
        this.Id = id;
        this.Desc = d;
        this.cost=c;
    }
    
}
