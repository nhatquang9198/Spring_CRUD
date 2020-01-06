package entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Belongings")
public class Belonging {
	@Id
	@Column(name = "id")
	private int id;

	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "person_id", nullable = false)
	private Person person;

	public Belonging() {
		super();
	}

	public Belonging(int id, Person person) {
		super();
		this.id = id;
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Belonging [id=" + id + ", person=" + person + "]";
	}

}
