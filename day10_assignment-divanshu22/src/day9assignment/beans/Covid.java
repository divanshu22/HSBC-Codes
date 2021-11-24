package day9assignment.beans;

import java.time.LocalDate;

public class Covid {
	private String name;
	private int seconddose;
	private LocalDate duration;
	private String sideeffects;
	private String precautions;

	public String getSideeffects() {
		return sideeffects;
	}

	public void setSideeffects(String sideeffects) {
		this.sideeffects = sideeffects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeconddose() {
		return seconddose;
	}

	public void setSeconddose(int seconddose) {
		this.seconddose = seconddose;
	}

	public LocalDate getDuration() {
		return duration;
	}

	public void setDuration(LocalDate duration) {
		this.duration = duration;
	}

	public String getPrecautions() {
		return precautions;
	}

	public void setPrecautions(String precautions) {
		this.precautions = precautions;
	}

}
