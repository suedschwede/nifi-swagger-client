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
import at.mic.nifi.swagger.client.model.PositionDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ComponentReferenceDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-05T15:38:14.826+01:00")
public class ComponentReferenceDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("versionedComponentId")
  private String versionedComponentId = null;

  @SerializedName("parentGroupId")
  private String parentGroupId = null;

  @SerializedName("position")
  private PositionDTO position = null;

  @SerializedName("name")
  private String name = null;

  public ComponentReferenceDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the component.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the component.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ComponentReferenceDTO versionedComponentId(String versionedComponentId) {
    this.versionedComponentId = versionedComponentId;
    return this;
  }

   /**
   * The ID of the corresponding component that is under version control
   * @return versionedComponentId
  **/
  @ApiModelProperty(example = "null", value = "The ID of the corresponding component that is under version control")
  public String getVersionedComponentId() {
    return versionedComponentId;
  }

  public void setVersionedComponentId(String versionedComponentId) {
    this.versionedComponentId = versionedComponentId;
  }

  public ComponentReferenceDTO parentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
    return this;
  }

   /**
   * The id of parent process group of this component if applicable.
   * @return parentGroupId
  **/
  @ApiModelProperty(example = "null", value = "The id of parent process group of this component if applicable.")
  public String getParentGroupId() {
    return parentGroupId;
  }

  public void setParentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
  }

  public ComponentReferenceDTO position(PositionDTO position) {
    this.position = position;
    return this;
  }

   /**
   * The position of this component in the UI if applicable.
   * @return position
  **/
  @ApiModelProperty(example = "null", value = "The position of this component in the UI if applicable.")
  public PositionDTO getPosition() {
    return position;
  }

  public void setPosition(PositionDTO position) {
    this.position = position;
  }

  public ComponentReferenceDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the component.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the component.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentReferenceDTO componentReferenceDTO = (ComponentReferenceDTO) o;
    return Objects.equals(this.id, componentReferenceDTO.id) &&
        Objects.equals(this.versionedComponentId, componentReferenceDTO.versionedComponentId) &&
        Objects.equals(this.parentGroupId, componentReferenceDTO.parentGroupId) &&
        Objects.equals(this.position, componentReferenceDTO.position) &&
        Objects.equals(this.name, componentReferenceDTO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, versionedComponentId, parentGroupId, position, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentReferenceDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    versionedComponentId: ").append(toIndentedString(versionedComponentId)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

