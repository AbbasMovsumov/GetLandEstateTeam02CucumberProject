package getLandEstate.pages;

public class Pages {
    public Pages(){}

    private ContactPage contactPage;

    private CPAdvertsPage CPAdvertsPage;
    private CPAdvertTypesPage CPAdvertTypesPage;
    private CPCategoriesPage CPCategoriesPage;
    private CPContactMessagesPage CPContactMessagesPage;
    private CPDashboardPage CPDashboardPage;
    private CPReportsPage CPReportsPage;
    private CPTourRequestsPage controlPanelTourRequestsPage;
    private CPUsersPage CPUsersPage;
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

        public CPAdvertsPage controlPanelAdvertsPage(){
            if (CPAdvertsPage == null){
                CPAdvertsPage = new CPAdvertsPage();
            }
            return CPAdvertsPage;
        }
        public CPAdvertTypesPage controlPanelAdvertTypesPage(){
            if (CPAdvertTypesPage == null){
                CPAdvertTypesPage = new CPAdvertTypesPage();
            }
            return CPAdvertTypesPage;
        }
        public CPCategoriesPage controlPanelCategoriesPage(){
            if (CPCategoriesPage == null){
                CPCategoriesPage = new CPCategoriesPage();
            }
            return CPCategoriesPage;
        }
        public CPContactMessagesPage controlPanelContactMessagesPage(){
            if (CPContactMessagesPage == null){
                CPContactMessagesPage = new CPContactMessagesPage();
            }
            return CPContactMessagesPage;
        }
        public CPDashboardPage controlPanelDashboardPage(){
            if (CPDashboardPage == null){
                CPDashboardPage = new CPDashboardPage();
            }
            return CPDashboardPage;
        }
        public CPReportsPage controlPanelReportsPage(){
            if (CPReportsPage == null){
                CPReportsPage = new CPReportsPage();
            }
            return CPReportsPage;
        }
        public CPTourRequestsPage controlPanelTourRequestsPage(){
            if (controlPanelTourRequestsPage == null){
                controlPanelTourRequestsPage = new CPTourRequestsPage();
            }
            return controlPanelTourRequestsPage;
        }
        public CPUsersPage controlPanelUsersPage(){
            if (CPUsersPage == null){
                CPUsersPage = new CPUsersPage();
            }
            return CPUsersPage;

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