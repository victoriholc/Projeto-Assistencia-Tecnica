package br.com.assistenciaTecnica.dao.generic;

import java.util.List;

public interface IDAOGeneric<Entity> 
{
	public void insert(Entity object);
	public void refresh(Entity object);
	public void remove(Entity object);
	public Entity queryById(Integer key);
	public List<Entity> seeAll();
}

