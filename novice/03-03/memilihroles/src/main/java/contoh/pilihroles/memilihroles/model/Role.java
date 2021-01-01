package contoh.pilihroles.memilihroles.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
	@Id
	@Column(name = "role_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idrole;
	
	private String namerole;
	public Long getIdrole() {
		return idrole;
	}
	public void setIdrole(Long idrole) {
		this.idrole = idrole;
	}
	public String getNameRole() {
		return namerole;
	}
	public void setNameRole(String namerole) {
		this.namerole = namerole;
	}
	
	
}
