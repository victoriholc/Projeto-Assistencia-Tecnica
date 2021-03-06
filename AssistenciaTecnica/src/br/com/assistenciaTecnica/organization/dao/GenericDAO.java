package br.com.assistenciaTecnica.organization.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public abstract class GenericDAO<Entity> implements IGenericDAO<Entity>
{
	protected EntityManager entityManager;
	protected Class<Entity> classPersistence;
	
	@SuppressWarnings("unchecked")
	public GenericDAO(){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("db_assistenciaTecnica");
		entityManager = entityManagerFactory.createEntityManager();
		
		ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();  
        classPersistence = (Class<Entity>) parameterizedType.getActualTypeArguments()[0];
	}
	
	public Class<Entity> getClassPersistence() {
		return classPersistence;
	}
	public void setClassPersistence(Class<Entity> classPersistence) {
		this.classPersistence = classPersistence;
	}
        
    public final void insert(Entity object)
    {
       	EntityTransaction tx = this.entityManager.getTransaction();
			object = this.entityManager.merge(object);
		try{
			tx.begin();
			this.entityManager.persist(object);
			tx.commit();
			System.out.println(classPersistence.getSimpleName() + " salvo com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()){
				tx.rollback();
			}
		}
	}
    
    //atualiza objeto no banci
    public final void update(Entity object)
    {
    	this.entityManager.merge(object);
    }
    
    //atualiza objeto que se encontra na mem�ria
    public final void refresh(Entity object)
    {
    	this.entityManager.refresh(object);
    }
    
    
    public final void remove(Entity object)
    {
    	EntityTransaction tx = this.entityManager.getTransaction();
    	try{
    		tx.begin();
    		
    		refresh(object);
    		this.entityManager.remove(object);
    		
    		tx.commit();
    		System.out.println(classPersistence.getSimpleName()+"Remove Sucess");
    	}catch(Exception e){
    		e.printStackTrace();
    		if (tx != null && tx.isActive()){
				tx.rollback();
			}
    	}
    }
    //busca o objeto passando a sua chave como par�metro
    public final Entity queryById(Integer key)
    {
    	Entity instance = null;
    	try {
			instance = (Entity)this.entityManager.find(classPersistence, key);
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		return instance;
    }
    
    public List<Entity> seeAll()
    {
    	try{
    		String sql = "from" + classPersistence.getSimpleName();
    		TypedQuery<Entity> query = entityManager.createQuery(sql, classPersistence);
    		return query.getResultList();
    	}catch (Exception e){

			e.printStackTrace();
    	}
    	return null;
    }
}
