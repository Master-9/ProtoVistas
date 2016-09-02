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
import com.vaadin.ui.ComboBox;
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
        Button btn_register_ps = new Button("Crear Usuario",new Button.ClickListener() {
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

       
        btn_login.setDescription("Ingresar");
        btn_login.setHeight("40px");
        btn_login.setWidth("130px");
        
        
        btn_register_ps.setDescription("Crear un nuevo Usuario");
        btn_register_ps.setHeight("40px");
        btn_register_ps.setWidth("130px");
        
        
        
        final HorizontalLayout hor = new HorizontalLayout();
        
        
        hor.setDefaultComponentAlignment(Alignment.MIDDLE_RIGHT);
        
       
        Resource logo = new ThemeResource("gsami3.jpg");
        HorizontalLayout panelSupe= new HorizontalLayout();
        panelSupe.addComponents(btn_login,btn_register_ps);
        panelSupe.setWidth("280px");
        
        
        HorizontalLayout panelIzq= new HorizontalLayout();
        ComboBox pais= new ComboBox("Elija un Pais");
		pais.addItem("Venezuela");
		pais.addItem("Colombia");
		pais.addItem("Uruguay");
		pais.addItem("España");
		pais.addItem("Escocia");
		pais.addItem("Egipto");
		pais.addItem("Panana");
		pais.addItem("United States");
		pais.addItem("United Kingdom");
		pais.setNullSelectionAllowed(false);
		panelIzq.addComponents(pais);
		panelIzq.setStyleName("izq");
       
        
        hor.addComponents(panelIzq,panelSupe);
        hor.setStyleName("barraSup");
        //panelSupe.setSpacing(true);
        //panelSupe.setMargin(true);
        hor.setSizeFull();
        hor.setHeight("80px");
        //panelSupe.setContent(hor);
        

        
        
        Panel barra= new Panel();
        barra.setSizeUndefined();
        barra.setIcon(logo);
        addComponents(hor,barra);
        setComponentAlignment(hor, Alignment.TOP_LEFT);
        hor.setComponentAlignment(panelIzq, Alignment.TOP_LEFT);
        
        setComponentAlignment(barra, Alignment.TOP_CENTER);
        
        
        //setMargin(true);
        setSpacing(true);
        setHeight("800px");
        		
	}
	

	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		//Notification.show("Tipos de Registros en Gsami para Médicos");
	}

}
