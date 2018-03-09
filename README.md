# marketcheck-cars-api-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>marketcheck-cars-api-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:marketcheck-cars-api-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/marketcheck-cars-api-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.DealerApi;

public class DealerApiExample {

    public static void main(String[] args) {
        DealerApi apiInstance = new DealerApi();
        Double latitude = 3.4D; // Double | Latitude component of location
        Double longitude = 3.4D; // Double | Longitude component of location
        Integer radius = 56; // Integer | Radius around the search location
        String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
        Integer rows = 56; // Integer | Number of results to return. Default is 10. Max is 50
        Integer start = 56; // Integer | Offset for the search results. Default is 1.
        try {
            DealersResponse result = apiInstance.dealerSearch(latitude, longitude, radius, apiKey, rows, start);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DealerApi#dealerSearch");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://marketcheck-prod.apigee.net/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DealerApi* | [**dealerSearch**](docs/DealerApi.md#dealerSearch) | **GET** /dealers | Find car dealers around
*DealerApi* | [**getDealer**](docs/DealerApi.md#getDealer) | **GET** /dealer/{dealer_id} | Dealer by id
*DealerApi* | [**getDealerActiveInventory**](docs/DealerApi.md#getDealerActiveInventory) | **GET** /dealer/{dealer_id}/active/inventory | Dealer inventory
*DealerApi* | [**getDealerHistoricalInventory**](docs/DealerApi.md#getDealerHistoricalInventory) | **GET** /dealer/{dealer_id}/historical/inventory | Dealer&#39;s historical inventory
*DealerApi* | [**getDealerLandingPage**](docs/DealerApi.md#getDealerLandingPage) | **GET** /dealer/{dealer_id}/landing | Experimental: Get cached version of dealer landing page by dealer id
*DealerApi* | [**getDealerRatings**](docs/DealerApi.md#getDealerRatings) | **GET** /dealer/{dealer_id}/ratings | Dealer&#39;s Rating
*DealerApi* | [**getDealerReviews**](docs/DealerApi.md#getDealerReviews) | **GET** /dealer/{dealer_id}/reviews | Dealer&#39;s Review
*FacetsApi* | [**getFacets**](docs/FacetsApi.md#getFacets) | **GET** /facets | Facets
*GraphsApi* | [**getPriceMilesPlotData**](docs/GraphsApi.md#getPriceMilesPlotData) | **GET** /plots | Price, Miles plots data for given criteria
*HistoryApi* | [**history**](docs/HistoryApi.md#history) | **GET** /history/{vin} | Get a cars online listing history
*InventoryApi* | [**getDealerActiveInventory**](docs/InventoryApi.md#getDealerActiveInventory) | **GET** /dealer/{dealer_id}/active/inventory | Dealer inventory
*InventoryApi* | [**getDealerHistoricalInventory**](docs/InventoryApi.md#getDealerHistoricalInventory) | **GET** /dealer/{dealer_id}/historical/inventory | Dealer&#39;s historical inventory
*ListingsApi* | [**getListing**](docs/ListingsApi.md#getListing) | **GET** /listing/{id} | Listing by id
*ListingsApi* | [**getListingExtra**](docs/ListingsApi.md#getListingExtra) | **GET** /listing/{id}/extra | Long text Listings attributes for Listing with the given id
*ListingsApi* | [**getListingMedia**](docs/ListingsApi.md#getListingMedia) | **GET** /listing/{id}/media | Listing media by id
*ListingsApi* | [**getListingVDP**](docs/ListingsApi.md#getListingVDP) | **GET** /listing/{id}/vdp | Get listing HTML
*ListingsApi* | [**getSummaryReport**](docs/ListingsApi.md#getSummaryReport) | **GET** /vin_report_summary | Get Summary Report
*ListingsApi* | [**search**](docs/ListingsApi.md#search) | **GET** /search | Gets active car listings for the given search criteria
*MarketApi* | [**getAverages**](docs/MarketApi.md#getAverages) | **GET** /averages | [MOCK] Get Averages for YMM
*MarketApi* | [**getComparison**](docs/MarketApi.md#getComparison) | **GET** /comparison | Compare market
*MarketApi* | [**getCompetition**](docs/MarketApi.md#getCompetition) | **GET** /competition | Competitors
*MarketApi* | [**getDepreciation**](docs/MarketApi.md#getDepreciation) | **GET** /depreciation | Depreciation
*MarketApi* | [**getMDS**](docs/MarketApi.md#getMDS) | **GET** /mds | Market Days Supply
*MarketApi* | [**getPopularity**](docs/MarketApi.md#getPopularity) | **GET** /popularity | Popularity
*MarketApi* | [**getTrends**](docs/MarketApi.md#getTrends) | **GET** /trends | Get Trends for criteria
*VINDecoderApi* | [**decode**](docs/VINDecoderApi.md#decode) | **GET** /vin/{vin}/specs | VIN Decoder
*VINDecoderApi* | [**getEconomy**](docs/VINDecoderApi.md#getEconomy) | **GET** /economy | Get Economy based on environmental factors
*VINDecoderApi* | [**getEfficiency**](docs/VINDecoderApi.md#getEfficiency) | **GET** /fuel_efficiency | Get fuel effeciency
*VINDecoderApi* | [**getSafetyRating**](docs/VINDecoderApi.md#getSafetyRating) | **GET** /safety | Get Safety Rating


## Documentation for Models

 - [Averages](docs/Averages.md)
 - [BaseListing](docs/BaseListing.md)
 - [Build](docs/Build.md)
 - [ComparisonPoint](docs/ComparisonPoint.md)
 - [CompetitorsCarDetails](docs/CompetitorsCarDetails.md)
 - [CompetitorsPoint](docs/CompetitorsPoint.md)
 - [CompetitorsSameCars](docs/CompetitorsSameCars.md)
 - [CompetitorsSimilarCars](docs/CompetitorsSimilarCars.md)
 - [Dealer](docs/Dealer.md)
 - [DealerLandingPage](docs/DealerLandingPage.md)
 - [DealerRating](docs/DealerRating.md)
 - [DealerReview](docs/DealerReview.md)
 - [DealersResponse](docs/DealersResponse.md)
 - [DepreciationPoint](docs/DepreciationPoint.md)
 - [DepreciationStats](docs/DepreciationStats.md)
 - [Economy](docs/Economy.md)
 - [Error](docs/Error.md)
 - [FacetItem](docs/FacetItem.md)
 - [FuelEfficiency](docs/FuelEfficiency.md)
 - [HistoricalListing](docs/HistoricalListing.md)
 - [Listing](docs/Listing.md)
 - [ListingDebugAttributes](docs/ListingDebugAttributes.md)
 - [ListingExtraAttributes](docs/ListingExtraAttributes.md)
 - [ListingMedia](docs/ListingMedia.md)
 - [ListingVDP](docs/ListingVDP.md)
 - [Location](docs/Location.md)
 - [MakeModel](docs/MakeModel.md)
 - [Mds](docs/Mds.md)
 - [PlotPoint](docs/PlotPoint.md)
 - [PopularityItem](docs/PopularityItem.md)
 - [RatingComponents](docs/RatingComponents.md)
 - [ReviewComponents](docs/ReviewComponents.md)
 - [SafetyRating](docs/SafetyRating.md)
 - [SearchResponse](docs/SearchResponse.md)
 - [TrendPoint](docs/TrendPoint.md)
 - [VinReport](docs/VinReport.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



