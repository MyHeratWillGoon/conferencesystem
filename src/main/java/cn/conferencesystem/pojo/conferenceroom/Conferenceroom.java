package cn.conferencesystem.pojo.conferenceroom;


public class Conferenceroom {

  private long id;
  private long roomNo;
  private String roonName;
  private String roomCapacity;
  private long status;
  private String remark;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getRoomNo() {
    return roomNo;
  }

  public void setRoomNo(long roomNo) {
    this.roomNo = roomNo;
  }


  public String getRoonName() {
    return roonName;
  }

  public void setRoonName(String roonName) {
    this.roonName = roonName;
  }


  public String getRoomCapacity() {
    return roomCapacity;
  }

  public void setRoomCapacity(String roomCapacity) {
    this.roomCapacity = roomCapacity;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
