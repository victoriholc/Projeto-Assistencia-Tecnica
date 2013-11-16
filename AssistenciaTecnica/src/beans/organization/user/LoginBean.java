package beans.organization.user;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.assistenciaTecnica.Facade;
import br.com.assistenciaTecnica.organization.exception.user.LoginInvalidException;
import br.com.assistenciaTecnica.organization.model.department.Department;
import br.com.assistenciaTecnica.organization.model.user.User;

@ManagedBean
public class LoginBean {
	private User userLog;
	private Department[] department;
	private String login;
	private String passWord;
	Facade facade = Facade.getInstace();
	
	public User getUserLog() {
		return userLog;
	}

	public void setUserLog(User userLog) {
		this.userLog = userLog;
	}

	public Department[] getDepartment() {
		return department;
	}

	public void setDepartment(Department[] department) {
		this.department = department;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String efetuarLogin(){
		try{
			userLog = facade.effectLogin(login, passWord);
		}catch(LoginInvalidException e){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Login ou Senha inexiste"));
		}
		return "/index.xhtml?faces-redirect=true";
	}
	
	public String effectLogoff(){
		userLog = null;
		return "/index.xhtml?faces-redirect=true";
	}
}
