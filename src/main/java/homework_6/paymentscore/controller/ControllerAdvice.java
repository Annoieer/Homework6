package homework_6.paymentscore.controller;

import homework_6.paymentscore.dto.ErrorResponseDto;
import homework_6.paymentscore.exception.CustomNotFoundException;
import homework_6.paymentscore.exception.CustomPaymentRequiredException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(CustomNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorResponseDto handleUserNotFoundException(CustomNotFoundException exception) {
        return new ErrorResponseDto(exception.getMessage(), exception.getHttpStatus().value());
    }

    @ExceptionHandler(CustomPaymentRequiredException.class)
    @ResponseStatus(value = HttpStatus.PAYMENT_REQUIRED)
    public ErrorResponseDto handlePaymentRequiredException(CustomPaymentRequiredException exception) {
        return new ErrorResponseDto(exception.getMessage(), exception.getHttpStatus().value());
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorResponseDto handleMethodArgumentTypeMismatchException() {
        return new ErrorResponseDto("Неверный тип параметра!", HttpStatus.BAD_REQUEST.value());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorResponseDto handleIllegalArgumentException() {
        return new ErrorResponseDto("Продукт или клиент не найден", HttpStatus.BAD_REQUEST.value());
    }
}