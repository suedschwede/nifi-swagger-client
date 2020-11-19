# SiteToSiteApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPeers**](SiteToSiteApi.md#getPeers) | **GET** /site-to-site/peers | Returns the available Peers and its status of this NiFi
[**getSiteToSiteDetails**](SiteToSiteApi.md#getSiteToSiteDetails) | **GET** /site-to-site | Returns the details about this NiFi necessary to communicate via site to site


<a name="getPeers"></a>
# **getPeers**
> PeersEntity getPeers()

Returns the available Peers and its status of this NiFi



### Example
```java
// Import classes:
//import at.mic.nifi.swagger.ApiException;
//import at.mic.nifi.swagger.client.SiteToSiteApi;


SiteToSiteApi apiInstance = new SiteToSiteApi();
try {
    PeersEntity result = apiInstance.getPeers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteToSiteApi#getPeers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PeersEntity**](PeersEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/xml

<a name="getSiteToSiteDetails"></a>
# **getSiteToSiteDetails**
> ControllerEntity getSiteToSiteDetails()

Returns the details about this NiFi necessary to communicate via site to site



### Example
```java
// Import classes:
//import at.mic.nifi.swagger.ApiException;
//import at.mic.nifi.swagger.client.SiteToSiteApi;


SiteToSiteApi apiInstance = new SiteToSiteApi();
try {
    ControllerEntity result = apiInstance.getSiteToSiteDetails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteToSiteApi#getSiteToSiteDetails");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ControllerEntity**](ControllerEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

