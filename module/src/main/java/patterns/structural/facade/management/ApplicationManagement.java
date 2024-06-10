package patterns.structural.facade.management;

import patterns.structural.facade.SmartManager;
import patterns.structural.facade.application.Application;

public class ApplicationManagement implements SmartManager<Application> {

    @Override
    public void download(Application application) {
        System.out.println("Downloaded application " + application.getName());
    }

    @Override
    public String getProperties(Application application) {
        return "Application{" +
                "\n" + "name=" + application.getName() +
                "\n" + "category=" + application.getCategory() +
                "\n" +  "MB=" + application.getMb() +
                "\n" +  '}';
    }
}
