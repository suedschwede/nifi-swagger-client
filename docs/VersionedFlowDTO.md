
# VersionedFlowDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**registryId** | **String** | The ID of the registry that the flow is tracked to |  [optional]
**bucketId** | **String** | The ID of the bucket where the flow is stored |  [optional]
**flowId** | **String** | The ID of the flow |  [optional]
**flowName** | **String** | The name of the flow |  [optional]
**description** | **String** | A description of the flow |  [optional]
**comments** | **String** | Comments for the changeset |  [optional]
**action** | [**ActionEnum**](#ActionEnum) | The action being performed |  [optional]


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
COMMIT | &quot;COMMIT&quot;
FORCE_COMMIT | &quot;FORCE_COMMIT&quot;



