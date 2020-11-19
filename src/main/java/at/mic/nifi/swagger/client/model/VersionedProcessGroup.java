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


package at.mic.nifi.swagger.client.model;

import java.util.Objects;
import at.mic.nifi.swagger.client.model.Position;
import at.mic.nifi.swagger.client.model.VersionedConnection;
import at.mic.nifi.swagger.client.model.VersionedControllerService;
import at.mic.nifi.swagger.client.model.VersionedFlowCoordinates;
import at.mic.nifi.swagger.client.model.VersionedFunnel;
import at.mic.nifi.swagger.client.model.VersionedLabel;
import at.mic.nifi.swagger.client.model.VersionedPort;
import at.mic.nifi.swagger.client.model.VersionedProcessGroup;
import at.mic.nifi.swagger.client.model.VersionedProcessor;
import at.mic.nifi.swagger.client.model.VersionedRemoteProcessGroup;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * VersionedProcessGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-05T15:38:14.826+01:00")
public class VersionedProcessGroup {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("position")
  private Position position = null;

  @SerializedName("processGroups")
  private List<VersionedProcessGroup> processGroups = new ArrayList<VersionedProcessGroup>();

  @SerializedName("remoteProcessGroups")
  private List<VersionedRemoteProcessGroup> remoteProcessGroups = new ArrayList<VersionedRemoteProcessGroup>();

  @SerializedName("processors")
  private List<VersionedProcessor> processors = new ArrayList<VersionedProcessor>();

  @SerializedName("inputPorts")
  private List<VersionedPort> inputPorts = new ArrayList<VersionedPort>();

  @SerializedName("outputPorts")
  private List<VersionedPort> outputPorts = new ArrayList<VersionedPort>();

  @SerializedName("connections")
  private List<VersionedConnection> connections = new ArrayList<VersionedConnection>();

  @SerializedName("labels")
  private List<VersionedLabel> labels = new ArrayList<VersionedLabel>();

  @SerializedName("funnels")
  private List<VersionedFunnel> funnels = new ArrayList<VersionedFunnel>();

  @SerializedName("controllerServices")
  private List<VersionedControllerService> controllerServices = new ArrayList<VersionedControllerService>();

  @SerializedName("versionedFlowCoordinates")
  private VersionedFlowCoordinates versionedFlowCoordinates = null;

  @SerializedName("variables")
  private Map<String, String> variables = new HashMap<String, String>();

  @SerializedName("parameterContextName")
  private String parameterContextName = null;

  @SerializedName("flowFileConcurrency")
  private String flowFileConcurrency = null;

  @SerializedName("flowFileOutboundPolicy")
  private String flowFileOutboundPolicy = null;

  /**
   * Gets or Sets componentType
   */
  public enum ComponentTypeEnum {
    @SerializedName("CONNECTION")
    CONNECTION("CONNECTION"),
    
    @SerializedName("PROCESSOR")
    PROCESSOR("PROCESSOR"),
    
    @SerializedName("PROCESS_GROUP")
    PROCESS_GROUP("PROCESS_GROUP"),
    
    @SerializedName("REMOTE_PROCESS_GROUP")
    REMOTE_PROCESS_GROUP("REMOTE_PROCESS_GROUP"),
    
    @SerializedName("INPUT_PORT")
    INPUT_PORT("INPUT_PORT"),
    
    @SerializedName("OUTPUT_PORT")
    OUTPUT_PORT("OUTPUT_PORT"),
    
    @SerializedName("REMOTE_INPUT_PORT")
    REMOTE_INPUT_PORT("REMOTE_INPUT_PORT"),
    
    @SerializedName("REMOTE_OUTPUT_PORT")
    REMOTE_OUTPUT_PORT("REMOTE_OUTPUT_PORT"),
    
    @SerializedName("FUNNEL")
    FUNNEL("FUNNEL"),
    
    @SerializedName("LABEL")
    LABEL("LABEL"),
    
    @SerializedName("CONTROLLER_SERVICE")
    CONTROLLER_SERVICE("CONTROLLER_SERVICE");

    private String value;

    ComponentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("componentType")
  private ComponentTypeEnum componentType = null;

  @SerializedName("groupIdentifier")
  private String groupIdentifier = null;

  public VersionedProcessGroup identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The component's unique identifier
   * @return identifier
  **/
  @ApiModelProperty(example = "null", value = "The component's unique identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public VersionedProcessGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The component's name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The component's name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VersionedProcessGroup comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * The user-supplied comments for the component
   * @return comments
  **/
  @ApiModelProperty(example = "null", value = "The user-supplied comments for the component")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public VersionedProcessGroup position(Position position) {
    this.position = position;
    return this;
  }

   /**
   * The component's position on the graph
   * @return position
  **/
  @ApiModelProperty(example = "null", value = "The component's position on the graph")
  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public VersionedProcessGroup processGroups(List<VersionedProcessGroup> processGroups) {
    this.processGroups = processGroups;
    return this;
  }

  public VersionedProcessGroup addProcessGroupsItem(VersionedProcessGroup processGroupsItem) {
    this.processGroups.add(processGroupsItem);
    return this;
  }

   /**
   * The child Process Groups
   * @return processGroups
  **/
  @ApiModelProperty(example = "null", value = "The child Process Groups")
  public List<VersionedProcessGroup> getProcessGroups() {
    return processGroups;
  }

  public void setProcessGroups(List<VersionedProcessGroup> processGroups) {
    this.processGroups = processGroups;
  }

  public VersionedProcessGroup remoteProcessGroups(List<VersionedRemoteProcessGroup> remoteProcessGroups) {
    this.remoteProcessGroups = remoteProcessGroups;
    return this;
  }

  public VersionedProcessGroup addRemoteProcessGroupsItem(VersionedRemoteProcessGroup remoteProcessGroupsItem) {
    this.remoteProcessGroups.add(remoteProcessGroupsItem);
    return this;
  }

   /**
   * The Remote Process Groups
   * @return remoteProcessGroups
  **/
  @ApiModelProperty(example = "null", value = "The Remote Process Groups")
  public List<VersionedRemoteProcessGroup> getRemoteProcessGroups() {
    return remoteProcessGroups;
  }

  public void setRemoteProcessGroups(List<VersionedRemoteProcessGroup> remoteProcessGroups) {
    this.remoteProcessGroups = remoteProcessGroups;
  }

  public VersionedProcessGroup processors(List<VersionedProcessor> processors) {
    this.processors = processors;
    return this;
  }

  public VersionedProcessGroup addProcessorsItem(VersionedProcessor processorsItem) {
    this.processors.add(processorsItem);
    return this;
  }

   /**
   * The Processors
   * @return processors
  **/
  @ApiModelProperty(example = "null", value = "The Processors")
  public List<VersionedProcessor> getProcessors() {
    return processors;
  }

  public void setProcessors(List<VersionedProcessor> processors) {
    this.processors = processors;
  }

  public VersionedProcessGroup inputPorts(List<VersionedPort> inputPorts) {
    this.inputPorts = inputPorts;
    return this;
  }

  public VersionedProcessGroup addInputPortsItem(VersionedPort inputPortsItem) {
    this.inputPorts.add(inputPortsItem);
    return this;
  }

   /**
   * The Input Ports
   * @return inputPorts
  **/
  @ApiModelProperty(example = "null", value = "The Input Ports")
  public List<VersionedPort> getInputPorts() {
    return inputPorts;
  }

  public void setInputPorts(List<VersionedPort> inputPorts) {
    this.inputPorts = inputPorts;
  }

  public VersionedProcessGroup outputPorts(List<VersionedPort> outputPorts) {
    this.outputPorts = outputPorts;
    return this;
  }

  public VersionedProcessGroup addOutputPortsItem(VersionedPort outputPortsItem) {
    this.outputPorts.add(outputPortsItem);
    return this;
  }

   /**
   * The Output Ports
   * @return outputPorts
  **/
  @ApiModelProperty(example = "null", value = "The Output Ports")
  public List<VersionedPort> getOutputPorts() {
    return outputPorts;
  }

  public void setOutputPorts(List<VersionedPort> outputPorts) {
    this.outputPorts = outputPorts;
  }

  public VersionedProcessGroup connections(List<VersionedConnection> connections) {
    this.connections = connections;
    return this;
  }

  public VersionedProcessGroup addConnectionsItem(VersionedConnection connectionsItem) {
    this.connections.add(connectionsItem);
    return this;
  }

   /**
   * The Connections
   * @return connections
  **/
  @ApiModelProperty(example = "null", value = "The Connections")
  public List<VersionedConnection> getConnections() {
    return connections;
  }

  public void setConnections(List<VersionedConnection> connections) {
    this.connections = connections;
  }

  public VersionedProcessGroup labels(List<VersionedLabel> labels) {
    this.labels = labels;
    return this;
  }

  public VersionedProcessGroup addLabelsItem(VersionedLabel labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * The Labels
   * @return labels
  **/
  @ApiModelProperty(example = "null", value = "The Labels")
  public List<VersionedLabel> getLabels() {
    return labels;
  }

  public void setLabels(List<VersionedLabel> labels) {
    this.labels = labels;
  }

  public VersionedProcessGroup funnels(List<VersionedFunnel> funnels) {
    this.funnels = funnels;
    return this;
  }

  public VersionedProcessGroup addFunnelsItem(VersionedFunnel funnelsItem) {
    this.funnels.add(funnelsItem);
    return this;
  }

   /**
   * The Funnels
   * @return funnels
  **/
  @ApiModelProperty(example = "null", value = "The Funnels")
  public List<VersionedFunnel> getFunnels() {
    return funnels;
  }

  public void setFunnels(List<VersionedFunnel> funnels) {
    this.funnels = funnels;
  }

  public VersionedProcessGroup controllerServices(List<VersionedControllerService> controllerServices) {
    this.controllerServices = controllerServices;
    return this;
  }

  public VersionedProcessGroup addControllerServicesItem(VersionedControllerService controllerServicesItem) {
    this.controllerServices.add(controllerServicesItem);
    return this;
  }

   /**
   * The Controller Services
   * @return controllerServices
  **/
  @ApiModelProperty(example = "null", value = "The Controller Services")
  public List<VersionedControllerService> getControllerServices() {
    return controllerServices;
  }

  public void setControllerServices(List<VersionedControllerService> controllerServices) {
    this.controllerServices = controllerServices;
  }

  public VersionedProcessGroup versionedFlowCoordinates(VersionedFlowCoordinates versionedFlowCoordinates) {
    this.versionedFlowCoordinates = versionedFlowCoordinates;
    return this;
  }

   /**
   * The coordinates where the remote flow is stored, or null if the Process Group is not directly under Version Control
   * @return versionedFlowCoordinates
  **/
  @ApiModelProperty(example = "null", value = "The coordinates where the remote flow is stored, or null if the Process Group is not directly under Version Control")
  public VersionedFlowCoordinates getVersionedFlowCoordinates() {
    return versionedFlowCoordinates;
  }

  public void setVersionedFlowCoordinates(VersionedFlowCoordinates versionedFlowCoordinates) {
    this.versionedFlowCoordinates = versionedFlowCoordinates;
  }

  public VersionedProcessGroup variables(Map<String, String> variables) {
    this.variables = variables;
    return this;
  }

  public VersionedProcessGroup putVariablesItem(String key, String variablesItem) {
    this.variables.put(key, variablesItem);
    return this;
  }

   /**
   * The Variables in the Variable Registry for this Process Group (not including any ancestor or descendant Process Groups)
   * @return variables
  **/
  @ApiModelProperty(example = "null", value = "The Variables in the Variable Registry for this Process Group (not including any ancestor or descendant Process Groups)")
  public Map<String, String> getVariables() {
    return variables;
  }

  public void setVariables(Map<String, String> variables) {
    this.variables = variables;
  }

  public VersionedProcessGroup parameterContextName(String parameterContextName) {
    this.parameterContextName = parameterContextName;
    return this;
  }

   /**
   * The name of the parameter context used by this process group
   * @return parameterContextName
  **/
  @ApiModelProperty(example = "null", value = "The name of the parameter context used by this process group")
  public String getParameterContextName() {
    return parameterContextName;
  }

  public void setParameterContextName(String parameterContextName) {
    this.parameterContextName = parameterContextName;
  }

  public VersionedProcessGroup flowFileConcurrency(String flowFileConcurrency) {
    this.flowFileConcurrency = flowFileConcurrency;
    return this;
  }

   /**
   * The configured FlowFile Concurrency for the Process Group
   * @return flowFileConcurrency
  **/
  @ApiModelProperty(example = "null", value = "The configured FlowFile Concurrency for the Process Group")
  public String getFlowFileConcurrency() {
    return flowFileConcurrency;
  }

  public void setFlowFileConcurrency(String flowFileConcurrency) {
    this.flowFileConcurrency = flowFileConcurrency;
  }

  public VersionedProcessGroup flowFileOutboundPolicy(String flowFileOutboundPolicy) {
    this.flowFileOutboundPolicy = flowFileOutboundPolicy;
    return this;
  }

   /**
   * The FlowFile Outbound Policy for the Process Group
   * @return flowFileOutboundPolicy
  **/
  @ApiModelProperty(example = "null", value = "The FlowFile Outbound Policy for the Process Group")
  public String getFlowFileOutboundPolicy() {
    return flowFileOutboundPolicy;
  }

  public void setFlowFileOutboundPolicy(String flowFileOutboundPolicy) {
    this.flowFileOutboundPolicy = flowFileOutboundPolicy;
  }

  public VersionedProcessGroup componentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
    return this;
  }

   /**
   * Get componentType
   * @return componentType
  **/
  @ApiModelProperty(example = "null", value = "")
  public ComponentTypeEnum getComponentType() {
    return componentType;
  }

  public void setComponentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
  }

  public VersionedProcessGroup groupIdentifier(String groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
    return this;
  }

   /**
   * The ID of the Process Group that this component belongs to
   * @return groupIdentifier
  **/
  @ApiModelProperty(example = "null", value = "The ID of the Process Group that this component belongs to")
  public String getGroupIdentifier() {
    return groupIdentifier;
  }

  public void setGroupIdentifier(String groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedProcessGroup versionedProcessGroup = (VersionedProcessGroup) o;
    return Objects.equals(this.identifier, versionedProcessGroup.identifier) &&
        Objects.equals(this.name, versionedProcessGroup.name) &&
        Objects.equals(this.comments, versionedProcessGroup.comments) &&
        Objects.equals(this.position, versionedProcessGroup.position) &&
        Objects.equals(this.processGroups, versionedProcessGroup.processGroups) &&
        Objects.equals(this.remoteProcessGroups, versionedProcessGroup.remoteProcessGroups) &&
        Objects.equals(this.processors, versionedProcessGroup.processors) &&
        Objects.equals(this.inputPorts, versionedProcessGroup.inputPorts) &&
        Objects.equals(this.outputPorts, versionedProcessGroup.outputPorts) &&
        Objects.equals(this.connections, versionedProcessGroup.connections) &&
        Objects.equals(this.labels, versionedProcessGroup.labels) &&
        Objects.equals(this.funnels, versionedProcessGroup.funnels) &&
        Objects.equals(this.controllerServices, versionedProcessGroup.controllerServices) &&
        Objects.equals(this.versionedFlowCoordinates, versionedProcessGroup.versionedFlowCoordinates) &&
        Objects.equals(this.variables, versionedProcessGroup.variables) &&
        Objects.equals(this.parameterContextName, versionedProcessGroup.parameterContextName) &&
        Objects.equals(this.flowFileConcurrency, versionedProcessGroup.flowFileConcurrency) &&
        Objects.equals(this.flowFileOutboundPolicy, versionedProcessGroup.flowFileOutboundPolicy) &&
        Objects.equals(this.componentType, versionedProcessGroup.componentType) &&
        Objects.equals(this.groupIdentifier, versionedProcessGroup.groupIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, name, comments, position, processGroups, remoteProcessGroups, processors, inputPorts, outputPorts, connections, labels, funnels, controllerServices, versionedFlowCoordinates, variables, parameterContextName, flowFileConcurrency, flowFileOutboundPolicy, componentType, groupIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedProcessGroup {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    processGroups: ").append(toIndentedString(processGroups)).append("\n");
    sb.append("    remoteProcessGroups: ").append(toIndentedString(remoteProcessGroups)).append("\n");
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
    sb.append("    inputPorts: ").append(toIndentedString(inputPorts)).append("\n");
    sb.append("    outputPorts: ").append(toIndentedString(outputPorts)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    funnels: ").append(toIndentedString(funnels)).append("\n");
    sb.append("    controllerServices: ").append(toIndentedString(controllerServices)).append("\n");
    sb.append("    versionedFlowCoordinates: ").append(toIndentedString(versionedFlowCoordinates)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    parameterContextName: ").append(toIndentedString(parameterContextName)).append("\n");
    sb.append("    flowFileConcurrency: ").append(toIndentedString(flowFileConcurrency)).append("\n");
    sb.append("    flowFileOutboundPolicy: ").append(toIndentedString(flowFileOutboundPolicy)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    groupIdentifier: ").append(toIndentedString(groupIdentifier)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

