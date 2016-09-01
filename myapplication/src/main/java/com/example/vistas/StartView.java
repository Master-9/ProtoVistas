package com.example.vistas;

import java.util.ArrayList;
import java.util.Collection;

import com.example.pruebaDB.MyUI;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Resource;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

/*
 * Este view será la portada del prototipo
 */
public class StartView extends VerticalLayout implements View {
	public final static String VIEW_NAME="";
	Navigator nav;
	
	
	/*
	 * Este view será la portada del prototipo
	 * debe tener hacer login
	 * debe tener la opcion de registrarse
	 */
	public StartView(){
	 
        final TextField name = new TextField();
        name.setCaption("Escriba su nombre aqui:");
        
        final TextField nameer = new TextField();
        name.setCaption("Escriba su nombre aqui:PPPP");

       
        
        
       
        
        setStyleName("ini");            
        //Resource regRap= new ThemeResource("can-stock-photo_csp5222148.jpg");
        
        /*Nav button to doctor  register view */
        Button btn_register_ps = new Button("Registrarse",new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI ui= UI.getCurrent();
				RegistrarUser uu= new RegistrarUser();
			    ui.addWindow(uu);
			}
		});

        /*Nav button to login view*/
        Button btn_login = new Button("Entrar", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI ui = UI.getCurrent();
				//nav = ui.getNavigator();
				//nav.navigateTo(LoginView.VIEW_NAME);
			
				Autenticar vv= new Autenticar();
				ui.addWindow(vv);
				/*
				ArrayList<Window> modals= new ArrayList<>();
				Collection<Window> los= ui.getWindows();
				for(Window j:los){
					modals.add(j);
				}
				modals.get(0).setVisible(true);
				*/
				
			}
		});
    
        setSpacing(true);

       
        btn_login.setDescription("Login");
        btn_login.setHeight("40px");
        btn_login.setWidth("110px");
        
        
        btn_register_ps.setDescription("Registrar Medico");
        btn_register_ps.setHeight("40px");
        btn_register_ps.setWidth("110px");
        
        
        
        final HorizontalLayout hor = new HorizontalLayout();
        
        
        hor.setDefaultComponentAlignment(Alignment.MIDDLE_RIGHT);
        
       
        
        HorizontalLayout panelSupe= new HorizontalLayout();
        panelSupe.addComponents(btn_login,btn_register_ps);
        panelSupe.setWidth("240px");
        hor.addComponents(panelSupe);
        hor.setStyleName("barraSup");
        //panelSupe.setSpacing(true);
        //panelSupe.setMargin(true);
        hor.setSizeFull();
        hor.setHeight("80px");
        //panelSupe.setContent(hor);
        addComponents(hor);
        setComponentAlignment(hor, Alignment.TOP_CENTER);
        setMargin(true);
        setSpacing(true);
        setHeight("800px");
        		
	}
	

	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		//Notification.show("Tipos de Registros en Gsami para Médicos");
	}

}
