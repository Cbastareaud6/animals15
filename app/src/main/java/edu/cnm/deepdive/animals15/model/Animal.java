package edu.cnm.deepdive.animals15.model;

import androidx.annotation.NonNull;
import com.google.gson.annotations.Expose;

import com.google.gson.annotations.SerializedName;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class Animal {

  @Expose
  private UUID uuid;

  @Expose
  private String created;

  @Expose
  private String title;

  @Expose
  @SerializedName("href")
  private String imageUrl;

  @Expose
  private String description;

  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @NonNull
  @Override
  public String toString() {
    return title;
  }
}
