package taller3.televisores;

public class Control {
	
	private TV tv;
	
	
	
	public void enlazar(TV televisor) {
		this.tv = televisor;
		televisor.control = this;
	}
	
	
	
	public void turnOn() {
		this.tv.turnOn();
	}
	
	
	public void canalUp() {
			 
			 this.tv.canalUp();
		}
					
					
					
	public void canalDown() {
		
		this.tv.canalDown();;
		
	}
	
	public void volumenUp() {
		
		this.tv.volumenUp();
		
		
	}
	
	public void volumenDown() {
		this.tv.volumenDown();
	}
	
	
	public void setCanal(int canal) {
		
		this.tv.setCanal(canal);
	
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public TV getTv() {
		return this.tv;
		
	}
	
	public int getPrecio() {
		return this.tv.getPrecio();
	}

	public void setPrecio(int precio) {
		this.tv.setPrecio(precio);
	}

	public int getCanal() {
		return this.tv.getCanal();
	}
	
	public int getVolumen() {
		return this.tv.getVolumen();
	}

	public void setVolumen(int volumen) {
		this.tv.setVolumen(volumen);
	}
	
	public void turnOff() {
		this.tv.turnOff();
	}
	
	

};
