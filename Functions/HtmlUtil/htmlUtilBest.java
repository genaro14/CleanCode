public class htmlUtilBest {
    // Listing 3-3
    public static String renderPageWith
     
    SetupsAndTeardowns(
             PageData pageData, boolean isSuite) 
             throws Exception {
                if (isTestPage(pageData))
                    includeSetupAndTeardownPages(pageData, isSuite);
            return pageData.getHtml();
    }
    
}
