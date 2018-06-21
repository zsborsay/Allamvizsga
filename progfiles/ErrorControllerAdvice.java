@ControllerAdvice
@RequestMapping(produces = "application/json")
public class ErrorControllerAdvice extends ResponseEntityExceptionHandler {
    
    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ErrorMessageDTO> apiException(ApiException e) {
        return new ResponseEntity<>(new ErrorMessageDTO(e.getMessage()),
                                                        e.getHttpStatus());
    }
    ...
}