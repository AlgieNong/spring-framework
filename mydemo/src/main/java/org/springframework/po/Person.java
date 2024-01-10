package org.springframework.po;

/**
 * @author shanmengyuan
 * @date 2024/1/10 10:45
 */
public class Person {

	private Integer id;

	private String name;

	private Cat cat;

	public Person() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public Person(Integer id, String name, Cat cat) {
		this.id = id;
		this.name = name;
		this.cat = cat;
	}
}
