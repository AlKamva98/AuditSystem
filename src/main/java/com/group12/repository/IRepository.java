package com.group12.repository;

// created standard Interface

/**  Author: Rachael Klein
 *   Student no: 218 057 377
 *   Date: 25-08-2020
 *   Description: An Implementation of an Interface UserAccount Respository
 */

//EntityType is the type
//ID is the datatype of the EntityType
public interface IRepository <EntityType,ID> {
     EntityType create(EntityType t);
     EntityType read(ID id);
     EntityType update(EntityType t);
     boolean delete (ID id);


}
