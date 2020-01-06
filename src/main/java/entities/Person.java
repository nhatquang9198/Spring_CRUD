package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Persons")
public class Person {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "person_name")
	private String name;

	@OneToMany(mappedBy = "person")
	private List<Belonging> belongings;

	public Person() {
		super();
	}

	public Person(int id, String name, List<Belonging> belongings) {
		super();
		this.id = id;
		this.name = name;
		this.belongings = belongings;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Belonging> getBelongings() {
		return belongings;
	}

	public void setBelongings(List<Belonging> belongings) {
		this.belongings = belongings;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", belongings=" + belongings + "]";
	}

}
