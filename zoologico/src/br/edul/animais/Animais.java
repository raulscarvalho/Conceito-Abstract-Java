package br.edul.animais;

public abstract class Animais {
	public String picture;
	public String food;
	public boolean hunger;
	public String boundaries;
	public String location;
	
	public abstract void makeNoise();
	
	public abstract void eat();
	
	public abstract void sleep();
	
	public abstract void roam();
	
}
