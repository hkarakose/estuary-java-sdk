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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NetApi
 */
@Disabled
public class NetApiTest {

    private final NetApi api = new NetApi();

    /**
     * Get all miners
     *
     * This endpoint returns all miners
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void publicMinersFailuresMinerGetTest() throws ApiException {
        String miner = null;
        String response = api.publicMinersFailuresMinerGet(miner);
        // TODO: test validations
    }

    /**
     * Get all miners
     *
     * This endpoint returns all miners
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void publicMinersGetTest() throws ApiException {
        String response = api.publicMinersGet();
        // TODO: test validations
    }

    /**
     * Net Addrs
     *
     * This endpoint is used to get net addrs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void publicNetAddrsGetTest() throws ApiException {
        List<String> response = api.publicNetAddrsGet();
        // TODO: test validations
    }

    /**
     * Net Peers
     *
     * This endpoint is used to get net peers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void publicNetPeersGetTest() throws ApiException {
        List<String> response = api.publicNetPeersGet();
        // TODO: test validations
    }

}
