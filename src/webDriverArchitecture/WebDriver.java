package webDriverArchitecture;

public interface WebDriver extends SearchContext
{
  @Override
  public void findElement(String element);
  
  public void get(String url);
  
  public String getTitle();
  
  public void click(String element);
  
  public void sendKeys(String element,String Value);
  
  public void close();
  
  
}
