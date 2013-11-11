package br.com.assistenciaTecnica.organization.dao.register;

import java.util.Calendar;
import java.util.List;

import br.com.assistenciaTecnica.base.stock.EletronicPiece;
import br.com.assistenciaTecnica.base.stock.Register;
import br.com.assistenciaTecnica.organization.dao.IGenericDAO;

public interface IRegisterDAO extends IGenericDAO<Register>
{
        public List<Register> browseByChangeDate(Calendar lasUpdate);
        public Integer batchQuery(String lot);
        public Integer consultQuantityOfPiece(EletronicPiece piece);
}
