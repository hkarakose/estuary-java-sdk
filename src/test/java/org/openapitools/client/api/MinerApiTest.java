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
 * API tests for MinerApi
 */
@Disabled
public class MinerApiTest {

    private final MinerApi api = new MinerApi();

    /**
     * Get all miners deals
     *
     * This endpoint returns all miners deals
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void publicMinersDealsMinerGetTest() throws ApiException {
        String miner = null;
        String response = api.publicMinersDealsMinerGet(miner);
        // TODO: test validations
    }

    /**
     * Get miner stats
     *
     * This endpoint returns miner stats
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void publicMinersStatsMinerGetTest() throws ApiException {
        String miner = null;
        String response = api.publicMinersStatsMinerGet(miner);
        // TODO: test validations
    }

}
