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
import java.util.ArrayList;
import java.util.List;

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
 * MainAddContentToCollectionParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-28T23:49:15.047006Z[Etc/UTC]")
public class MainAddContentToCollectionParams {
  public static final String SERIALIZED_NAME_CIDS = "cids";
  @SerializedName(SERIALIZED_NAME_CIDS)
  private List<String> cids = null;

  public static final String SERIALIZED_NAME_COLLECTION = "collection";
  @SerializedName(SERIALIZED_NAME_COLLECTION)
  private String collection;

  public static final String SERIALIZED_NAME_CONTENTS = "contents";
  @SerializedName(SERIALIZED_NAME_CONTENTS)
  private List<Integer> contents = null;

  public MainAddContentToCollectionParams() { 
  }

  public MainAddContentToCollectionParams cids(List<String> cids) {
    
    this.cids = cids;
    return this;
  }

  public MainAddContentToCollectionParams addCidsItem(String cidsItem) {
    if (this.cids == null) {
      this.cids = new ArrayList<>();
    }
    this.cids.add(cidsItem);
    return this;
  }

   /**
   * Get cids
   * @return cids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCids() {
    return cids;
  }


  public void setCids(List<String> cids) {
    this.cids = cids;
  }


  public MainAddContentToCollectionParams collection(String collection) {
    
    this.collection = collection;
    return this;
  }

   /**
   * Get collection
   * @return collection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCollection() {
    return collection;
  }


  public void setCollection(String collection) {
    this.collection = collection;
  }


  public MainAddContentToCollectionParams contents(List<Integer> contents) {
    
    this.contents = contents;
    return this;
  }

  public MainAddContentToCollectionParams addContentsItem(Integer contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<>();
    }
    this.contents.add(contentsItem);
    return this;
  }

   /**
   * Get contents
   * @return contents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getContents() {
    return contents;
  }


  public void setContents(List<Integer> contents) {
    this.contents = contents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainAddContentToCollectionParams mainAddContentToCollectionParams = (MainAddContentToCollectionParams) o;
    return Objects.equals(this.cids, mainAddContentToCollectionParams.cids) &&
        Objects.equals(this.collection, mainAddContentToCollectionParams.collection) &&
        Objects.equals(this.contents, mainAddContentToCollectionParams.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cids, collection, contents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainAddContentToCollectionParams {\n");
    sb.append("    cids: ").append(toIndentedString(cids)).append("\n");
    sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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
    openapiFields.add("cids");
    openapiFields.add("collection");
    openapiFields.add("contents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MainAddContentToCollectionParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MainAddContentToCollectionParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MainAddContentToCollectionParams is not found in the empty JSON string", MainAddContentToCollectionParams.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MainAddContentToCollectionParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MainAddContentToCollectionParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("cids") != null && !jsonObj.get("cids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cids` to be an array in the JSON string but got `%s`", jsonObj.get("cids").toString()));
      }
      if (jsonObj.get("collection") != null && !jsonObj.get("collection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collection").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("contents") != null && !jsonObj.get("contents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `contents` to be an array in the JSON string but got `%s`", jsonObj.get("contents").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MainAddContentToCollectionParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MainAddContentToCollectionParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MainAddContentToCollectionParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MainAddContentToCollectionParams.class));

       return (TypeAdapter<T>) new TypeAdapter<MainAddContentToCollectionParams>() {
           @Override
           public void write(JsonWriter out, MainAddContentToCollectionParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MainAddContentToCollectionParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MainAddContentToCollectionParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MainAddContentToCollectionParams
  * @throws IOException if the JSON string is invalid with respect to MainAddContentToCollectionParams
  */
  public static MainAddContentToCollectionParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MainAddContentToCollectionParams.class);
  }

 /**
  * Convert an instance of MainAddContentToCollectionParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

