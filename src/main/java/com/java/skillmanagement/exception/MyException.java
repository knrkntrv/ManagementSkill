package com.java.skillmanagement.exception;


import com.java.skillmanagement.enums.ResultEnum;


@SuppressWarnings("serial")
public class MyException extends RuntimeException {

    @SuppressWarnings("unused")
	private Integer code;

    public MyException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public MyException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
