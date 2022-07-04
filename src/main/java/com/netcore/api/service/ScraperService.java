package com.netcore.api.service;

import com.netcore.api.model.ResponseDTO;

import java.util.Set;

public interface ScraperService {

    Set<ResponseDTO> getVehicleByModel(String vehicleModel);
}
