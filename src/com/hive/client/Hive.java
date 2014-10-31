package com.hive.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Hive implements EntryPoint {
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	@JsType
	interface Window {
		@JsProperty
		int getX();
	}
	
	@JsExport
	public class MyWindow implements Window {

		@Override
		public int getX() {
			return 15;
		}
	}

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
Window window = new MyWindow();

com.google.gwt.user.client.Window.alert("Hello : " + window.getX());

	}
}
