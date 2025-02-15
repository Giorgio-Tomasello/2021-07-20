package it.polito.tdp.yelp.model;

public class Event implements Comparable<Event>{
	
	public enum EventType {
		
		DA_INTERVISTARE,
		FERIE
	}
	
	private int giorno;
	private User intervistato;
	private Giornalista giornalista;
	private EventType type;
	
	
	public Event(int giorno, EventType type, User intervistato, Giornalista giornalista) {
		super();
		this.giorno = giorno;
		this.intervistato = intervistato;
		this.giornalista = giornalista;
		this.type = type;
	}


	public int getGiorno() {
		return giorno;
	}


	public User getIntervistato() {
		return intervistato;
	}


	public Giornalista getGiornalista() {
		return giornalista;
	}
	
	

	public EventType getType() {
		return type;
	}


	@Override
	public int compareTo(Event other) {
		// TODO Auto-generated method stub
		return this.giorno - other.giorno;
	}



	
	

}
