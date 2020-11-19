# FunnelApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFunnel**](FunnelApi.md#getFunnel) | **GET** /funnels/{id} | Gets a funnel
[**removeFunnel**](FunnelApi.md#removeFunnel) | **DELETE** /funnels/{id} | Deletes a funnel
[**updateFunnel**](FunnelApi.md#updateFunnel) | **PUT** /funnels/{id} | Updates a funnel


<a name="getFunnel"></a>
# **getFunnel**
> FunnelEntity getFunnel(id)

Gets a funnel



### Example
```java
// Import classes:
//import at.mic.nifi.swagger.ApiException;
//import at.mic.nifi.swagger.client.FunnelApi;


FunnelApi apiInstance = new FunnelApi();
String id = "id_example"; // String | The funnel id.
try {
    FunnelEntity result = apiInstance.getFunnel(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FunnelApi#getFunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The funnel id. |

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="removeFunnel"></a>
# **removeFunnel**
> FunnelEntity removeFunnel(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a funnel



### Example
```java
// Import classes:
//import at.mic.nifi.swagger.ApiException;
//import at.mic.nifi.swagger.client.FunnelApi;


FunnelApi apiInstance = new FunnelApi();
String id = "id_example"; // String | The funnel id.
String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    FunnelEntity result = apiInstance.removeFunnel(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FunnelApi#removeFunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The funnel id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="updateFunnel"></a>
# **updateFunnel**
> FunnelEntity updateFunnel(id, body)

Updates a funnel



### Example
```java
// Import classes:
//import at.mic.nifi.swagger.ApiException;
//import at.mic.nifi.swagger.client.FunnelApi;


FunnelApi apiInstance = new FunnelApi();
String id = "id_example"; // String | The funnel id.
FunnelEntity body = new FunnelEntity(); // FunnelEntity | The funnel configuration details.
try {
    FunnelEntity result = apiInstance.updateFunnel(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FunnelApi#updateFunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The funnel id. |
 **body** | [**FunnelEntity**](FunnelEntity.md)| The funnel configuration details. |

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

