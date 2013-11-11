package br.com.assistenciaTecnica.organization.dao;

import java.util.List;

public interface IGenericDAO<Entity> 
{
	public void insert(Entity object);
	public void update(Entity object);
	public void refresh(Entity object);
	public void remove(Entity object);
	public Entity queryById(Integer key);
	public List<Entity> seeAll();
}

