package taller3.televisores;

public class Control {
	
	private TV tv;
	
	
	
	public void enlazar(TV televisor) {
		this.tv = televisor;
		televisor.control = this;
	}
	
	
	
	public void turnOn() {
		this.tv.estado = true;
	}
	
	public void TurnOff() {
		this.tv.estado = false;
	}
	
public void canalUp() {
		
		if(this.tv.estado && this.tv.canal < 120 && this.tv.canal > 1) {
			
			this.tv.canal++;
			
		}
		
		
		
	}
	
	public void canalDown() {
		
		if(this.tv.estado && this.tv.canal < 120 && this.tv.canal > 1) {
					
					this.tv.canal--;
					
				}
		
		
	}
	
	public void volumenUp() {
		
		if(this.tv.estado && this.tv.volumen < 7 && this.tv.volumen > 0) {
			this.tv.volumen++;
		}
		
		
	}
	
	public void volumenDown() {
		if(this.tv.estado && this.tv.volumen < 7 && this.tv.volumen > 0) {
			this.tv.volumen--;
		}
	}
	
	
	public void setCanal(int canal) {
		this.tv.canal = canal;
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public TV getTv() {
		return this.tv;
		
	}
	
	public int getPrecio() {
		return this.tv.precio;
	}

	public void setPrecio(int precio) {
		this.tv.precio = precio;
	}

	public int getCanal() {
		return this.tv.canal;
	}
	
	public int getVolumen() {
		return this.tv.volumen;
	}

	public void setVolumen(int volumen) {
		this.tv.volumen = volumen;
	}
	
	public void turnOff() {
		this.tv.estado = false;
	}

};
