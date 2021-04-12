package com.acme.domain;

public abstract class Good implements Product{

	public enum UnitOfMeasureType {
		LITER, GALLON, CUBIC_METER, CUBIC_FEET
	}

	private String name;
	private int modelNumber;
	private double height;
	private UnitOfMeasureType unitOfMeasure;
	private boolean flammable = true;
	private double weightPerUofM;

	public Good(String nam, int modelNumber, double height, UnitOfMeasureType uoM, boolean flammable,
			double wgtPerUoM) {
		name = nam;
		this.modelNumber = modelNumber;
		this.height = height;
		this.unitOfMeasure = uoM;
		this.flammable = flammable;
		this.weightPerUofM = wgtPerUoM;
	}

	public String toString() {
		//return "-";// + modelNumber;
		return name + '-'+modelNumber;
	}

	public abstract double volume();

	public double weight() {
		return volume() * weightPerUofM;
	}
	
	public final boolean canShipViaPostOffice() {
		if(!flammable && weight()<200) return true;
		return false ;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String nam) {
		name = nam;
	}

	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public UnitOfMeasureType getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(UnitOfMeasureType unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public boolean isFlammable() {
		return flammable;
	}

	public void setFlammable(boolean flammable) {
		this.flammable = flammable;
	}

	public double getWeightPerUofM() {
		return weightPerUofM;
	}

	public void setWeightPerUofM(double weightPerUofM) {
		this.weightPerUofM = weightPerUofM;
	}

}
