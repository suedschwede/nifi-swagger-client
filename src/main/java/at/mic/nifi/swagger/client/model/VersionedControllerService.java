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
import at.mic.nifi.swagger.client.model.Bundle;
import at.mic.nifi.swagger.client.model.ControllerServiceAPI;
import at.mic.nifi.swagger.client.model.Position;
import at.mic.nifi.swagger.client.model.VersionedPropertyDescriptor;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * VersionedControllerService
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-05T15:38:14.826+01:00")
public class VersionedControllerService {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("position")
  private Position position = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("bundle")
  private Bundle bundle = null;

  @SerializedName("controllerServiceApis")
  private List<ControllerServiceAPI> controllerServiceApis = new ArrayList<ControllerServiceAPI>();

  @SerializedName("properties")
  private Map<String, String> properties = new HashMap<String, String>();

  @SerializedName("propertyDescriptors")
  private Map<String, VersionedPropertyDescriptor> propertyDescriptors = new HashMap<String, VersionedPropertyDescriptor>();

  @SerializedName("annotationData")
  private String annotationData = null;

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

  public VersionedControllerService identifier(String identifier) {
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

  public VersionedControllerService name(String name) {
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

  public VersionedControllerService comments(String comments) {
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

  public VersionedControllerService position(Position position) {
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

  public VersionedControllerService type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the controller service.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "The type of the controller service.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VersionedControllerService bundle(Bundle bundle) {
    this.bundle = bundle;
    return this;
  }

   /**
   * The details of the artifact that bundled this processor type.
   * @return bundle
  **/
  @ApiModelProperty(example = "null", value = "The details of the artifact that bundled this processor type.")
  public Bundle getBundle() {
    return bundle;
  }

  public void setBundle(Bundle bundle) {
    this.bundle = bundle;
  }

  public VersionedControllerService controllerServiceApis(List<ControllerServiceAPI> controllerServiceApis) {
    this.controllerServiceApis = controllerServiceApis;
    return this;
  }

  public VersionedControllerService addControllerServiceApisItem(ControllerServiceAPI controllerServiceApisItem) {
    this.controllerServiceApis.add(controllerServiceApisItem);
    return this;
  }

   /**
   * Lists the APIs this Controller Service implements.
   * @return controllerServiceApis
  **/
  @ApiModelProperty(example = "null", value = "Lists the APIs this Controller Service implements.")
  public List<ControllerServiceAPI> getControllerServiceApis() {
    return controllerServiceApis;
  }

  public void setControllerServiceApis(List<ControllerServiceAPI> controllerServiceApis) {
    this.controllerServiceApis = controllerServiceApis;
  }

  public VersionedControllerService properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public VersionedControllerService putPropertiesItem(String key, String propertiesItem) {
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The properties of the controller service.
   * @return properties
  **/
  @ApiModelProperty(example = "null", value = "The properties of the controller service.")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public VersionedControllerService propertyDescriptors(Map<String, VersionedPropertyDescriptor> propertyDescriptors) {
    this.propertyDescriptors = propertyDescriptors;
    return this;
  }

  public VersionedControllerService putPropertyDescriptorsItem(String key, VersionedPropertyDescriptor propertyDescriptorsItem) {
    this.propertyDescriptors.put(key, propertyDescriptorsItem);
    return this;
  }

   /**
   * The property descriptors for the processor.
   * @return propertyDescriptors
  **/
  @ApiModelProperty(example = "null", value = "The property descriptors for the processor.")
  public Map<String, VersionedPropertyDescriptor> getPropertyDescriptors() {
    return propertyDescriptors;
  }

  public void setPropertyDescriptors(Map<String, VersionedPropertyDescriptor> propertyDescriptors) {
    this.propertyDescriptors = propertyDescriptors;
  }

  public VersionedControllerService annotationData(String annotationData) {
    this.annotationData = annotationData;
    return this;
  }

   /**
   * The annotation for the controller service. This is how the custom UI relays configuration to the controller service.
   * @return annotationData
  **/
  @ApiModelProperty(example = "null", value = "The annotation for the controller service. This is how the custom UI relays configuration to the controller service.")
  public String getAnnotationData() {
    return annotationData;
  }

  public void setAnnotationData(String annotationData) {
    this.annotationData = annotationData;
  }

  public VersionedControllerService componentType(ComponentTypeEnum componentType) {
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

  public VersionedControllerService groupIdentifier(String groupIdentifier) {
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
    VersionedControllerService versionedControllerService = (VersionedControllerService) o;
    return Objects.equals(this.identifier, versionedControllerService.identifier) &&
        Objects.equals(this.name, versionedControllerService.name) &&
        Objects.equals(this.comments, versionedControllerService.comments) &&
        Objects.equals(this.position, versionedControllerService.position) &&
        Objects.equals(this.type, versionedControllerService.type) &&
        Objects.equals(this.bundle, versionedControllerService.bundle) &&
        Objects.equals(this.controllerServiceApis, versionedControllerService.controllerServiceApis) &&
        Objects.equals(this.properties, versionedControllerService.properties) &&
        Objects.equals(this.propertyDescriptors, versionedControllerService.propertyDescriptors) &&
        Objects.equals(this.annotationData, versionedControllerService.annotationData) &&
        Objects.equals(this.componentType, versionedControllerService.componentType) &&
        Objects.equals(this.groupIdentifier, versionedControllerService.groupIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, name, comments, position, type, bundle, controllerServiceApis, properties, propertyDescriptors, annotationData, componentType, groupIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedControllerService {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    controllerServiceApis: ").append(toIndentedString(controllerServiceApis)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    propertyDescriptors: ").append(toIndentedString(propertyDescriptors)).append("\n");
    sb.append("    annotationData: ").append(toIndentedString(annotationData)).append("\n");
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

