package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContentProvider {
  @JsonProperty("id")
  private Integer id = null;
  @JsonProperty("name")
  private String name = null;
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentProvider {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

