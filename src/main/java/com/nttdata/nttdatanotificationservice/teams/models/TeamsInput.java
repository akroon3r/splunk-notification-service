package com.nttdata.nttdatanotificationservice.teams.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class TeamsInput {

  private String type;
  private String id;
  private Boolean isMultiline;
  private String title;
  private Boolean isMultiSelect;
  private ArrayList<TeamsChoice> choices = new ArrayList<>();


  public TeamsInput(String id, String type, String title) {
    this.type = type;
    this.id = id;
    this.title = title;
  }

  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public String getId() {
    return id;
  }

  public Boolean getMultiline() {
    return isMultiline;
  }

  public String getTitle() {
    return title;
  }

  public Boolean getMultiSelect() {
    return isMultiSelect;
  }

  public ArrayList<TeamsChoice> getChoices() {
    return choices;
  }

  public void addChoice(TeamsChoice choice) {
    this.choices.add(choice);
  }

  public static TeamsInput defaultTeamsInput(String id, String type, String title) {
    return new TeamsInput(id, type, title);
  }


  public void setType(String type) {
    this.type = type;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setMultiline(Boolean multiline) {
    isMultiline = multiline;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setMultiSelect(Boolean multiSelect) {
    isMultiSelect = multiSelect;
  }
}