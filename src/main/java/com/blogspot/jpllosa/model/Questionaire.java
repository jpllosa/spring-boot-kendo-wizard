package com.blogspot.jpllosa.model;

public class Questionaire {
	private String section1answer1;
	private String section1answer2;
	private String section2answer1;
	private String section2answer2;
	
	public String getSection1answer1() {
		return section1answer1;
	}
	public void setSection1answer1(String section1answer1) {
		this.section1answer1 = section1answer1;
	}
	public String getSection1answer2() {
		return section1answer2;
	}
	public void setSection1answer2(String section1answer2) {
		this.section1answer2 = section1answer2;
	}
	public String getSection2answer1() {
		return section2answer1;
	}
	public void setSection2answer1(String section2answer1) {
		this.section2answer1 = section2answer1;
	}
	public String getSection2answer2() {
		return section2answer2;
	}
	public void setSection2answer2(String section2answer2) {
		this.section2answer2 = section2answer2;
	}
	@Override
	public String toString() {
		return "Questionaire [section1answer1=" + section1answer1 + ", section1answer2=" + section1answer2
				+ ", section2answer1=" + section2answer1 + ", section2answer2=" + section2answer2 + "]";
	}
}
