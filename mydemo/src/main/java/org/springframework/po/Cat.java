package org.springframework.po;

/**
 * @author shanmengyuan
 * @date 2024/1/10 10:47
 */
public class Cat {


	private String color;

	public Cat() {

	}

	public Cat(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
