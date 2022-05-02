/*
 * Estuary API
 * This is the API for the Estuary application.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * MainUserStatsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-28T23:49:15.047006Z[Etc/UTC]")
public class MainUserStatsResponse {
  public static final String SERIALIZED_NAME_NUM_PINS = "numPins";
  @SerializedName(SERIALIZED_NAME_NUM_PINS)
  private Integer numPins;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "totalSize";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private Integer totalSize;

  public MainUserStatsResponse() { 
  }

  public MainUserStatsResponse numPins(Integer numPins) {
    
    this.numPins = numPins;
    return this;
  }

   /**
   * Get numPins
   * @return numPins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumPins() {
    return numPins;
  }


  public void setNumPins(Integer numPins) {
    this.numPins = numPins;
  }


  public MainUserStatsResponse totalSize(Integer totalSize) {
    
    this.totalSize = totalSize;
    return this;
  }

   /**
   * Get totalSize
   * @return totalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalSize() {
    return totalSize;
  }


  public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainUserStatsResponse mainUserStatsResponse = (MainUserStatsResponse) o;
    return Objects.equals(this.numPins, mainUserStatsResponse.numPins) &&
        Objects.equals(this.totalSize, mainUserStatsResponse.totalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numPins, totalSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainUserStatsResponse {\n");
    sb.append("    numPins: ").append(toIndentedString(numPins)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("numPins");
    openapiFields.add("totalSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MainUserStatsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MainUserStatsResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MainUserStatsResponse is not found in the empty JSON string", MainUserStatsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MainUserStatsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MainUserStatsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MainUserStatsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MainUserStatsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MainUserStatsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MainUserStatsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<MainUserStatsResponse>() {
           @Override
           public void write(JsonWriter out, MainUserStatsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MainUserStatsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MainUserStatsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MainUserStatsResponse
  * @throws IOException if the JSON string is invalid with respect to MainUserStatsResponse
  */
  public static MainUserStatsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MainUserStatsResponse.class);
  }

 /**
  * Convert an instance of MainUserStatsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

