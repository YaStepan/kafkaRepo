package com.example.datageneratormicroservice.web.dto;

import com.example.datageneratormicroservice.model.Data;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class DataDto {
    private Long sensorId;
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")//'T' - это пробел
    private LocalDateTime timestamp;
    private double measurement;
    private Data.MeasurementType measurementType;
}
