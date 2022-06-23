package products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productelement")
public class ProductElementBean {
	@Id
	@Column(name = "ElementID")
	private Integer elementid;
	
	@Column(name = "Elements")
	private String elements;

	@Override
	public String toString() {
		return "ProductElementBean [" + elementid + "," + elements + "]";
	}

	public int getElementid() {
		return elementid;
	}

	public void setElementid(int elementid) {
		this.elementid = elementid;
	}

	public String getElements() {
		return elements;
	}

	public void setElements(String elements) {
		this.elements = elements;
	}
	
	
}
