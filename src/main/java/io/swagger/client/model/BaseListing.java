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

import io.swagger.client.model.Build;
import io.swagger.client.model.Dealer;
import io.swagger.client.model.ListingMedia;
import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Minimal set of attributes describing a listing
 **/
@ApiModel(description = "Minimal set of attributes describing a listing")
public class BaseListing {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("heading")
  private String heading = null;
  @SerializedName("vin")
  private String vin = null;
  @SerializedName("stock_no")
  private String stockNo = null;
  @SerializedName("price")
  private String price = null;
  @SerializedName("miles")
  private String miles = null;
  @SerializedName("inventory_type")
  private String inventoryType = null;
  @SerializedName("last_seen_at")
  private BigDecimal lastSeenAt = null;
  @SerializedName("last_seen_at_date")
  private String lastSeenAtDate = null;
  @SerializedName("scraped_at_date")
  private BigDecimal scrapedAtDate = null;
  @SerializedName("first_seen_at")
  private BigDecimal firstSeenAt = null;
  @SerializedName("first_seen_at_date")
  private String firstSeenAtDate = null;
  @SerializedName("ref_price")
  private String refPrice = null;
  @SerializedName("ref_miles")
  private String refMiles = null;
  @SerializedName("ref_price_dt")
  private Integer refPriceDt = null;
  @SerializedName("ref_miles_dt")
  private Integer refMilesDt = null;
  @SerializedName("dom")
  private BigDecimal dom = null;
  @SerializedName("dom_180")
  private BigDecimal dom180 = null;
  @SerializedName("dom_active")
  private BigDecimal domActive = null;
  @SerializedName("seller_type")
  private String sellerType = null;
  @SerializedName("exterior_color")
  private String exteriorColor = null;
  @SerializedName("interior_color")
  private String interiorColor = null;
  @SerializedName("vdp_url")
  private String vdpUrl = null;
  @SerializedName("source")
  private String source = null;
  @SerializedName("media")
  private ListingMedia media = null;
  @SerializedName("build")
  private Build build = null;
  @SerializedName("dealer")
  private Dealer dealer = null;
  @SerializedName("is_certified")
  private Integer isCertified = null;
  @SerializedName("distance")
  private BigDecimal distance = null;

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
   * Listing title as displayed on the source website
   **/
  @ApiModelProperty(value = "Listing title as displayed on the source website")
  public String getHeading() {
    return heading;
  }
  public void setHeading(String heading) {
    this.heading = heading;
  }

  /**
   * VIN for the car
   **/
  @ApiModelProperty(value = "VIN for the car")
  public String getVin() {
    return vin;
  }
  public void setVin(String vin) {
    this.vin = vin;
  }

  /**
   * Stock no of the car
   **/
  @ApiModelProperty(value = "Stock no of the car")
  public String getStockNo() {
    return stockNo;
  }
  public void setStockNo(String stockNo) {
    this.stockNo = stockNo;
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
   * Inventory type of car
   **/
  @ApiModelProperty(value = "Inventory type of car")
  public String getInventoryType() {
    return inventoryType;
  }
  public void setInventoryType(String inventoryType) {
    this.inventoryType = inventoryType;
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
   * Listing last seen at (most recent) date
   **/
  @ApiModelProperty(value = "Listing last seen at (most recent) date")
  public String getLastSeenAtDate() {
    return lastSeenAtDate;
  }
  public void setLastSeenAtDate(String lastSeenAtDate) {
    this.lastSeenAtDate = lastSeenAtDate;
  }

  /**
   * Listing first seen at first scraped date
   **/
  @ApiModelProperty(value = "Listing first seen at first scraped date")
  public BigDecimal getScrapedAtDate() {
    return scrapedAtDate;
  }
  public void setScrapedAtDate(BigDecimal scrapedAtDate) {
    this.scrapedAtDate = scrapedAtDate;
  }

  /**
   * Listing first seen at first scraped timestamp
   **/
  @ApiModelProperty(value = "Listing first seen at first scraped timestamp")
  public BigDecimal getFirstSeenAt() {
    return firstSeenAt;
  }
  public void setFirstSeenAt(BigDecimal firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
  }

  /**
   * Listing first seen at first scraped date
   **/
  @ApiModelProperty(value = "Listing first seen at first scraped date")
  public String getFirstSeenAtDate() {
    return firstSeenAtDate;
  }
  public void setFirstSeenAtDate(String firstSeenAtDate) {
    this.firstSeenAtDate = firstSeenAtDate;
  }

  /**
   * Last reported price for the car. If the asking price value is not or is available then the last_price could perhaps be used. last_price is the price for the car listed on the source website as of last_price_dt date
   **/
  @ApiModelProperty(value = "Last reported price for the car. If the asking price value is not or is available then the last_price could perhaps be used. last_price is the price for the car listed on the source website as of last_price_dt date")
  public String getRefPrice() {
    return refPrice;
  }
  public void setRefPrice(String refPrice) {
    this.refPrice = refPrice;
  }

  /**
   * Last Odometer reading / reported miles usage for the car. If the asking miles value is not or is available then the last_miles could perhaps be used. last_miles is the miles for the car listed on the source website as of last_miles_dt date
   **/
  @ApiModelProperty(value = "Last Odometer reading / reported miles usage for the car. If the asking miles value is not or is available then the last_miles could perhaps be used. last_miles is the miles for the car listed on the source website as of last_miles_dt date")
  public String getRefMiles() {
    return refMiles;
  }
  public void setRefMiles(String refMiles) {
    this.refMiles = refMiles;
  }

  /**
   * The date at which the last price was reported online. This is earlier to last_seen_date
   **/
  @ApiModelProperty(value = "The date at which the last price was reported online. This is earlier to last_seen_date")
  public Integer getRefPriceDt() {
    return refPriceDt;
  }
  public void setRefPriceDt(Integer refPriceDt) {
    this.refPriceDt = refPriceDt;
  }

  /**
   * The date at which the last miles was reported online. This is earlier to last_seen_date
   **/
  @ApiModelProperty(value = "The date at which the last miles was reported online. This is earlier to last_seen_date")
  public Integer getRefMilesDt() {
    return refMilesDt;
  }
  public void setRefMilesDt(Integer refMilesDt) {
    this.refMilesDt = refMilesDt;
  }

  /**
   * Days on Market value for the car based on current and historical listings found in the Marketcheck database for this car
   **/
  @ApiModelProperty(value = "Days on Market value for the car based on current and historical listings found in the Marketcheck database for this car")
  public BigDecimal getDom() {
    return dom;
  }
  public void setDom(BigDecimal dom) {
    this.dom = dom;
  }

  /**
   * Days on Market value for the car based on current and last 6 month listings found in the Marketcheck database for this car
   **/
  @ApiModelProperty(value = "Days on Market value for the car based on current and last 6 month listings found in the Marketcheck database for this car")
  public BigDecimal getDom180() {
    return dom180;
  }
  public void setDom180(BigDecimal dom180) {
    this.dom180 = dom180;
  }

  /**
   * Days on Market value for the car based on current and last 30 days listings found in the Marketcheck database for this car
   **/
  @ApiModelProperty(value = "Days on Market value for the car based on current and last 30 days listings found in the Marketcheck database for this car")
  public BigDecimal getDomActive() {
    return domActive;
  }
  public void setDomActive(BigDecimal domActive) {
    this.domActive = domActive;
  }

  /**
   * Seller type for the car
   **/
  @ApiModelProperty(value = "Seller type for the car")
  public String getSellerType() {
    return sellerType;
  }
  public void setSellerType(String sellerType) {
    this.sellerType = sellerType;
  }

  /**
   * Exterior color of the car
   **/
  @ApiModelProperty(value = "Exterior color of the car")
  public String getExteriorColor() {
    return exteriorColor;
  }
  public void setExteriorColor(String exteriorColor) {
    this.exteriorColor = exteriorColor;
  }

  /**
   * Interior color of the car
   **/
  @ApiModelProperty(value = "Interior color of the car")
  public String getInteriorColor() {
    return interiorColor;
  }
  public void setInteriorColor(String interiorColor) {
    this.interiorColor = interiorColor;
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
   * Source domain of the listing
   **/
  @ApiModelProperty(value = "Source domain of the listing")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * Car Media Attributes - main photo link/url and photo links
   **/
  @ApiModelProperty(value = "Car Media Attributes - main photo link/url and photo links")
  public ListingMedia getMedia() {
    return media;
  }
  public void setMedia(ListingMedia media) {
    this.media = media;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Build getBuild() {
    return build;
  }
  public void setBuild(Build build) {
    this.build = build;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Dealer getDealer() {
    return dealer;
  }
  public void setDealer(Dealer dealer) {
    this.dealer = dealer;
  }

  /**
   * Certified car
   **/
  @ApiModelProperty(value = "Certified car")
  public Integer getIsCertified() {
    return isCertified;
  }
  public void setIsCertified(Integer isCertified) {
    this.isCertified = isCertified;
  }

  /**
   * Distance of the car's location from the specified user lcoation
   **/
  @ApiModelProperty(value = "Distance of the car's location from the specified user lcoation")
  public BigDecimal getDistance() {
    return distance;
  }
  public void setDistance(BigDecimal distance) {
    this.distance = distance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseListing baseListing = (BaseListing) o;
    return (this.id == null ? baseListing.id == null : this.id.equals(baseListing.id)) &&
        (this.heading == null ? baseListing.heading == null : this.heading.equals(baseListing.heading)) &&
        (this.vin == null ? baseListing.vin == null : this.vin.equals(baseListing.vin)) &&
        (this.stockNo == null ? baseListing.stockNo == null : this.stockNo.equals(baseListing.stockNo)) &&
        (this.price == null ? baseListing.price == null : this.price.equals(baseListing.price)) &&
        (this.miles == null ? baseListing.miles == null : this.miles.equals(baseListing.miles)) &&
        (this.inventoryType == null ? baseListing.inventoryType == null : this.inventoryType.equals(baseListing.inventoryType)) &&
        (this.lastSeenAt == null ? baseListing.lastSeenAt == null : this.lastSeenAt.equals(baseListing.lastSeenAt)) &&
        (this.lastSeenAtDate == null ? baseListing.lastSeenAtDate == null : this.lastSeenAtDate.equals(baseListing.lastSeenAtDate)) &&
        (this.scrapedAtDate == null ? baseListing.scrapedAtDate == null : this.scrapedAtDate.equals(baseListing.scrapedAtDate)) &&
        (this.firstSeenAt == null ? baseListing.firstSeenAt == null : this.firstSeenAt.equals(baseListing.firstSeenAt)) &&
        (this.firstSeenAtDate == null ? baseListing.firstSeenAtDate == null : this.firstSeenAtDate.equals(baseListing.firstSeenAtDate)) &&
        (this.refPrice == null ? baseListing.refPrice == null : this.refPrice.equals(baseListing.refPrice)) &&
        (this.refMiles == null ? baseListing.refMiles == null : this.refMiles.equals(baseListing.refMiles)) &&
        (this.refPriceDt == null ? baseListing.refPriceDt == null : this.refPriceDt.equals(baseListing.refPriceDt)) &&
        (this.refMilesDt == null ? baseListing.refMilesDt == null : this.refMilesDt.equals(baseListing.refMilesDt)) &&
        (this.dom == null ? baseListing.dom == null : this.dom.equals(baseListing.dom)) &&
        (this.dom180 == null ? baseListing.dom180 == null : this.dom180.equals(baseListing.dom180)) &&
        (this.domActive == null ? baseListing.domActive == null : this.domActive.equals(baseListing.domActive)) &&
        (this.sellerType == null ? baseListing.sellerType == null : this.sellerType.equals(baseListing.sellerType)) &&
        (this.exteriorColor == null ? baseListing.exteriorColor == null : this.exteriorColor.equals(baseListing.exteriorColor)) &&
        (this.interiorColor == null ? baseListing.interiorColor == null : this.interiorColor.equals(baseListing.interiorColor)) &&
        (this.vdpUrl == null ? baseListing.vdpUrl == null : this.vdpUrl.equals(baseListing.vdpUrl)) &&
        (this.source == null ? baseListing.source == null : this.source.equals(baseListing.source)) &&
        (this.media == null ? baseListing.media == null : this.media.equals(baseListing.media)) &&
        (this.build == null ? baseListing.build == null : this.build.equals(baseListing.build)) &&
        (this.dealer == null ? baseListing.dealer == null : this.dealer.equals(baseListing.dealer)) &&
        (this.isCertified == null ? baseListing.isCertified == null : this.isCertified.equals(baseListing.isCertified)) &&
        (this.distance == null ? baseListing.distance == null : this.distance.equals(baseListing.distance));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.heading == null ? 0: this.heading.hashCode());
    result = 31 * result + (this.vin == null ? 0: this.vin.hashCode());
    result = 31 * result + (this.stockNo == null ? 0: this.stockNo.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.miles == null ? 0: this.miles.hashCode());
    result = 31 * result + (this.inventoryType == null ? 0: this.inventoryType.hashCode());
    result = 31 * result + (this.lastSeenAt == null ? 0: this.lastSeenAt.hashCode());
    result = 31 * result + (this.lastSeenAtDate == null ? 0: this.lastSeenAtDate.hashCode());
    result = 31 * result + (this.scrapedAtDate == null ? 0: this.scrapedAtDate.hashCode());
    result = 31 * result + (this.firstSeenAt == null ? 0: this.firstSeenAt.hashCode());
    result = 31 * result + (this.firstSeenAtDate == null ? 0: this.firstSeenAtDate.hashCode());
    result = 31 * result + (this.refPrice == null ? 0: this.refPrice.hashCode());
    result = 31 * result + (this.refMiles == null ? 0: this.refMiles.hashCode());
    result = 31 * result + (this.refPriceDt == null ? 0: this.refPriceDt.hashCode());
    result = 31 * result + (this.refMilesDt == null ? 0: this.refMilesDt.hashCode());
    result = 31 * result + (this.dom == null ? 0: this.dom.hashCode());
    result = 31 * result + (this.dom180 == null ? 0: this.dom180.hashCode());
    result = 31 * result + (this.domActive == null ? 0: this.domActive.hashCode());
    result = 31 * result + (this.sellerType == null ? 0: this.sellerType.hashCode());
    result = 31 * result + (this.exteriorColor == null ? 0: this.exteriorColor.hashCode());
    result = 31 * result + (this.interiorColor == null ? 0: this.interiorColor.hashCode());
    result = 31 * result + (this.vdpUrl == null ? 0: this.vdpUrl.hashCode());
    result = 31 * result + (this.source == null ? 0: this.source.hashCode());
    result = 31 * result + (this.media == null ? 0: this.media.hashCode());
    result = 31 * result + (this.build == null ? 0: this.build.hashCode());
    result = 31 * result + (this.dealer == null ? 0: this.dealer.hashCode());
    result = 31 * result + (this.isCertified == null ? 0: this.isCertified.hashCode());
    result = 31 * result + (this.distance == null ? 0: this.distance.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseListing {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  heading: ").append(heading).append("\n");
    sb.append("  vin: ").append(vin).append("\n");
    sb.append("  stockNo: ").append(stockNo).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  miles: ").append(miles).append("\n");
    sb.append("  inventoryType: ").append(inventoryType).append("\n");
    sb.append("  lastSeenAt: ").append(lastSeenAt).append("\n");
    sb.append("  lastSeenAtDate: ").append(lastSeenAtDate).append("\n");
    sb.append("  scrapedAtDate: ").append(scrapedAtDate).append("\n");
    sb.append("  firstSeenAt: ").append(firstSeenAt).append("\n");
    sb.append("  firstSeenAtDate: ").append(firstSeenAtDate).append("\n");
    sb.append("  refPrice: ").append(refPrice).append("\n");
    sb.append("  refMiles: ").append(refMiles).append("\n");
    sb.append("  refPriceDt: ").append(refPriceDt).append("\n");
    sb.append("  refMilesDt: ").append(refMilesDt).append("\n");
    sb.append("  dom: ").append(dom).append("\n");
    sb.append("  dom180: ").append(dom180).append("\n");
    sb.append("  domActive: ").append(domActive).append("\n");
    sb.append("  sellerType: ").append(sellerType).append("\n");
    sb.append("  exteriorColor: ").append(exteriorColor).append("\n");
    sb.append("  interiorColor: ").append(interiorColor).append("\n");
    sb.append("  vdpUrl: ").append(vdpUrl).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  media: ").append(media).append("\n");
    sb.append("  build: ").append(build).append("\n");
    sb.append("  dealer: ").append(dealer).append("\n");
    sb.append("  isCertified: ").append(isCertified).append("\n");
    sb.append("  distance: ").append(distance).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
