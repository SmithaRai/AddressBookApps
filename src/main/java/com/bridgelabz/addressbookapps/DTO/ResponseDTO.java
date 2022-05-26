package com.bridgelabz.addressbookapps.DTO;

import lombok.Data;

public @Data class ResponseDTO {

    private String message ;
    private Object data;

    public ResponseDTO(String message, Object data){

        this.message=message;
        this.data=data;
    }



    @Override
    public String toString() {
        return "ResponseDTO{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
