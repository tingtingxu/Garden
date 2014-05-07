import java.util.*

pulic class TestRepository{
  private java.util.Date today;
  private String testStatus;
  private String location;
  private String platform;
  
  public TestRepository(java.util.Date today, String location, String platform){
    this.today = today;
    this.location = location;
    this.platform = platform;
  }
  
  public String testRepo(String strInput){
    if(strInput!=null && strInput.length>0){
      testStatus = "Successful";
    }else if(strInput.length ==0){
      testStatus = "Well...Waiting for input...";
    }else{
      testStatus = "Bad Timing...Try next time."
    }
    return testStatus;
  }
  
  public static void main(String[] args){
    TestRepository testRepo = new TestRepository(new Date(), "Office", "Windows 7");
    System.out.println("Here's the result: " + testRepo.testRepo());
  }
}
