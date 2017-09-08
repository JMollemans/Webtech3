package edu.ap.producten;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class ProductenApplicatie extends Application {

	 @Override
	   public synchronized Restlet createInboundRoot() {

	       Router router = new Router(getContext());
	       
	       router.attach("/producten", ProductenResource.class);
	       router.attach("/producten/{product_id}", ProductResource.class);
	       return router;
	   }
}

