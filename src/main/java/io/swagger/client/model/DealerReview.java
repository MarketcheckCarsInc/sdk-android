/**
 * Marketcheck Cars API
 * <b>Access the New, Used and Certified cars inventories for all Car Dealers in US.</b> <br/>The data is sourced from online listings by over 44,000 Car dealers in US. At any time, there are about 6.2M searchable listings (about 1.9M unique VINs) for Used & Certified cars and about 6.6M (about 3.9M unique VINs) New Car listings from all over US. We use this API at the back for our website <a href='https://www.marketcheck.com' target='_blank'>www.marketcheck.com</a> and our Android and iOS mobile apps too.<br/><h5> Few useful links : </h5><ul><li>A quick view of the API and the use cases is depicated <a href='https://portals.marketcheck.com/mcapi/' target='_blank'>here</a></li><li>The Postman collection with various usages of the API is shared here https://www.getpostman.com/collections/2752684ff636cdd7bac2</li></ul>
 *
 * OpenAPI spec version: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.ReviewComponents;
import java.math.BigDecimal;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class DealerReview {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("street")
  private String street = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("state")
  private String state = null;
  @SerializedName("zip")
  private String zip = null;
  @SerializedName("latitude")
  private String latitude = null;
  @SerializedName("longitude")
  private String longitude = null;
  @SerializedName("overall_reviews")
  private BigDecimal overallReviews = null;
  @SerializedName("review_components")
  private List<ReviewComponents> reviewComponents = null;

  /**
   * Name of the dealer
   **/
  @ApiModelProperty(value = "Name of the dealer")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Street of the dealer
   **/
  @ApiModelProperty(value = "Street of the dealer")
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

  /**
   * City of the dealer
   **/
  @ApiModelProperty(value = "City of the dealer")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * State of the dealer
   **/
  @ApiModelProperty(value = "State of the dealer")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  /**
   * Zip of the dealer
   **/
  @ApiModelProperty(value = "Zip of the dealer")
  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }

  /**
   * Latutide for the dealer location
   **/
  @ApiModelProperty(value = "Latutide for the dealer location")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  /**
   * Longitude for the dealer location
   **/
  @ApiModelProperty(value = "Longitude for the dealer location")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  /**
   * Overall reviews of the dealership
   **/
  @ApiModelProperty(value = "Overall reviews of the dealership")
  public BigDecimal getOverallReviews() {
    return overallReviews;
  }
  public void setOverallReviews(BigDecimal overallReviews) {
    this.overallReviews = overallReviews;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ReviewComponents> getReviewComponents() {
    return reviewComponents;
  }
  public void setReviewComponents(List<ReviewComponents> reviewComponents) {
    this.reviewComponents = reviewComponents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealerReview dealerReview = (DealerReview) o;
    return (this.name == null ? dealerReview.name == null : this.name.equals(dealerReview.name)) &&
        (this.street == null ? dealerReview.street == null : this.street.equals(dealerReview.street)) &&
        (this.city == null ? dealerReview.city == null : this.city.equals(dealerReview.city)) &&
        (this.state == null ? dealerReview.state == null : this.state.equals(dealerReview.state)) &&
        (this.zip == null ? dealerReview.zip == null : this.zip.equals(dealerReview.zip)) &&
        (this.latitude == null ? dealerReview.latitude == null : this.latitude.equals(dealerReview.latitude)) &&
        (this.longitude == null ? dealerReview.longitude == null : this.longitude.equals(dealerReview.longitude)) &&
        (this.overallReviews == null ? dealerReview.overallReviews == null : this.overallReviews.equals(dealerReview.overallReviews)) &&
        (this.reviewComponents == null ? dealerReview.reviewComponents == null : this.reviewComponents.equals(dealerReview.reviewComponents));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.street == null ? 0: this.street.hashCode());
    result = 31 * result + (this.city == null ? 0: this.city.hashCode());
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    result = 31 * result + (this.zip == null ? 0: this.zip.hashCode());
    result = 31 * result + (this.latitude == null ? 0: this.latitude.hashCode());
    result = 31 * result + (this.longitude == null ? 0: this.longitude.hashCode());
    result = 31 * result + (this.overallReviews == null ? 0: this.overallReviews.hashCode());
    result = 31 * result + (this.reviewComponents == null ? 0: this.reviewComponents.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealerReview {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  street: ").append(street).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  zip: ").append(zip).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  overallReviews: ").append(overallReviews).append("\n");
    sb.append("  reviewComponents: ").append(reviewComponents).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
