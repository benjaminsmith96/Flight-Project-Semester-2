/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Interceptor.ConcreteContext;
import Interceptor.ConcreteInterceptor;
import Interceptor.Dispatcher;
import Interceptor.Interceptor;
import java.util.logging.Level;
import org.junit.Test;
/**
 *
 * @author Stephen
 */
public class JUnitTestForInterceptor {
    
    public JUnitTestForInterceptor() {
    }
    
    @Test
    public void testInterceptor(){
        String[] test = new String[3];
        String message = "";
        
        try{
            System.out.print(test[4]);
        } 
          catch(Exception e)
                    {
                           message = "Error Detected";
                           Interceptor in = new ConcreteInterceptor();
                           Dispatcher.getInstance().register(in);
                           Dispatcher.getInstance().dispatch(new ConcreteContext(Level.SEVERE, e, message));
                    }
    }
}
