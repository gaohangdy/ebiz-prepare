package com.eshop;

import com.eshop.ejb.entity.NewsEntity;
import com.eshop.ejb.facade.NewsEntityFacade;
import static java.lang.System.out;
import java.util.Iterator;
import java.util.List;
import javax.ejb.EJB;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {

    private static final long serialVersionUID = 1L;
//    @EJB
//    private EnterpriseMessage enterpriseMessage;
    @EJB
    private NewsEntityFacade newsEntityFacade;

    public HomePage(final PageParameters parameters) {
//		super(parameters);
//
//		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));

        // TODO Add your page's components here
        super(parameters);
        List news = newsEntityFacade.findAll();
        for (Iterator it = news.iterator(); it.hasNext();) {
            NewsEntity elem = (NewsEntity) it.next();
            out.println(" <b>" + elem.getTitle() + " </b><br />");
            out.println(elem.getBody() + "<br /> ");
        }
        add(new Label("message", news.get(0).toString()));

    }
}
