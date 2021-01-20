package com.sancor.autorizador.domain;
import java.io.Serializable;
import java.util.Iterator;

public class GenericClass <T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private T t;
	private T e;
	private T f;
	
	
	
	
	public GenericClass() {
		super();
	}




	public GenericClass(T t, T e, T f) {
		super();
		this.t = t;
		this.e = e;
		this.f = f;
	}




	public T getT() {
		return t;
	}




	public void setT(T t) {
		this.t = t;
	}




	public T getE() {
		return e;
	}




	public void setE(T e) {
		this.e = e;
	}




	public T getF() {
		return f;
	}




	public void setF(T f) {
		this.f = f;
	}


	//Si es necesario

	@Override
	public String toString() {
		return "GenericClass [t=" + t + ", e=" + e + ", f=" + f + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((e == null) ? 0 : e.hashCode());
		result = prime * result + ((f == null) ? 0 : f.hashCode());
		result = prime * result + ((t == null) ? 0 : t.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GenericClass other = (GenericClass) obj;
		if (e == null) {
			if (other.e != null)
				return false;
		} else if (!e.equals(other.e))
			return false;
		if (f == null) {
			if (other.f != null)
				return false;
		} else if (!f.equals(other.f))
			return false;
		if (t == null) {
			if (other.t != null)
				return false;
		} else if (!t.equals(other.t))
			return false;
		return true;
	}
	
	
	
	

}
