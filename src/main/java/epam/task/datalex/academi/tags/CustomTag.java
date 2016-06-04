package epam.task.datalex.academi.tags;

import flight.Flight;
import flight.FlightHome;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.util.Properties;


public class CustomTag extends SimpleTagSupport {
    private String var;

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

   protected Flight getFlight (){
       Properties properties = new Properties();
       properties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
       properties.put(Context.PROVIDER_URL, "localhost:1099");
       Flight flight = null;
       try {
           InitialContext jndiContext = new InitialContext(properties);
           Object ref = jndiContext.lookup("Flight");
           FlightHome home = (FlightHome) PortableRemoteObject.narrow(ref,
                   FlightHome.class);
           flight = home.create();
       } catch (Exception e) {
           e.printStackTrace();
           throw new IllegalStateException("opps some wrong", e);
       }
       return flight;
   }


}
