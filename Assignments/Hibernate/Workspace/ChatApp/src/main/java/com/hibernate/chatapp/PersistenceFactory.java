package com.hibernate.chatapp;

public class PersistenceFactory {

	private static Persistence singleton;

	private PersistenceFactory() {
	}

	public static Persistence getInstance() {
		if (singleton == null) {
			singleton = new HibernatePersistence();
		}
		return singleton;
	}

}
