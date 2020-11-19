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
import at.mic.nifi.swagger.client.model.ComponentStateEntity;
import at.mic.nifi.swagger.client.model.ProcessorEntity;
import at.mic.nifi.swagger.client.model.ProcessorRunStatusEntity;
import at.mic.nifi.swagger.client.model.ProcessorsRunStatusDetailsEntity;
import at.mic.nifi.swagger.client.model.PropertyDescriptorEntity;
import at.mic.nifi.swagger.client.model.RunStatusDetailsRequestEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProcessorsApi
 */
@Ignore
public class ProcessorsApiTest {

    private final ProcessorsApi api = new ProcessorsApi();

    
    /**
     * Clears the state for a processor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearStateTest() throws ApiException {
        String id = null;
        ComponentStateEntity response = api.clearState(id);

        // TODO: test validations
    }
    
    /**
     * Deletes a processor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProcessorTest() throws ApiException {
        String id = null;
        String version = null;
        String clientId = null;
        Boolean disconnectedNodeAcknowledged = null;
        ProcessorEntity response = api.deleteProcessor(id, version, clientId, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    
    /**
     * Gets a processor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessorTest() throws ApiException {
        String id = null;
        ProcessorEntity response = api.getProcessor(id);

        // TODO: test validations
    }
    
    /**
     * Gets diagnostics information about a processor
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessorDiagnosticsTest() throws ApiException {
        String id = null;
        ProcessorEntity response = api.getProcessorDiagnostics(id);

        // TODO: test validations
    }
    
    /**
     * Submits a query to retrieve the run status details of all processors that are in the given list of Processor IDs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessorRunStatusDetailsTest() throws ApiException {
        RunStatusDetailsRequestEntity body = null;
        ProcessorsRunStatusDetailsEntity response = api.getProcessorRunStatusDetails(body);

        // TODO: test validations
    }
    
    /**
     * Gets the descriptor for a processor property
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPropertyDescriptorTest() throws ApiException {
        String id = null;
        String propertyName = null;
        String clientId = null;
        PropertyDescriptorEntity response = api.getPropertyDescriptor(id, propertyName, clientId);

        // TODO: test validations
    }
    
    /**
     * Gets the state for a processor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStateTest() throws ApiException {
        String id = null;
        ComponentStateEntity response = api.getState(id);

        // TODO: test validations
    }
    
    /**
     * Terminates a processor, essentially \&quot;deleting\&quot; its threads and any active tasks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void terminateProcessorTest() throws ApiException {
        String id = null;
        ProcessorEntity response = api.terminateProcessor(id);

        // TODO: test validations
    }
    
    /**
     * Updates a processor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProcessorTest() throws ApiException {
        String id = null;
        ProcessorEntity body = null;
        ProcessorEntity response = api.updateProcessor(id, body);

        // TODO: test validations
    }
    
    /**
     * Updates run status of a processor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRunStatusTest() throws ApiException {
        String id = null;
        ProcessorRunStatusEntity body = null;
        ProcessorEntity response = api.updateRunStatus(id, body);

        // TODO: test validations
    }
    
}
