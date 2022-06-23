package supplies;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "supplies")
public class SuppliesBean {
	@Id
	@Column(name = "SuppliesID ")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short suppliesid ;

	@Column(name = "SuppliesName ")
	private String suppliesname ;
	
	@Column(name = "ContactPerson ")
	private String contactperson ;
	
	@Column(name = "Position ")
	private String position ;
	
	@Column(name = "SuppliesPhone ")
	private String suppliesphone ;
	
	@Column(name = "Fax ")
	private String fax ;
	
	@Column(name = "SuppliesAdress ")
	private String suppliesadress ;

	@Column(name = "SuppliesArea ")
	private String suppliesarea ;

	public Short getSuppliesid() {
		return suppliesid;
	}

	public void setSuppliesid(short suppliesid) {
		this.suppliesid = suppliesid;
	}

	public String getSuppliesname() {
		return suppliesname;
	}

	public void setSuppliesname(String suppliesname) {
		this.suppliesname = suppliesname;
	}

	public String getContactperson() {
		return contactperson;
	}

	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSuppliesphone() {
		return suppliesphone;
	}

	public void setSuppliesphone(String suppliesphone) {
		this.suppliesphone = suppliesphone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getSuppliesadress() {
		return suppliesadress;
	}

	public void setSuppliesadress(String suppliesadress) {
		this.suppliesadress = suppliesadress;
	}

	public String getSuppliesarea() {
		return suppliesarea;
	}

	public void setSuppliesarea(String suppliesarea) {
		this.suppliesarea = suppliesarea;
	}

	@Override
	public String toString() {
		return "model.SuppliesBean [" + suppliesid + ", " + suppliesname + ", " + contactperson + ", " + position + ", "
				+ suppliesphone + ", " + fax + ", " + suppliesadress + ", " + suppliesarea + "]";
	}
	
	
	
	
	

}
