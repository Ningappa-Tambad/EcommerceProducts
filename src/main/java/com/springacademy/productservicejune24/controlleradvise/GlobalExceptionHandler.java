package com.springacademy.productservicejune24.controlleradvise;


import com.springacademy.productservicejune24.dtos.ExceptionDto;
import com.springacademy.productservicejune24.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(ArithmeticException.class)
   public ResponseEntity<String> handleAirthmaticException()
   {
       ResponseEntity<String> response=new ResponseEntity<>(
        "AirthmaticException occurred",
        HttpStatus.NOT_FOUND
);

return response;
   }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public ResponseEntity<String> arrayIndexOutOfBoundsException()
    {
        ResponseEntity<String> response=new ResponseEntity<>(
                "Array index out of bounds has been reached,Inside controller advise",
                HttpStatus.BAD_REQUEST
        );

        return response;
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> nullPointerException()
    {
        ResponseEntity<String> response=new ResponseEntity<>(
                "Null pointer exception has been handled",
                HttpStatus.NOT_FOUND
        );

        return response;
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleProductNotFoundException()
    {
      ExceptionDto exceptionDto=new ExceptionDto();

       exceptionDto.setMessage("Product not found");
       exceptionDto.setSolution("Please try again with valid product id");
       ResponseEntity<ExceptionDto> response=new ResponseEntity<>(exceptionDto, HttpStatus.NOT_FOUND);
       return response;
    }


}
