/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.12.1
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package at.mic.nifi.swagger.client;

import at.mic.nifi.swagger.ApiException;
import at.mic.nifi.swagger.client.model.CreateActiveRequestEntity;
import at.mic.nifi.swagger.client.model.StartVersionControlRequestEntity;
import at.mic.nifi.swagger.client.model.VersionControlComponentMappingEntity;
import at.mic.nifi.swagger.client.model.VersionControlInformationEntity;
import at.mic.nifi.swagger.client.model.VersionedFlowSnapshotEntity;
import at.mic.nifi.swagger.client.model.VersionedFlowUpdateRequestEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VersionsApi
 */
@Ignore
public class VersionsApiTest {

    private final VersionsApi api = new VersionsApi();

    
    /**
     * Create a version control request
     *
     * Creates a request so that a Process Group can be placed under Version Control or have its Version Control configuration changed. Creating this request will prevent any other threads from simultaneously saving local changes to Version Control. It will not, however, actually save the local flow to the Flow Registry. A POST to /versions/process-groups/{id} should be used to initiate saving of the local flow to the Flow Registry. Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createVersionControlRequestTest() throws ApiException {
        CreateActiveRequestEntity body = null;
        String response = api.createVersionControlRequest(body);

        // TODO: test validations
    }
    
    /**
     * Deletes the Revert Request with the given ID
     *
     * Deletes the Revert Request with the given ID. After a request is created via a POST to /versions/revert-requests/process-groups/{id}, it is expected that the client will properly clean up the request by DELETE&#39;ing it, once the Revert process has completed. If the request is deleted before the request completes, then the Revert request will finish the step that it is currently performing and then will cancel any subsequent steps. Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRevertRequestTest() throws ApiException {
        String id = null;
        Boolean disconnectedNodeAcknowledged = null;
        VersionedFlowUpdateRequestEntity response = api.deleteRevertRequest(id, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    
    /**
     * Deletes the Update Request with the given ID
     *
     * Deletes the Update Request with the given ID. After a request is created via a POST to /versions/update-requests/process-groups/{id}, it is expected that the client will properly clean up the request by DELETE&#39;ing it, once the Update process has completed. If the request is deleted before the request completes, then the Update request will finish the step that it is currently performing and then will cancel any subsequent steps. Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUpdateRequestTest() throws ApiException {
        String id = null;
        Boolean disconnectedNodeAcknowledged = null;
        VersionedFlowUpdateRequestEntity response = api.deleteUpdateRequest(id, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    
    /**
     * Deletes the version control request with the given ID
     *
     * Deletes the Version Control Request with the given ID. This will allow other threads to save flows to the Flow Registry. See also the documentation for POSTing to /versions/active-requests for information regarding why this is done. Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVersionControlRequestTest() throws ApiException {
        String id = null;
        Boolean disconnectedNodeAcknowledged = null;
        api.deleteVersionControlRequest(id, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    
    /**
     * Gets the latest version of a Process Group for download
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void exportFlowVersionTest() throws ApiException {
        String id = null;
        String response = api.exportFlowVersion(id);

        // TODO: test validations
    }
    
    /**
     * Returns the Revert Request with the given ID
     *
     * Returns the Revert Request with the given ID. Once a Revert Request has been created by performing a POST to /versions/revert-requests/process-groups/{id}, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRevertRequestTest() throws ApiException {
        String id = null;
        VersionedFlowUpdateRequestEntity response = api.getRevertRequest(id);

        // TODO: test validations
    }
    
    /**
     * Returns the Update Request with the given ID
     *
     * Returns the Update Request with the given ID. Once an Update Request has been created by performing a POST to /versions/update-requests/process-groups/{id}, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUpdateRequestTest() throws ApiException {
        String id = null;
        VersionedFlowUpdateRequestEntity response = api.getUpdateRequest(id);

        // TODO: test validations
    }
    
    /**
     * Gets the Version Control information for a process group
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVersionInformationTest() throws ApiException {
        String id = null;
        VersionControlInformationEntity response = api.getVersionInformation(id);

        // TODO: test validations
    }
    
    /**
     * Initiate the Revert Request of a Process Group with the given ID
     *
     * For a Process Group that is already under Version Control, this will initiate the action of reverting any local changes that have been made to the Process Group since it was last synchronized with the Flow Registry. This will result in the flow matching the Versioned Flow that exists in the Flow Registry. This can be a lengthy process, as it will stop any Processors and disable any Controller Services necessary to perform the action and then restart them. As a result, the endpoint will immediately return a VersionedFlowUpdateRequestEntity, and the process of updating the flow will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /versions/revert-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /versions/revert-requests/{requestId}. Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initiateRevertFlowVersionTest() throws ApiException {
        String id = null;
        VersionControlInformationEntity body = null;
        VersionedFlowUpdateRequestEntity response = api.initiateRevertFlowVersion(id, body);

        // TODO: test validations
    }
    
    /**
     * Initiate the Update Request of a Process Group with the given ID
     *
     * For a Process Group that is already under Version Control, this will initiate the action of changing from a specific version of the flow in the Flow Registry to a different version of the flow. This can be a lengthy process, as it will stop any Processors and disable any Controller Services necessary to perform the action and then restart them. As a result, the endpoint will immediately return a VersionedFlowUpdateRequestEntity, and the process of updating the flow will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /versions/update-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /versions/update-requests/{requestId}. Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initiateVersionControlUpdateTest() throws ApiException {
        String id = null;
        VersionControlInformationEntity body = null;
        VersionedFlowUpdateRequestEntity response = api.initiateVersionControlUpdate(id, body);

        // TODO: test validations
    }
    
    /**
     * Save the Process Group with the given ID
     *
     * Begins version controlling the Process Group with the given ID or commits changes to the Versioned Flow, depending on if the provided VersionControlInformation includes a flowId. Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveToFlowRegistryTest() throws ApiException {
        String id = null;
        StartVersionControlRequestEntity body = null;
        VersionControlInformationEntity response = api.saveToFlowRegistry(id, body);

        // TODO: test validations
    }
    
    /**
     * Stops version controlling the Process Group with the given ID
     *
     * Stops version controlling the Process Group with the given ID. The Process Group will no longer track to any Versioned Flow. Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopVersionControlTest() throws ApiException {
        String id = null;
        String version = null;
        String clientId = null;
        Boolean disconnectedNodeAcknowledged = null;
        VersionControlInformationEntity response = api.stopVersionControl(id, version, clientId, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    
    /**
     * Update the version of a Process Group with the given ID
     *
     * For a Process Group that is already under Version Control, this will update the version of the flow to a different version. This endpoint expects that the given snapshot will not modify any Processor that is currently running or any Controller Service that is enabled. Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFlowVersionTest() throws ApiException {
        String id = null;
        VersionedFlowSnapshotEntity body = null;
        VersionControlInformationEntity response = api.updateFlowVersion(id, body);

        // TODO: test validations
    }
    
    /**
     * Updates the request with the given ID
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVersionControlRequestTest() throws ApiException {
        String id = null;
        VersionControlComponentMappingEntity body = null;
        VersionControlInformationEntity response = api.updateVersionControlRequest(id, body);

        // TODO: test validations
    }
    
}
