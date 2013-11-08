package br.com.assistenciaTecnica.organization.dao.register;

import java.util.Calendar;
import java.util.List;

import javax.persistence.TypedQuery;

import br.com.assistenciaTecnica.base.stock.EletronicPiece;
import br.com.assistenciaTecnica.base.stock.Register;
import br.com.assistenciaTecnica.organization.dao.GenericDAO;

public class RegisterDAO extends GenericDAO<Register> implements IRegisterDAO
{
        @Override
        public List<Register> browseByChangeDate(Calendar lastUpdate)
        {
                try
                {
                        TypedQuery<Register> query = entityManager.createQuery("SELECT FROM Register r WHERE r.lastUpdade =: lastUpdade", Register.class);
                        query.setParameter("lastUpdate", lastUpdate);
                        
                        return query.getResultList();
                }
                catch(Exception e)
                {
                        e.printStackTrace();
                }
                return null;
        }
        @Override
        public List<Register> batchQuery(String lot)
        {
                try
                {
                        TypedQuery<Register> query = entityManager.createQuery("SELECT FROM Register r WHERE r.lot = :lot", Register.class);
                        query.setParameter("lot", lot);

                        return query.getResultList().count();
                }
                catch(Exception e)
                {
                        e.printStackTrace();
                }
                return null;
        }
        public Integer consultQuantityOfPiece(EletronicPiece piece)
        {
                try{
                        TypedQuery<Register> query = entityManager.createQuery("SELECT  FROM EletronicPiece e WHERE e.name = :e.name", Register.class);
                        query.setParameter("piece", piece);
                        return query.getResultList().count();
                }catch(Exception e){
                        e.printStackTrace();
                }
                return null;
        }
}