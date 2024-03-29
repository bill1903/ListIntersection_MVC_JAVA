package com.billsampas.assignment;



/**
 * The App class is responsible for assembling all the
 * MVC components
 */
public class App {

	public static void main(String[] args) {
		// Assemble all the components of the MVC
		  Model m = new Model(50,5000,false);
		  View v = new View();
		  Controller c = new Controller(m, v);
		  c.initController();
	}

}
