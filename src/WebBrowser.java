public class WebBrowser {
  private String pageUrl;

  public WebBrowser(String pageUrl) {
    this.pageUrl = pageUrl;
  }

  public String getPageUrl() {
    return pageUrl;
  }

  public void setPageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
  }

  public void showPage(String pageUrl) {
    System.out.println("Mostrando página: " + pageUrl);
  }

  public void openNewTab() {
    System.out.println("Nova guia aberta");
  }

  public void refreshPage() {
    System.out.println("Página recarregada");
  }
}
