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

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Represents a car history entry
 **/
@ApiModel(description = "Represents a car history entry")
public class HistoricalListing {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("price")
  private String price = null;
  @SerializedName("msrp")
  private String msrp = null;
  @SerializedName("miles")
  private String miles = null;
  @SerializedName("vdp_url")
  private String vdpUrl = null;
  @SerializedName("seller_name")
  private String sellerName = null;
  @SerializedName("scraped_at")
  private BigDecimal scrapedAt = null;
  @SerializedName("last_seen_at")
  private BigDecimal lastSeenAt = null;
  @SerializedName("source")
  private String source = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("state")
  private String state = null;
  @SerializedName("zip")
  private String zip = null;

  /**
   * Unique identifier representing a specific listing from the Marketcheck database
   **/
  @ApiModelProperty(value = "Unique identifier representing a specific listing from the Marketcheck database")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Asking price for the car
   **/
  @ApiModelProperty(value = "Asking price for the car")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * MSRP for the car
   **/
  @ApiModelProperty(value = "MSRP for the car")
  public String getMsrp() {
    return msrp;
  }
  public void setMsrp(String msrp) {
    this.msrp = msrp;
  }

  /**
   * Odometer reading / reported miles usage for the car
   **/
  @ApiModelProperty(value = "Odometer reading / reported miles usage for the car")
  public String getMiles() {
    return miles;
  }
  public void setMiles(String miles) {
    this.miles = miles;
  }

  /**
   * Vehicle Details Page url of the specific car
   **/
  @ApiModelProperty(value = "Vehicle Details Page url of the specific car")
  public String getVdpUrl() {
    return vdpUrl;
  }
  public void setVdpUrl(String vdpUrl) {
    this.vdpUrl = vdpUrl;
  }

  /**
   * Seller name of the listing from the Marketcheck database
   **/
  @ApiModelProperty(value = "Seller name of the listing from the Marketcheck database")
  public String getSellerName() {
    return sellerName;
  }
  public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
  }

  /**
   * Listing scraped at timestamp
   **/
  @ApiModelProperty(value = "Listing scraped at timestamp")
  public BigDecimal getScrapedAt() {
    return scrapedAt;
  }
  public void setScrapedAt(BigDecimal scrapedAt) {
    this.scrapedAt = scrapedAt;
  }

  /**
   * Listing last seen at (most recent) timestamp
   **/
  @ApiModelProperty(value = "Listing last seen at (most recent) timestamp")
  public BigDecimal getLastSeenAt() {
    return lastSeenAt;
  }
  public void setLastSeenAt(BigDecimal lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
  }

  /**
   * Source website for the listing
   **/
  @ApiModelProperty(value = "Source website for the listing")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * City of the listing
   **/
  @ApiModelProperty(value = "City of the listing")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * State of the listing
   **/
  @ApiModelProperty(value = "State of the listing")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  /**
   * Zip of the listing
   **/
  @ApiModelProperty(value = "Zip of the listing")
  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalListing historicalListing = (HistoricalListing) o;
    return (this.id == null ? historicalListing.id == null : this.id.equals(historicalListing.id)) &&
        (this.price == null ? historicalListing.price == null : this.price.equals(historicalListing.price)) &&
        (this.msrp == null ? historicalListing.msrp == null : this.msrp.equals(historicalListing.msrp)) &&
        (this.miles == null ? historicalListing.miles == null : this.miles.equals(historicalListing.miles)) &&
        (this.vdpUrl == null ? historicalListing.vdpUrl == null : this.vdpUrl.equals(historicalListing.vdpUrl)) &&
        (this.sellerName == null ? historicalListing.sellerName == null : this.sellerName.equals(historicalListing.sellerName)) &&
        (this.scrapedAt == null ? historicalListing.scrapedAt == null : this.scrapedAt.equals(historicalListing.scrapedAt)) &&
        (this.lastSeenAt == null ? historicalListing.lastSeenAt == null : this.lastSeenAt.equals(historicalListing.lastSeenAt)) &&
        (this.source == null ? historicalListing.source == null : this.source.equals(historicalListing.source)) &&
        (this.city == null ? historicalListing.city == null : this.city.equals(historicalListing.city)) &&
        (this.state == null ? historicalListing.state == null : this.state.equals(historicalListing.state)) &&
        (this.zip == null ? historicalListing.zip == null : this.zip.equals(historicalListing.zip));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.msrp == null ? 0: this.msrp.hashCode());
    result = 31 * result + (this.miles == null ? 0: this.miles.hashCode());
    result = 31 * result + (this.vdpUrl == null ? 0: this.vdpUrl.hashCode());
    result = 31 * result + (this.sellerName == null ? 0: this.sellerName.hashCode());
    result = 31 * result + (this.scrapedAt == null ? 0: this.scrapedAt.hashCode());
    result = 31 * result + (this.lastSeenAt == null ? 0: this.lastSeenAt.hashCode());
    result = 31 * result + (this.source == null ? 0: this.source.hashCode());
    result = 31 * result + (this.city == null ? 0: this.city.hashCode());
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    result = 31 * result + (this.zip == null ? 0: this.zip.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalListing {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  msrp: ").append(msrp).append("\n");
    sb.append("  miles: ").append(miles).append("\n");
    sb.append("  vdpUrl: ").append(vdpUrl).append("\n");
    sb.append("  sellerName: ").append(sellerName).append("\n");
    sb.append("  scrapedAt: ").append(scrapedAt).append("\n");
    sb.append("  lastSeenAt: ").append(lastSeenAt).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  zip: ").append(zip).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
