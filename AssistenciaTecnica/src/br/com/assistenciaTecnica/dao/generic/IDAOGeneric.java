package br.com.assistenciaTecnica.dao.generic;

public interface IDAOGeneric<Entity> 
{
	public void insert(Entity object);
	public void refresh(Entity object);
	public void remove(Entity object);
	public Entity queryById(Integer key);
}

