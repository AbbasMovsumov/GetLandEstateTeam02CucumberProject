package getLandEstate.pages;

public class Pages {
    public Pages(){}

    private ContactPage contactPage;
    private ControlPanelAdvertsPage controlPanelAdvertsPage;
    private ControlPanelAdvertTypesPage controlPanelAdvertTypesPage;
    private ControlPanelCategoriesPage controlPanelCategoriesPage;
    private ControlPanelContactMessagesPage controlPanelContactMessagesPage;
    private ControlPanelDashboardPage controlPanelDashboardPage;
    private ControlPanelReportsPage controlPanelReportsPage;
    private ControlPanelTourRequestsPage controlPanelTourRequestsPage;
    private ControlPanelUsersPage controlPanelUsersPage;
    private HomePage homePage;
    private LoginPage loginPage;
    private MyAdvertsPage myAdvertsPage;
    private MyFavoritesPage myFavoritesPage;
    private MyProfilePage myProfilePage;
    private MyTourRequestsPage myTourRequestsPage;
    private NewAdvertsPage newAdvertsPage;
    private PropertiesPage propertiesPage;
    private RegisterPage registerPage;


    public ContactPage contactPage(){
        if (contactPage == null){
            contactPage = new ContactPage();
        }
        return contactPage;
    }
    public ControlPanelAdvertsPage controlPanelAdvertsPage(){
        if (controlPanelAdvertsPage == null){
            controlPanelAdvertsPage = new ControlPanelAdvertsPage();
        }
        return controlPanelAdvertsPage;
    }
    public ControlPanelAdvertTypesPage controlPanelAdvertTypesPage(){
        if (controlPanelAdvertTypesPage == null){
            controlPanelAdvertTypesPage = new ControlPanelAdvertTypesPage();
        }
        return controlPanelAdvertTypesPage;
    }
    public ControlPanelCategoriesPage controlPanelCategoriesPage(){
        if (controlPanelCategoriesPage == null){
            controlPanelCategoriesPage = new ControlPanelCategoriesPage();
        }
        return controlPanelCategoriesPage;
    }
    public ControlPanelContactMessagesPage controlPanelContactMessagesPage(){
        if (controlPanelContactMessagesPage == null){
            controlPanelContactMessagesPage = new ControlPanelContactMessagesPage();
        }
        return controlPanelContactMessagesPage;
    }
    public ControlPanelDashboardPage controlPanelDashboardPage(){
        if (controlPanelDashboardPage == null){
            controlPanelDashboardPage = new ControlPanelDashboardPage();
        }
        return controlPanelDashboardPage;
    }
    public ControlPanelReportsPage controlPanelReportsPage(){
        if (controlPanelReportsPage == null){
            controlPanelReportsPage = new ControlPanelReportsPage();
        }
        return controlPanelReportsPage;
    }
    public ControlPanelTourRequestsPage controlPanelTourRequestsPage(){
        if (controlPanelTourRequestsPage == null){
            controlPanelTourRequestsPage = new ControlPanelTourRequestsPage();
        }
        return controlPanelTourRequestsPage;
    }
    public ControlPanelUsersPage controlPanelUsersPage(){
        if (controlPanelUsersPage == null){
            controlPanelUsersPage = new ControlPanelUsersPage();
        }
        return controlPanelUsersPage;
    }
    public HomePage homePage(){
        if (homePage == null){
            homePage = new HomePage();
        }
        return homePage;
    }
    public LoginPage loginPage(){
        if (loginPage == null){
            loginPage = new LoginPage();
        }
        return loginPage;
    }
    public MyAdvertsPage myAdvertsPage(){
        if (myAdvertsPage == null){
            myAdvertsPage = new MyAdvertsPage();
        }
        return myAdvertsPage;
    }
    public MyFavoritesPage myFavoritesPage(){
        if (myFavoritesPage == null){
            myFavoritesPage = new MyFavoritesPage();
        }
        return myFavoritesPage;
    }
    public MyProfilePage myProfilePage(){
        if (myProfilePage == null){
            myProfilePage = new MyProfilePage();
        }
        return myProfilePage;
    }
    public MyTourRequestsPage myTourRequestsPage(){
        if (myTourRequestsPage == null){
            myTourRequestsPage = new MyTourRequestsPage();
        }
        return myTourRequestsPage;
    }
    public NewAdvertsPage newAdvertsPage(){
        if (newAdvertsPage == null){
            newAdvertsPage = new NewAdvertsPage();
        }
        return newAdvertsPage;
    }
    public PropertiesPage propertiesPage(){
        if (propertiesPage == null){
            propertiesPage = new PropertiesPage();
        }
        return propertiesPage;
    }
    public RegisterPage registerPage(){
        if (registerPage == null){
            registerPage = new RegisterPage();
        }
        return registerPage;
    }
}
