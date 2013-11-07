package beans.organization.department;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import br.com.assistenciaTecnica.Facade;
import br.com.assistenciaTecnica.organization.exception.NoSearchResultsException;
import br.com.assistenciaTecnica.organization.exception.department.DepartmentAlreadyExistsException;
import br.com.assistenciaTecnica.organization.model.department.Department;

@ManagedBean
public class DepartmentBean {
	
	private Department department = new Department();
	private List<Department> listDepartment = new ArrayList<Department>();
	private String erro = "";
	private String feedback = "";

	public Department getDepartment() {
		return this.department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public List<Department> getListDepartment() {
		try {
			this.listDepartment = Facade.getInstace().seeAllDepartment();
		} catch (NoSearchResultsException e) {
			this.erro = e.getMessage();
			e.printStackTrace();
		}
		return listDepartment;
	}

	public String insert() {
		try {

			Facade.getInstace().insertDepartment(this.department);
			this.setFeedback("Departamento Salvo com sucesso!");

		} catch (DepartmentAlreadyExistsException e) {
			e.printStackTrace();
			this.setErro(e.getMessage());

		} catch (Exception e) {

			e.printStackTrace();
			this.setErro(e.getMessage());
		}
		return "department";
	}
	public void remove(Department department){
		Facade.getInstace().removeDepartment(department);
	}
	
	public String newDepartment() {
		return "department.xhtml?faces-redirect=true";
	}
	public String view() {
		
		return "/organization/department/view_department.xhtml?faces-redirect=true";
	}
	public String loadDepartment(Department department) {
		this.department = department;
		return "department.xhtml";
	}

}
