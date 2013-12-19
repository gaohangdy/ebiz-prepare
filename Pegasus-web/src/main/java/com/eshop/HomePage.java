package com.eshop;

import com.eshop.ejb.EnterpriseMessage;
import javax.ejb.EJB;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;
	@EJB
	private EnterpriseMessage enterpriseMessage;
	public HomePage(final PageParameters parameters) {
//		super(parameters);
//
//		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));

		// TODO Add your page's components here
		super(parameters);

		add(new Label("message", enterpriseMessage.message));                

    }
}
