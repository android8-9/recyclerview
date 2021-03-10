package com.cheekupeeku.testrecyclerview;

import java.io.Serializable;

public class User implements Serializable {
  private int imageId;
  private String name;
  private String mobile;
   public User(){}
    public User(int imageId, String name, String mobile) {
        this.imageId = imageId;
        this.name = name;
        this.mobile = mobile;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
