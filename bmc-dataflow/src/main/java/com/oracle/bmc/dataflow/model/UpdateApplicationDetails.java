/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dataflow.model;

/**
 * The update application details.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateApplicationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateApplicationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("arguments")
        private java.util.List<String> arguments;

        public Builder arguments(java.util.List<String> arguments) {
            this.arguments = arguments;
            this.__explicitlySet__.add("arguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private java.util.Map<String, String> configuration;

        public Builder configuration(java.util.Map<String, String> configuration) {
            this.configuration = configuration;
            this.__explicitlySet__.add("configuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
        private String driverShape;

        public Builder driverShape(String driverShape) {
            this.driverShape = driverShape;
            this.__explicitlySet__.add("driverShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
        private String executorShape;

        public Builder executorShape(String executorShape) {
            this.executorShape = executorShape;
            this.__explicitlySet__.add("executorShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logsBucketUri")
        private String logsBucketUri;

        public Builder logsBucketUri(String logsBucketUri) {
            this.logsBucketUri = logsBucketUri;
            this.__explicitlySet__.add("logsBucketUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numExecutors")
        private Integer numExecutors;

        public Builder numExecutors(Integer numExecutors) {
            this.numExecutors = numExecutors;
            this.__explicitlySet__.add("numExecutors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<ApplicationParameter> parameters;

        public Builder parameters(java.util.List<ApplicationParameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("warehouseBucketUri")
        private String warehouseBucketUri;

        public Builder warehouseBucketUri(String warehouseBucketUri) {
            this.warehouseBucketUri = warehouseBucketUri;
            this.__explicitlySet__.add("warehouseBucketUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateApplicationDetails build() {
            UpdateApplicationDetails __instance__ =
                    new UpdateApplicationDetails(
                            arguments,
                            configuration,
                            definedTags,
                            description,
                            displayName,
                            driverShape,
                            executorShape,
                            freeformTags,
                            logsBucketUri,
                            numExecutors,
                            parameters,
                            warehouseBucketUri);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateApplicationDetails o) {
            Builder copiedBuilder =
                    arguments(o.getArguments())
                            .configuration(o.getConfiguration())
                            .definedTags(o.getDefinedTags())
                            .description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .driverShape(o.getDriverShape())
                            .executorShape(o.getExecutorShape())
                            .freeformTags(o.getFreeformTags())
                            .logsBucketUri(o.getLogsBucketUri())
                            .numExecutors(o.getNumExecutors())
                            .parameters(o.getParameters())
                            .warehouseBucketUri(o.getWarehouseBucketUri());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The arguments passed to the running application as command line arguments.  An argument is
     * either a plain text or a placeholder. Placeholders are replaced using values from the parameters
     * map.  Each placeholder specified must be represented in the parameters map else the request
     * (POST or PUT) will fail with a HTTP 400 status code.  Placeholders are specified as
     * `Service Api Spec`, where `name` is the name of the parameter.
     * Example:  `[ \"--input\", \"${input_file}\", \"--name\", \"John Doe\" ]`
     * If \"input_file\" has a value of \"mydata.xml\", then the value above will be translated to
     * `--input mydata.xml --name \"John Doe\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arguments")
    java.util.List<String> arguments;

    /**
     * The Spark configuration passed to the running process.
     * See https://spark.apache.org/docs/latest/configuration.html#available-properties
     * Example: { \"spark.app.name\" : \"My App Name\", \"spark.shuffle.io.maxRetries\" : \"4\" }
     * Note: Not all Spark properties are permitted to be set.  Attempting to set a property that is
     * not allowed to be overwritten will cause a 400 status to be returned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    java.util.Map<String, String> configuration;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly description. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * A user-friendly name. It does not have to be unique. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The VM shape for the driver. Sets the driver cores and memory.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
    String driverShape;

    /**
     * The VM shape for the executors. Sets the executor cores and memory.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
    String executorShape;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * An Oracle Cloud Infrastructure URI of the bucket where the Spark job logs are to be uploaded.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logsBucketUri")
    String logsBucketUri;

    /**
     * The number of executor VMs requested.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numExecutors")
    Integer numExecutors;

    /**
     * An array of name/value pairs used to fill placeholders found in properties like
     * `Application.arguments`.  The name must be a string of one or more word characters
     * (a-z, A-Z, 0-9, _).  The value can be a string of 0 or more characters of any kind.
     * Example:  [ { name: \"iterations\", value: \"10\"}, { name: \"input_file\", value: \"mydata.xml\" }, { name: \"variable_x\", value: \"${x}\"} ]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    java.util.List<ApplicationParameter> parameters;

    /**
     * An Oracle Cloud Infrastructure URI of the bucket to be used as default warehouse directory
     * for BATCH SQL runs.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warehouseBucketUri")
    String warehouseBucketUri;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
