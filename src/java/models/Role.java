/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author nuket
 */
public class Role implements Serializable{
       int id;
       String name;
       public Role(int id, String name){
           this.id = id;
           this.name = name;
       }
       
       public int getID(){
           return id;
       }
       
       public String getName(){
           return name;
       }
}
