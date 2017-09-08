package edu.ap.producten;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class MedicijnenApplicatie extends Application {

	 @Override
	   public synchronized Restlet createInboundRoot() {

	       Router router = new Router(getContext());
	       
	       router.attach("/medicijnen", MedicijnenResource.class);
	       router.attach("/medicijnen/{medicijn_id}", ProductResource.class);
	       return router;
	   }
}

