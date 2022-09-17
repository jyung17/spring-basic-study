package com.fastcampus.ch2;

public class User {
  private String id;
  private String password;
  private String email;
  private String birth;
  private String sns;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getBirth() {
    return birth;
  }

  public void setBirth(String birth) {
    this.birth = birth;
  }

  public String getSns() {
    return sns;
  }

  public void setSns(String sns) {
    this.sns = sns;
  }

  @Override
  public String toString() {
    return "User{" +
        "id='" + id + '\'' +
        ", password='" + password + '\'' +
        ", email='" + email + '\'' +
        ", birth='" + birth + '\'' +
        ", sns='" + sns + '\'' +
        '}';
  }
}

