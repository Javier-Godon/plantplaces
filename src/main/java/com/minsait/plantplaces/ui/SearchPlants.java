package com.minsait.plantplaces.ui;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Scope;

import com.minsait.plantplaces.dto.Plant;

@Named
@ManagedBean
@SessionScoped
public class SearchPlants {

	
	@Inject
	private Plant plant;
	
	public String execute() {
		
		if (plant !=null && plant.getName().equalsIgnoreCase("Re")) {
			return "search";
		}
		else {
			return "noresults";
		}
		
	}
	
	public Plant getPlant() {
		return plant;
	}
	
	public void setPlant(Plant plant) {
		this.plant=plant;
	}
	
	public List<plant> completePlants(String query){
		
	}
}
