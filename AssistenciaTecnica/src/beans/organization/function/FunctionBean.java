package beans.organization.function;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.assistenciaTecnica.Facade;
import br.com.assistenciaTecnica.organization.exception.function.FunctionAlreadyExistentsException;
import br.com.assistenciaTecnica.organization.model.functionary.Function;

@ManagedBean
public class FunctionBean {
	private Function function;
	private String name;
	private float salary;
	private String description;
	private boolean situation;
	private List<Function> listFunction;
	
	public List<Function> getListFunction() {
		return listFunction;
	}

	public void setListFunction(List<Function> listFunction) {
		this.listFunction = listFunction;
	}

	public Function getFunction(){
		return function;
	}
	
	public void setFunction(Function function){
		this.function = function;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isSituation() {
		return situation;
	}

	public void setSituation(boolean situation) {
		this.situation = situation;
	}
	
	public void insertFunction(Function function){
		try{
			if(function.getId() == null){
				Facade.getInstace().insertFunction(function);
			}else{
				System.out.println("Function Exist");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void removeFunction(Function function){
		if(function.getId() == null){
			Facade.getInstace().removeFunction(function);
		}else{
			System.out.println("Function Exist");
		}
	}
	
	public void refrech(Function function){
		
	}
}
