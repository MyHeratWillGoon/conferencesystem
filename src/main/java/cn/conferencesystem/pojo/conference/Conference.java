package cn.conferencesystem.pojo.conference;


public class Conference {

  private long id;
  private String conferenceTitle;
  private long population;
  private java.sql.Timestamp beginTime;
  private java.sql.Timestamp endTime;
  private String remark;
  private long dId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getConferenceTitle() {
    return conferenceTitle;
  }

  public void setConferenceTitle(String conferenceTitle) {
    this.conferenceTitle = conferenceTitle;
  }


  public long getPopulation() {
    return population;
  }

  public void setPopulation(long population) {
    this.population = population;
  }


  public java.sql.Timestamp getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(java.sql.Timestamp beginTime) {
    this.beginTime = beginTime;
  }


  public java.sql.Timestamp getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Timestamp endTime) {
    this.endTime = endTime;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public long getDId() {
    return dId;
  }

  public void setDId(long dId) {
    this.dId = dId;
  }

}
