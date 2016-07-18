package gwt.material.design.jscore.client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import gwt.material.design.jscore.client.api.Console;
import gwt.material.design.jscore.client.api.JSON;
import gwt.material.design.jscore.client.api.Window;

/**
 *
 * @author Cristian Rinaldi
 */
public class JSNI {
    
    public final static native Console createConsole() /*-{
        return $wnd.console;
    }-*/;
    
    public final static native Window createWindow() /*-{
        return $wnd;
    }-*/;
    
    public final static native JSON createJSON() /*-{
        return $wnd.JSON;
    }-*/;
    
}
