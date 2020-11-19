# nifi-swagger-client

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
    <groupId>at.mic.nifi</groupId>
    <artifactId>nifi-swagger-client</artifactId>
    <version>1.1.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "at.mic.nifi:nifi-swagger-client:1.1.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/nifi-swagger-client-1.1.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import at.mic.nifi.swagger.*;
import at.mic.nifi.swagger.auth.*;
import at.mic.nifi.swagger.client.model.*;
import at.mic.nifi.swagger.client.AccessApi;

import java.io.File;
import java.util.*;

public class AccessApiExample {

    public static void main(String[] args) {
        
        AccessApi apiInstance = new AccessApi();
        String username = "username_example"; // String | 
        String password = "password_example"; // String | 
        try {
            String result = apiInstance.createAccessToken(username, password);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessApi#createAccessToken");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/nifi-api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccessApi* | [**createAccessToken**](docs/AccessApi.md#createAccessToken) | **POST** /access/token | Creates a token for accessing the REST API via username/password
*AccessApi* | [**createAccessTokenFromTicket**](docs/AccessApi.md#createAccessTokenFromTicket) | **POST** /access/kerberos | Creates a token for accessing the REST API via Kerberos ticket exchange / SPNEGO negotiation
*AccessApi* | [**createDownloadToken**](docs/AccessApi.md#createDownloadToken) | **POST** /access/download-token | Creates a single use access token for downloading FlowFile content.
*AccessApi* | [**createUiExtensionToken**](docs/AccessApi.md#createUiExtensionToken) | **POST** /access/ui-extension-token | Creates a single use access token for accessing a NiFi UI extension.
*AccessApi* | [**getAccessStatus**](docs/AccessApi.md#getAccessStatus) | **GET** /access | Gets the status the client&#39;s access
*AccessApi* | [**getLoginConfig**](docs/AccessApi.md#getLoginConfig) | **GET** /access/config | Retrieves the access configuration for this NiFi
*AccessApi* | [**knoxCallback**](docs/AccessApi.md#knoxCallback) | **GET** /access/knox/callback | Redirect/callback URI for processing the result of the Apache Knox login sequence.
*AccessApi* | [**knoxLogout**](docs/AccessApi.md#knoxLogout) | **GET** /access/knox/logout | Performs a logout in the Apache Knox.
*AccessApi* | [**knoxRequest**](docs/AccessApi.md#knoxRequest) | **GET** /access/knox/request | Initiates a request to authenticate through Apache Knox.
*AccessApi* | [**logOut**](docs/AccessApi.md#logOut) | **DELETE** /access/logout | Performs a logout for other providers that have been issued a JWT.
*AccessApi* | [**oidcCallback**](docs/AccessApi.md#oidcCallback) | **GET** /access/oidc/callback | Redirect/callback URI for processing the result of the OpenId Connect login sequence.
*AccessApi* | [**oidcExchange**](docs/AccessApi.md#oidcExchange) | **POST** /access/oidc/exchange | Retrieves a JWT following a successful login sequence using the configured OpenId Connect provider.
*AccessApi* | [**oidcLogout**](docs/AccessApi.md#oidcLogout) | **GET** /access/oidc/logout | Performs a logout in the OpenId Provider.
*AccessApi* | [**oidcRequest**](docs/AccessApi.md#oidcRequest) | **GET** /access/oidc/request | Initiates a request to authenticate through the configured OpenId Connect provider.
*ConnectionsApi* | [**deleteConnection**](docs/ConnectionsApi.md#deleteConnection) | **DELETE** /connections/{id} | Deletes a connection
*ConnectionsApi* | [**getConnection**](docs/ConnectionsApi.md#getConnection) | **GET** /connections/{id} | Gets a connection
*ConnectionsApi* | [**updateConnection**](docs/ConnectionsApi.md#updateConnection) | **PUT** /connections/{id} | Updates a connection
*ControllerApi* | [**createBulletin**](docs/ControllerApi.md#createBulletin) | **POST** /controller/bulletin | Creates a new bulletin
*ControllerApi* | [**createControllerService**](docs/ControllerApi.md#createControllerService) | **POST** /controller/controller-services | Creates a new controller service
*ControllerApi* | [**createRegistryClient**](docs/ControllerApi.md#createRegistryClient) | **POST** /controller/registry-clients | Creates a new registry client
*ControllerApi* | [**createReportingTask**](docs/ControllerApi.md#createReportingTask) | **POST** /controller/reporting-tasks | Creates a new reporting task
*ControllerApi* | [**deleteHistory**](docs/ControllerApi.md#deleteHistory) | **DELETE** /controller/history | Purges history
*ControllerApi* | [**deleteNode**](docs/ControllerApi.md#deleteNode) | **DELETE** /controller/cluster/nodes/{id} | Removes a node from the cluster
*ControllerApi* | [**deleteRegistryClient**](docs/ControllerApi.md#deleteRegistryClient) | **DELETE** /controller/registry-clients/{id} | Deletes a registry client
*ControllerApi* | [**getCluster**](docs/ControllerApi.md#getCluster) | **GET** /controller/cluster | Gets the contents of the cluster
*ControllerApi* | [**getControllerConfig**](docs/ControllerApi.md#getControllerConfig) | **GET** /controller/config | Retrieves the configuration for this NiFi Controller
*ControllerApi* | [**getNode**](docs/ControllerApi.md#getNode) | **GET** /controller/cluster/nodes/{id} | Gets a node in the cluster
*ControllerApi* | [**getRegistryClient**](docs/ControllerApi.md#getRegistryClient) | **GET** /controller/registry-clients/{id} | Gets a registry client
*ControllerApi* | [**getRegistryClients**](docs/ControllerApi.md#getRegistryClients) | **GET** /controller/registry-clients | Gets the listing of available registry clients
*ControllerApi* | [**updateControllerConfig**](docs/ControllerApi.md#updateControllerConfig) | **PUT** /controller/config | Retrieves the configuration for this NiFi
*ControllerApi* | [**updateNode**](docs/ControllerApi.md#updateNode) | **PUT** /controller/cluster/nodes/{id} | Updates a node in the cluster
*ControllerApi* | [**updateRegistryClient**](docs/ControllerApi.md#updateRegistryClient) | **PUT** /controller/registry-clients/{id} | Updates a registry client
*ControllerServicesApi* | [**clearState**](docs/ControllerServicesApi.md#clearState) | **POST** /controller-services/{id}/state/clear-requests | Clears the state for a controller service
*ControllerServicesApi* | [**getControllerService**](docs/ControllerServicesApi.md#getControllerService) | **GET** /controller-services/{id} | Gets a controller service
*ControllerServicesApi* | [**getControllerServiceReferences**](docs/ControllerServicesApi.md#getControllerServiceReferences) | **GET** /controller-services/{id}/references | Gets a controller service
*ControllerServicesApi* | [**getPropertyDescriptor**](docs/ControllerServicesApi.md#getPropertyDescriptor) | **GET** /controller-services/{id}/descriptors | Gets a controller service property descriptor
*ControllerServicesApi* | [**getState**](docs/ControllerServicesApi.md#getState) | **GET** /controller-services/{id}/state | Gets the state for a controller service
*ControllerServicesApi* | [**removeControllerService**](docs/ControllerServicesApi.md#removeControllerService) | **DELETE** /controller-services/{id} | Deletes a controller service
*ControllerServicesApi* | [**updateControllerService**](docs/ControllerServicesApi.md#updateControllerService) | **PUT** /controller-services/{id} | Updates a controller service
*ControllerServicesApi* | [**updateControllerServiceReferences**](docs/ControllerServicesApi.md#updateControllerServiceReferences) | **PUT** /controller-services/{id}/references | Updates a controller services references
*ControllerServicesApi* | [**updateRunStatus**](docs/ControllerServicesApi.md#updateRunStatus) | **PUT** /controller-services/{id}/run-status | Updates run status of a controller service
*CountersApi* | [**getCounters**](docs/CountersApi.md#getCounters) | **GET** /counters | Gets the current counters for this NiFi
*CountersApi* | [**updateCounter**](docs/CountersApi.md#updateCounter) | **PUT** /counters/{id} | Updates the specified counter. This will reset the counter value to 0
*DataTransferApi* | [**commitInputPortTransaction**](docs/DataTransferApi.md#commitInputPortTransaction) | **DELETE** /data-transfer/input-ports/{portId}/transactions/{transactionId} | Commit or cancel the specified transaction
*DataTransferApi* | [**commitOutputPortTransaction**](docs/DataTransferApi.md#commitOutputPortTransaction) | **DELETE** /data-transfer/output-ports/{portId}/transactions/{transactionId} | Commit or cancel the specified transaction
*DataTransferApi* | [**createPortTransaction**](docs/DataTransferApi.md#createPortTransaction) | **POST** /data-transfer/{portType}/{portId}/transactions | Create a transaction to the specified output port or input port
*DataTransferApi* | [**extendInputPortTransactionTTL**](docs/DataTransferApi.md#extendInputPortTransactionTTL) | **PUT** /data-transfer/input-ports/{portId}/transactions/{transactionId} | Extend transaction TTL
*DataTransferApi* | [**extendOutputPortTransactionTTL**](docs/DataTransferApi.md#extendOutputPortTransactionTTL) | **PUT** /data-transfer/output-ports/{portId}/transactions/{transactionId} | Extend transaction TTL
*DataTransferApi* | [**receiveFlowFiles**](docs/DataTransferApi.md#receiveFlowFiles) | **POST** /data-transfer/input-ports/{portId}/transactions/{transactionId}/flow-files | Transfer flow files to the input port
*DataTransferApi* | [**transferFlowFiles**](docs/DataTransferApi.md#transferFlowFiles) | **GET** /data-transfer/output-ports/{portId}/transactions/{transactionId}/flow-files | Transfer flow files from the output port
*FlowApi* | [**activateControllerServices**](docs/FlowApi.md#activateControllerServices) | **PUT** /flow/process-groups/{id}/controller-services | Enable or disable Controller Services in the specified Process Group.
*FlowApi* | [**generateClientId**](docs/FlowApi.md#generateClientId) | **GET** /flow/client-id | Generates a client id.
*FlowApi* | [**getAboutInfo**](docs/FlowApi.md#getAboutInfo) | **GET** /flow/about | Retrieves details about this NiFi to put in the About dialog
*FlowApi* | [**getAction**](docs/FlowApi.md#getAction) | **GET** /flow/history/{id} | Gets an action
*FlowApi* | [**getBanners**](docs/FlowApi.md#getBanners) | **GET** /flow/banners | Retrieves the banners for this NiFi
*FlowApi* | [**getBuckets**](docs/FlowApi.md#getBuckets) | **GET** /flow/registries/{id}/buckets | Gets the buckets from the specified registry for the current user
*FlowApi* | [**getBulletinBoard**](docs/FlowApi.md#getBulletinBoard) | **GET** /flow/bulletin-board | Gets current bulletins
*FlowApi* | [**getBulletins**](docs/FlowApi.md#getBulletins) | **GET** /flow/controller/bulletins | Retrieves Controller level bulletins
*FlowApi* | [**getClusterSummary**](docs/FlowApi.md#getClusterSummary) | **GET** /flow/cluster/summary | The cluster summary for this NiFi
*FlowApi* | [**getComponentHistory**](docs/FlowApi.md#getComponentHistory) | **GET** /flow/history/components/{componentId} | Gets configuration history for a component
*FlowApi* | [**getConnectionStatistics**](docs/FlowApi.md#getConnectionStatistics) | **GET** /flow/connections/{id}/statistics | Gets statistics for a connection
*FlowApi* | [**getConnectionStatus**](docs/FlowApi.md#getConnectionStatus) | **GET** /flow/connections/{id}/status | Gets status for a connection
*FlowApi* | [**getConnectionStatusHistory**](docs/FlowApi.md#getConnectionStatusHistory) | **GET** /flow/connections/{id}/status/history | Gets the status history for a connection
*FlowApi* | [**getControllerServiceTypes**](docs/FlowApi.md#getControllerServiceTypes) | **GET** /flow/controller-service-types | Retrieves the types of controller services that this NiFi supports
*FlowApi* | [**getControllerServicesFromController**](docs/FlowApi.md#getControllerServicesFromController) | **GET** /flow/controller/controller-services | Gets controller services for reporting tasks
*FlowApi* | [**getControllerServicesFromGroup**](docs/FlowApi.md#getControllerServicesFromGroup) | **GET** /flow/process-groups/{id}/controller-services | Gets all controller services
*FlowApi* | [**getControllerStatus**](docs/FlowApi.md#getControllerStatus) | **GET** /flow/status | Gets the current status of this NiFi
*FlowApi* | [**getCurrentUser**](docs/FlowApi.md#getCurrentUser) | **GET** /flow/current-user | Retrieves the user identity of the user making the request
*FlowApi* | [**getFlow**](docs/FlowApi.md#getFlow) | **GET** /flow/process-groups/{id} | Gets a process group
*FlowApi* | [**getFlowConfig**](docs/FlowApi.md#getFlowConfig) | **GET** /flow/config | Retrieves the configuration for this NiFi flow
*FlowApi* | [**getFlowMetrics**](docs/FlowApi.md#getFlowMetrics) | **GET** /flow/metrics/{producer} | Gets all metrics for the flow from a particular node
*FlowApi* | [**getFlows**](docs/FlowApi.md#getFlows) | **GET** /flow/registries/{registry-id}/buckets/{bucket-id}/flows | Gets the flows from the specified registry and bucket for the current user
*FlowApi* | [**getInputPortStatus**](docs/FlowApi.md#getInputPortStatus) | **GET** /flow/input-ports/{id}/status | Gets status for an input port
*FlowApi* | [**getOutputPortStatus**](docs/FlowApi.md#getOutputPortStatus) | **GET** /flow/output-ports/{id}/status | Gets status for an output port
*FlowApi* | [**getParameterContexts**](docs/FlowApi.md#getParameterContexts) | **GET** /flow/parameter-contexts | Gets all Parameter Contexts
*FlowApi* | [**getPrioritizers**](docs/FlowApi.md#getPrioritizers) | **GET** /flow/prioritizers | Retrieves the types of prioritizers that this NiFi supports
*FlowApi* | [**getProcessGroupStatus**](docs/FlowApi.md#getProcessGroupStatus) | **GET** /flow/process-groups/{id}/status | Gets the status for a process group
*FlowApi* | [**getProcessGroupStatusHistory**](docs/FlowApi.md#getProcessGroupStatusHistory) | **GET** /flow/process-groups/{id}/status/history | Gets status history for a remote process group
*FlowApi* | [**getProcessorStatus**](docs/FlowApi.md#getProcessorStatus) | **GET** /flow/processors/{id}/status | Gets status for a processor
*FlowApi* | [**getProcessorStatusHistory**](docs/FlowApi.md#getProcessorStatusHistory) | **GET** /flow/processors/{id}/status/history | Gets status history for a processor
*FlowApi* | [**getProcessorTypes**](docs/FlowApi.md#getProcessorTypes) | **GET** /flow/processor-types | Retrieves the types of processors that this NiFi supports
*FlowApi* | [**getRegistries**](docs/FlowApi.md#getRegistries) | **GET** /flow/registries | Gets the listing of available registries
*FlowApi* | [**getRemoteProcessGroupStatus**](docs/FlowApi.md#getRemoteProcessGroupStatus) | **GET** /flow/remote-process-groups/{id}/status | Gets status for a remote process group
*FlowApi* | [**getRemoteProcessGroupStatusHistory**](docs/FlowApi.md#getRemoteProcessGroupStatusHistory) | **GET** /flow/remote-process-groups/{id}/status/history | Gets the status history
*FlowApi* | [**getReportingTaskTypes**](docs/FlowApi.md#getReportingTaskTypes) | **GET** /flow/reporting-task-types | Retrieves the types of reporting tasks that this NiFi supports
*FlowApi* | [**getReportingTasks**](docs/FlowApi.md#getReportingTasks) | **GET** /flow/reporting-tasks | Gets all reporting tasks
*FlowApi* | [**getTemplates**](docs/FlowApi.md#getTemplates) | **GET** /flow/templates | Gets all templates
*FlowApi* | [**getVersions**](docs/FlowApi.md#getVersions) | **GET** /flow/registries/{registry-id}/buckets/{bucket-id}/flows/{flow-id}/versions | Gets the flow versions from the specified registry and bucket for the specified flow for the current user
*FlowApi* | [**queryHistory**](docs/FlowApi.md#queryHistory) | **GET** /flow/history | Gets configuration history
*FlowApi* | [**scheduleComponents**](docs/FlowApi.md#scheduleComponents) | **PUT** /flow/process-groups/{id} | Schedule or unschedule components in the specified Process Group.
*FlowApi* | [**searchCluster**](docs/FlowApi.md#searchCluster) | **GET** /flow/cluster/search-results | Searches the cluster for a node with the specified address
*FlowApi* | [**searchFlow**](docs/FlowApi.md#searchFlow) | **GET** /flow/search-results | Performs a search against this NiFi using the specified search term
*FlowfileQueuesApi* | [**createDropRequest**](docs/FlowfileQueuesApi.md#createDropRequest) | **POST** /flowfile-queues/{id}/drop-requests | Creates a request to drop the contents of the queue in this connection.
*FlowfileQueuesApi* | [**createFlowFileListing**](docs/FlowfileQueuesApi.md#createFlowFileListing) | **POST** /flowfile-queues/{id}/listing-requests | Lists the contents of the queue in this connection.
*FlowfileQueuesApi* | [**deleteListingRequest**](docs/FlowfileQueuesApi.md#deleteListingRequest) | **DELETE** /flowfile-queues/{id}/listing-requests/{listing-request-id} | Cancels and/or removes a request to list the contents of this connection.
*FlowfileQueuesApi* | [**downloadFlowFileContent**](docs/FlowfileQueuesApi.md#downloadFlowFileContent) | **GET** /flowfile-queues/{id}/flowfiles/{flowfile-uuid}/content | Gets the content for a FlowFile in a Connection.
*FlowfileQueuesApi* | [**getDropRequest**](docs/FlowfileQueuesApi.md#getDropRequest) | **GET** /flowfile-queues/{id}/drop-requests/{drop-request-id} | Gets the current status of a drop request for the specified connection.
*FlowfileQueuesApi* | [**getFlowFile**](docs/FlowfileQueuesApi.md#getFlowFile) | **GET** /flowfile-queues/{id}/flowfiles/{flowfile-uuid} | Gets a FlowFile from a Connection.
*FlowfileQueuesApi* | [**getListingRequest**](docs/FlowfileQueuesApi.md#getListingRequest) | **GET** /flowfile-queues/{id}/listing-requests/{listing-request-id} | Gets the current status of a listing request for the specified connection.
*FlowfileQueuesApi* | [**removeDropRequest**](docs/FlowfileQueuesApi.md#removeDropRequest) | **DELETE** /flowfile-queues/{id}/drop-requests/{drop-request-id} | Cancels and/or removes a request to drop the contents of this connection.
*FunnelApi* | [**getFunnel**](docs/FunnelApi.md#getFunnel) | **GET** /funnels/{id} | Gets a funnel
*FunnelApi* | [**removeFunnel**](docs/FunnelApi.md#removeFunnel) | **DELETE** /funnels/{id} | Deletes a funnel
*FunnelApi* | [**updateFunnel**](docs/FunnelApi.md#updateFunnel) | **PUT** /funnels/{id} | Updates a funnel
*InputPortsApi* | [**getInputPort**](docs/InputPortsApi.md#getInputPort) | **GET** /input-ports/{id} | Gets an input port
*InputPortsApi* | [**removeInputPort**](docs/InputPortsApi.md#removeInputPort) | **DELETE** /input-ports/{id} | Deletes an input port
*InputPortsApi* | [**updateInputPort**](docs/InputPortsApi.md#updateInputPort) | **PUT** /input-ports/{id} | Updates an input port
*InputPortsApi* | [**updateRunStatus**](docs/InputPortsApi.md#updateRunStatus) | **PUT** /input-ports/{id}/run-status | Updates run status of an input-port
*LabelsApi* | [**getLabel**](docs/LabelsApi.md#getLabel) | **GET** /labels/{id} | Gets a label
*LabelsApi* | [**removeLabel**](docs/LabelsApi.md#removeLabel) | **DELETE** /labels/{id} | Deletes a label
*LabelsApi* | [**updateLabel**](docs/LabelsApi.md#updateLabel) | **PUT** /labels/{id} | Updates a label
*OutputPortsApi* | [**getOutputPort**](docs/OutputPortsApi.md#getOutputPort) | **GET** /output-ports/{id} | Gets an output port
*OutputPortsApi* | [**removeOutputPort**](docs/OutputPortsApi.md#removeOutputPort) | **DELETE** /output-ports/{id} | Deletes an output port
*OutputPortsApi* | [**updateOutputPort**](docs/OutputPortsApi.md#updateOutputPort) | **PUT** /output-ports/{id} | Updates an output port
*OutputPortsApi* | [**updateRunStatus**](docs/OutputPortsApi.md#updateRunStatus) | **PUT** /output-ports/{id}/run-status | Updates run status of an output-port
*ParameterContextsApi* | [**createParameterContext**](docs/ParameterContextsApi.md#createParameterContext) | **POST** /parameter-contexts | Create a Parameter Context
*ParameterContextsApi* | [**deleteParameterContext**](docs/ParameterContextsApi.md#deleteParameterContext) | **DELETE** /parameter-contexts/{id} | Deletes the Parameter Context with the given ID
*ParameterContextsApi* | [**deleteUpdateRequest**](docs/ParameterContextsApi.md#deleteUpdateRequest) | **DELETE** /parameter-contexts/{contextId}/update-requests/{requestId} | Deletes the Update Request with the given ID
*ParameterContextsApi* | [**deleteValidationRequest**](docs/ParameterContextsApi.md#deleteValidationRequest) | **DELETE** /parameter-contexts/{contextId}/validation-requests/{id} | Deletes the Validation Request with the given ID
*ParameterContextsApi* | [**getParameterContext**](docs/ParameterContextsApi.md#getParameterContext) | **GET** /parameter-contexts/{id} | Returns the Parameter Context with the given ID
*ParameterContextsApi* | [**getParameterContextUpdate**](docs/ParameterContextsApi.md#getParameterContextUpdate) | **GET** /parameter-contexts/{contextId}/update-requests/{requestId} | Returns the Update Request with the given ID
*ParameterContextsApi* | [**getValidationRequest**](docs/ParameterContextsApi.md#getValidationRequest) | **GET** /parameter-contexts/{contextId}/validation-requests/{id} | Returns the Validation Request with the given ID
*ParameterContextsApi* | [**submitParameterContextUpdate**](docs/ParameterContextsApi.md#submitParameterContextUpdate) | **POST** /parameter-contexts/{contextId}/update-requests | Initiate the Update Request of a Parameter Context
*ParameterContextsApi* | [**submitValidationRequest**](docs/ParameterContextsApi.md#submitValidationRequest) | **POST** /parameter-contexts/{contextId}/validation-requests | Initiate a Validation Request to determine how the validity of components will change if a Parameter Context were to be updated
*ParameterContextsApi* | [**updateParameterContext**](docs/ParameterContextsApi.md#updateParameterContext) | **PUT** /parameter-contexts/{id} | Modifies a Parameter Context
*PoliciesApi* | [**createAccessPolicy**](docs/PoliciesApi.md#createAccessPolicy) | **POST** /policies | Creates an access policy
*PoliciesApi* | [**getAccessPolicy**](docs/PoliciesApi.md#getAccessPolicy) | **GET** /policies/{id} | Gets an access policy
*PoliciesApi* | [**getAccessPolicyForResource**](docs/PoliciesApi.md#getAccessPolicyForResource) | **GET** /policies/{action}/{resource} | Gets an access policy for the specified action and resource
*PoliciesApi* | [**removeAccessPolicy**](docs/PoliciesApi.md#removeAccessPolicy) | **DELETE** /policies/{id} | Deletes an access policy
*PoliciesApi* | [**updateAccessPolicy**](docs/PoliciesApi.md#updateAccessPolicy) | **PUT** /policies/{id} | Updates a access policy
*ProcessGroupsApi* | [**copySnippet**](docs/ProcessGroupsApi.md#copySnippet) | **POST** /process-groups/{id}/snippet-instance | Copies a snippet and discards it.
*ProcessGroupsApi* | [**createConnection**](docs/ProcessGroupsApi.md#createConnection) | **POST** /process-groups/{id}/connections | Creates a connection
*ProcessGroupsApi* | [**createControllerService**](docs/ProcessGroupsApi.md#createControllerService) | **POST** /process-groups/{id}/controller-services | Creates a new controller service
*ProcessGroupsApi* | [**createEmptyAllConnectionsRequest**](docs/ProcessGroupsApi.md#createEmptyAllConnectionsRequest) | **POST** /process-groups/{id}/empty-all-connections-requests | Creates a request to drop all flowfiles of all connection queues in this process group.
*ProcessGroupsApi* | [**createFunnel**](docs/ProcessGroupsApi.md#createFunnel) | **POST** /process-groups/{id}/funnels | Creates a funnel
*ProcessGroupsApi* | [**createInputPort**](docs/ProcessGroupsApi.md#createInputPort) | **POST** /process-groups/{id}/input-ports | Creates an input port
*ProcessGroupsApi* | [**createLabel**](docs/ProcessGroupsApi.md#createLabel) | **POST** /process-groups/{id}/labels | Creates a label
*ProcessGroupsApi* | [**createOutputPort**](docs/ProcessGroupsApi.md#createOutputPort) | **POST** /process-groups/{id}/output-ports | Creates an output port
*ProcessGroupsApi* | [**createProcessGroup**](docs/ProcessGroupsApi.md#createProcessGroup) | **POST** /process-groups/{id}/process-groups | Creates a process group
*ProcessGroupsApi* | [**createProcessor**](docs/ProcessGroupsApi.md#createProcessor) | **POST** /process-groups/{id}/processors | Creates a new processor
*ProcessGroupsApi* | [**createRemoteProcessGroup**](docs/ProcessGroupsApi.md#createRemoteProcessGroup) | **POST** /process-groups/{id}/remote-process-groups | Creates a new process group
*ProcessGroupsApi* | [**createTemplate**](docs/ProcessGroupsApi.md#createTemplate) | **POST** /process-groups/{id}/templates | Creates a template and discards the specified snippet.
*ProcessGroupsApi* | [**deleteReplaceProcessGroupRequest**](docs/ProcessGroupsApi.md#deleteReplaceProcessGroupRequest) | **DELETE** /process-groups/replace-requests/{id} | Deletes the Replace Request with the given ID
*ProcessGroupsApi* | [**deleteVariableRegistryUpdateRequest**](docs/ProcessGroupsApi.md#deleteVariableRegistryUpdateRequest) | **DELETE** /process-groups/{groupId}/variable-registry/update-requests/{updateId} | Deletes an update request for a process group&#39;s variable registry. If the request is not yet complete, it will automatically be cancelled.
*ProcessGroupsApi* | [**exportProcessGroup**](docs/ProcessGroupsApi.md#exportProcessGroup) | **GET** /process-groups/{id}/download | Gets a process group for download
*ProcessGroupsApi* | [**getConnections**](docs/ProcessGroupsApi.md#getConnections) | **GET** /process-groups/{id}/connections | Gets all connections
*ProcessGroupsApi* | [**getDropAllFlowfilesRequest**](docs/ProcessGroupsApi.md#getDropAllFlowfilesRequest) | **GET** /process-groups/{id}/empty-all-connections-requests/{drop-request-id} | Gets the current status of a drop all flowfiles request.
*ProcessGroupsApi* | [**getFunnels**](docs/ProcessGroupsApi.md#getFunnels) | **GET** /process-groups/{id}/funnels | Gets all funnels
*ProcessGroupsApi* | [**getInputPorts**](docs/ProcessGroupsApi.md#getInputPorts) | **GET** /process-groups/{id}/input-ports | Gets all input ports
*ProcessGroupsApi* | [**getLabels**](docs/ProcessGroupsApi.md#getLabels) | **GET** /process-groups/{id}/labels | Gets all labels
*ProcessGroupsApi* | [**getLocalModifications**](docs/ProcessGroupsApi.md#getLocalModifications) | **GET** /process-groups/{id}/local-modifications | Gets a list of local modifications to the Process Group since it was last synchronized with the Flow Registry
*ProcessGroupsApi* | [**getOutputPorts**](docs/ProcessGroupsApi.md#getOutputPorts) | **GET** /process-groups/{id}/output-ports | Gets all output ports
*ProcessGroupsApi* | [**getProcessGroup**](docs/ProcessGroupsApi.md#getProcessGroup) | **GET** /process-groups/{id} | Gets a process group
*ProcessGroupsApi* | [**getProcessGroups**](docs/ProcessGroupsApi.md#getProcessGroups) | **GET** /process-groups/{id}/process-groups | Gets all process groups
*ProcessGroupsApi* | [**getProcessors**](docs/ProcessGroupsApi.md#getProcessors) | **GET** /process-groups/{id}/processors | Gets all processors
*ProcessGroupsApi* | [**getRemoteProcessGroups**](docs/ProcessGroupsApi.md#getRemoteProcessGroups) | **GET** /process-groups/{id}/remote-process-groups | Gets all remote process groups
*ProcessGroupsApi* | [**getReplaceProcessGroupRequest**](docs/ProcessGroupsApi.md#getReplaceProcessGroupRequest) | **GET** /process-groups/replace-requests/{id} | Returns the Replace Request with the given ID
*ProcessGroupsApi* | [**getVariableRegistry**](docs/ProcessGroupsApi.md#getVariableRegistry) | **GET** /process-groups/{id}/variable-registry | Gets a process group&#39;s variable registry
*ProcessGroupsApi* | [**getVariableRegistryUpdateRequest**](docs/ProcessGroupsApi.md#getVariableRegistryUpdateRequest) | **GET** /process-groups/{groupId}/variable-registry/update-requests/{updateId} | Gets a process group&#39;s variable registry
*ProcessGroupsApi* | [**importTemplate**](docs/ProcessGroupsApi.md#importTemplate) | **POST** /process-groups/{id}/templates/import | Imports a template
*ProcessGroupsApi* | [**initiateReplaceProcessGroup**](docs/ProcessGroupsApi.md#initiateReplaceProcessGroup) | **POST** /process-groups/{id}/replace-requests | Initiate the Replace Request of a Process Group with the given ID
*ProcessGroupsApi* | [**instantiateTemplate**](docs/ProcessGroupsApi.md#instantiateTemplate) | **POST** /process-groups/{id}/template-instance | Instantiates a template
*ProcessGroupsApi* | [**removeDropRequest**](docs/ProcessGroupsApi.md#removeDropRequest) | **DELETE** /process-groups/{id}/empty-all-connections-requests/{drop-request-id} | Cancels and/or removes a request to drop all flowfiles.
*ProcessGroupsApi* | [**removeProcessGroup**](docs/ProcessGroupsApi.md#removeProcessGroup) | **DELETE** /process-groups/{id} | Deletes a process group
*ProcessGroupsApi* | [**replaceProcessGroup**](docs/ProcessGroupsApi.md#replaceProcessGroup) | **PUT** /process-groups/{id}/flow-contents | Replace Process Group contents with the given ID with the specified Process Group contents
*ProcessGroupsApi* | [**submitUpdateVariableRegistryRequest**](docs/ProcessGroupsApi.md#submitUpdateVariableRegistryRequest) | **POST** /process-groups/{id}/variable-registry/update-requests | Submits a request to update a process group&#39;s variable registry
*ProcessGroupsApi* | [**updateProcessGroup**](docs/ProcessGroupsApi.md#updateProcessGroup) | **PUT** /process-groups/{id} | Updates a process group
*ProcessGroupsApi* | [**updateVariableRegistry**](docs/ProcessGroupsApi.md#updateVariableRegistry) | **PUT** /process-groups/{id}/variable-registry | Updates the contents of a Process Group&#39;s variable Registry
*ProcessGroupsApi* | [**uploadTemplate**](docs/ProcessGroupsApi.md#uploadTemplate) | **POST** /process-groups/{id}/templates/upload | Uploads a template
*ProcessorsApi* | [**clearState**](docs/ProcessorsApi.md#clearState) | **POST** /processors/{id}/state/clear-requests | Clears the state for a processor
*ProcessorsApi* | [**deleteProcessor**](docs/ProcessorsApi.md#deleteProcessor) | **DELETE** /processors/{id} | Deletes a processor
*ProcessorsApi* | [**getProcessor**](docs/ProcessorsApi.md#getProcessor) | **GET** /processors/{id} | Gets a processor
*ProcessorsApi* | [**getProcessorDiagnostics**](docs/ProcessorsApi.md#getProcessorDiagnostics) | **GET** /processors/{id}/diagnostics | Gets diagnostics information about a processor
*ProcessorsApi* | [**getProcessorRunStatusDetails**](docs/ProcessorsApi.md#getProcessorRunStatusDetails) | **POST** /processors/run-status-details/queries | Submits a query to retrieve the run status details of all processors that are in the given list of Processor IDs
*ProcessorsApi* | [**getPropertyDescriptor**](docs/ProcessorsApi.md#getPropertyDescriptor) | **GET** /processors/{id}/descriptors | Gets the descriptor for a processor property
*ProcessorsApi* | [**getState**](docs/ProcessorsApi.md#getState) | **GET** /processors/{id}/state | Gets the state for a processor
*ProcessorsApi* | [**terminateProcessor**](docs/ProcessorsApi.md#terminateProcessor) | **DELETE** /processors/{id}/threads | Terminates a processor, essentially \&quot;deleting\&quot; its threads and any active tasks
*ProcessorsApi* | [**updateProcessor**](docs/ProcessorsApi.md#updateProcessor) | **PUT** /processors/{id} | Updates a processor
*ProcessorsApi* | [**updateRunStatus**](docs/ProcessorsApi.md#updateRunStatus) | **PUT** /processors/{id}/run-status | Updates run status of a processor
*ProvenanceApi* | [**deleteLineage**](docs/ProvenanceApi.md#deleteLineage) | **DELETE** /provenance/lineage/{id} | Deletes a lineage query
*ProvenanceApi* | [**deleteProvenance**](docs/ProvenanceApi.md#deleteProvenance) | **DELETE** /provenance/{id} | Deletes a provenance query
*ProvenanceApi* | [**getLineage**](docs/ProvenanceApi.md#getLineage) | **GET** /provenance/lineage/{id} | Gets a lineage query
*ProvenanceApi* | [**getProvenance**](docs/ProvenanceApi.md#getProvenance) | **GET** /provenance/{id} | Gets a provenance query
*ProvenanceApi* | [**getSearchOptions**](docs/ProvenanceApi.md#getSearchOptions) | **GET** /provenance/search-options | Gets the searchable attributes for provenance events
*ProvenanceApi* | [**submitLineageRequest**](docs/ProvenanceApi.md#submitLineageRequest) | **POST** /provenance/lineage | Submits a lineage query
*ProvenanceApi* | [**submitProvenanceRequest**](docs/ProvenanceApi.md#submitProvenanceRequest) | **POST** /provenance | Submits a provenance query
*ProvenanceEventsApi* | [**getInputContent**](docs/ProvenanceEventsApi.md#getInputContent) | **GET** /provenance-events/{id}/content/input | Gets the input content for a provenance event
*ProvenanceEventsApi* | [**getOutputContent**](docs/ProvenanceEventsApi.md#getOutputContent) | **GET** /provenance-events/{id}/content/output | Gets the output content for a provenance event
*ProvenanceEventsApi* | [**getProvenanceEvent**](docs/ProvenanceEventsApi.md#getProvenanceEvent) | **GET** /provenance-events/{id} | Gets a provenance event
*ProvenanceEventsApi* | [**submitReplay**](docs/ProvenanceEventsApi.md#submitReplay) | **POST** /provenance-events/replays | Replays content from a provenance event
*RemoteProcessGroupsApi* | [**getRemoteProcessGroup**](docs/RemoteProcessGroupsApi.md#getRemoteProcessGroup) | **GET** /remote-process-groups/{id} | Gets a remote process group
*RemoteProcessGroupsApi* | [**getState**](docs/RemoteProcessGroupsApi.md#getState) | **GET** /remote-process-groups/{id}/state | Gets the state for a RemoteProcessGroup
*RemoteProcessGroupsApi* | [**removeRemoteProcessGroup**](docs/RemoteProcessGroupsApi.md#removeRemoteProcessGroup) | **DELETE** /remote-process-groups/{id} | Deletes a remote process group
*RemoteProcessGroupsApi* | [**updateRemoteProcessGroup**](docs/RemoteProcessGroupsApi.md#updateRemoteProcessGroup) | **PUT** /remote-process-groups/{id} | Updates a remote process group
*RemoteProcessGroupsApi* | [**updateRemoteProcessGroupInputPort**](docs/RemoteProcessGroupsApi.md#updateRemoteProcessGroupInputPort) | **PUT** /remote-process-groups/{id}/input-ports/{port-id} | Updates a remote port
*RemoteProcessGroupsApi* | [**updateRemoteProcessGroupInputPortRunStatus**](docs/RemoteProcessGroupsApi.md#updateRemoteProcessGroupInputPortRunStatus) | **PUT** /remote-process-groups/{id}/input-ports/{port-id}/run-status | Updates run status of a remote port
*RemoteProcessGroupsApi* | [**updateRemoteProcessGroupOutputPort**](docs/RemoteProcessGroupsApi.md#updateRemoteProcessGroupOutputPort) | **PUT** /remote-process-groups/{id}/output-ports/{port-id} | Updates a remote port
*RemoteProcessGroupsApi* | [**updateRemoteProcessGroupOutputPortRunStatus**](docs/RemoteProcessGroupsApi.md#updateRemoteProcessGroupOutputPortRunStatus) | **PUT** /remote-process-groups/{id}/output-ports/{port-id}/run-status | Updates run status of a remote port
*RemoteProcessGroupsApi* | [**updateRemoteProcessGroupRunStatus**](docs/RemoteProcessGroupsApi.md#updateRemoteProcessGroupRunStatus) | **PUT** /remote-process-groups/{id}/run-status | Updates run status of a remote process group
*ReportingTasksApi* | [**clearState**](docs/ReportingTasksApi.md#clearState) | **POST** /reporting-tasks/{id}/state/clear-requests | Clears the state for a reporting task
*ReportingTasksApi* | [**getPropertyDescriptor**](docs/ReportingTasksApi.md#getPropertyDescriptor) | **GET** /reporting-tasks/{id}/descriptors | Gets a reporting task property descriptor
*ReportingTasksApi* | [**getReportingTask**](docs/ReportingTasksApi.md#getReportingTask) | **GET** /reporting-tasks/{id} | Gets a reporting task
*ReportingTasksApi* | [**getState**](docs/ReportingTasksApi.md#getState) | **GET** /reporting-tasks/{id}/state | Gets the state for a reporting task
*ReportingTasksApi* | [**removeReportingTask**](docs/ReportingTasksApi.md#removeReportingTask) | **DELETE** /reporting-tasks/{id} | Deletes a reporting task
*ReportingTasksApi* | [**updateReportingTask**](docs/ReportingTasksApi.md#updateReportingTask) | **PUT** /reporting-tasks/{id} | Updates a reporting task
*ReportingTasksApi* | [**updateRunStatus**](docs/ReportingTasksApi.md#updateRunStatus) | **PUT** /reporting-tasks/{id}/run-status | Updates run status of a reporting task
*ResourcesApi* | [**getResources**](docs/ResourcesApi.md#getResources) | **GET** /resources | Gets the available resources that support access/authorization policies
*SiteToSiteApi* | [**getPeers**](docs/SiteToSiteApi.md#getPeers) | **GET** /site-to-site/peers | Returns the available Peers and its status of this NiFi
*SiteToSiteApi* | [**getSiteToSiteDetails**](docs/SiteToSiteApi.md#getSiteToSiteDetails) | **GET** /site-to-site | Returns the details about this NiFi necessary to communicate via site to site
*SnippetsApi* | [**createSnippet**](docs/SnippetsApi.md#createSnippet) | **POST** /snippets | Creates a snippet. The snippet will be automatically discarded if not used in a subsequent request after 1 minute.
*SnippetsApi* | [**deleteSnippet**](docs/SnippetsApi.md#deleteSnippet) | **DELETE** /snippets/{id} | Deletes the components in a snippet and discards the snippet
*SnippetsApi* | [**updateSnippet**](docs/SnippetsApi.md#updateSnippet) | **PUT** /snippets/{id} | Move&#39;s the components in this Snippet into a new Process Group and discards the snippet
*SystemDiagnosticsApi* | [**getSystemDiagnostics**](docs/SystemDiagnosticsApi.md#getSystemDiagnostics) | **GET** /system-diagnostics | Gets the diagnostics for the system NiFi is running on
*TemplatesApi* | [**exportTemplate**](docs/TemplatesApi.md#exportTemplate) | **GET** /templates/{id}/download | Exports a template
*TemplatesApi* | [**removeTemplate**](docs/TemplatesApi.md#removeTemplate) | **DELETE** /templates/{id} | Deletes a template
*TenantsApi* | [**createUser**](docs/TenantsApi.md#createUser) | **POST** /tenants/users | Creates a user
*TenantsApi* | [**createUserGroup**](docs/TenantsApi.md#createUserGroup) | **POST** /tenants/user-groups | Creates a user group
*TenantsApi* | [**getUser**](docs/TenantsApi.md#getUser) | **GET** /tenants/users/{id} | Gets a user
*TenantsApi* | [**getUserGroup**](docs/TenantsApi.md#getUserGroup) | **GET** /tenants/user-groups/{id} | Gets a user group
*TenantsApi* | [**getUserGroups**](docs/TenantsApi.md#getUserGroups) | **GET** /tenants/user-groups | Gets all user groups
*TenantsApi* | [**getUsers**](docs/TenantsApi.md#getUsers) | **GET** /tenants/users | Gets all users
*TenantsApi* | [**removeUser**](docs/TenantsApi.md#removeUser) | **DELETE** /tenants/users/{id} | Deletes a user
*TenantsApi* | [**removeUserGroup**](docs/TenantsApi.md#removeUserGroup) | **DELETE** /tenants/user-groups/{id} | Deletes a user group
*TenantsApi* | [**searchTenants**](docs/TenantsApi.md#searchTenants) | **GET** /tenants/search-results | Searches for a tenant with the specified identity
*TenantsApi* | [**updateUser**](docs/TenantsApi.md#updateUser) | **PUT** /tenants/users/{id} | Updates a user
*TenantsApi* | [**updateUserGroup**](docs/TenantsApi.md#updateUserGroup) | **PUT** /tenants/user-groups/{id} | Updates a user group
*VersionsApi* | [**createVersionControlRequest**](docs/VersionsApi.md#createVersionControlRequest) | **POST** /versions/active-requests | Create a version control request
*VersionsApi* | [**deleteRevertRequest**](docs/VersionsApi.md#deleteRevertRequest) | **DELETE** /versions/revert-requests/{id} | Deletes the Revert Request with the given ID
*VersionsApi* | [**deleteUpdateRequest**](docs/VersionsApi.md#deleteUpdateRequest) | **DELETE** /versions/update-requests/{id} | Deletes the Update Request with the given ID
*VersionsApi* | [**deleteVersionControlRequest**](docs/VersionsApi.md#deleteVersionControlRequest) | **DELETE** /versions/active-requests/{id} | Deletes the version control request with the given ID
*VersionsApi* | [**exportFlowVersion**](docs/VersionsApi.md#exportFlowVersion) | **GET** /versions/process-groups/{id}/download | Gets the latest version of a Process Group for download
*VersionsApi* | [**getRevertRequest**](docs/VersionsApi.md#getRevertRequest) | **GET** /versions/revert-requests/{id} | Returns the Revert Request with the given ID
*VersionsApi* | [**getUpdateRequest**](docs/VersionsApi.md#getUpdateRequest) | **GET** /versions/update-requests/{id} | Returns the Update Request with the given ID
*VersionsApi* | [**getVersionInformation**](docs/VersionsApi.md#getVersionInformation) | **GET** /versions/process-groups/{id} | Gets the Version Control information for a process group
*VersionsApi* | [**initiateRevertFlowVersion**](docs/VersionsApi.md#initiateRevertFlowVersion) | **POST** /versions/revert-requests/process-groups/{id} | Initiate the Revert Request of a Process Group with the given ID
*VersionsApi* | [**initiateVersionControlUpdate**](docs/VersionsApi.md#initiateVersionControlUpdate) | **POST** /versions/update-requests/process-groups/{id} | Initiate the Update Request of a Process Group with the given ID
*VersionsApi* | [**saveToFlowRegistry**](docs/VersionsApi.md#saveToFlowRegistry) | **POST** /versions/process-groups/{id} | Save the Process Group with the given ID
*VersionsApi* | [**stopVersionControl**](docs/VersionsApi.md#stopVersionControl) | **DELETE** /versions/process-groups/{id} | Stops version controlling the Process Group with the given ID
*VersionsApi* | [**updateFlowVersion**](docs/VersionsApi.md#updateFlowVersion) | **PUT** /versions/process-groups/{id} | Update the version of a Process Group with the given ID
*VersionsApi* | [**updateVersionControlRequest**](docs/VersionsApi.md#updateVersionControlRequest) | **PUT** /versions/active-requests/{id} | Updates the request with the given ID


## Documentation for Models

 - [AboutDTO](docs/AboutDTO.md)
 - [AboutEntity](docs/AboutEntity.md)
 - [AccessConfigurationDTO](docs/AccessConfigurationDTO.md)
 - [AccessConfigurationEntity](docs/AccessConfigurationEntity.md)
 - [AccessPolicyDTO](docs/AccessPolicyDTO.md)
 - [AccessPolicyEntity](docs/AccessPolicyEntity.md)
 - [AccessPolicySummaryDTO](docs/AccessPolicySummaryDTO.md)
 - [AccessPolicySummaryEntity](docs/AccessPolicySummaryEntity.md)
 - [AccessStatusDTO](docs/AccessStatusDTO.md)
 - [AccessStatusEntity](docs/AccessStatusEntity.md)
 - [ActionDTO](docs/ActionDTO.md)
 - [ActionDetailsDTO](docs/ActionDetailsDTO.md)
 - [ActionEntity](docs/ActionEntity.md)
 - [ActivateControllerServicesEntity](docs/ActivateControllerServicesEntity.md)
 - [AffectedComponentDTO](docs/AffectedComponentDTO.md)
 - [AffectedComponentEntity](docs/AffectedComponentEntity.md)
 - [AllowableValueDTO](docs/AllowableValueDTO.md)
 - [AllowableValueEntity](docs/AllowableValueEntity.md)
 - [AttributeDTO](docs/AttributeDTO.md)
 - [BannerDTO](docs/BannerDTO.md)
 - [BannerEntity](docs/BannerEntity.md)
 - [BatchSettingsDTO](docs/BatchSettingsDTO.md)
 - [BatchSize](docs/BatchSize.md)
 - [Bucket](docs/Bucket.md)
 - [BucketDTO](docs/BucketDTO.md)
 - [BucketEntity](docs/BucketEntity.md)
 - [BucketsEntity](docs/BucketsEntity.md)
 - [BulletinBoardDTO](docs/BulletinBoardDTO.md)
 - [BulletinBoardEntity](docs/BulletinBoardEntity.md)
 - [BulletinDTO](docs/BulletinDTO.md)
 - [BulletinEntity](docs/BulletinEntity.md)
 - [Bundle](docs/Bundle.md)
 - [BundleDTO](docs/BundleDTO.md)
 - [ClusteSummaryEntity](docs/ClusteSummaryEntity.md)
 - [ClusterDTO](docs/ClusterDTO.md)
 - [ClusterEntity](docs/ClusterEntity.md)
 - [ClusterSearchResultsEntity](docs/ClusterSearchResultsEntity.md)
 - [ClusterSummaryDTO](docs/ClusterSummaryDTO.md)
 - [ComponentDetailsDTO](docs/ComponentDetailsDTO.md)
 - [ComponentDifferenceDTO](docs/ComponentDifferenceDTO.md)
 - [ComponentHistoryDTO](docs/ComponentHistoryDTO.md)
 - [ComponentHistoryEntity](docs/ComponentHistoryEntity.md)
 - [ComponentReferenceDTO](docs/ComponentReferenceDTO.md)
 - [ComponentReferenceEntity](docs/ComponentReferenceEntity.md)
 - [ComponentRestrictionPermissionDTO](docs/ComponentRestrictionPermissionDTO.md)
 - [ComponentSearchResultDTO](docs/ComponentSearchResultDTO.md)
 - [ComponentStateDTO](docs/ComponentStateDTO.md)
 - [ComponentStateEntity](docs/ComponentStateEntity.md)
 - [ComponentValidationResultDTO](docs/ComponentValidationResultDTO.md)
 - [ComponentValidationResultEntity](docs/ComponentValidationResultEntity.md)
 - [ComponentValidationResultsEntity](docs/ComponentValidationResultsEntity.md)
 - [ConnectableComponent](docs/ConnectableComponent.md)
 - [ConnectableDTO](docs/ConnectableDTO.md)
 - [ConnectionDTO](docs/ConnectionDTO.md)
 - [ConnectionEntity](docs/ConnectionEntity.md)
 - [ConnectionStatisticsDTO](docs/ConnectionStatisticsDTO.md)
 - [ConnectionStatisticsEntity](docs/ConnectionStatisticsEntity.md)
 - [ConnectionStatisticsSnapshotDTO](docs/ConnectionStatisticsSnapshotDTO.md)
 - [ConnectionStatusDTO](docs/ConnectionStatusDTO.md)
 - [ConnectionStatusEntity](docs/ConnectionStatusEntity.md)
 - [ConnectionStatusPredictionsSnapshotDTO](docs/ConnectionStatusPredictionsSnapshotDTO.md)
 - [ConnectionStatusSnapshotDTO](docs/ConnectionStatusSnapshotDTO.md)
 - [ConnectionStatusSnapshotEntity](docs/ConnectionStatusSnapshotEntity.md)
 - [ConnectionsEntity](docs/ConnectionsEntity.md)
 - [ControllerBulletinsEntity](docs/ControllerBulletinsEntity.md)
 - [ControllerConfigurationDTO](docs/ControllerConfigurationDTO.md)
 - [ControllerConfigurationEntity](docs/ControllerConfigurationEntity.md)
 - [ControllerDTO](docs/ControllerDTO.md)
 - [ControllerEntity](docs/ControllerEntity.md)
 - [ControllerServiceAPI](docs/ControllerServiceAPI.md)
 - [ControllerServiceApiDTO](docs/ControllerServiceApiDTO.md)
 - [ControllerServiceDTO](docs/ControllerServiceDTO.md)
 - [ControllerServiceEntity](docs/ControllerServiceEntity.md)
 - [ControllerServiceReferencingComponentDTO](docs/ControllerServiceReferencingComponentDTO.md)
 - [ControllerServiceReferencingComponentEntity](docs/ControllerServiceReferencingComponentEntity.md)
 - [ControllerServiceReferencingComponentsEntity](docs/ControllerServiceReferencingComponentsEntity.md)
 - [ControllerServiceRunStatusEntity](docs/ControllerServiceRunStatusEntity.md)
 - [ControllerServiceStatusDTO](docs/ControllerServiceStatusDTO.md)
 - [ControllerServiceTypesEntity](docs/ControllerServiceTypesEntity.md)
 - [ControllerServicesEntity](docs/ControllerServicesEntity.md)
 - [ControllerStatusDTO](docs/ControllerStatusDTO.md)
 - [ControllerStatusEntity](docs/ControllerStatusEntity.md)
 - [CopySnippetRequestEntity](docs/CopySnippetRequestEntity.md)
 - [CounterDTO](docs/CounterDTO.md)
 - [CounterEntity](docs/CounterEntity.md)
 - [CountersDTO](docs/CountersDTO.md)
 - [CountersEntity](docs/CountersEntity.md)
 - [CountersSnapshotDTO](docs/CountersSnapshotDTO.md)
 - [CreateActiveRequestEntity](docs/CreateActiveRequestEntity.md)
 - [CreateTemplateRequestEntity](docs/CreateTemplateRequestEntity.md)
 - [CurrentUserEntity](docs/CurrentUserEntity.md)
 - [DifferenceDTO](docs/DifferenceDTO.md)
 - [DimensionsDTO](docs/DimensionsDTO.md)
 - [DocumentedTypeDTO](docs/DocumentedTypeDTO.md)
 - [DropRequestDTO](docs/DropRequestDTO.md)
 - [DropRequestEntity](docs/DropRequestEntity.md)
 - [ExplicitRestrictionDTO](docs/ExplicitRestrictionDTO.md)
 - [ExternalControllerServiceReference](docs/ExternalControllerServiceReference.md)
 - [FlowBreadcrumbDTO](docs/FlowBreadcrumbDTO.md)
 - [FlowBreadcrumbEntity](docs/FlowBreadcrumbEntity.md)
 - [FlowComparisonEntity](docs/FlowComparisonEntity.md)
 - [FlowConfigurationDTO](docs/FlowConfigurationDTO.md)
 - [FlowConfigurationEntity](docs/FlowConfigurationEntity.md)
 - [FlowDTO](docs/FlowDTO.md)
 - [FlowEntity](docs/FlowEntity.md)
 - [FlowFileDTO](docs/FlowFileDTO.md)
 - [FlowFileEntity](docs/FlowFileEntity.md)
 - [FlowFileSummaryDTO](docs/FlowFileSummaryDTO.md)
 - [FlowSnippetDTO](docs/FlowSnippetDTO.md)
 - [FunnelDTO](docs/FunnelDTO.md)
 - [FunnelEntity](docs/FunnelEntity.md)
 - [FunnelsEntity](docs/FunnelsEntity.md)
 - [GarbageCollectionDTO](docs/GarbageCollectionDTO.md)
 - [HistoryDTO](docs/HistoryDTO.md)
 - [HistoryEntity](docs/HistoryEntity.md)
 - [InputPortsEntity](docs/InputPortsEntity.md)
 - [InstantiateTemplateRequestEntity](docs/InstantiateTemplateRequestEntity.md)
 - [JaxbLink](docs/JaxbLink.md)
 - [LabelDTO](docs/LabelDTO.md)
 - [LabelEntity](docs/LabelEntity.md)
 - [LabelsEntity](docs/LabelsEntity.md)
 - [LineageDTO](docs/LineageDTO.md)
 - [LineageEntity](docs/LineageEntity.md)
 - [LineageRequestDTO](docs/LineageRequestDTO.md)
 - [LineageResultsDTO](docs/LineageResultsDTO.md)
 - [ListingRequestDTO](docs/ListingRequestDTO.md)
 - [ListingRequestEntity](docs/ListingRequestEntity.md)
 - [NodeConnectionStatisticsSnapshotDTO](docs/NodeConnectionStatisticsSnapshotDTO.md)
 - [NodeConnectionStatusSnapshotDTO](docs/NodeConnectionStatusSnapshotDTO.md)
 - [NodeCountersSnapshotDTO](docs/NodeCountersSnapshotDTO.md)
 - [NodeDTO](docs/NodeDTO.md)
 - [NodeEntity](docs/NodeEntity.md)
 - [NodeEventDTO](docs/NodeEventDTO.md)
 - [NodePortStatusSnapshotDTO](docs/NodePortStatusSnapshotDTO.md)
 - [NodeProcessGroupStatusSnapshotDTO](docs/NodeProcessGroupStatusSnapshotDTO.md)
 - [NodeProcessorStatusSnapshotDTO](docs/NodeProcessorStatusSnapshotDTO.md)
 - [NodeRemoteProcessGroupStatusSnapshotDTO](docs/NodeRemoteProcessGroupStatusSnapshotDTO.md)
 - [NodeSearchResultDTO](docs/NodeSearchResultDTO.md)
 - [NodeStatusSnapshotsDTO](docs/NodeStatusSnapshotsDTO.md)
 - [NodeSystemDiagnosticsSnapshotDTO](docs/NodeSystemDiagnosticsSnapshotDTO.md)
 - [OutputPortsEntity](docs/OutputPortsEntity.md)
 - [ParameterContextDTO](docs/ParameterContextDTO.md)
 - [ParameterContextEntity](docs/ParameterContextEntity.md)
 - [ParameterContextReferenceDTO](docs/ParameterContextReferenceDTO.md)
 - [ParameterContextReferenceEntity](docs/ParameterContextReferenceEntity.md)
 - [ParameterContextUpdateRequestDTO](docs/ParameterContextUpdateRequestDTO.md)
 - [ParameterContextUpdateRequestEntity](docs/ParameterContextUpdateRequestEntity.md)
 - [ParameterContextUpdateStepDTO](docs/ParameterContextUpdateStepDTO.md)
 - [ParameterContextValidationRequestDTO](docs/ParameterContextValidationRequestDTO.md)
 - [ParameterContextValidationRequestEntity](docs/ParameterContextValidationRequestEntity.md)
 - [ParameterContextValidationStepDTO](docs/ParameterContextValidationStepDTO.md)
 - [ParameterContextsEntity](docs/ParameterContextsEntity.md)
 - [ParameterDTO](docs/ParameterDTO.md)
 - [ParameterEntity](docs/ParameterEntity.md)
 - [PeerDTO](docs/PeerDTO.md)
 - [PeersEntity](docs/PeersEntity.md)
 - [Permissions](docs/Permissions.md)
 - [PermissionsDTO](docs/PermissionsDTO.md)
 - [PortDTO](docs/PortDTO.md)
 - [PortEntity](docs/PortEntity.md)
 - [PortRunStatusEntity](docs/PortRunStatusEntity.md)
 - [PortStatusDTO](docs/PortStatusDTO.md)
 - [PortStatusEntity](docs/PortStatusEntity.md)
 - [PortStatusSnapshotDTO](docs/PortStatusSnapshotDTO.md)
 - [PortStatusSnapshotEntity](docs/PortStatusSnapshotEntity.md)
 - [Position](docs/Position.md)
 - [PositionDTO](docs/PositionDTO.md)
 - [PreviousValueDTO](docs/PreviousValueDTO.md)
 - [PrioritizerTypesEntity](docs/PrioritizerTypesEntity.md)
 - [ProcessGroupDTO](docs/ProcessGroupDTO.md)
 - [ProcessGroupEntity](docs/ProcessGroupEntity.md)
 - [ProcessGroupFlowDTO](docs/ProcessGroupFlowDTO.md)
 - [ProcessGroupFlowEntity](docs/ProcessGroupFlowEntity.md)
 - [ProcessGroupImportEntity](docs/ProcessGroupImportEntity.md)
 - [ProcessGroupNameDTO](docs/ProcessGroupNameDTO.md)
 - [ProcessGroupReplaceRequestDTO](docs/ProcessGroupReplaceRequestDTO.md)
 - [ProcessGroupReplaceRequestEntity](docs/ProcessGroupReplaceRequestEntity.md)
 - [ProcessGroupStatusDTO](docs/ProcessGroupStatusDTO.md)
 - [ProcessGroupStatusEntity](docs/ProcessGroupStatusEntity.md)
 - [ProcessGroupStatusSnapshotDTO](docs/ProcessGroupStatusSnapshotDTO.md)
 - [ProcessGroupStatusSnapshotEntity](docs/ProcessGroupStatusSnapshotEntity.md)
 - [ProcessGroupsEntity](docs/ProcessGroupsEntity.md)
 - [ProcessorConfigDTO](docs/ProcessorConfigDTO.md)
 - [ProcessorDTO](docs/ProcessorDTO.md)
 - [ProcessorEntity](docs/ProcessorEntity.md)
 - [ProcessorRunStatusDetailsDTO](docs/ProcessorRunStatusDetailsDTO.md)
 - [ProcessorRunStatusDetailsEntity](docs/ProcessorRunStatusDetailsEntity.md)
 - [ProcessorRunStatusEntity](docs/ProcessorRunStatusEntity.md)
 - [ProcessorStatusDTO](docs/ProcessorStatusDTO.md)
 - [ProcessorStatusEntity](docs/ProcessorStatusEntity.md)
 - [ProcessorStatusSnapshotDTO](docs/ProcessorStatusSnapshotDTO.md)
 - [ProcessorStatusSnapshotEntity](docs/ProcessorStatusSnapshotEntity.md)
 - [ProcessorTypesEntity](docs/ProcessorTypesEntity.md)
 - [ProcessorsEntity](docs/ProcessorsEntity.md)
 - [ProcessorsRunStatusDetailsEntity](docs/ProcessorsRunStatusDetailsEntity.md)
 - [PropertyDescriptorDTO](docs/PropertyDescriptorDTO.md)
 - [PropertyDescriptorEntity](docs/PropertyDescriptorEntity.md)
 - [PropertyHistoryDTO](docs/PropertyHistoryDTO.md)
 - [ProvenanceDTO](docs/ProvenanceDTO.md)
 - [ProvenanceEntity](docs/ProvenanceEntity.md)
 - [ProvenanceEventDTO](docs/ProvenanceEventDTO.md)
 - [ProvenanceEventEntity](docs/ProvenanceEventEntity.md)
 - [ProvenanceLinkDTO](docs/ProvenanceLinkDTO.md)
 - [ProvenanceNodeDTO](docs/ProvenanceNodeDTO.md)
 - [ProvenanceOptionsDTO](docs/ProvenanceOptionsDTO.md)
 - [ProvenanceOptionsEntity](docs/ProvenanceOptionsEntity.md)
 - [ProvenanceRequestDTO](docs/ProvenanceRequestDTO.md)
 - [ProvenanceResultsDTO](docs/ProvenanceResultsDTO.md)
 - [ProvenanceSearchableFieldDTO](docs/ProvenanceSearchableFieldDTO.md)
 - [QueueSizeDTO](docs/QueueSizeDTO.md)
 - [RegistryClientEntity](docs/RegistryClientEntity.md)
 - [RegistryClientsEntity](docs/RegistryClientsEntity.md)
 - [RegistryDTO](docs/RegistryDTO.md)
 - [RelationshipDTO](docs/RelationshipDTO.md)
 - [RemotePortRunStatusEntity](docs/RemotePortRunStatusEntity.md)
 - [RemoteProcessGroupContentsDTO](docs/RemoteProcessGroupContentsDTO.md)
 - [RemoteProcessGroupDTO](docs/RemoteProcessGroupDTO.md)
 - [RemoteProcessGroupEntity](docs/RemoteProcessGroupEntity.md)
 - [RemoteProcessGroupPortDTO](docs/RemoteProcessGroupPortDTO.md)
 - [RemoteProcessGroupPortEntity](docs/RemoteProcessGroupPortEntity.md)
 - [RemoteProcessGroupStatusDTO](docs/RemoteProcessGroupStatusDTO.md)
 - [RemoteProcessGroupStatusEntity](docs/RemoteProcessGroupStatusEntity.md)
 - [RemoteProcessGroupStatusSnapshotDTO](docs/RemoteProcessGroupStatusSnapshotDTO.md)
 - [RemoteProcessGroupStatusSnapshotEntity](docs/RemoteProcessGroupStatusSnapshotEntity.md)
 - [RemoteProcessGroupsEntity](docs/RemoteProcessGroupsEntity.md)
 - [ReportingTaskDTO](docs/ReportingTaskDTO.md)
 - [ReportingTaskEntity](docs/ReportingTaskEntity.md)
 - [ReportingTaskRunStatusEntity](docs/ReportingTaskRunStatusEntity.md)
 - [ReportingTaskStatusDTO](docs/ReportingTaskStatusDTO.md)
 - [ReportingTaskTypesEntity](docs/ReportingTaskTypesEntity.md)
 - [ReportingTasksEntity](docs/ReportingTasksEntity.md)
 - [RequiredPermissionDTO](docs/RequiredPermissionDTO.md)
 - [ResourceDTO](docs/ResourceDTO.md)
 - [ResourcesEntity](docs/ResourcesEntity.md)
 - [RevisionDTO](docs/RevisionDTO.md)
 - [RevisionInfo](docs/RevisionInfo.md)
 - [RunStatusDetailsRequestEntity](docs/RunStatusDetailsRequestEntity.md)
 - [ScheduleComponentsEntity](docs/ScheduleComponentsEntity.md)
 - [SearchResultGroupDTO](docs/SearchResultGroupDTO.md)
 - [SearchResultsDTO](docs/SearchResultsDTO.md)
 - [SearchResultsEntity](docs/SearchResultsEntity.md)
 - [SnippetDTO](docs/SnippetDTO.md)
 - [SnippetEntity](docs/SnippetEntity.md)
 - [StartVersionControlRequestEntity](docs/StartVersionControlRequestEntity.md)
 - [StateEntryDTO](docs/StateEntryDTO.md)
 - [StateMapDTO](docs/StateMapDTO.md)
 - [StatusDescriptorDTO](docs/StatusDescriptorDTO.md)
 - [StatusHistoryDTO](docs/StatusHistoryDTO.md)
 - [StatusHistoryEntity](docs/StatusHistoryEntity.md)
 - [StatusSnapshotDTO](docs/StatusSnapshotDTO.md)
 - [StorageUsageDTO](docs/StorageUsageDTO.md)
 - [StreamingOutput](docs/StreamingOutput.md)
 - [SubmitReplayRequestEntity](docs/SubmitReplayRequestEntity.md)
 - [SystemDiagnosticsDTO](docs/SystemDiagnosticsDTO.md)
 - [SystemDiagnosticsEntity](docs/SystemDiagnosticsEntity.md)
 - [SystemDiagnosticsSnapshotDTO](docs/SystemDiagnosticsSnapshotDTO.md)
 - [TemplateDTO](docs/TemplateDTO.md)
 - [TemplateEntity](docs/TemplateEntity.md)
 - [TemplatesEntity](docs/TemplatesEntity.md)
 - [TenantDTO](docs/TenantDTO.md)
 - [TenantEntity](docs/TenantEntity.md)
 - [TenantsEntity](docs/TenantsEntity.md)
 - [TransactionResultEntity](docs/TransactionResultEntity.md)
 - [UpdateControllerServiceReferenceRequestEntity](docs/UpdateControllerServiceReferenceRequestEntity.md)
 - [UserDTO](docs/UserDTO.md)
 - [UserEntity](docs/UserEntity.md)
 - [UserGroupDTO](docs/UserGroupDTO.md)
 - [UserGroupEntity](docs/UserGroupEntity.md)
 - [UserGroupsEntity](docs/UserGroupsEntity.md)
 - [UsersEntity](docs/UsersEntity.md)
 - [VariableDTO](docs/VariableDTO.md)
 - [VariableEntity](docs/VariableEntity.md)
 - [VariableRegistryDTO](docs/VariableRegistryDTO.md)
 - [VariableRegistryEntity](docs/VariableRegistryEntity.md)
 - [VariableRegistryUpdateRequestDTO](docs/VariableRegistryUpdateRequestDTO.md)
 - [VariableRegistryUpdateRequestEntity](docs/VariableRegistryUpdateRequestEntity.md)
 - [VariableRegistryUpdateStepDTO](docs/VariableRegistryUpdateStepDTO.md)
 - [VersionControlComponentMappingEntity](docs/VersionControlComponentMappingEntity.md)
 - [VersionControlInformationDTO](docs/VersionControlInformationDTO.md)
 - [VersionControlInformationEntity](docs/VersionControlInformationEntity.md)
 - [VersionInfoDTO](docs/VersionInfoDTO.md)
 - [VersionedConnection](docs/VersionedConnection.md)
 - [VersionedControllerService](docs/VersionedControllerService.md)
 - [VersionedFlow](docs/VersionedFlow.md)
 - [VersionedFlowCoordinates](docs/VersionedFlowCoordinates.md)
 - [VersionedFlowDTO](docs/VersionedFlowDTO.md)
 - [VersionedFlowEntity](docs/VersionedFlowEntity.md)
 - [VersionedFlowSnapshot](docs/VersionedFlowSnapshot.md)
 - [VersionedFlowSnapshotEntity](docs/VersionedFlowSnapshotEntity.md)
 - [VersionedFlowSnapshotMetadata](docs/VersionedFlowSnapshotMetadata.md)
 - [VersionedFlowSnapshotMetadataEntity](docs/VersionedFlowSnapshotMetadataEntity.md)
 - [VersionedFlowSnapshotMetadataSetEntity](docs/VersionedFlowSnapshotMetadataSetEntity.md)
 - [VersionedFlowUpdateRequestDTO](docs/VersionedFlowUpdateRequestDTO.md)
 - [VersionedFlowUpdateRequestEntity](docs/VersionedFlowUpdateRequestEntity.md)
 - [VersionedFlowsEntity](docs/VersionedFlowsEntity.md)
 - [VersionedFunnel](docs/VersionedFunnel.md)
 - [VersionedLabel](docs/VersionedLabel.md)
 - [VersionedParameter](docs/VersionedParameter.md)
 - [VersionedParameterContext](docs/VersionedParameterContext.md)
 - [VersionedPort](docs/VersionedPort.md)
 - [VersionedProcessGroup](docs/VersionedProcessGroup.md)
 - [VersionedProcessor](docs/VersionedProcessor.md)
 - [VersionedPropertyDescriptor](docs/VersionedPropertyDescriptor.md)
 - [VersionedRemoteGroupPort](docs/VersionedRemoteGroupPort.md)
 - [VersionedRemoteProcessGroup](docs/VersionedRemoteProcessGroup.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

dev@nifi.apache.org

