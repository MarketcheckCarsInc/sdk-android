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
 * Describes the dealer landing page (SRP) HTML object
 **/
@ApiModel(description = "Describes the dealer landing page (SRP) HTML object")
public class DealerLandingPage {
  
  @SerializedName("html")
  private String html = null;
  @SerializedName("crawled_at")
  private BigDecimal crawledAt = null;
  @SerializedName("srp_url")
  private String srpUrl = null;

  /**
   * The HTML string for the listing web page
   **/
  @ApiModelProperty(value = "The HTML string for the listing web page")
  public String getHtml() {
    return html;
  }
  public void setHtml(String html) {
    this.html = html;
  }

  /**
   * The timestamp indicating the time when the SRP was cached
   **/
  @ApiModelProperty(value = "The timestamp indicating the time when the SRP was cached")
  public BigDecimal getCrawledAt() {
    return crawledAt;
  }
  public void setCrawledAt(BigDecimal crawledAt) {
    this.crawledAt = crawledAt;
  }

  /**
   * The URL of the SRP
   **/
  @ApiModelProperty(value = "The URL of the SRP")
  public String getSrpUrl() {
    return srpUrl;
  }
  public void setSrpUrl(String srpUrl) {
    this.srpUrl = srpUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealerLandingPage dealerLandingPage = (DealerLandingPage) o;
    return (this.html == null ? dealerLandingPage.html == null : this.html.equals(dealerLandingPage.html)) &&
        (this.crawledAt == null ? dealerLandingPage.crawledAt == null : this.crawledAt.equals(dealerLandingPage.crawledAt)) &&
        (this.srpUrl == null ? dealerLandingPage.srpUrl == null : this.srpUrl.equals(dealerLandingPage.srpUrl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.html == null ? 0: this.html.hashCode());
    result = 31 * result + (this.crawledAt == null ? 0: this.crawledAt.hashCode());
    result = 31 * result + (this.srpUrl == null ? 0: this.srpUrl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealerLandingPage {\n");
    
    sb.append("  html: ").append(html).append("\n");
    sb.append("  crawledAt: ").append(crawledAt).append("\n");
    sb.append("  srpUrl: ").append(srpUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
